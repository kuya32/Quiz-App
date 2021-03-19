package com.macode.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.core.content.contentValuesOf
import com.macode.quizapp.databinding.ActivityQuizQuestionsBinding
import com.macode.quizapp.databinding.ActivityQuizSelectionBinding

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityQuizQuestionsBinding
    private lateinit var selectionBinding : ActivityQuizSelectionBinding
    private var currentPosition : Int = 1
    private var questionsList : ArrayList<Question>? = null
    private var selectedOptionPosition : Int = 0
    private var correctAnswers : Int = 0
    private var userName : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionsBinding.inflate(layoutInflater)
        selectionBinding = ActivityQuizSelectionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        userName = intent.getStringExtra(Constants.USERS_NAME)

        val toolbar = findViewById<Toolbar>(R.id.quizQuestionToolbar)
        setSupportActionBar(toolbar)

        retrieveQuizGenre()

        setQuestion()

        binding.quizOptionOne.setOnClickListener(this)
        binding.quizOptionTwo.setOnClickListener(this)
        binding.quizOptionThree.setOnClickListener(this)
        binding.quizOptionFour.setOnClickListener(this)
        binding.quizQuestionSubmitButton.setOnClickListener(this)
    }

    private fun retrieveQuizGenre() {
        when(intent.getStringExtra("genre")) {
            "country" -> {
                questionsList = Constants.getCountryQuestions()
                supportActionBar?.title = "Quiz App: " + selectionBinding.selectionCountryTitle.text
            } "anime" -> {
                questionsList = Constants.getAnimeQuestions()
                supportActionBar?.title = "Quiz App: " + selectionBinding.selectionAnimeTitle.text
            } "nfl" -> {
                questionsList = Constants.getNFLQuestions()
                supportActionBar?.title = "Quiz App: " + selectionBinding.selectionNFLTitle.text
            }
        }
    }

    private fun setQuestion() {

        val question = questionsList!![currentPosition - 1]

        defaultOptionsView()

        if (currentPosition == questionsList!!.size) {
            "FINISH".also { binding.quizQuestionSubmitButton.text = it }
        } else {
            "SUBMIT".also { binding.quizQuestionSubmitButton.text = it }
        }

        binding.progressBar.progress = currentPosition
        ("$currentPosition" + "/" + binding.progressBar.max).also { binding.progress.text = it }

        binding.quizQuestion.text = question.question
        binding.quizImage.setImageResource(question.image)
        binding.quizOptionOne.text = question.optionOne
        binding.quizOptionTwo.text = question.optionTwo
        binding.quizOptionThree.text = question.optionThree
        binding.quizOptionFour.text = question.optionFour
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, binding.quizOptionOne)
        options.add(1, binding.quizOptionTwo)
        options.add(2, binding.quizOptionThree)
        options.add(3, binding.quizOptionFour)

        for (option in options) {
            option.setTextColor(Color.parseColor("#706E6E"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.quizOptionOne -> {
                selectedOptionView(binding.quizOptionOne, 1)
            } R.id.quizOptionTwo -> {
                selectedOptionView(binding.quizOptionTwo, 2)
            } R.id.quizOptionThree -> {
                selectedOptionView(binding.quizOptionThree, 3)
            } R.id.quizOptionFour -> {
                selectedOptionView(binding.quizOptionFour, 4)
            }
            R.id.quizQuestionSubmitButton -> {
                if (selectedOptionPosition == 0) {
                    currentPosition++

                    when {
                        currentPosition <= questionsList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.USERS_NAME, userName)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, questionsList!!.size.toString())
                            intent.putExtra(Constants.CORRECT_ANSWERS, correctAnswers.toString())
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = questionsList?.get(currentPosition - 1)
                    if (question?.image?.equals(R.drawable.ic_rachel) == true) {
                        answerView(selectedOptionPosition, R.drawable.correct_option_border_bg)
                        correctAnswers++
                    } else if (question!!.correctAnswer != selectedOptionPosition) {
                        answerView(selectedOptionPosition, R.drawable.incorrect_option_border_bg)
                    } else {
                        correctAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (currentPosition == questionsList!!.size) {
                        "FINISH".also { binding.quizQuestionSubmitButton.text = it }
                    } else {
                        "GO TO THE NEXT QUESTION".also {
                            binding.quizQuestionSubmitButton.text = it
                        }
                    }
                    selectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer : Int, drawableView : Int) {
        when (answer) {
            1 -> {
                binding.quizOptionOne.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                binding.quizOptionTwo.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                binding.quizOptionThree.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                binding.quizOptionFour.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    private fun selectedOptionView(tv : TextView, selectedOptionNum : Int) {
        defaultOptionsView()
        selectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#FF000000"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
    }
}
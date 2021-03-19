package com.macode.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.macode.quizapp.databinding.ActivityQuizSelectionBinding
import com.macode.quizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding
    private var userName : String? = null
    private var totalQuestions : String? = null
    private var correctAnswers : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        retrieveQuizResult()

        ("Hey, $userName Congratulations!").also { binding.congratulationText.text = it }
        ("Your Score is $correctAnswers out of $totalQuestions").also { binding.quizScore.text = it }

        binding.finishQuizButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun retrieveQuizResult() {
        userName = intent.getStringExtra(Constants.USERS_NAME)
        totalQuestions = intent.getStringExtra(Constants.TOTAL_QUESTIONS)
        correctAnswers = intent.getStringExtra(Constants.CORRECT_ANSWERS)
    }
}
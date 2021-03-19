package com.macode.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.macode.quizapp.databinding.ActivityQuizSelectionBinding

class QuizSelectionActivity : AppCompatActivity() {

    private lateinit var binding : ActivityQuizSelectionBinding
    private var userName : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizSelectionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        userName = intent.getStringExtra(Constants.USERS_NAME)

        binding.selectionCountryButton.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USERS_NAME, userName)
            intent.putExtra("genre", "country")
            startActivity(intent)
            finish()
        }

        binding.selectionAnimeButton.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USERS_NAME, userName)
            intent.putExtra("genre", "anime")
            startActivity(intent)
            finish()
        }

        binding.selectionNFLButton.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USERS_NAME, userName)
            intent.putExtra("genre", "nfl")
            startActivity(intent)
            finish()
        }
    }
}
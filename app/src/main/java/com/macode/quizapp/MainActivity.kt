package com.macode.quizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import com.macode.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.nextButton.setOnClickListener {
            if(binding.nameEditInput.text.toString().isEmpty()) {
                showError(binding.nameInput, "Please enter your name!")
            } else {
                val intent = Intent(this, QuizSelectionActivity::class.java)
                intent.putExtra(Constants.USERS_NAME, binding.nameEditInput.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }

    private fun showError(layout: TextInputLayout, text: String) {
        layout.error = text
        layout.requestFocus()
    }
}
package com.macode.quizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton.setOnClickListener {
            if(nameEditInput.text.toString().isEmpty()) {
                showError(nameInput, "Please enter your name!")
            } else {
                val intent = Intent(this, QuizSelectionActivity::class.java)
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
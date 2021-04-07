package com.example.quizfun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        tv_score.text = "Your score is $correctAnswers out of $totalQuestions"

        btn_finish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
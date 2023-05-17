package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class ExerciseOneActivity : AppCompatActivity() {
    lateinit var exerciseone:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_one)
        exerciseone = findViewById(R.id.exeone_card)
    }
}
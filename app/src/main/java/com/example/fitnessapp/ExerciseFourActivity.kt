package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class ExerciseFourActivity : AppCompatActivity() {
    lateinit var exercisefour:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_four)
        exercisefour = findViewById(R.id.exefour_card)
    }
}
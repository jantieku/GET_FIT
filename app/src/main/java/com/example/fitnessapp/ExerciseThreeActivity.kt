package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class ExerciseThreeActivity : AppCompatActivity() {
    lateinit var exercisethree:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_three)
        exercisethree = findViewById(R.id.exethree_card)
    }
}
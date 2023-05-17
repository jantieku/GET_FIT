package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class ExerciseTwoActivity : AppCompatActivity() {
    lateinit var exercisetwo:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_two)
        exercisetwo = findViewById(R.id.exetwo_card)!!
    }
}
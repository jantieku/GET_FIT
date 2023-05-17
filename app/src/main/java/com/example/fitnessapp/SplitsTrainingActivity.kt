package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class SplitsTrainingActivity : AppCompatActivity() {
    lateinit var msplits:TextView
    lateinit var aboutsplits:TextView
    lateinit var exeone:CardView
    lateinit var exetwo:CardView
    lateinit var exethree:CardView
    lateinit var exefour:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_split_workout)
        msplits = findViewById(R.id.splits)
        aboutsplits = findViewById(R.id.abt_splits)
        exeone = findViewById(R.id.exeone_card)
        exetwo = findViewById(R.id.exetwo_card)
        exethree = findViewById(R.id.exethree_card)
        exefour = findViewById(R.id.exefour_card)
        exeone.setOnClickListener {
           var one = Intent(this, ExerciseOneActivity::class.java)
            startActivity(one)
        }
        exetwo.setOnClickListener {
            var two = Intent(this, ExerciseTwoActivity::class.java)
            startActivity(two)
        }
        exethree.setOnClickListener {
            var three = Intent(this, ExerciseThreeActivity::class.java)
            startActivity(three)
        }
        exefour.setOnClickListener {
            var four = Intent(this, ExerciseFourActivity::class.java)
            startActivity(four)
        }
    }
}
package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class ThighWorkoutActivity : AppCompatActivity() {
    lateinit var mthighs:TextView
    lateinit var abouthighs:TextView
    lateinit var sidehop:CardView
    lateinit var highstepping:CardView
    lateinit var lunges:CardView
    lateinit var sumosquat:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thigh_workout)
        mthighs = findViewById(R.id.thighs)
        abouthighs = findViewById(R.id.abt_thighs)
        sidehop = findViewById(R.id.sidehop_card)
        highstepping = findViewById(R.id.high_stepping_card)
        lunges = findViewById(R.id.lunges_card)
        sumosquat = findViewById(R.id.sumosquat_card)
        sidehop.setOnClickListener {
            var sidehop = Intent(this, SidehopActivity::class.java)
            startActivity(sidehop)
        }
        highstepping.setOnClickListener {
            var highstepping = Intent(this, HighsteppingActivity::class.java)
            startActivity(highstepping)
        }
        lunges.setOnClickListener {
            var lunges = Intent(this, LungesActivity::class.java)
            startActivity(lunges)

        }
        sumosquat.setOnClickListener {
            var sumosquat = Intent(this, SumosquatActivity::class.java)
            startActivity(sumosquat)


        }
    }
}
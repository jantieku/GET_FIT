package com.example.fitnessapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.fitnessapp.databinding.ActivityDashboardBinding

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import de.hdodenhof.circleimageview.CircleImageView
import java.util.Date

class DashBoardActivity : AppCompatActivity() {




    lateinit var userImage:CircleImageView
    lateinit var edtprofile:LinearLayout
    lateinit var thighs:ImageView
    lateinit var arms:ImageView
    lateinit var tummy:ImageView
    lateinit var splits:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        userImage = findViewById(R.id.profile_pic)
        edtprofile = findViewById(R.id.linearLayoutedtprofile)
        thighs = findViewById(R.id.imageView7)
        arms= findViewById(R.id.imageView8)
        tummy = findViewById(R.id.imageView9)
        splits = findViewById(R.id.imageView10)
        // Collect username
        thighs.setOnClickListener {
            var thighs = Intent(this, ThighWorkoutActivity::class.java)
            startActivity(thighs)
        }
        arms.setOnClickListener {
            var arms = Intent(this, ArmsWorkoutActivity::class.java)
            startActivity(arms)
        }
        tummy.setOnClickListener {
            var tummy = Intent(this, TummyWorkoutActivity::class.java)
            startActivity(tummy)
        }
        splits.setOnClickListener {
            var splits = Intent(this, SplitsTrainingActivity::class.java)
            startActivity(splits)
        }
        edtprofile.setOnClickListener {
//            var editprofile =Intent(this,EditProfileActivity::class.java)
//            startActivity(editprofile)
        }
    }

}
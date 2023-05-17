package com.example.fitnessapp

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase





class MainActivity : AppCompatActivity() {
    lateinit var mbtnsignup:TextView
    lateinit var eMail:EditText
    lateinit var mpassword:EditText
    lateinit var mbtnlogin:Button
    lateinit var moption:TextView
    lateinit var progressDialog: ProgressDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mbtnsignup = findViewById(R.id.signUp)
        eMail =findViewById(R.id.eMailUsername)
        mpassword = findViewById(R.id.password)
        mbtnlogin = findViewById(R.id.login)
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Saving")
        progressDialog.setMessage("Please wait...")
        mbtnsignup.setOnClickListener {
            var signup = Intent(this,SignUpActivity::class.java)
            startActivity(signup)
        }
        mbtnlogin.setOnClickListener {
            //Collect user data
            var email = eMail.text.toString().trim()
            var pin = mpassword.text.toString().trim()
            var id = System.currentTimeMillis().toString()

            if (email.isEmpty()){
                eMail.setError("Please fill out this field")
                eMail.requestFocus()
            }else if(pin.isEmpty()){
                mpassword.setError("Please fill out this field")
                mpassword.requestFocus()
            }else{
                //Proceed to save
                var loggedUser = UserLogin(email,pin, id)
                // Create a reference in the firebase database
                var ref  = FirebaseDatabase.getInstance().getReference().child("LoggedUsers/"+id)
                // Show progress to start saving
                progressDialog.dismiss()
                ref.setValue(loggedUser).addOnCompleteListener {
                    // Dismiss the progress and check if the task was successful completed
                        task ->
                    if (task.isSuccessful){
                        Toast.makeText(this,"Login successful", Toast.LENGTH_LONG).show()
                        var login = Intent(this, DashBoardActivity::class.java)
                        startActivity(login)

                    }else{
                        Toast.makeText(this,"Login failed", Toast.LENGTH_LONG).show()
                    }
                }
            }
            }
        }
    }


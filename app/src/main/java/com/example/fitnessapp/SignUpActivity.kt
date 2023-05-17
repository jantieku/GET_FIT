package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.app.ProgressDialog
import android.content.Intent
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class SignUpActivity : AppCompatActivity() {
    lateinit var username:EditText
    lateinit var eMail:EditText
    private lateinit var edtpassword:EditText
    private lateinit var conpassword:EditText
    lateinit var signin:Button
    lateinit var progressDialog:ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        username = findViewById(R.id.Username)
        eMail = findViewById(R.id.eMail)
        edtpassword = findViewById(R.id.password)
        conpassword = findViewById(R.id.c_password)
        signin = findViewById(R.id.sign_in)
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Saving")
        progressDialog.setMessage("Please wait...")
        signin.setOnClickListener {
            // Collect user data
            var name = username.text.toString().trim()
            var email = eMail.text.toString().trim()
            var password = edtpassword.text.toString().trim()
            var c_password = conpassword.text.toString().trim()
            var id = System.currentTimeMillis().toString()
            if(name.isEmpty()){
                    username.setError("Please fill this field")
                   username.requestFocus()
                }else if(email.isEmpty()){
                eMail.setError("Please fill this field")
                eMail.requestFocus()
                }else if(password.isEmpty()){
                    edtpassword.setError("Please fill this field")
                    edtpassword.requestFocus()
                }else if (c_password.isEmpty()){
                    conpassword.setError("Please fill this field")
                    conpassword.requestFocus()
            }else{
                // Proceed to save
                var user = User(name,email, password, c_password, id)
                // Create a reference in the firebase database
                var ref = FirebaseDatabase.getInstance().getReference().child("Users/"+id)
                // Show progress to start saving
                progressDialog.dismiss()
                ref.setValue(user).addOnCompleteListener {
                    // Dismiss the progess and check if the task was successfull completed
                    task ->
                    if (task.isSuccessful){
                        Toast.makeText(this,"Account created succesully", Toast.LENGTH_LONG).show()
                        var home = Intent(this, DashBoardActivity::class.java)
                        startActivity(home)
                    }else{
                        Toast.makeText(this,"Account creation failed", Toast.LENGTH_LONG).show()
                    }
                }
        }



    }

}}
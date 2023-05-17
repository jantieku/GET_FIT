package com.example.fitnessapp

import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText

class User {
    var username:String = ""
    var email:String = ""
    var password:String = ""
    var cpassword:String = ""
    var id:String=""

    constructor(username: String, email: String, password: String, cpassword: String, id: String) {
        this.username = username
        this.email = email
        this.password = password
        this.cpassword = cpassword
        this.id = id
    }
    constructor()
}
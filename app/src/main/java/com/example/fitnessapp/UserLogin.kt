package com.example.fitnessapp

import android.widget.EditText

 class UserLogin {
    var email:String = ""
    private var password:String = ""
    var id:String=""

    constructor(email: String, password: String, id:String) {

        this.email = email
        this.password = password
        this.id = id



    }
}
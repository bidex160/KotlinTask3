package com.example.kotlintask3

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val username:EditText = findViewById(R.id.cretaeuser)
        val email:EditText = findViewById(R.id.email)
        val fullname:EditText = findViewById(R.id.fullname)
        val num:EditText = findViewById(R.id.number)
        val password:EditText = findViewById(R.id.passcreate)
        val create:Button = findViewById(R.id.button2)
        val sharep:SharedPreferences = getSharedPreferences("user_details", Context.MODE_PRIVATE)
        val editor:SharedPreferences.Editor = sharep.edit()

        create.setOnClickListener(View.OnClickListener {
            val name:String = fullname.text.toString()
            val usernameget:String = username.text.toString()
            val numget:String = num.text.toString()
            val passget:String = password.text.toString()
            val emailget:String = email.text.toString()


            editor.putString("fullname", name)
            editor.putString("username", usernameget)
            editor.putString("number", numget)
            editor.putString("password", passget)
            editor.putString("email", emailget)
            editor.apply()

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)


        })

    }
}

package com.example.kotlintask3

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import java.lang.Exception

class LoginActivity : AppCompatActivity() {
    private val TAG = "Login"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val textViewnane:TextView = findViewById(R.id.textnane)
        val textViewpass:TextView = findViewById(R.id.textpassword)
        val createa:TextView = findViewById(R.id.create)
        val textViewlogin:TextView = findViewById(R.id.login)
        val forget:TextView = findViewById(R.id.forgetpass)
        val username:EditText = findViewById(R.id.name)
        val passwordin:EditText = findViewById(R.id.password)
        val loginbt:Button = findViewById(R.id.button)


        val spf:SharedPreferences = getSharedPreferences("user_details", Context.MODE_PRIVATE)


         forget.setOnClickListener {
             val intent = Intent(this, FogretDetails::class.java)
             startActivity(intent)

         }
        loginbt.setOnClickListener(View.OnClickListener {
            val inputname:String = username.text.toString()
            val passwordinput:String = passwordin.text.toString()
            try {
                val storename: String? = spf.getString("username", "")
                val storepass: String? = spf.getString("password", "")
                Log.d(TAG," on click")
                if (inputname == storename && passwordinput ==storepass){
                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("username", storename)
                    intent.putExtra("password", storepass)
                    startActivity(intent)
                    Log.d(TAG,"login" +"succesfully")
                }else{

                    val snack = Snackbar.make(it, "Incorrect Username or Password", Snackbar.LENGTH_INDEFINITE)
                    snack.show()


                }
            }catch (e:Exception){
                Log.d(TAG, "exception"+e)
            }




        })

        createa.setOnClickListener(View.OnClickListener {

         val intent = Intent(this, SignUp::class.java)
            startActivity(intent)

        })


    }
}

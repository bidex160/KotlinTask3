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
import java.lang.Exception

class FogretDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fogret_details)
        val forgetname:EditText = findViewById(R.id.editusernmae)
        val forgetpassword:EditText = findViewById(R.id.newpassword)
        val change:Button = findViewById(R.id.change)

        val spf:SharedPreferences = getSharedPreferences("user_details", Context.MODE_PRIVATE)
        val realusernmae:String? = spf.getString("username", "")

        change.setOnClickListener(View.OnClickListener {
            val getname:String = forgetname.text.toString()
            try {
                if (realusernmae == getname){
                    val editor:SharedPreferences.Editor = spf.edit()
                    editor.putString("password", forgetpassword.text.toString())
                    editor.apply()

                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                }else{
                    val snack = Snackbar.make(it, "Incorrect Username", Snackbar.LENGTH_INDEFINITE)
                    snack.show()
                }

            }catch (e:Exception){

            }

        })
    }
}

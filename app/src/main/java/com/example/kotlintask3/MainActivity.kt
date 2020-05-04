package com.example.kotlintask3

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import java.lang.Exception
import kotlin.math.log


class MainActivity : AppCompatActivity() {
    private val TAG = "MyActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // initview()
        val youtube:ImageView = findViewById(R.id.youtube)
        val mail:ImageView = findViewById(R.id.mail)
        val skype:ImageView = findViewById(R.id.skype)
        val instagram:ImageView = findViewById(R.id.instagram)
        val slack:ImageView = findViewById(R.id.slack)
        val google:ImageView = findViewById(R.id.google)
        val twitter:ImageView = findViewById(R.id.twitter)
        val whatsapp:ImageView = findViewById(R.id.whtsp)
        val dribble:ImageView = findViewById(R.id.dribble)
        val facebook:ImageView = findViewById(R.id.facebook)
        val git:ImageView = findViewById(R.id.git)
        val txtname:TextView = findViewById(R.id.textView12)
        val txtpass:TextView = findViewById(R.id.textView13)


           val view:View = findViewById(R.id.dribble)


        //Snackbar.make(this, "" ,Snackbar.LENGTH_INDEFINITE)
        try {
            val intent:Intent = intent
            val name:String = intent.getStringExtra("username")
            val email:String = intent.getStringExtra("password")

            txtname.text = "Username:-\t $name"
            txtpass.text = "Password:- \t $email"
            Log.d(TAG, "onCreate" + name)
        }catch (e:Exception){

        }

        
        git.setOnClickListener {

            try {


                val gitintent = Intent(Intent.ACTION_VIEW)
                gitintent.setData(Uri.parse("http://github.com"))
                gitintent.setPackage("com.github.android")
                if (gitintent.resolveActivity(packageManager) != null){
                    startActivity(gitintent)
                }else{
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://github.com")))
                }

            }catch (e:Exception){

            }
        }

        mail.setOnClickListener {
            val mailintent = Intent(Intent.ACTION_SENDTO)
            mailintent.setData(Uri.parse("mailto:bidex890@gmail.com"))
            mailintent.putExtra(Intent.EXTRA_SUBJECT,"subject")
             mailintent.putExtra(Intent.EXTRA_TEXT, "body")
            try {
                if(mailintent.resolveActivity(packageManager) != null){
                    startActivity(mailintent)
                }else{
                    startActivity(Intent.createChooser(mailintent, "chooser"))

                }



            }catch (e:Exception){

            }
        }
        youtube.setOnClickListener {
            val youintent = Intent(Intent.ACTION_VIEW)
            youintent.setData(Uri.parse("vnd.youtube:"))
           try {
               if (youintent.resolveActivity(packageManager) != null){
                   startActivity(youintent)

               }else{
                  startActivity(Intent.createChooser(youintent, "youtube app"))
               }


           }catch (e:Exception){

           }
        }
        skype.setOnClickListener {
            try {
            val skyintent = Intent(Intent.ACTION_VIEW)
            skyintent.setData(Uri.parse("http://skype.com"))
                skyintent.setPackage("com.skype.android")

                if (skyintent.resolveActivity(packageManager) != null){
                    startActivity(skyintent)
                }else{
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://skype.com")))
                }

            }catch (e:Exception){

            }
        }
        instagram.setOnClickListener {
            val instaintent = Intent(Intent.ACTION_VIEW)
            instaintent.setData(Uri.parse("http://instagram.com/_u/thabidex"))
            instaintent.setPackage("com.instagram.android")
            try {
                if (instaintent.resolveActivity(packageManager) != null){
                    startActivity(instaintent)

                }else{
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/_u/thabidex")))

                }

            }catch (e:Exception){

            }
        }
        slack.setOnClickListener {
            try {
                val slackint = Intent(Intent.ACTION_VIEW)
                  slackint.setData(Uri.parse("http://slack.com/bidex160"))
                   slackint.setPackage("com.slack.android")


                if (slackint.resolveActivity(packageManager) != null){
                    startActivity(slackint)

                }else{
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://slack.com/bidex160")))
                }
            }catch (e:Exception){

            }

        }
        twitter.setOnClickListener {

            try {
                val twiintent  = Intent(Intent.ACTION_VIEW)
                twiintent.setData(Uri.parse("http://twitter.com/AbidemiTajudeen"))
                twiintent.setPackage("com.twitter.android")
                if (twiintent.resolveActivity(packageManager) != null){
                    startActivity(twiintent)
                }else{
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://twitter.com/AbidemiTajudeen")))
                }

            }catch (e:Exception){

            }
        }
        whatsapp.setOnClickListener {

            try {
                val whatintent = Intent(Intent.ACTION_VIEW, Uri.parse("http://wa.me/2347015351040"))
                whatintent.setPackage("com.WhatsApp.android")

                if (whatintent.resolveActivity(packageManager) != null) {
                        startActivity(whatintent)
                }else{

                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://wa.me/2347015351040")))
                }



            }catch (e:Exception){

            }
        }
        facebook.setOnClickListener {
            try {
                val fintent = Intent(Intent.ACTION_VIEW)
                fintent.setData(Uri.parse("http://facebook.com/Trojanhorz"))
                fintent.setPackage("com.facebook.android")

                if (fintent.resolveActivity(packageManager) != null){
                    startActivity(fintent)
                }else{
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://facebook.com/Trojanhorz")))
                }

            }catch (e:Exception){

            }





        }
        dribble.setOnClickListener {

        }
        google.setOnClickListener {
            try {
                val igoogle = Intent(Intent.ACTION_VIEW)
                igoogle.setData(Uri.parse("http://google.com"))
                igoogle.setPackage("com.google.android")

                try {
                    if(igoogle.resolveActivity(packageManager) != null){
                        startActivity(igoogle)
                    }else{
                        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com")))
                    }

                }catch (e:Exception){

                }


            }catch (e:Exception){

            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(TAG, "On Destroy")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "On Start")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "On Stop")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "On Pause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "On Restart")

    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)
        Log.i(TAG, "On Create")
    }
}

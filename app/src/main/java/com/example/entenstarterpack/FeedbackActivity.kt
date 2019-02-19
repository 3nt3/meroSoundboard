package com.example.entenstarterpack

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_feedback.*
import java.lang.Exception

class FeedbackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        submitBtn.setOnClickListener {
            val msg = tf0.text.toString()

            if (msg.isNullOrEmpty()) {
                tf0.setError("Du musst eine Nachricht eingeben!")
            } else {
                sendMessage(tf0.text.toString())
                val intent = Intent(this, MainActivity::class.java)
                //startActivity(intent)
            }
        }

        setSupportActionBar(toolbar3)
    }

    private fun sendMessage(msg: String) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.data = Uri.parse("mailto:")
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_EMAIL, "gott@3nt3.de")
        intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback")
        intent.putExtra(Intent.EXTRA_TEXT, msg)

        startActivity(Intent.createChooser(intent, "Womit willste das denn verschicken?"))


        Log.i("Feedback", "Message: $msg")
    }

}
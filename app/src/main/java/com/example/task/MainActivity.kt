package com.example.task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.task.R.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        var btn_login = findViewById<Button>(R.id.btn_login)
        var btn_signup = findViewById<Button>(R.id.btn_signup)
        btn_login.setOnClickListener{
        val intent=Intent(this,login::class.java)
            startActivity(intent)
        }
        btn_signup.setOnClickListener{
            val intent=Intent(this,signup::class.java)
            startActivity(intent)
        }
    }
}
package com.example.task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var btn_submit=findViewById<Button>(R.id.btnSubmit)
        btn_submit.setOnClickListener {
            val intent=Intent(this,signup::class.java)
            startActivity(intent)
        }
    }
}
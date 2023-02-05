package com.example.task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class merchant : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_merchant)
        val btn_add=findViewById<Button>(R.id.btn_add)
        btn_add.setOnClickListener {
            val intent=Intent(this,buyer::class.java)
            startActivity(intent)
        }
    }
}
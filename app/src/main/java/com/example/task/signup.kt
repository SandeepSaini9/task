package com.example.task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val btn_txtview = findViewById<Button>(R.id.txtView)
        val user_type = resources.getStringArray(R.array.UserType)
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, user_type
            )
            spinner.adapter = adapter
        }
        btn_txtview.setOnClickListener {
            val intent = Intent(this, merchant::class.java)
            startActivity(intent)
        }
    }
}
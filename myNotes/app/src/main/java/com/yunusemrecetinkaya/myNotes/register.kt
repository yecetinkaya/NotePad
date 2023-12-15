package com.yunusemrecetinkaya.myNotes

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val editTextUsername = findViewById<EditText>(R.id.et_username)
        val editTextPassword = findViewById<EditText>(R.id.et_password)
        val btnRegister = findViewById<Button>(R.id.btn_register)

        btnRegister.setOnClickListener{

            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            val preference = getSharedPreferences("users",Context.MODE_PRIVATE)
            val editor = preference.edit()
            editor.putString(username, password).apply()

            Toast.makeText(this, "Kaydınız oluşturuldu.", Toast.LENGTH_LONG).show()

        }

    }
}
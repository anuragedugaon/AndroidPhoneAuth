package com.fameouscoder.firebase

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity2 : AppCompatActivity() {
    lateinit var auth: FirebaseAuth
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

       auth= Firebase.auth
        var email=findViewById<EditText>(R.id.emaill)
        var password=findViewById<EditText>(R.id.passwords)
        var button=findViewById<Button>(R.id.buttons)

        button.setOnClickListener {
            auth.signInWithEmailAndPassword(email.text.toString(),password.text.toString())
                .addOnSuccessListener {
                Toast.makeText(this, "success fulyl login", Toast.LENGTH_SHORT).show()

            }.addOnFailureListener {
                Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()


            }

        }
    }
}
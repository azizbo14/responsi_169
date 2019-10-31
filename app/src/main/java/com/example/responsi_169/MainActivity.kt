package com.example.responsi_169

import android.app.Activity
import android.app.ProgressDialog.show
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        btn_login.setOnClickListener {
            val username = inuser.text.toString()
            val password = inpass.text.toString()
            if (username == "aziz" || password == "aziz") {
                val intent = Intent(this,HomeActivity::class.java)
                startActivity(intent)
            }

            else {
                Toast.makeText(
                    this, "Username dan Password Salah , Anda Gagal Login",
                    Toast.LENGTH_LONG
                ).show()
            }
            btn_regis.setOnClickListener {
                intent = Intent(this, RegistrasiActivity::class.java)


                startActivity(intent)
            }
        }
    }

}

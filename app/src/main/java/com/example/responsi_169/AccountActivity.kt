package com.example.responsi_169
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_account.*

@SuppressLint("Registered")
class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val bundle = intent.extras
        val idnama = bundle?.get("nama")
        val alamatku = bundle?.get("alamat")
        val usernameku = bundle?.get("username")
        val passwordku = bundle?.get("password")

        nama_reg.setText(""+idnama)
        alamat_reg.setText(""+alamatku)
        username_reg.setText(""+usernameku)
        password_reg.setText(""+passwordku)
    }
}
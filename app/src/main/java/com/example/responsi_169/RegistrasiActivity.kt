package com.example.responsi_169

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*


class RegistrasiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var namaku : EditText = findViewById(R.id.id_nama)
        var alamatku : EditText = findViewById(R.id.id_alamat)
        var usernameku : EditText = findViewById(R.id.id_username)
        var passwordku : EditText = findViewById(R.id.id_password)

        btn_simpan.setOnClickListener{
        intent = Intent(this, AccountActivity::class.java)
            intent.putExtra("nama", namaku.getText())
            intent.putExtra("alamat", alamatku.getText())
            intent.putExtra("username", usernameku.getText())
            intent.putExtra("password", passwordku.getText())

            Toast.makeText(this,"Berhasil . . . ",Toast.LENGTH_SHORT).show()

            startActivity(intent)
        }
    }

}
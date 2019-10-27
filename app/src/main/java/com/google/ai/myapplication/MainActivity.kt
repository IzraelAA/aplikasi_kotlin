package com.google.ai.myapplication

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nama = findViewById<EditText>(R.id.edt_nama)
        val passe = findViewById<EditText>(R.id.pass)
        val Login = findViewById<Button>(R.id.btn)

        Login.setOnClickListener {
            var name = nama.text.toString()
            var pass = passe.text.toString()

            if (name == "Panca" && pass == "S4ndi"){
            val intent = Intent (this@MainActivity,FullscreenActivity:: class.java)
            intent.putExtra("Name",name)
            startActivity(intent)}
            else if (name == ""&& pass == ""){
                Toast.makeText(applicationContext,"Masukan Nama & Sandi!!!",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(applicationContext,"Ada Yang Salah",Toast.LENGTH_LONG).show()
            }
        }
    }
}

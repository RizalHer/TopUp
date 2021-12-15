package com.rizal.aliefstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnTopup: Button
    private lateinit var btnJoki: Button
    private lateinit var btnhome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnTopup= findViewById(R.id.btn_top_up)
        btnTopup.setOnClickListener(this)

        btnJoki= findViewById(R.id.btn_joki)
        btnJoki.setOnClickListener(this)

        btnhome = findViewById(R.id.btn_home)
        btnhome.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.btn_top_up -> run {
                    val intent = Intent(this, TopUp::class.java)
                    startActivity(intent)
                }
                R.id.btn_joki -> run {
                    val intent = Intent(this, Joki::class.java)
                    startActivity(intent)
                }
                R.id.btn_home -> run {
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                }
            }
}

    }
}
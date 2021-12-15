package com.rizal.aliefstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TopUp : AppCompatActivity(),View.OnClickListener {
    private lateinit var btnMl: Button
    private lateinit var btnFf: Button
    private lateinit var btnPubg: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_up)

        btnMl= findViewById(R.id.btn_ml)
        btnMl.setOnClickListener(this)

        btnFf= findViewById(R.id.btn_ff)
        btnFf.setOnClickListener(this)

        btnPubg= findViewById(R.id.btn_pubg)
        btnPubg.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.btn_ml -> run {
                    val intent = Intent(this, Ml::class.java)
                    startActivity(intent)
                }
                R.id.btn_ff -> run {
                    val intent = Intent(this, Ff::class.java)
                    startActivity(intent)
                }
                R.id.btn_pubg -> run {
                    val intent = Intent(this, Pubg::class.java)
                    startActivity(intent)
                }
    }
        }
    }
}
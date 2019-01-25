package com.groupboys.kumpulanvideoanak

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {
    lateinit var imgbutton:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgbutton=findViewById(R.id.imageButton2)
        imgbutton.setOnClickListener {
            startActivity(Intent(this,Baru::class.java))
        }
    }
}

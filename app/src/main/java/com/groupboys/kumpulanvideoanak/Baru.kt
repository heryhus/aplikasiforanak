package com.groupboys.kumpulanvideoanak

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_baru.*
class Baru : AppCompatActivity() {
    lateinit var imgsatu : ImageButton
    lateinit var imgdua : ImageButton
    lateinit var imgtiga : ImageButton
    lateinit var imgempat : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baru)
        imgsatu=findViewById(R.id.img1)
        imgsatu.setOnClickListener{
            startActivity(Intent(this,VideoUpin::class.java))
        }


        imgdua=findViewById(R.id.img2)
        imgdua.setOnClickListener{
            startActivity(Intent(this,Doraemon::class.java))
        }
        imgempat=findViewById(R.id.img3)
        imgempat.setOnClickListener {
            startActivity(Intent(this, Vidio_dragon::class.java))
        }
        imgempat=findViewById(R.id.img4)
        imgempat.setOnClickListener {
            startActivity(Intent(this, Larva::class.java))
        }
        imgempat=findViewById(R.id.img5)
        imgempat.setOnClickListener {
            startActivity(Intent(this, Boboiboy::class.java))
        }
        imgempat=findViewById(R.id.img6)
        imgempat.setOnClickListener {
            startActivity(Intent(this, VideoNussa::class.java))
        }
    }
}

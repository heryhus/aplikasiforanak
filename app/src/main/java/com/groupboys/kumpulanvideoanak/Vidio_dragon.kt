package com.groupboys.kumpulanvideoanak

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class Vidio_dragon : AppCompatActivity() {
    lateinit var of : VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vidio_dragon)
        of=findViewById (R.id.dra)
        //inisialisasi object videoView
        of.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dragon))
        //digunakan untuk mengidentifikasi resource seperti lokasi video
        of.setMediaController(MediaController(this))
        //menampilkan media controller video
        of.start()
    }
}

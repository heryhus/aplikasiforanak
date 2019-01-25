package com.groupboys.kumpulanvideoanak

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class VideoNussa : AppCompatActivity() {
    lateinit var og : VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.videonussa)

        og=findViewById (R.id.nusa)
        //inisialisasi object videoView
        og.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.nusaa))
        //digunakan untuk mengidentifikasi resource seperti lokasi video
        og.setMediaController(MediaController(this))
        //menampilkan media controller video
        og.start()


    }
}

package com.example.entenstarterpack

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.PopupWindow
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var woSindDeineJungs: MediaPlayer
    private lateinit var qdh: MediaPlayer
    private lateinit var ballerLos: MediaPlayer
    private lateinit var gokhanAbi: MediaPlayer
    private lateinit var volo62: MediaPlayer
    private lateinit var ferrari: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        woSindDeineJungs = MediaPlayer.create(this, R.raw.wosinddeinejungs)
        qdh = MediaPlayer.create(this, R.raw.qdh)
        ballerLos = MediaPlayer.create(this, R.raw.ballerlos)
        gokhanAbi = MediaPlayer.create(this, R.raw.gokhanabi)
        volo62 = MediaPlayer.create(this, R.raw.kommenurmitvolo62)
        ferrari = MediaPlayer.create()


        // Wo sind deine Jungs, wo?
        btn0.setOnClickListener({
            woSindDeineJungs.seekTo(0)
            woSindDeineJungs.start()
        })

        // QDH
        btn1.setOnClickListener({
            qdh.seekTo(0)
            qdh.start()
        })

        // Baller Los
        btn2.setOnClickListener({
            ballerLos.seekTo(0)
            ballerLos.start()
        })

        // Gökhan Abi
        btn3.setOnClickListener({
            gokhanAbi.seekTo(0)
            gokhanAbi.start()
        })

        // Volo 62
        btn4.setOnClickListener({
            volo62.seekTo(0)
            volo62.start()
        })

        btn5.setOnClickListener({
            foo.seekTo(0, 0)
            foo.start()
        })



        setSupportActionBar(toolbar2)
    }

}
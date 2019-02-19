package com.example.entenstarterpack

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

import android.view.Menu

import android.view.MenuItem


class MainActivity : AppCompatActivity() {

    private lateinit var woSindDeineJungs: MediaPlayer
    private lateinit var qdh: MediaPlayer
    private lateinit var ballerLos: MediaPlayer
    private lateinit var gokhanAbi: MediaPlayer
    private lateinit var volo62: MediaPlayer
    private lateinit var gringosauer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        woSindDeineJungs = MediaPlayer.create(this, R.raw.wosinddeinejungs)
        qdh = MediaPlayer.create(this, R.raw.qdh)
        ballerLos = MediaPlayer.create(this, R.raw.ballerlos)
        gokhanAbi = MediaPlayer.create(this, R.raw.gokhanabi)
        volo62 = MediaPlayer.create(this, R.raw.kommenurmitvolo62)
        gringosauer = MediaPlayer.create(this, R.raw.gringosauer)

        // Wo sind deine Jungs, wo?
        btn0.setOnClickListener {
            woSindDeineJungs.seekTo(0)
            woSindDeineJungs.start()
        }

        // QDH
        btn1.setOnClickListener {
            qdh.seekTo(0)
            qdh.start()
        }

        // Baller Los
        btn2.setOnClickListener {
            ballerLos.seekTo(0)
            ballerLos.start()
        }

        // Gökhan Abi
        btn3.setOnClickListener {
            gokhanAbi.seekTo(0)
            gokhanAbi.start()
        }

        // Volo 62
        btn4.setOnClickListener {
            volo62.seekTo(0)
            volo62.start()
        }

        // Gringo ist sauer
        btn5.setOnClickListener({
            gringosauer.seekTo(0)
            gringosauer.start()
        })



        setSupportActionBar(toolbar2)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        val intent = Intent(this, FeedbackActivity::class.java)
        startActivity(intent)

        return super.onOptionsItemSelected(item)
    }

}
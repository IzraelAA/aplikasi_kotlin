package com.google.ai.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_fullscreen.*

class FullscreenActivity : AppCompatActivity() {
    private lateinit var rvHeroes: RecyclerView
    private var list: ArrayList<Menu> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fullscreen)

        var intent = intent
        val nama = intent.getStringExtra("Name")
        val resultTv = findViewById<TextView>(R.id.texttv)
        resultTv.text = "Halo"+nama
        rvHeroes = findViewById(R.id.rv_view)
        rvHeroes.setHasFixedSize(true)

        list.addAll(HeroesData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvHeroes.layoutManager = GridLayoutManager(this, 2)
        val gridHeroAdapter = GridHeroAdapter(list)
        rvHeroes.adapter = gridHeroAdapter
    }
}
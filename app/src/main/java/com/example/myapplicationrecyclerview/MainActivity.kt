package com.example.myapplicationrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var monsters = ArrayList<Monster>()
       val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        monsters.add(Monster("new","new","new","new",12.0,12))
        monsters.add(Monster("new","new","new","new",12.0,12))
        monsters.add(Monster("new","new","new","new",12.0,12))

        val adapter = MainRecyclerAdapter(this, monsters)
        recyclerView.adapter = adapter
    }
}
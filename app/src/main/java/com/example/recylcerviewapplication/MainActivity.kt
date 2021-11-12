package com.example.recylcerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cityNameList: List<String> =
            listOf("Tomsk", "Omsk", "Barnaul", "Ekaterinburg", "Anadir", "Okha")
        val megapolisList: List<Megapolis> = listOf(
            Megapolis("Barnaul", 1000),
            Megapolis("Novosibirsk", 1500),
            Megapolis("Omsk", 650)
        )
        val cityRecyclerView: RecyclerView = findViewById(R.id.city_recycler_view)
        cityRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        cityRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )

        cityRecyclerView.adapter = MegapolisAdapter(megapolisList)


    }
}
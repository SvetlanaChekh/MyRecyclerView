package com.example.recylcerviewapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonAbout: Button=findViewById(R.id.button_about)
        val link= Uri.parse("https://lk.sakhgu.ru")
        val intent=Intent(Intent.ACTION_VIEW, link)
        buttonAbout.setOnClickListener {
            startActivity(intent)
        }


        val bannerList: List<Banner> = listOf(
            Banner(R.drawable.chekhonina_photo, "supervisor Chekhonina Svetlana"),
            Banner(R.drawable.pak_photo, "programmer Pak Dmitriy"),
            Banner(R.drawable.scheroburko_photo, "programmer Scheroburko Vyacheslav")
        )

        val employeeRecyclerView: RecyclerView = findViewById(R.id.employee_recycler_view)
        employeeRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        /*employeeRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )*/
        employeeRecyclerView.adapter = BannerAdapter(bannerList)


    }
}
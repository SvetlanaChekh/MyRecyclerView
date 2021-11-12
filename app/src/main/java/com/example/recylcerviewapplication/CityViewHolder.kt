package com.example.recylcerviewapplication

import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(cityName: String) {
        val cityNameTextView: TextView = itemView.findViewById(R.id.city_recycler_view)//
        cityNameTextView.text = cityName


        val toastButton: Button = itemView.findViewById(R.id.toast_button)
        toastButton.setOnClickListener {
            Toast.makeText(itemView.context, cityName, Toast.LENGTH_LONG).show()
        }
    }
}

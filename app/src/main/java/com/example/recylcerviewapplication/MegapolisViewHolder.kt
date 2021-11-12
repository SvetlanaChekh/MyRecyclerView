package com.example.recylcerviewapplication

import android.view.View
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class MegapolisViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(megapolis: Megapolis) {
        val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
        val populationTextView: TextView = itemView.findViewById(R.id.population_text_view)
        nameTextView.text = megapolis.name

        val populationFormatted = "${megapolis.population} тыс.чел."
        populationTextView.text = populationFormatted
    }

}
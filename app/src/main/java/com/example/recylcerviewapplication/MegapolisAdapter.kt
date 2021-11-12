package com.example.recylcerviewapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MegapolisAdapter (private val megapolisList:List<Megapolis>) : RecyclerView.Adapter<MegapolisViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MegapolisViewHolder {
        val megapolisListItemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.megapolis_list_item, parent, false)

        return MegapolisViewHolder(megapolisListItemView)
    }

    override fun onBindViewHolder(holder: MegapolisViewHolder, position: Int) {
        val megapolis = megapolisList[position]
        holder.bind(megapolis)
    }

    override fun getItemCount(): Int {
        return megapolisList.size
    }
}
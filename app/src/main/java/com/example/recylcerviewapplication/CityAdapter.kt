package com.example.recylcerviewapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CityAdapter(private val cityNameList:List<String>): RecyclerView.Adapter<CityViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val cityItemView=LayoutInflater.from(parent.context).inflate(R.layout.city_list_item, parent, false)
        return CityViewHolder(cityItemView)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val cityName = cityNameList[position]
        holder.bind(cityName)
    }

    override fun getItemCount(): Int {
        return cityNameList.size
    }
}
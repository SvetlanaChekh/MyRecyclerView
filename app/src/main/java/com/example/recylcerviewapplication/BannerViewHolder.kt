package com.example.recylcerviewapplication

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class BannerViewHolder(itemView:View): RecyclerView. ViewHolder(itemView) {
    fun bind(banner: Banner){
        val bannerImageView: ImageView=itemView.findViewById(R.id.banner_image_view)
        val bannerDescriptionTextView: TextView=itemView.findViewById(R.id.description_text_view)
        bannerImageView.setImageDrawable(itemView.context.getDrawable(banner.imageRes))
        bannerDescriptionTextView.text=banner.description
        //Toast.makeText(itemView.context, cityName, Toast.LENGTH_LONG).show()
        Toast.makeText(itemView.context,banner.description, Toast.LENGTH_SHORT).show()
    }
}
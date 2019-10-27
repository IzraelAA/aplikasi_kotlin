package com.google.ai.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridHeroAdapter(val listHeroes: ArrayList<Menu>) : RecyclerView.Adapter<GridHeroAdapter.GridViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.content_main, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val hero = listHeroes[position]
        Glide.with(holder.itemView.context)
            .load(hero.Gambar)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.nama.text = hero.Menu
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu memilih " + hero.Menu, Toast.LENGTH_SHORT).show() }
    }


    override fun getItemCount(): Int {
        return listHeroes.size
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var nama: TextView = itemView.findViewById(R.id.nama)
    }
}
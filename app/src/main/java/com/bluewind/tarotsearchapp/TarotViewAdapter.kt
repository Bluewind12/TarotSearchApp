package com.bluewind.tarotsearchapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

internal class TarotViewAdapter : RecyclerView.Adapter<TarotViewHolder>() {
    private var list: List<Tarot> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarotViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return TarotViewHolder.create(inflater, parent, false)
    }

    override fun onBindViewHolder(holder: TarotViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun setItem(list: List<Tarot>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = list.size
}
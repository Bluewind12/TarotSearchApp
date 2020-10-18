package com.bluewind.tarotsearchapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bluewind.tarotsearchapp.databinding.TarotViewBinding

internal class TarotViewHolder(
    itemView: View,
    private val binding: TarotViewBinding
) : RecyclerView.ViewHolder(itemView) {
    companion object {
        fun create(
            inflater: LayoutInflater,
            container: ViewGroup,
            attachToRoot: Boolean
        ): TarotViewHolder {
            val binding = TarotViewBinding.inflate(inflater, container, attachToRoot)
            return TarotViewHolder(binding.root, binding)
        }
    }

    fun bind(item: Tarot) {
        binding.apply {
            tarot = item
            executePendingBindings()
        }
    }
}
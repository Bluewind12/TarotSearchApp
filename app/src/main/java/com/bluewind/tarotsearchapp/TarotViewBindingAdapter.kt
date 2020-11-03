package com.bluewind.tarotsearchapp

import android.widget.ImageView
import androidx.databinding.BindingAdapter

internal object TarotViewBindingAdapter {
    @JvmStatic
    @BindingAdapter("imageResource")
    fun setImageResource(imageView: ImageView, resource: Int): Unit {
        imageView.setImageResource(resource)
    }
}

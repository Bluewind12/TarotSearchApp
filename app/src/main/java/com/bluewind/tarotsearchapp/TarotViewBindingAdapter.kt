package com.bluewind.tarotsearchapp

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter

internal object TarotViewBindingAdapter {
    @JvmStatic
    @BindingAdapter("android:src")
    fun setDrawable(
        imageView: ImageView?,
        drawable: Drawable?
    ) {
        if (imageView == null) return
        drawable?.let {
            imageView.setImageDrawable(drawable)
        }
    }
}

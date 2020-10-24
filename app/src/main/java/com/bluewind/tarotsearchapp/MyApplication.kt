package com.bluewind.tarotsearchapp

import android.app.Application
import android.content.Context


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    fun setActivity(activity: MainActivity) {
        mainActivity = activity
    }

    companion object {
        private var context: Context? = null
        val appContext: Context?
            get() = context

        private var mainActivity: MainActivity? = null
        var appActivity: MainActivity?
            get() = mainActivity
            set(value) {
                mainActivity = value
            }

        private var rotate: Int = 0
        var deviceRotate: Int
            get() = rotate
            set(value) {
                when (value) {
                    0, 180 -> rotate = value
                }
            }
    }
}
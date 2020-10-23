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
        private var mainActivity: MainActivity? = null
        val appContext: Context?
            get() = context

        var appActivity: MainActivity?
            get() = mainActivity
            set(value) {
                mainActivity = value
            }
    }
}
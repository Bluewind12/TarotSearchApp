package com.bluewind.tarotsearchapp

import android.content.Context
import android.os.Bundle
import android.view.OrientationEventListener
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var mOrientationEventListener: OrientationEventListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyApplication.appActivity = this

        //起動時調査
        startCheck()

        mOrientationEventListener = object : OrientationEventListener(this) {
            override fun onOrientationChanged(orientation: Int) {
                MyApplication.deviceRotate = (orientation + 45) / 90 * 90
            }
        }
    }

    override fun onResume() {
        super.onResume()
        mOrientationEventListener.enable()
    }

    override fun onPause() {
        super.onPause()
        mOrientationEventListener.disable()
    }

    private fun startCheck() {
        val sharedPreferences = getSharedPreferences("TarotDictionary", Context.MODE_PRIVATE)

        if (sharedPreferences.getBoolean("FirstTimeStartup", true)) {
            //ここで使い方の表示
            AlertDialog.Builder(this)
                .setMessage("テスト用")
                .setTitle("テスト用")
                .create()
                .show()


        }
    }
}
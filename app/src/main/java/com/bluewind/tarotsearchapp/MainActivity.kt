package com.bluewind.tarotsearchapp

import android.content.Context
import android.os.Bundle
import android.view.OrientationEventListener
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.bluewind.tarotsearchapp.readme.ReadMeViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.read_me_tab_layout.*
import kotlinx.android.synthetic.main.read_me_tab_layout.view.*


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
//            AlertDialog.Builder(this)
//                .setTitle("使い方")
//                .setMessage("このアプリはスマートフォン・タブレットの向きを利用したアプリです。\n普通に持った状態でタロットをタップすると「正位置」の説明が\n逆向きにした状態でタロットをタップすると「逆位置」の説明が表示されます。")
//                .create()
//                .show()
//

            val view: View = layoutInflater.inflate(R.layout.read_me_tab_layout, null)
            view.readMeViewPager.adapter = ReadMeViewPagerAdapter(supportFragmentManager, lifecycle)
            TabLayoutMediator(
                view.readMeTabLayout,
                view.readMeViewPager,
                TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                }
            ).attach()

            AlertDialog.Builder(this)
                .setView(view)
                .show()
        }
    }
}
package com.bluewind.tarotsearchapp

import android.content.Context
import android.os.Bundle
import android.view.OrientationEventListener
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.bluewind.tarotsearchapp.readme.ReadMeViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.read_me_tab_layout.view.*
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.main_fragment.*

class MainActivity : AppCompatActivity() {
    private lateinit var mOrientationEventListener: OrientationEventListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //起動時調査
        startCheck()
        //AD初期化
        MobileAds.initialize(this) {}
        adMainView.loadAd(AdRequest.Builder().build())

        //InterstitialAd
        val mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-3940256099942544/1033173712" //TODO : リリース時に変更
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        mInterstitialAd.adListener = object : AdListener() {
            override fun onAdClosed() {
                mInterstitialAd.loadAd(AdRequest.Builder().build())
            }
        }
        MyApplication.appInterstitialAd = mInterstitialAd

        MyApplication.appActivity = this
        mOrientationEventListener = object : OrientationEventListener(this) {
            override fun onOrientationChanged(orientation: Int) {
                MyApplication.deviceRotate = (orientation + 45) / 90 * 90
            }
        }
        floatingActionButton.setOnClickListener {
            showReadMe()
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
                .setOnDismissListener {
                    val edit = sharedPreferences.edit()
                    edit.putBoolean("FirstTimeStartup", false)
                    edit.apply()
                }
                .show()
        }
    }

    private fun showReadMe() {
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
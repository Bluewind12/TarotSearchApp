package com.bluewind.tarotsearchapp

import android.os.Bundle
import android.view.OrientationEventListener
import androidx.appcompat.app.AppCompatActivity
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
    }

    override fun onResume() {
        super.onResume()
        mOrientationEventListener.enable()
    }

    override fun onPause() {
        super.onPause()
        mOrientationEventListener.disable()
    }
}
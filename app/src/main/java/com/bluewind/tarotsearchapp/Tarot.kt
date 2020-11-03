package com.bluewind.tarotsearchapp

import android.app.AlertDialog
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.tarot_info_modal_reverse.view.*
import kotlinx.android.synthetic.main.tarot_info_modal_upright.view.*


data class Tarot(
    val title: String,
    val num: Int,
    val numTitle: String,
    val uprightInfo: String,
    val reverseInfo: String,
    val drawable: Int
) {
    fun showModal(tarot: Tarot) {
        when (MyApplication.deviceRotate) {
            0 -> uprightInfo(tarot)
            180 -> reverseInfo(tarot)
        }
    }

    private fun uprightInfo(tarot: Tarot) {
        val view: View = LayoutInflater.from(MyApplication.appContext)
            .inflate(R.layout.tarot_info_modal_upright, null)

        val titleTextView = view.uprightTitleText
        val numTextView = view.uprightNumText
        val infoTextView = view.uprightInfoText
        val positionTextView = view.uprightPositionText

        titleTextView.text = tarot.title
        numTextView.text = tarot.numTitle
        infoTextView.text = tarot.uprightInfo
        positionTextView.text = "正位置"


        val mDialog = AlertDialog.Builder(MyApplication.appActivity)
            .setView(view)
            .create()

        mDialog.show()
    }

    private fun reverseInfo(tarot: Tarot) {
        val view: View = LayoutInflater.from(MyApplication.appContext)
            .inflate(R.layout.tarot_info_modal_reverse, null)

        val titleTextView = view.reverseTitleText
        val numTextView = view.reverseNumText
        val infoTextView = view.reverseInfoText
        val positionTextView = view.reversePositionText

        titleTextView.text = tarot.title
        numTextView.text = tarot.numTitle
        infoTextView.text = tarot.reverseInfo
        positionTextView.text = "逆位置"

        val mDialog = AlertDialog.Builder(MyApplication.appActivity)
            .setView(view)
            .create()

        mDialog.show()
    }
}
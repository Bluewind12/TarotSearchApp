package com.bluewind.tarotsearchapp

import android.app.AlertDialog
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.tarot_info_modal_reverse.view.*
import kotlinx.android.synthetic.main.tarot_info_modal_upright.view.*


data class Tarot(
    val title: String,
    val num: Int,
    val numTitle: String,
    val drawable: Drawable?
) {
    fun uprightInfo(title: String) {
        val view: View = LayoutInflater.from(MyApplication.appContext)
            .inflate(R.layout.tarot_info_modal_upright, null)

        view.uprightTitleText.text = title
        view.uprightNumText.text = "000"
        view.uprightInfoText.text = "TEST"

        val closeButton: Button = view.uprightCloseButton as Button
        closeButton.text = "閉じる"


        val mDialog = AlertDialog.Builder(MyApplication.appActivity)
            .setView(view)
            .create()

        closeButton.setOnClickListener {
            mDialog.dismiss()
        }

        mDialog.show()
    }
    fun reverseInfo(title: String) {
        val view: View = LayoutInflater.from(MyApplication.appContext)
            .inflate(R.layout.tarot_info_modal_reverse, null)

        view.reverseTitleText.text = title
        view.reverseNumText.text = "000"
        view.reverseInfoText.text = "TEST"

        val closeButton: Button = view.reverseCloseButton as Button
        closeButton.text = "閉じる"


        val mDialog = AlertDialog.Builder(MyApplication.appActivity)
            .setView(view)
            .create()

        closeButton.setOnClickListener {
            mDialog.dismiss()
        }

        mDialog.show()
    }
}
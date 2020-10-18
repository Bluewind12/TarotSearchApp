package com.bluewind.tarotsearchapp.enum

import com.bluewind.tarotsearchapp.R

enum class TarotEnum(
    val num: Int,
    val title: String,
    val numString: String,
    val drawable: Int,
    val info: String,
    val backInfo: String
) {
    THE_FOOL(0, "愚者", "0", R.drawable.ic_launcher_background, "", ""),
    THE_MAGICIAN(1, "魔術師", "I", R.drawable.ic_launcher_background, "", ""),
    THE_HIGH_PRIESTESS(2, "女教皇", "II", R.drawable.ic_launcher_background, "", ""),
    THE_EMPRESS(3, "女帝", "III", R.drawable.ic_launcher_background, "", ""),
    THE_EMPEROR(4, "皇帝", "IV", R.drawable.ic_launcher_background, "", ""),
    THE_HIEROPHANT(5, "教皇", "V", R.drawable.ic_launcher_background, "", ""),
    THE_LOVERS(6, "恋人たち", "VI", R.drawable.ic_launcher_background, "", ""),
    THE_CHARIOT(7, "戦車", "VII", R.drawable.ic_launcher_background, "", ""),
    STRENGTH(8, "力", "VIII", R.drawable.ic_launcher_background, "", ""),
    THE_HERMIT(9, "隠者", "IX", R.drawable.ic_launcher_background, "", ""),
    WHEEL_OF_FORTUNE(10, "運命の輪", "X", R.drawable.ic_launcher_background, "", ""),
    JUSTICE(11, "正義", "XI", R.drawable.ic_launcher_background, "", ""),
    THE_HANGED_MAN(12, "吊るされた男", "XII", R.drawable.ic_launcher_background, "", ""),
    DEATH(13, "死", "XIII", R.drawable.ic_launcher_background, "", ""),
    TEMPERANCE(14, "節制", "XIV", R.drawable.ic_launcher_background, "", ""),
    THE_DEVIL(15, "悪魔", "XV", R.drawable.ic_launcher_background, "", ""),
    THE_TOWER(16, "塔", "XVI", R.drawable.ic_launcher_background, "", ""),
    THE_STAR(17, "星", "XVII", R.drawable.ic_launcher_background, "", ""),
    THE_MOON(18, "月", "XVIII", R.drawable.ic_launcher_background, "", ""),
    THE_SUN(19, "太陽", "XIX", R.drawable.ic_launcher_background, "", ""),
    JUDGEMENT(20, "審判", "XX", R.drawable.ic_launcher_background, "", ""),
    THE_WORLD(21, "世界", "XXI", R.drawable.ic_launcher_background, "", ""),
}
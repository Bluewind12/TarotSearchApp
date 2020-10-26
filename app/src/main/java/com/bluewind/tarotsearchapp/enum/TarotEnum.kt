package com.bluewind.tarotsearchapp.enum

import com.bluewind.tarotsearchapp.R

enum class TarotEnum(
    val num: Int,
    val title: String,
    val numString: String,
    val info: String,
    val backInfo: String,
    val drawable: Int
) {
    THE_FOOL(0, "愚者", "0", "", "", R.drawable.rws_tarot_00_fool),
    THE_MAGICIAN(1, "魔術師", "I", "", "", R.drawable.rws_tarot_01_magician),
    THE_HIGH_PRIESTESS(2, "女教皇", "II", "", "", R.drawable.rws_tarot_02_high_priestess),
    THE_EMPRESS(3, "女帝", "III", "", "", R.drawable.rws_tarot_03_empress),
    THE_EMPEROR(4, "皇帝", "IV", "", "", R.drawable.rws_tarot_04_emperor),
    THE_HIEROPHANT(5, "教皇", "V", "", "", R.drawable.rws_tarot_05_hierophant),
    THE_LOVERS(6, "恋人たち", "VI", "", "", R.drawable.rws_tarot_06_lovers),
    THE_CHARIOT(7, "戦車", "VII", "", "", R.drawable.rws_tarot_07_chariot),
    STRENGTH(8, "力", "VIII", "", "", R.drawable.rws_tarot_08_strength),
    THE_HERMIT(9, "隠者", "IX", "", "", R.drawable.rws_tarot_09_hermit),
    WHEEL_OF_FORTUNE(10, "運命の輪", "X", "", "", R.drawable.rws_tarot_10_wheel_of_fortune),
    JUSTICE(11, "正義", "XI", "", "", R.drawable.rws_tarot_11_justice),
    THE_HANGED_MAN(12, "吊るされた男", "XII", "", "", R.drawable.rws_tarot_12_hanged_man),
    DEATH(13, "死", "XIII", "", "", R.drawable.rws_tarot_13_death),
    TEMPERANCE(14, "節制", "XIV", "", "", R.drawable.rws_tarot_14_temperance),
    THE_DEVIL(15, "悪魔", "XV", "", "", R.drawable.rws_tarot_15_devil),
    THE_TOWER(16, "塔", "XVI", "", "", R.drawable.rws_tarot_16_tower),
    THE_STAR(17, "星", "XVII", "", "", R.drawable.rws_tarot_17_star),
    THE_MOON(18, "月", "XVIII", "", "", R.drawable.rws_tarot_18_moon),
    THE_SUN(19, "太陽", "XIX", "", "", R.drawable.rws_tarot_19_sun),
    JUDGEMENT(20, "審判", "XX", "", "", R.drawable.rws_tarot_20_judgement),
    THE_WORLD(21, "世界", "XXI", "", "", R.drawable.rws_tarot_21_world),
}
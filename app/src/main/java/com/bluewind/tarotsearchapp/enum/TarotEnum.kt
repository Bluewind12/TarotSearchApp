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
    THE_FOOL(0, "愚者", "0", "直感、期待、変化、積極的", "幻滅、愚考、気まぐれ、消極的", R.drawable.rws_tarot_00_fool),
    THE_MAGICIAN(1, "魔術師", "I", "奇抜、才能、好奇心、創造力", "凡庸、曖昧、無気力、優柔不断", R.drawable.rws_tarot_01_magician),
    THE_HIGH_PRIESTESS(2, "女教皇", "II", "知性、安心、安らぎ、聡明", "悲観、自己中心的、疑心暗鬼", R.drawable.rws_tarot_02_high_priestess),
    THE_EMPRESS(3, "女帝", "III", "豊穣、繁栄、結婚、女性的魅力", "浪費、無駄、婚約破棄、", R.drawable.rws_tarot_03_empress),
    THE_EMPEROR(4, "皇帝", "IV", "威厳、実行力、統率力", "頑固、過労、独善的、計画倒れ", R.drawable.rws_tarot_04_emperor),
    THE_HIEROPHANT(5, "教皇", "V", "共感、慈愛、親切、広い視野", "誤解、悲観、反感、狭い視野", R.drawable.rws_tarot_05_hierophant),
    THE_LOVERS(6, "恋人たち", "VI", "恋愛、性的魅力、決断", "失恋、見込み違い、選択の失敗", R.drawable.rws_tarot_06_lovers),
    THE_CHARIOT(7, "戦車", "VII", "勝利、征服、困難の突破、問題解決", "失敗、困難、悪戦苦闘、事故", R.drawable.rws_tarot_07_chariot),
    STRENGTH(8, "力", "VIII", "意志、気力、信念、独立", "放棄、妥協、自信喪失", R.drawable.rws_tarot_08_strength),
    THE_HERMIT(9, "隠者", "IX", "秘智、孤独、核心、思慮", "虚実、劣等感、混沌、愚痴", R.drawable.rws_tarot_09_hermit),
    WHEEL_OF_FORTUNE(10, "運命の輪", "X", "好転、宿命、事態の進展", "暗転、混沌、すれ違い", R.drawable.rws_tarot_10_wheel_of_fortune),
    JUSTICE(11, "正義", "XI", "正義、均衡、名誉、正当性", "別離、不正、悪徳、モラルの欠如", R.drawable.rws_tarot_11_justice),
    THE_HANGED_MAN(12, "吊るされた男", "XII", "犠牲、努力、忍耐、救済", "無駄、徒労、疲労、骨折り損", R.drawable.rws_tarot_12_hanged_man),
    DEATH(13, "死", "XIII", "崩壊、死、損失、終末", "再生、更新、仕切り直し", R.drawable.rws_tarot_13_death),
    TEMPERANCE(14, "節制", "XIV", "調節、安定、堅実、適応", "暴走、傲慢、感情的", R.drawable.rws_tarot_14_temperance),
    THE_DEVIL(15, "悪魔", "XV", "執着、堕落、邪心、悪意", "回復、気持ち整理、解放", R.drawable.rws_tarot_15_devil),
    THE_TOWER(16, "塔", "XVI", "苦境、崩壊、破滅、破綻", "緊迫、無念、屈辱、誤解", R.drawable.rws_tarot_16_tower),
    THE_STAR(17, "星", "XVII", "希望、閃き、明るい未来、可能性", "儚さ、失望、短命、考えすぎ", R.drawable.rws_tarot_17_star),
    THE_MOON(18, "月", "XVIII", "不安、懸念、恐怖、胸騒ぎ", "真実、明瞭、光明、安堵", R.drawable.rws_tarot_18_moon),
    THE_SUN(19, "太陽", "XIX", "成功、誕生、満足、成就", "延期、中止、挫折、停滞", R.drawable.rws_tarot_19_sun),
    JUDGEMENT(20, "審判", "XX", "復活、改善、覚醒、発展", "悔恨、行き詰まり、再起不能", R.drawable.rws_tarot_20_judgement),
    THE_WORLD(21, "世界", "XXI", "完全、完璧、攻略、優勝", "衰退、低迷、未完成、調和の崩壊", R.drawable.rws_tarot_21_world),
}
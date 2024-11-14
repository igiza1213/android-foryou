package com.example.android_foryou.screens.home

import com.example.android_foryou.R

object HomeData {

    val hotItems = listOf(
        HotModel("롯데월드", "5.3", R.drawable.lotte),
        HotModel("콘서트", "2.7", R.drawable.concert),
        HotModel("야구장", "1.5", R.drawable.bassball),
        HotModel("경복궁", "5.7", R.drawable.castle),
    )

    val listItems = listOf(
        ListModel("경복궁", "경복궁 데이트 다녀왔어요~", "130", R.drawable.small_castle),
        ListModel("서울숲", "서울숲 데이트 다녀왔어요~", "110", R.drawable.small_forest),
        ListModel("야구장", "야구장 데이트 다녀왔어요~", "10", R.drawable.small_baseball),
    )
}
package com.magdy.meditationuicompose

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.ColorUtils

data class Feature(
    val title:String,
    @DrawableRes val iconId:Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)

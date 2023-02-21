package com.example.meditation

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Feature(
 val title:String,
 @DrawableRes val iconid:Int,
 val lightcolor:Color,
 val mediumcolor:Color,
 val darkcolor:Color
)
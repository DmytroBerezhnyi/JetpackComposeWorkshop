package com.example.jetpackcomposeworkshop.model

import androidx.annotation.DrawableRes

data class Participant(
    val name: String,
    val surname: String,
    @DrawableRes val image: Int? = null,
    val isPremium: Boolean = false,
    val isSpeaking: Boolean = false,
    val isSpeakingAllowed: Boolean,
    val volume: Int = 100,
)
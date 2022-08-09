package com.example.jetpackcomposeworkshop.model

import androidx.annotation.DrawableRes
import com.example.jetpackcomposeworkshop.R

data class Participant(
    val name: String,
    val surname: String,
    @DrawableRes val image: Int? = null,
    val isPremium: Boolean = false,
    val isSpeaking: Boolean = false,
    val isSpeakingAllowed: Boolean,
    val volume: Int = 100,
)

val participantList: List<Participant> = listOf(
    Participant(
        name = "Guillaume",
        surname = "Lefevre",
        image = R.drawable.dev_gui,
        isPremium = true,
        isSpeaking = true,
        isSpeakingAllowed = true,
    ),
    Participant(
        name = "Alfred",
        surname = "Arokkia",
        image = R.drawable.dev_alfred,
        isPremium = true,
        isSpeaking = false,
        isSpeakingAllowed = true,
    ),
    Participant(
        name = "Pavel",
        surname = "Shashkov",
        image = R.drawable.dev_pavel,
        isPremium = true,
        isSpeaking = false,
        isSpeakingAllowed = true,
    ),
    Participant(
        name = "Raphaël",
        surname = "Teyssandier",
        image = R.drawable.dev_raph,
        isPremium = true,
        isSpeaking = false,
        isSpeakingAllowed = true,
    ),
    Participant(
        name = "Lam",
        surname = "Pham",
        image = R.drawable.dev_lam,
        isPremium = true,
        isSpeaking = false,
        isSpeakingAllowed = true,
    ),
    Participant(
        name = "Zine Eddine",
        surname = "Latioui",
        image = R.drawable.dev_zizou,
        isPremium = true,
        isSpeaking = false,
        isSpeakingAllowed = true,
    ),
    Participant(
        name = "Aya",
        surname = "Boussaadia",
        image = R.drawable.dev_aya,
        isPremium = true,
        isSpeaking = false,
        isSpeakingAllowed = true,
    ),
    Participant(
        name = "Alexey",
        surname = "Tereshchenko",
        image = R.drawable.dev_alexey,
        isPremium = true,
        isSpeaking = false,
        isSpeakingAllowed = true,
    ),
    Participant(
        name = "Dmytro",
        surname = "Berezhnyi",
        image = R.drawable.dev_dmytro,
        isSpeakingAllowed = true,
        isPremium = true,
        isSpeaking = true,
    ),
    Participant(
        name = "Nicolas",
        surname = "Moges",
        image = R.drawable.dev_nico,
        isPremium = true,
        isSpeaking = false,
        isSpeakingAllowed = true,
    ),
    Participant(
        name = "Antoine",
        surname = "Pelletier",
        image = R.drawable.dev_antoine,
        isPremium = true,
        isSpeaking = false,
        isSpeakingAllowed = true,
    ),
    Participant(
        name = "Mukhammad",
        surname = "Shodiev",
        image = R.drawable.dev_mukham,
        isPremium = true,
        isSpeaking = false,
        isSpeakingAllowed = true,
    ),
    Participant(
        name = "Ilya",
        surname = "Pavlik",
        isPremium = true,
        isSpeaking = false,
        isSpeakingAllowed = true,
    )
)
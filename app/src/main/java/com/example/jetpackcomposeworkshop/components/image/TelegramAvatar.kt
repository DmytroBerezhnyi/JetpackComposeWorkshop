package com.example.jetpackcomposeworkshop.components.image

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeworkshop.ui.theme.TelegramPrimary

@Composable
fun TelegramAvatar(@DrawableRes image: Int?, name: String, surname: String) {
    if (image != null) {
        /* Image(
             asset = image,
             modifier = Modifier.size(40.dp)
         )*/
    } else {
        Box(
            modifier = Modifier
                .size(65.dp)
                .clip(CircleShape)
                .background(TelegramPrimary)
                .padding(8.dp)
        ) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = name.first().toString() + surname.first(),
                color = Color.White,
                style = MaterialTheme.typography.h5
            )
        }
    }
}
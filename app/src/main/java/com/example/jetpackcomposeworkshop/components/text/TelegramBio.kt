package com.example.jetpackcomposeworkshop.components.text

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeworkshop.R

@Composable
fun TelegramBio(name: String, surname: String, isPremium: Boolean) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "$name $surname",
            color = Color.White,
            style = MaterialTheme.typography.body1
        )

        if (isPremium) {
            Image(
                modifier = Modifier
                    .padding(start = 4.dp)
                    .size(16.dp),
                painter = painterResource(id = R.drawable.image_telegram_star),
                contentDescription = "telegram_premium"
            )
        }
    }
}
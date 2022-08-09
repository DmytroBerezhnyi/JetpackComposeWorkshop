package com.example.jetpackcomposeworkshop.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeworkshop.R
import com.example.jetpackcomposeworkshop.components.linearGradient

@Composable
fun HandUpComponent(modifier: Modifier, onClicked: () -> Unit) {
    Box(
        modifier = Modifier
            .size(200.dp)
            .clip(CircleShape)
            .background(
                Brush.radialGradient(
                    colors = listOf(
                        Color(0x40232537), Color(0x201F232E)
                    )
                )
            )
            .then(modifier)
    ) {
        Box(modifier = Modifier
            .size(130.dp)
            .clip(CircleShape)
            .background(
                Brush.linearGradient(
                    0.0f to Color(0xFF6B82F2),
                    0.05f to Color(0xFF7079EC),
                    0.15f to Color(0xFF7079EC),
                    0.8f to Color(0xFFaf5fa3),
                    0.9f to Color(0xFFbd5d8f),
                    0.95f to Color(0xFFbd5d8f),
                    angleInDegrees = 45f,
                    tileMode = TileMode.Decal
                )
            )
            .clickable { onClicked() }
            .align(Alignment.Center)) {
            Image(
                modifier = Modifier
                    .size(75.dp)
                    .align(Alignment.Center),
                painter = painterResource(id = R.drawable.image_hand_up),
                contentDescription = "Muted by admin"
            )
        }

        Text(
            modifier = Modifier
                .padding(bottom = 8.dp)
                .align(Alignment.BottomCenter),
            text = "Muted by admin",
            color = Color.White
        )
    }
}
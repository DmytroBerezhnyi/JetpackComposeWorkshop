package com.example.jetpackcomposeworkshop.components.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun CircleButton(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    circleTint: Color = Color.Black,
    imageTint: Color = Color.White,
    circleSize: Dp = 60.dp,
    iconSize: Dp = 30.dp,
    contentDescription: String = "",
    content: @Composable () -> Unit
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(circleSize)
                .clip(CircleShape)
                .background(circleTint)
                .then(modifier)
        ) {
            Icon(
                modifier = Modifier
                    .size(iconSize)
                    .align(Alignment.Center),
                imageVector = imageVector,
                tint = imageTint,
                contentDescription = contentDescription
            )
        }

        content()
    }
}
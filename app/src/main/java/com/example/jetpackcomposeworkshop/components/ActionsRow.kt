package com.example.jetpackcomposeworkshop.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CallEnd
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeworkshop.components.button.CircleButton

@Composable
fun BoxScope.ActionsRow() {
    Row(
        Modifier
            .fillMaxWidth()
            .height(220.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent,
                        Color.Black.copy(alpha = 1f),
                    ),
                    startY = 230f,
                )
            )
            .align(Alignment.BottomCenter),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        CircleButton(
            imageVector = Icons.Filled.VolumeUp,
            circleTint = Color(0xFF4B5F91),
            contentDescription = "Speaker",
            content = {
                Text(
                    modifier = Modifier.padding(top = 4.dp),
                    text = "Speaker",
                    color = Color.White
                )
            }
        )

        HandUpComponent(
            modifier = Modifier.padding(horizontal = 32.dp),
            onClicked = {},
        )

        CircleButton(
            imageVector = Icons.Filled.CallEnd,
            circleTint = Color(0xFF863D3F),
            contentDescription = "Leave",
            content = {
                Text(
                    modifier = Modifier.padding(top = 4.dp),
                    text = "Leave",
                    color = Color.White
                )
            }
        )
    }
}
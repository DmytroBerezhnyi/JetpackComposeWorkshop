package com.example.jetpackcomposeworkshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeworkshop.components.ActionsRow
import com.example.jetpackcomposeworkshop.components.participant.ParticipantItem
import com.example.jetpackcomposeworkshop.model.Participant
import com.example.jetpackcomposeworkshop.ui.theme.Background
import com.example.jetpackcomposeworkshop.ui.theme.CardBackground
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelegramConferenceScreen()
        }
    }
}

@Preview
@Composable
fun TelegramConferenceScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Background)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Android Team  \uD83D\uDCAA",
                color = Color.White,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Text(
                text = "12 participant",
                color = Color(0xFF878C92),
                style = MaterialTheme.typography.body1,
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(CardBackground)
            ) {
                LazyColumn {
                    items(participantList) {
                        ParticipantItem(it)
                    }
                }
            }
        }

        ActionsRow()
    }
}

val participantList = listOf(
    Participant(
        name = "Dmytro",
        surname = "Berezhnyi",
        isSpeakingAllowed = true,
        isPremium = true,
        isSpeaking = true,
    ),
    Participant(
        name = "Alexey",
        surname = "Tereshchenko",
        isPremium = true,
        isSpeaking = false,
        isSpeakingAllowed = false,
    )
)
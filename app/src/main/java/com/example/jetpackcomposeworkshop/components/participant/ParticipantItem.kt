package com.example.jetpackcomposeworkshop.components.participant

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MicNone
import androidx.compose.material.icons.filled.MicOff
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeworkshop.components.image.TelegramAvatar
import com.example.jetpackcomposeworkshop.components.text.TelegramBio
import com.example.jetpackcomposeworkshop.model.Participant

@Composable
fun ParticipantItem(participant: Participant) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TelegramAvatar(participant.image, participant.name, participant.surname)

        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            TelegramBio(participant.name, participant.surname, participant.isPremium)
            ParticipantCallStatus(participant.isSpeaking, participant.volume)
        }

        Spacer(modifier = Modifier.weight(1f))

        Icon(
            modifier = Modifier.padding(horizontal = 16.dp),
            imageVector = if (participant.isSpeakingAllowed) Icons.Default.MicNone else Icons.Default.MicOff,
            tint = when {
                participant.isSpeaking -> Color(0xFF89D48D)
                participant.isSpeakingAllowed -> Color(0xFF878C92)
                else -> Color.Red
            },
            contentDescription = "Microphone"
        )
    }
}

@Composable
fun ParticipantCallStatus(isSpeaking: Boolean, speakingVolume: Int) {
    if (isSpeaking) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Filled.VolumeUp,
                tint = Color(0xFF89D48D),
                contentDescription = "Microphone"
            )
            Text(
                text = "$speakingVolume speaking",
                color = Color(0xFF89D48D),
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(horizontal = 4.dp)
            )
        }
    } else {
        Text(
            text = "listening",
            color = Color(0xFF6AA8DA),
            style = MaterialTheme.typography.body1
        )
    }
}
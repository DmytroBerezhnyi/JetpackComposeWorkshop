package com.example.jetpackcomposeworkshop.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jetpackcomposeworkshop.components.loading.LoadingIndicator
import com.example.jetpackcomposeworkshop.components.participant.ParticipantItem
import com.example.jetpackcomposeworkshop.model.Participant
import com.example.jetpackcomposeworkshop.model.participantList
import com.example.jetpackcomposeworkshop.ui.theme.Background
import com.example.jetpackcomposeworkshop.ui.theme.CardBackground


@Composable
fun TelegramConferenceScreen() {
    val vm: TelegramConferenceViewModel = hiltViewModel()

    LaunchedEffect(key1 = Unit) {
        vm.loadParticipants()
    }

    Scaffold {
        TelegramConferenceScreenContent(
            modifier = Modifier.padding(it),
            participants = vm.participants,
            onMuteClicked = vm::muteParticipant,
        )
    }
}

@Composable
private fun TelegramConferenceScreenContent(
    modifier: Modifier = Modifier,
    participants: List<Participant>,
    onMuteClicked: (Participant) -> Unit = {},
) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Background)
            .then(modifier)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (participants.isEmpty()) {
                LoadingIndicator(modifier = Modifier.fillMaxSize())
            } else {
                ConferenceDetailsColumn(participants.size)

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .clip(shape = RoundedCornerShape(12.dp))
                        .background(CardBackground)
                ) {
                    LazyColumn {
                        items(participants) {
                            ParticipantItem(participant = it, onMuteClicked = onMuteClicked)
                        }

                        item { Spacer(modifier = Modifier.height(300.dp)) }
                    }
                }
            }
        }

        ConferenceActionsRow()
    }
}

@Composable
private fun ConferenceDetailsColumn(participantsCount: Int) {
    Text(
        text = "Android Team  \uD83D\uDCAA",
        color = Color.White,
        style = MaterialTheme.typography.h6,
        modifier = Modifier.padding(vertical = 8.dp)
    )

    Text(
        text = "$participantsCount participant",
        color = Color(0xFF878C92),
        style = MaterialTheme.typography.body1,
    )
}

@Preview
@Composable
private fun TelegramConferenceScreenPreview() {
    TelegramConferenceScreenContent(
        modifier = Modifier,
        participants = participantList
    )
}
package com.example.jetpackcomposeworkshop.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpackcomposeworkshop.model.Participant
import com.example.jetpackcomposeworkshop.model.participantList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.time.Duration.Companion.seconds

@HiltViewModel
class TelegramConferenceViewModel @Inject constructor() : ViewModel() {

    var participants: List<Participant> by mutableStateOf(emptyList())

    fun loadParticipants() {
        viewModelScope.launch {
            delay(2.seconds)
            participants = participantList
        }
    }

    fun muteParticipant(participant: Participant) {
        val participantIndex = participants.indexOf(participant)

        participants = participants.minus(participant)
            .toMutableList().apply {
                add(
                    participantIndex,
                    participant.copy(isSpeakingAllowed = participant.isSpeakingAllowed.not())
                )
            }
    }
}
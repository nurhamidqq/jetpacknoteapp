package com.github.nurhamidqq.jetpacknoteapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.github.nurhamidqq.jetpacknoteapp.ui.theme.BabyBlue
import com.github.nurhamidqq.jetpacknoteapp.ui.theme.LightGreen
import com.github.nurhamidqq.jetpacknoteapp.ui.theme.RedOrange
import com.github.nurhamidqq.jetpacknoteapp.ui.theme.RedPink
import com.github.nurhamidqq.jetpacknoteapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)
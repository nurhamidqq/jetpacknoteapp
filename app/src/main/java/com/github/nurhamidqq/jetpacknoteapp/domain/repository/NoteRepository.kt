package com.github.nurhamidqq.jetpacknoteapp.domain.repository

import com.github.nurhamidqq.jetpacknoteapp.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}
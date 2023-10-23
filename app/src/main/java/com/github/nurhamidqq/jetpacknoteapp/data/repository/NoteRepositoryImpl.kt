package com.github.nurhamidqq.jetpacknoteapp.data.repository

import com.github.nurhamidqq.jetpacknoteapp.data.data_source.NoteDao
import com.github.nurhamidqq.jetpacknoteapp.domain.model.Note
import com.github.nurhamidqq.jetpacknoteapp.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}
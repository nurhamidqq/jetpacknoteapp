package com.github.nurhamidqq.jetpacknoteapp.domain.use_case

import com.github.nurhamidqq.jetpacknoteapp.domain.model.Note
import com.github.nurhamidqq.jetpacknoteapp.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}
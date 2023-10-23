package com.github.nurhamidqq.jetpacknoteapp.domain.use_case

import com.github.nurhamidqq.jetpacknoteapp.domain.model.Note
import com.github.nurhamidqq.jetpacknoteapp.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}
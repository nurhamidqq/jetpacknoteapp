package com.github.nurhamidqq.jetpacknoteapp.presentation.notes

import com.github.nurhamidqq.jetpacknoteapp.domain.model.Note
import com.github.nurhamidqq.jetpacknoteapp.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}

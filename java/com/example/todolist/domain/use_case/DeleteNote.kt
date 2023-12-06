package com.example.todo.domain.use_case

import com.example.todo.domain.model.Note
import com.example.todo.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }

}
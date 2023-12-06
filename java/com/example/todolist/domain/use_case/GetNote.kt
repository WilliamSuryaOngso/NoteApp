package com.example.todo.domain.use_case

import com.example.todo.domain.model.Note
import com.example.todo.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }

}
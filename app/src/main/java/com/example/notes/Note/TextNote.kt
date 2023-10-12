package com.example.notes.Note

import java.util.Date

data class TextNote(
    override val idOfNote: Int,
    override var titleOfNote: String,
    override var descriptionOfNote: String,
    override val dateOfCreateNote: Date,
    override val dateOfRedactNote: Date
) : Note {



}
package com.example.notes.Note

import java.util.Date


interface Note {
    val idOfNote: Int
    var titleOfNote: String
    var descriptionOfNote: String
    val dateOfCreateNote: Date
    val dateOfRedactNote: Date

}
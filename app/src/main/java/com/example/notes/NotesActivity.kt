package com.example.notes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notes.data.recyclermodels.RecyclerNotesModel
import com.example.notes.databinding.ListOfNoteBinding
import com.example.notes.model.NotesAdapter

class NotesActivity: AppCompatActivity() {

    private val notes = listOf<RecyclerNotesModel>(
        RecyclerNotesModel("Note1", "123", true),
        RecyclerNotesModel("Note2", "456", false),
        RecyclerNotesModel("Note3", "789", true),
    )
    private lateinit var binding: ListOfNoteBinding
    private lateinit var adapter: NotesAdapter // Объект Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ListOfNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // обращение к RecyclerView
        // change
        binding.recyclerList.adapter = NotesAdapter(notes)


        val manager = LinearLayoutManager(this) // LayoutManager
        binding.recyclerList.layoutManager = manager

    }



}
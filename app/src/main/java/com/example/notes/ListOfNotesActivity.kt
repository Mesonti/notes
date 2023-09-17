package com.example.notes

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notes.data.recyclermodels.RecyclerNotesModel
import com.example.notes.databinding.ListOfNoteBinding
import com.example.notes.model.NotesAdapter

class ListOfNotesActivity: AppCompatActivity() {

    private val notes = listOf<RecyclerNotesModel?>(
        RecyclerNotesModel("1", "123", true),
        RecyclerNotesModel("2", "456", true),
        RecyclerNotesModel("3", "789", true),
        RecyclerNotesModel(null, null, false),
        RecyclerNotesModel(null, null, null),
        RecyclerNotesModel(null, null, null),
        RecyclerNotesModel(null, null, null),
        RecyclerNotesModel(null, null, null),
        RecyclerNotesModel(null, null, null),
        RecyclerNotesModel(null, null, null),
        RecyclerNotesModel("Hello", "note", true),
        RecyclerNotesModel("WithNullLiked", "Hello", null),
        RecyclerNotesModel("New now", null, true),
        RecyclerNotesModel("Note3", "789", true),
        RecyclerNotesModel("Note3", "789", true),
        RecyclerNotesModel("Note3", "789", true),
        RecyclerNotesModel("Note3", "789", true),
        RecyclerNotesModel("Note3", "789", true),
        RecyclerNotesModel("Note3", "789", true),
        RecyclerNotesModel("Note3", "789", true),

    ).filter { it?.title != null
    it?.description != null }


    fun sort(notes: List<RecyclerNotesModel>): List<RecyclerNotesModel> {
        val sort = findViewById<ImageView?>(R.id.sort)
        return notes.filter { it.title != null
        it.description != null}
    }


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
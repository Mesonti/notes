package com.example.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notes.data.recyclermodels.RecyclerNotesModel
import com.example.notes.databinding.ActivityMainBinding

import com.example.notes.model.NotesAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: NotesAdapter // Объект Adapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val manager = LinearLayoutManager(this) // LayoutManager

    }

    fun sort(notes: List<RecyclerNotesModel>): ImageView? = findViewById(R.id.btnSort)

}
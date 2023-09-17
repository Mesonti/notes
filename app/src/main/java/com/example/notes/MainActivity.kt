package com.example.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notes.data.recyclermodels.RecyclerNotesModel
import com.example.notes.databinding.ActivityMainBinding

import com.example.notes.model.NotesAdapter
//import com.example.notes.model.PersonService

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: NotesAdapter // Объект Adapter
//    private val personService: NoteService // Объект PersonService
//        get() = (applicationContext as App).personService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val manager = LinearLayoutManager(this) // LayoutManager
//        adapter = PersonAdapter(object : PersonActionListener { // Создание объекта
//            override fun onPersonGetId(person: Person) =
//                Toast.makeText(this@MainActivity, "Persons ID: ${person.id}", Toast.LENGTH_SHORT).show()

//            override fun onPersonLike(person: Person) = personService.likePerson(person)

//            override fun onPersonRemove(person: Person) = personService.removePerson(person)

//            override fun onPersonMove(person: Person, moveBy: Int) = personService.movePerson(person, moveBy)

//        })
//        personService.addListener(listener)
//
//        binding.recyclerView.layoutManager = manager // Назначение LayoutManager для RecyclerView
//        binding.recyclerView.adapter = adapter // Назначение адаптера для RecyclerView
    }

    // как сделать сортировку
    fun sort(notes: List<RecyclerNotesModel>): List<RecyclerNotesModel> {
        val sort = findViewById<ImageView?>(R.id.sort)
        return notes.filter { it.title != null
            it.description != null}
    }

//    private val listener: PersonListener = {adapter.data = it}
}
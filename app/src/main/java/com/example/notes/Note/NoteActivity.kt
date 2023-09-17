package com.example.notes.Note

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.notes.R
import com.example.notes.databinding.ActivityMainBinding

class NoteActivity(
    val id: Int,
    var name: String?,
    var description: String?,
    var isLiked: Boolean = false,
) : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        fun addNote(itemView: View) {
            val editTitle = itemView.findViewById<EditText>(R.id.edit_title)
            val editDescription = itemView.findViewById<EditText>(R.id.edit_body)
            val toast = Toast.makeText(this, "Заметка $name создана", Toast.LENGTH_LONG).show()
        }

        fun changeName(): String {
            println("Введите новое имя для заметки $name")
            name = readlnOrNull().toString()
            return "Заметка переименована"
        }

        fun changeDescription(): String {
            println("Введите новое описание для заметки $name")
            description = readlnOrNull().toString()
            return "Описание изменено"
        }

        fun addToFavorites(): String {
            isLiked = true
            return "Заметка $name добавлена в избранное"
        }

        fun removeFromFavorites(): String {
            isLiked = false
            return "Заметка $name удалена из избранного"
        }
    }
}
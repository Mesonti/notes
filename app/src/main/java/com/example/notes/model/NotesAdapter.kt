package com.example.notes.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.notes.R
import com.example.notes.data.recyclermodels.RecyclerNotesModel

class NotesAdapter(val items: List<RecyclerNotesModel>): RecyclerView.Adapter<NotesAdapter.PersonViewHolder>() {

    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleView = itemView.findViewById<TextView>(R.id.nameTextView)
        val descriptionView = itemView.findViewById<TextView>(R.id.descriptionTextView)
        val likeImageView = itemView.findViewById<ImageView>(R.id.likedImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_person, parent, false)
        val personViewHolder = PersonViewHolder(itemView)
        personViewHolder.likeImageView.isVisible = false
        return personViewHolder
    }

    override fun getItemCount() = items.count()

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val item = items[position]
        holder.titleView.text = item.title
        holder.descriptionView.text = item.description
        holder.likeImageView.isVisible = item.liked
    }

}
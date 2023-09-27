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

class NotesAdapter(val items: MutableList<RecyclerNotesModel?>): RecyclerView.Adapter<NotesAdapter.NoteViewHolder>() {

    class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleView: TextView? = itemView.findViewById(R.id.nameTextView)
        val descriptionView: TextView? = itemView.findViewById(R.id.descriptionTextView)
        val likeImageView: ImageView? = itemView.findViewById(R.id.likedImageView)

//        val titleView = itemView.findViewById<TextView?>(R.id.nameTextView)
//        val descriptionView = itemView.findViewById<TextView?>(R.id.descriptionTextView)
//        val likeImageView = itemView.findViewById<ImageView?>(R.id.likedImageView)
    }

    fun setItems(items: List<RecyclerNotesModel>) {
        this.items.clear()
        this.items.addAll(items)
        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_person, parent, false)
        val personViewHolder = NoteViewHolder(itemView)
        personViewHolder.likeImageView?.isVisible = false
        return personViewHolder
    }

    override fun getItemCount() = items.count()

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val item = items[position]
        holder.titleView?.text = item?.title ?: "Empty"
        holder.descriptionView?.text = item?.description ?: "Empty"
        holder.likeImageView?.isVisible = item?.isLiked == true
    }

}
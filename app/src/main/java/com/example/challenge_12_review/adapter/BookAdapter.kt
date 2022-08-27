package com.example.challenge_12_review.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.challenge_12_review.databinding.ItemBookBinding
import com.example.challenge_12_review.model.Book


class BookAdapter : ListAdapter<Book,BookAdapter.BookItemViewHolder>(diffUtil) {
    inner class BookItemViewHolder(private val binding : ItemBookBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(bookModel: Book){
            binding.titleTextView.text = bookModel.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookItemViewHolder {
        return BookItemViewHolder(ItemBookBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: BookItemViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}
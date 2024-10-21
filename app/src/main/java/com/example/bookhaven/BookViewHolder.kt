package com.example.bookhaven

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.bookhaven.databinding.BookListItemBinding

class BookViewHolder(
    private val binding: BookListItemBinding,
    private val onBookClick: (Books) -> Unit
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(book: Books) {
        binding.bookTitle.text = book.title
        binding.bookImg.setImageResource(book.imageResId)
        binding.root.setOnClickListener {
            onBookClick(book)
        }

//        binding.root.setOnClickListener{
//            Toast.makeText(
//                binding.root.context,
//                "${book.title} clicked!",
//                Toast.LENGTH_SHORT
//            ).show()
//        }
    }

}
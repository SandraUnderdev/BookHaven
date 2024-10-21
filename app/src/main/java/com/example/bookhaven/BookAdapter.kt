package com.example.bookhaven

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bookhaven.databinding.BookListItemBinding

class BookAdapter(
    private val bookList: List<Books>,
    private val onBookClick: (Books) -> Unit
): RecyclerView.Adapter<BookViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = BookListItemBinding.inflate(inflater, parent, false) // Inflate using binding
        return BookViewHolder(binding, onBookClick)
    }

    override fun getItemCount(): Int {
       return  bookList.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
       val currentBook = bookList[position]
        holder.bind(currentBook)
    }

}
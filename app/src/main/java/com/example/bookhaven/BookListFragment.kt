package com.example.bookhaven

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.bookhaven.databinding.FragmentBookListBinding


// TODO: Rename parameter arguments, choose names that match

class BookListFragment : Fragment() {

    private  var _binding: FragmentBookListBinding? = null
    private  val binding
        get() = checkNotNull(_binding) {
            "Cannot access binding because it is null. Is the view visible"
        }

    private val bookRepository = BookCatalogRepository()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =
            FragmentBookListBinding.inflate(inflater,container, false )
        binding.bookRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)

       val allBooks =  bookRepository.getBooks()
       val adapter = BookAdapter(allBooks) {
           selectedBook -> openBookDetailFragment(selectedBook)
       }

        binding.bookRecyclerView.adapter = adapter
        return binding.root
    }

    private fun openBookDetailFragment(selectedBook: Books) {
        val fragment = BookDetailFragment()
        val bundle = Bundle().apply{
            putString("title", selectedBook.title)
            putInt("imageResId", selectedBook.imageResId)
            putString("author", selectedBook.author)
            putString("genre", selectedBook.genre)
            putString("description", selectedBook.description)
        }
        fragment.arguments = bundle

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
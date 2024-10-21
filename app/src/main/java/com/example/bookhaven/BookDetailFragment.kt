package com.example.bookhaven

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.bookhaven.databinding.FragmentBookDetailBinding
import com.example.bookhaven.databinding.FragmentBookListBinding


class BookDetailFragment : Fragment() {

    private var _binding: FragmentBookDetailBinding? = null
    private val binding
        get() = checkNotNull(_binding) {
            "Cannot access binding because it is null. Is the view visible?"
        }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =
            FragmentBookDetailBinding.inflate(inflater, container, false)

        val title = arguments?.getString("title")
        val imageResId = arguments?.getInt("imageResId")
        val author = arguments?.getString("author")
        val genre = arguments?.getString("genre")
        val description = arguments?.getString("description")

        binding.bookDetailTitle.text = title
        binding.bookDetailAuthor.text = author
        binding.bookDetailGenre.text = genre
        binding.bookDetailDescription.text = description
        if (imageResId != null) {
            binding.bookImage.setImageResource(imageResId)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
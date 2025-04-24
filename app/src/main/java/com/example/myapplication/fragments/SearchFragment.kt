package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapters.RecyclerViewListAdapter
import com.example.myapplication.databinding.FragmentSearchBinding
import com.example.myapplication.models.Book

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    lateinit var rcAdapter: RecyclerViewListAdapter
    private val data = listOf(
        Book("Hello", ""),
        Book("Hello1", "", ""),
        Book("Hello2", "", ""),
        Book("Hello3", "", ""),
        Book("Hello4", "", ""),
        Book("Hello5", "", ""),
        Book("Hello6", "", ""),
        Book("Hello7", "", ""),
        Book("Hello8", "", ""),
        Book("Hello9", "", ""),
        Book("Hello0", "", ""),
        Book("Hello10", "", ""),
        Book("Hello11", "", ""),
        Book("Hello12", "", "")
        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)

        rcAdapter = RecyclerViewListAdapter()
        rcAdapter.submitList(data)
        rvSearch.adapter = rcAdapter
        rvSearch.layoutManager = GridLayoutManager(requireContext(), 3)
    }
}
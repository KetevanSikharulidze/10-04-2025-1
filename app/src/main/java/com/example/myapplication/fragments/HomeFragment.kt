package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.RecyclerViewAdapter
import com.example.myapplication.databinding.FragmentHomeBinding
import com.example.myapplication.models.Book

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding?= null
    private val binding get() = _binding!!

    private lateinit var recyclerAdapter: RecyclerViewAdapter
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
        Book("Hello12", "", ""),

        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)

        recyclerAdapter = RecyclerViewAdapter(data)
        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            HomeFragment()
    }
}
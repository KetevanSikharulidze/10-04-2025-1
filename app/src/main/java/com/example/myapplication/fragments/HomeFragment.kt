package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapters.RecyclerViewAdapter
import com.example.myapplication.databinding.FragmentHomeBinding
import com.example.myapplication.models.Book

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding?= null
    private val binding get() = _binding!!

    private lateinit var recyclerAdapter: RecyclerViewAdapter
    private val data = listOf(
        Book("Hello", "https://images.unsplash.com/photo-1485846234645-a62644f84728?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8ZmlsbXxlbnwwfHwwfHx8Mg%3D%3D"),
        Book("Hello1", "https://images.unsplash.com/photo-1542204165-65bf26472b9b?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8ZmlsbXxlbnwwfHwwfHx8Mg%3D%3D", ""),
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
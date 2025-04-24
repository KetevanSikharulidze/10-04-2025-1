package com.example.myapplication.profileFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.RecyclerViewAdapter
import com.example.myapplication.adapters.RecyclerViewListAdapter
import com.example.myapplication.databinding.FragmentFirstBinding
import com.example.myapplication.models.Book

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    private lateinit var rcAdapterProfile: RecyclerViewAdapter
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
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)

        rcAdapterProfile = RecyclerViewAdapter(data)
        rvAdapterFirst.adapter = rcAdapterProfile
        rvAdapterFirst.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
    }
}
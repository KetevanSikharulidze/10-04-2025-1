package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.myapplication.R
import com.example.myapplication.adapters.ViewPagerAdapter
import com.example.myapplication.databinding.FragmentProfileBinding
import com.example.myapplication.profileFragments.FirstFragment
import com.example.myapplication.profileFragments.SecondFragment
import com.google.android.material.tabs.TabLayoutMediator

class ProfileFragment : Fragment() {

    private var _binding : FragmentProfileBinding? = null
    private val binding get() = _binding!!

    lateinit var viewPagerAdapter: ViewPagerAdapter

    private val fList = listOf(
        FirstFragment(),
        SecondFragment()
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            if (isAdded) {
                viewPagerAdapter = ViewPagerAdapter(requireActivity(),fList)
                vp.adapter = viewPagerAdapter

                val tList = listOf(
                    ContextCompat.getDrawable(requireContext(),R.drawable.ic_firsts),
                    ContextCompat.getDrawable(requireContext(),R.drawable.ic_second)
                )

                TabLayoutMediator(tabLayout,vp){ tab, position ->
                    tab.icon = tList[position]
                }.attach()

            }


        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            ProfileFragment()
    }
}
package com.example.a4thmonthlesson1.ui.onBoard

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.a4thmonthlesson1.databinding.FragmentOnBoardingBinding
import com.example.a4thmonthlesson1.ui.onBoard.adapter.OnBoardAdapter


class OnBoardingFragment : Fragment() {
    private lateinit var binding: FragmentOnBoardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = OnBoardAdapter()

        binding.pager.adapter = adapter

        val pagerSnapHelper = PagerSnapHelper()
        pagerSnapHelper.attachToRecyclerView(binding.pager)
//
//        binding.indicator.attachToRecyclerView(binding.pager)
//        adapter.registerAdapterDataObserver(binding.indicator.getAdapterDataObserver())
    }


}




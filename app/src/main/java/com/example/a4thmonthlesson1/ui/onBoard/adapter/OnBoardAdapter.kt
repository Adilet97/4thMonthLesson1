package com.example.a4thmonthlesson1.ui.onBoard.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a4thmonthlesson1.OnBoard
import com.example.a4thmonthlesson1.databinding.ItemOnBoardingPageBinding
import com.example.a4thmonthlesson1.loadImage

class OnBoardAdapter : RecyclerView.Adapter<OnBoardAdapter.OnBoardViewHolder>() {

    private val arrayListBoarding = arrayListOf<OnBoard>()

    init {
        arrayListBoarding.add(
            OnBoard(
                "https://cdn-icons-png.flaticon.com/512/2098/2098402.png",
                "Making",
                "Plan",
            )
        )
        arrayListBoarding.add(
            OnBoard(
                "https://cdn-icons-png.flaticon.com/512/2387/2387635.png",
                "Set up",
                "Tasks"
            )
        )
        arrayListBoarding.add(
            OnBoard(
                "https://cdn-icons-png.flaticon.com/512/4236/4236706.png",
                "Achieve",
                "Goals"
            )
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardViewHolder {
        return OnBoardViewHolder(
            ItemOnBoardingPageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: OnBoardViewHolder, position: Int) {
        holder.bind(arrayListBoarding[position])
    }

    override fun getItemCount(): Int = arrayListBoarding.size


    inner class OnBoardViewHolder(private val binding: ItemOnBoardingPageBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(onBoard: OnBoard) {
            binding.tvObfTitle.text=onBoard.title
            binding.tvObfDescription.text=onBoard.description
            onBoard.image?.let { binding.imagePager.loadImage(it) }

        }

    }
}
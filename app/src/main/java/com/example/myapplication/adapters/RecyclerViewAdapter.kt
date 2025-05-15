package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ListItemBinding
import com.example.myapplication.models.Book

class RecyclerViewAdapter(val data: List<Book>) : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {


    inner class MyViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            val datas = data[position]

            titleTV.text = datas.title
            detailsTV.text = datas.details
            Glide.with(root).load(datas.image).into(imageView)

        }
    }


}
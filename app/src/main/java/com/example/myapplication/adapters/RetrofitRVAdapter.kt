package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.RetrofitItemBinding
import com.example.myapplication.models.PostListItem

class RetrofitRVAdapter(private val retrofitList: List<PostListItem>) : RecyclerView.Adapter<RetrofitRVAdapter.Holder>() {

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        val binding = RetrofitItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.retrofit_item,parent,false)
        return Holder(view)
    }

    override fun getItemCount() = retrofitList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.binding.apply {

            val post = retrofitList[position]

            title.text = post.title
            body.text = post.body

        }
    }
}
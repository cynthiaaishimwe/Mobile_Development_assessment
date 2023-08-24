package com.cynthia.mobiledevelopmentassessment4.Model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cynthia.mobiledevelopmentassessment4.databinding.PostItemsBinding

class PostAdapter (var postList: List<Posts>): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val binding = PostItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PostViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        var currentPost = postList[position]
        holder.bind(currentPost)
    }

    inner class PostViewHolder(val binding:PostItemsBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(currentPost:Posts){
            binding.apply{
                tvId.text = currentPost.id.toString()
                tvTitle.text = currentPost.title
                tvBody.text = currentPost.body

            }
        }

    }
}

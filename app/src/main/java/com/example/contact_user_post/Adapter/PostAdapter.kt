package com.example.contact_user_post.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_user_post.R
import com.example.contact_user_post.model.Post

class PostAdapter(var post:ArrayList<Post>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PostViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.post_item,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is PostViewHolder){
            holder.text.text = post[position].text
            holder.name.text = post[position].name
            if (post[position].image != null){
                holder.image.isVisible = true
                post[position].image?.let { holder.image.setImageResource(it) }
            }

        }
    }

    override fun getItemCount(): Int {
        return post.size
    }

    class PostViewHolder(var view: View):RecyclerView.ViewHolder(view){
        var text = view.findViewById<TextView>(R.id.text_post)
        var name = view.findViewById<TextView>(R.id.name_post)
        var image = view.findViewById<ImageView>(R.id.image_post)
    }


}
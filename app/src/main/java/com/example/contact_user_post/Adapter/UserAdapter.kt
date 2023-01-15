package com.example.contact_user_post.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_user_post.R
import com.example.contact_user_post.model.User

class UserAdapter(var user:ArrayList<User>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return UserViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.user_item,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is UserViewHolder){
            holder.surname.text = user[position].surname
            holder.name.text = user[position].name
            holder.id.text = user[position].id.toString()
        }
    }

    override fun getItemCount(): Int {
        return user.size
    }

    class UserViewHolder(var view:View):RecyclerView.ViewHolder(view){
        var surname = view.findViewById<TextView>(R.id.surname_user)
        var name = view.findViewById<TextView>(R.id.name_user)
        var id = view.findViewById<TextView>(R.id.user_id)
    }

}
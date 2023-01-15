package com.example.contact_user_post.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_user_post.R
import com.example.contact_user_post.model.Contact

class ContactAdapter(var contact:ArrayList<Contact>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ContactViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.contact_item,parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ContactViewHolder){
            holder.picture.setImageResource(contact[position].picture)
            holder.name.text = contact[position].name
            holder.number.text = contact[position].number
        }
    }

    override fun getItemCount(): Int {
        return contact.size
    }

    class ContactViewHolder(var view: View):RecyclerView.ViewHolder(view){
        var picture = view.findViewById<ImageView>(R.id.picture)
        var name = view.findViewById<TextView>(R.id.contact_name)
        var number = view.findViewById<TextView>(R.id.contact_number)
    }
}
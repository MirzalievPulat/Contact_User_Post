package com.example.contact_user_post

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_user_post.Adapter.ContactAdapter
import com.example.contact_user_post.model.Contact


class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_contact, container, false)

        var recyclerView = view.findViewById<RecyclerView>(R.id.recyclerContact)
        recyclerView.adapter = ContactAdapter(prepareData())

        return view
    }

    fun prepareData():ArrayList<Contact>{
        var contact = ArrayList<Contact>()

        contact.add(Contact("Po'lat","+998 93 1234567",R.mipmap.ic_launcher))
        contact.add(Contact("Po'lat","+998 93 1234567",R.mipmap.ic_launcher))
        contact.add(Contact("Po'lat","+998 93 1234567",R.mipmap.ic_launcher))
        contact.add(Contact("Po'lat","+998 93 1234567",R.mipmap.ic_launcher))
        contact.add(Contact("Po'lat","+998 93 1234567",R.mipmap.ic_launcher))
        contact.add(Contact("Po'lat","+998 93 1234567",R.mipmap.ic_launcher))
        contact.add(Contact("Po'lat","+998 93 1234567",R.mipmap.ic_launcher))
        contact.add(Contact("Po'lat","+998 93 1234567",R.mipmap.ic_launcher))
        contact.add(Contact("Po'lat","+998 93 1234567",R.mipmap.ic_launcher))
        contact.add(Contact("Po'lat","+998 93 1234567",R.mipmap.ic_launcher))

        return contact
    }

}
package com.example.contact_user_post

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_user_post.Adapter.UserAdapter
import com.example.contact_user_post.model.User


class UserFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_user, container, false)

        var recyclerView = view.findViewById<RecyclerView>(R.id.recyclerUser)
        recyclerView.adapter = UserAdapter(prepareData())

        return view
    }

    fun prepareData():ArrayList<User>{
        var user = ArrayList<User>()

        user.add(User("Mirzaliyev","Po'lat",11))
        user.add(User("Mirzaliyev","Po'lat",11))
        user.add(User("Mirzaliyev","Po'lat",11))
        user.add(User("Mirzaliyev","Po'lat",11))
        user.add(User("Mirzaliyev","Po'lat",11))
        user.add(User("Mirzaliyev","Po'lat",11))
        user.add(User("Mirzaliyev","Po'lat",11))
        user.add(User("Mirzaliyev","Po'lat",11))
        user.add(User("Mirzaliyev","Po'lat",11))
        user.add(User("Mirzaliyev","Po'lat",11))

        return user
    }

}
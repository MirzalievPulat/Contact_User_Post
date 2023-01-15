package com.example.contact_user_post

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_user_post.Adapter.PostAdapter
import com.example.contact_user_post.Adapter.UserAdapter
import com.example.contact_user_post.model.Post
import com.example.contact_user_post.model.User

class PostFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_post, container, false)

        var recyclerView = view.findViewById<RecyclerView>(R.id.recyclerPost)
        recyclerView.adapter = PostAdapter(prepareData())

        return view
    }

    fun prepareData():ArrayList<Post>{
        var post = ArrayList<Post>()

        post.add(Post("Po'lat","The weather is getting colder",R.drawable.snow_storm))
        post.add(Post("Po'lat","It's now -15 in Chicago"))
        post.add(Post("John","I thought this film is just a trash but it wasn't",R.drawable.action1))
        post.add(Post("Catherina","my car has broken yesterday"))
        post.add(Post("Poll","Pleasse give me some joke that I haven't heard before"))
        post.add(Post("Catherina","my car looks cool"))
        post.add(Post("Martin","asdf asdf asdf asdfdsf"))
        post.add(Post("Catherina","my car has broken yesterday"))
        post.add(Post("Molly","Maybe you should watch another one,like this",R.drawable.sample1))


        return post
    }

}
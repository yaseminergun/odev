package com.example.odev.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.odev.Model.Users
import com.example.odev.R
import kotlinx.android.synthetic.main.layout_movie_item.view.*
class MyMovieAdapter(private val context: Context, private val movieList: MutableList<Users>): RecyclerView.Adapter<MyMovieAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.layout_movie_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.txt_name.text = movieList[position].name
        holder.txt_email.text = movieList[position].email

    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var txt_name : TextView
        var txt_email : TextView


        init {

            txt_name = itemView.txt_name
            txt_email = itemView.txt_email

        }
    }
}
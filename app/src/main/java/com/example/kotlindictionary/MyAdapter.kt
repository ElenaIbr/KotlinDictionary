package com.example.kotlindictionary

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val arrayList: ArrayList<Article>, val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //for row.xml
        fun BindItems(article: Article) {
            itemView.findViewById<TextView>(R.id.titleTv).text = article.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.BindItems(arrayList[position])

        //when you press on one of the rows, all row content goes to item activity layout
        holder.itemView.setOnClickListener {

            val item = arrayList.get(position)

            var gTitle: String = item.title
            var gDesctiption: String = item.des
            var gImageView: Int = item.image
            var gTopic: String = item.top
            var gLink: String = item.link

            val intent = Intent(context, ItemActivity::class.java)

            intent.putExtra("iTitle", gTitle)
            intent.putExtra("iDescription", gDesctiption)
            intent.putExtra("iImageView", gImageView)
            intent.putExtra("iIop", gTopic)
            intent.putExtra("iLink", gLink)

            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    //this fun is used for category selection through drawerlayout
    fun updateAdapter(listArray: List<Article>) {
        arrayList.clear()
        arrayList.addAll(listArray)
        notifyDataSetChanged()
    }
}
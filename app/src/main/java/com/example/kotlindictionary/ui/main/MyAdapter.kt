package com.example.kotlindictionary.ui.main

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindictionary.ui.item.ArticleActivity
import com.example.kotlindictionary.R
import com.example.kotlindictionary.data.Article

class MyAdapter(var arrayList: MutableList<Article>, val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //for row.xml
        fun BindItems(article: Article) {
            itemView.findViewById<TextView>(R.id.titleTv).text = article.title
            itemView.findViewById<TextView>(R.id.parTv).text = article.paragraph
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.main_content_row, parent, false)
        return ViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.BindItems(arrayList[position])

        //when you press on one of the rows, all row content goes to item activity layout
        holder.itemView.setOnClickListener {

            val item = arrayList[position]

            val gPar: String = item.paragraph
            val gTitle: String = item.title
            val gDesctiption: String = item.des
            val gCode: String = item.code
            val gTopic: String = item.top
            val gLink: String = item.link

            val intent = Intent(context, ArticleActivity::class.java)

            intent.putExtra("iPar", gPar)
            intent.putExtra("iTitle", gTitle)
            intent.putExtra("iDescription", gDesctiption)
            intent.putExtra("iCode", gCode)
            intent.putExtra("iIop", gTopic)
            intent.putExtra("iLink", gLink)

            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    //this fun is used for category selection through drawerlayout
    fun updateAdapter(listArray: MutableList<Article>) {
        arrayList = listArray
        notifyDataSetChanged()
    }
}
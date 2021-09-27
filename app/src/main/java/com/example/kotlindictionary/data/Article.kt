package com.example.kotlindictionary.data
import android.graphics.text.LineBreaker
import java.io.Serializable

//data for a single item
class Article(val paragraph: String,
              val title: String, //article name
              val des: String, //article content
              val code: String, //code image
              val top: String, //topic name
              val link: String //link to content resource
            ) : Serializable
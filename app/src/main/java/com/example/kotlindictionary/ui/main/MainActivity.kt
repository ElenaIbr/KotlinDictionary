package com.example.kotlindictionary.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.SearchView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlindictionary.R
import com.example.kotlindictionary.data.Article
import com.example.kotlindictionary.data.ArticleList
import com.example.kotlindictionary.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import java.util.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    var arrayList = mutableListOf<Article>()
    var displayList = mutableListOf<Article>()

    private lateinit var mBinding: ActivityMainBinding

    private lateinit var toggle : ActionBarDrawerToggle
    private var adapter : MyAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        //actionBar
        toggle = ActionBarDrawerToggle(this, mBinding.drLayout, R.string.open,  R.string.close)
        mBinding.drLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //navigationView
        mBinding.navView.setNavigationItemSelectedListener(this)

        //recycleView
        ArticleList.articles.forEach { item ->
            arrayList.add(item)
            displayList.add(item)
        }
        val rcView = findViewById<RecyclerView>(R.id.recycleView)
        rcView.layoutManager = LinearLayoutManager(this)

        adapter = MyAdapter(arrayList, this)
        rcView.adapter = adapter
    }

    //search rows from RecyclerView by SearchView
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)
        val menuItem = menu!!.findItem(R.id.search)

        if(menuItem != null) {
            val searchView = menuItem.actionView as SearchView
            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{

                override fun onQueryTextSubmit(query: String?): Boolean {
                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {

                    val editText = searchView.findViewById<EditText>(androidx.appcompat.R.id.search_src_text)
                    editText.hint = "Search the library..."

                    if(newText!!.isNotEmpty()) {
                        displayList.clear()
                        val search = newText.lowercase(Locale.getDefault())

                        arrayList.forEach {
                            if(it.title.lowercase(Locale.getDefault()).contains(search)){
                                displayList.add(it)}}
                        adapter?.updateAdapter(displayList)
                    }
                    else{
                        displayList.clear()
                        displayList.addAll(arrayList)
                        findViewById<RecyclerView>(R.id.recycleView).adapter!!.notifyDataSetChanged()
                    }
                    return true}})
        }
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        val rcView = findViewById<RecyclerView>(R.id.recycleView)

            when(item.itemId) {

            R.id.id_basic_syntax -> {

                adapter?.updateAdapter(fillArray("1. Basic syntax"))
                rcView.smoothScrollToPosition(0)

            }
            R.id.id_idioms -> {

                adapter?.updateAdapter(fillArray("2. Idioms"))
                rcView.smoothScrollToPosition(0)
            }
            R.id.id_data_types -> {

                adapter?.updateAdapter(fillArray("3. Data types"))
                rcView.smoothScrollToPosition(0)
            }
            R.id.id_conditions_loops -> {

                adapter?.updateAdapter(fillArray("4. Conditions and loops"))
                rcView.smoothScrollToPosition(0)
            }
            R.id.id_classes_objects -> {

                adapter?.updateAdapter(fillArray("5. Classes and objects"))
                rcView.smoothScrollToPosition(0)
            }
            R.id.id_functions -> {

                adapter?.updateAdapter(fillArray("6. Functions"))
                rcView.smoothScrollToPosition(0)
            }

            R.id.all -> {

                 val intent = Intent(this, MainActivity::class.java)
                 startActivity(intent)
            }
        }
        findViewById<DrawerLayout>(R.id.dr_layout).closeDrawer(GravityCompat.START)
        return true
    }


    private fun fillArray(topic: String):MutableList<Article>{

        val array = mutableListOf<Article>()
        val tepmArr = ArticleList.articles.filter { it.top.contains(topic) }
        tepmArr.forEach {item ->
            array.add(item)
        }
        return array
    }
}

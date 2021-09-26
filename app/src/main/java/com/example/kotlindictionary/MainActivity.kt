package com.example.kotlindictionary

import android.content.Intent
import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import androidx.appcompat.widget.SearchView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    val arrayList = ArrayList<Article>()
    val displayList = ArrayList<Article>()

    private var adapter : MyAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView = findViewById<NavigationView>(R.id.nav_view)
        navView.setNavigationItemSelectedListener(this)

        arrayList.addAll((fillArray("1.")))//add Basic syntax articles
        arrayList.addAll((fillArray("2.")))//add Idioms articles
        arrayList.addAll((fillArray("3.")))//add Data types articles
        arrayList.addAll((fillArray("4.")))//add Conditions and loop articles
        arrayList.addAll((fillArray("5.")))//add Сlasses and objects articles
        arrayList.addAll((fillArray("6.")))//add Functions articles

        displayList.addAll(arrayList)

        val rcView = findViewById<RecyclerView>(R.id.recycleView)
        rcView.layoutManager = LinearLayoutManager(this)

        adapter = MyAdapter(displayList, this)
        rcView.adapter = adapter
    }

    //search rows from RecyclerView by SearchView
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
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
                        findViewById<RecyclerView>(R.id.recycleView).adapter!!.notifyDataSetChanged()
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
        return super.onOptionsItemSelected(item)
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        val rcView = findViewById<RecyclerView>(R.id.recycleView)

            when(item.itemId) {

            R.id.id_basic_syntax -> {

                adapter?.updateAdapter(fillArray("1."))
                rcView.smoothScrollToPosition(0)

            }
            R.id.id_idioms -> {

                adapter?.updateAdapter(fillArray("2."))
                rcView.smoothScrollToPosition(0)
            }
            R.id.id_data_types -> {

                adapter?.updateAdapter(fillArray("3."))
                rcView.smoothScrollToPosition(0)
            }
            R.id.id_conditions_loops -> {

                adapter?.updateAdapter(fillArray("4."))
                rcView.smoothScrollToPosition(0)
            }
            R.id.id_classes_objects -> {

                adapter?.updateAdapter(fillArray("5."))
                rcView.smoothScrollToPosition(0)
            }
            R.id.id_functions -> {

                adapter?.updateAdapter(fillArray("6."))
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


    private fun fillArray(topic: String):List<Article>{

        val itemArray = ArrayList<Article>()

        val titleArray = resources.getStringArray(R.array.categories)
        val desArray = resources.getStringArray(R.array.categories_content)
        val imgArray = getImage(R.array.categories_image_array)
        val linkArray = resources.getStringArray(R.array.category_link)

        val categoryArray = resources.getStringArray(R.array.titles)

            for(n in 0..titleArray.size-1) {
                var listItem = Article(titleArray[n],
                    desArray[n],
                    imgArray[n],
                    categoryArray[(Character.getNumericValue(topic.first()))-1],
                    linkArray[n])

                itemArray.add(listItem)
                }

        val endArray = itemArray.filter { it.title.contains(topic) }
        return endArray
    }

    //to get list with images
    private fun getImage(imgArrId:Int):IntArray {
        val tArr: TypedArray = resources.obtainTypedArray(imgArrId)
        val count = tArr.length()
        val idArr = IntArray(count)
        for(i in idArr.indices) {
            idArr[i] = tArr.getResourceId(i, 0)
        }
        tArr.recycle()
        return idArr
    }
}
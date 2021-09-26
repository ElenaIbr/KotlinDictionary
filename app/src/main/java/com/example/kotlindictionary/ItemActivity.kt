package com.example.kotlindictionary

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.davemorrissey.labs.subscaleview.ImageSource
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView
import me.jackdevey.codeview.CodeView

class ItemActivity : AppCompatActivity() {

    var link : String? = null

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val actionBar : ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        actionBar.setTitle(intent.getStringExtra("iIop"))

        //get content
        findViewById<TextView>(R.id.a_title).text = intent.getStringExtra("iTitle")
        findViewById<TextView>(R.id.a_description).text = intent.getStringExtra("iDescription")
        findViewById<SubsamplingScaleImageView>(R.id.a_image).setImage(ImageSource.resource(intent.getIntExtra("iImageView", R.drawable.k_letter_ground)))

        val codeArray = resources.getStringArray(R.array.categories_code_array)
        findViewById<CodeView>(R.id.code_view).code = codeArray[0]
        findViewById<CodeView>(R.id.code_view).show()

        link = intent.getStringExtra("iLink")
    }

    //action for activity_item.linkBtn
    fun getLink (view: View) {

        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(link)
        startActivity(intent)
    }
}
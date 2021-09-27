package com.example.kotlindictionary.ui.item

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.example.kotlindictionary.R
import com.example.kotlindictionary.databinding.ActivityArticleBinding
import com.example.kotlindictionary.databinding.ActivityMainBinding
import io.github.kbiakov.codeview.CodeView
import io.github.kbiakov.codeview.adapters.Options
import io.github.kbiakov.codeview.highlight.ColorTheme

class ArticleActivity : AppCompatActivity() {

    var link : String? = null
    private lateinit var mBinding: ActivityArticleBinding

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityArticleBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val actionBar : ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar.title = intent.getStringExtra("iIop")

        //get content
        val title = "${intent.getStringExtra("iPar")} ${intent.getStringExtra("iTitle")}"

        mBinding.aTitle.text = title
        mBinding.aDescription.text = intent.getStringExtra("iDescription")
        link = intent.getStringExtra("iLink")

        val code = intent.getStringExtra("iCode") ?: ""

        if(!code.isEmpty()) {
            findViewById<CodeView>(R.id.code_view)
                .setOptions(Options.Default.get(this)
                    .withTheme(ColorTheme.SOLARIZED_LIGHT)
                    .withLanguage("kotlin")
                    .withCode(code))
        }
        else mBinding.codeView.visibility = View.GONE
    }

    fun getLink (view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(link)
        startActivity(intent)
    }
}
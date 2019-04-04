package br.com.paulosalvatore.ocean_a5_03_04_19

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_view_model.*
import java.util.*

class ViewModelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        val myViewModel =
                ViewModelProviders
                        .of(this)
                        .get(MyViewModel::class.java)

        myViewModel.text.observe(this, android.arch.lifecycle.Observer {
            textView.text = it
        })

        textView.setOnClickListener {
            myViewModel.updateText()
        }
    }
}

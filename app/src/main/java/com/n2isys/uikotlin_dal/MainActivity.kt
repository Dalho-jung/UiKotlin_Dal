package com.n2isys.uikotlin_dal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.n2isys.uikotlin_dal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var viewBind = ActivityMainBinding.inflate(layoutInflater,null,false)
        setContentView(viewBind.root)

        viewBind.okBtn.setOnClickListener {
            val inputContent = viewBind.contentEdt.text.toString()

            viewBind.resultRst.text = inputContent
        }

    }
}
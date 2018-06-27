package com.roating.ace.ace06

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_tv1.setOnClickListener(this)
        main_tv2.setOnClickListener(this)
        main_tv3.setOnClickListener(this)
        main_tv4.setOnClickListener(this)
        main_tv5.setOnClickListener(this)
        main_tv6.setOnClickListener(this)
        main_tv7.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.main_tv1 -> {
                startActivity(Intent(this, ToolbarActivityK::class.java))
            }
            R.id.main_tv4 -> {
                startActivity(Intent(this, ToolbarNoBarActivityK::class.java))
            }
            R.id.main_tv2 -> {
                startActivity(Intent(this, ToolbarImgActivityK::class.java))
            }
            R.id.main_tv3 -> {
                startActivity(Intent(this, ImgBackgroundActivityK::class.java))
            }
            R.id.main_tv5 -> {
                main_tv5.text = "折叠布局 CollapsingToolbarLayout 折叠后的效果也是沉浸式状态，可以固定折叠后的状态，但是并不建议这样处理，偶然想到而已！"
            }
            R.id.main_tv6 -> {
                startActivity(Intent(this, ToolbarTestActivityK::class.java))
            }
            R.id.main_tv7 -> {
                startActivity(Intent(this, ToolbarLayerActivityK::class.java))
            }
        }
    }
}

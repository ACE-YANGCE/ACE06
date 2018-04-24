package com.roating.ace.ace06

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.os.Build
import android.view.View
import kotlinx.android.synthetic.main.activity_toorbar.*

class ToolbarNoBarActivityK : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = resources.getColor(R.color.colorAccentDark)
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toorbar)

        toolbar.setBackgroundColor(resources.getColor(R.color.colorAccentDark))
        toolbar_tv.text = "无状态栏 纯色 Toolbar"
    }
}

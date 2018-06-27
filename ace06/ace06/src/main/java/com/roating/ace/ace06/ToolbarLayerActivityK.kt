package com.roating.ace.ace06

import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RoundRectShape
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.view.View
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_toolbar_test.*

class ToolbarLayerActivityK : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
//            window.statusBarColor = resources.getColor(R.color.colorPrimaryDark)
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar_test)

        val radius0 = 10
        val outerR = floatArrayOf(radius0.toFloat(), radius0.toFloat(), radius0.toFloat(), radius0.toFloat(), radius0.toFloat(), radius0.toFloat(), radius0.toFloat(), radius0.toFloat())
        val roundRectShape0 = RoundRectShape(outerR, null, null)
        val shapeDrawableBg = ShapeDrawable()
        shapeDrawableBg.setPadding(0, 0, 0, 0)
        shapeDrawableBg.setShape(roundRectShape0)
        shapeDrawableBg.getPaint().setStyle(Paint.Style.FILL)
        shapeDrawableBg.getPaint().setColor(-0x444445)

        // 创建资源对象
        val resources = resources
        // 创建数组对象
        val layers = arrayOfNulls<Drawable>(2)
        layers[0] = shapeDrawableBg
        layers[1] = resources.getDrawable(R.drawable.icon_bg)

        val layerDrawable = LayerDrawable(layers)
        // 设置背景
        toolbar.background = layerDrawable

        test_lay.background = layerDrawable
    }
}

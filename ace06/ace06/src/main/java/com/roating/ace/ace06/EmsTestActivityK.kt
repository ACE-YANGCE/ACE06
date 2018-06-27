package com.roating.ace.ace06

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_maxems.*


/**
 * Created by yangce on 2018/5/12.
 */
class EmsTestActivityK : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maxems)

        val spec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
        left_tv1.measure(spec, spec)
        val measuredWidthTicketNum = left_tv1.getMeasuredWidth()
        Log.e("====meaNum=", measuredWidthTicketNum.toString())
        right_tv1.text = left_tv1.getMeasuredWidth().toString()
        right_tv2.text = getTextViewWidth(findViewById(R.id.left_tv2) as TextView)
        right_tv3.text = getTextViewWidth(findViewById(R.id.left_tv3) as TextView)
        right_tv4.text = getTextViewWidth(findViewById(R.id.left_tv4) as TextView)
        right_tv5.text = getTextViewWidth(findViewById(R.id.left_tv5) as TextView)
        right_tv6.text = getTextViewWidth(findViewById(R.id.left_tv6) as TextView)
        right_tv7.text = getTextViewWidth(findViewById(R.id.left_tv7) as TextView)
        right_tv8.text = getTextViewWidth(findViewById(R.id.left_tv8) as TextView)
        right_tv9.text = getTextViewWidth(findViewById(R.id.left_tv9) as TextView)
        right_tv10.text = getTextViewWidth(findViewById(R.id.left_tv10) as TextView)
        right_tv11.text = getTextViewWidth(findViewById(R.id.left_tv11) as TextView)
        right_tv12.text = getTextViewWidth(findViewById(R.id.left_tv12) as TextView)
        right_tv13.text = getTextViewWidth(findViewById(R.id.left_tv13) as TextView)
        right_tv14.text = getTextViewWidth(findViewById(R.id.left_tv14) as TextView)
        right_tv15.text = getTextViewWidth(findViewById(R.id.left_tv15) as TextView)
        right_tv16.text = getTextViewWidth(findViewById(R.id.left_tv16) as TextView)

        right_tv21.text = getTextViewWidth(findViewById(R.id.left_tv21) as TextView)
        right_tv22.text = getTextViewWidth(findViewById(R.id.left_tv22) as TextView)
        right_tv23.text = getTextViewWidth(findViewById(R.id.left_tv23) as TextView)
        right_tv24.text = getTextViewWidth(findViewById(R.id.left_tv24) as TextView)
        right_tv25.text = getTextViewWidth(findViewById(R.id.left_tv25) as TextView)
        right_tv26.text = getTextViewWidth(findViewById(R.id.left_tv26) as TextView)
        right_tv27.text = getTextViewWidth(findViewById(R.id.left_tv27) as TextView)
        right_tv28.text = getTextViewWidth(findViewById(R.id.left_tv28) as TextView)
        right_tv29.text = getTextViewWidth(findViewById(R.id.left_tv29) as TextView)
        right_tv210.text = getTextViewWidth(findViewById(R.id.left_tv210) as TextView)
        right_tv211.text = getTextViewWidth(findViewById(R.id.left_tv211) as TextView)
        right_tv212.text = getTextViewWidth(findViewById(R.id.left_tv212) as TextView)
        right_tv213.text = getTextViewWidth(findViewById(R.id.left_tv213) as TextView)
        right_tv214.text = getTextViewWidth(findViewById(R.id.left_tv214) as TextView)
        right_tv215.text = getTextViewWidth(findViewById(R.id.left_tv215) as TextView)
        right_tv216.text = getTextViewWidth(findViewById(R.id.left_tv216) as TextView)
    }

    override fun onClick(v: View?) {
        when (v?.id) {

        }
    }

    fun getTextViewWidth(tv: TextView): String {
        val spec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
        tv.measure(spec, spec)
        val measuredWidthTicketNum = tv.getMeasuredWidth()
        return measuredWidthTicketNum.toString()
    }
}
package com.example.homework11

import android.annotation.SuppressLint
import android.content.res.Resources
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView

class MainActivity : AppCompatActivity() {

//    @SuppressLint("ResourceAsColor")
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val pastliner = LinearLayout(this)
        val pastparam = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)

        pastliner.layoutParams = pastparam

        val buttonclear = Button(this)
        val buttonclearparam = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,toInt(100))
        buttonclearparam.marginStart = toInt(16)
        buttonclearparam.marginEnd = toInt(16)
        buttonclearparam.bottomMargin = toInt(16)
        buttonclear.layoutParams = buttonclearparam
        buttonclear.setText("clear")
        buttonclear.setBackgroundResource(R.drawable.buttonstylee)

        pastliner.addView(buttonclear)


        val asosiyliner = LinearLayout(this)
        val asosiyparam = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)
        asosiyliner.layoutParams = asosiyparam

        asosiyliner.weightSum = 3F
        asosiyliner.orientation = LinearLayout.HORIZONTAL

        val button1 = Button(this)
        val button2 = Button(this)
        val button3 = Button(this)

        val button1param = LinearLayout.LayoutParams(toInt(0),toInt(50))
        button1param.weight = 1F
        button1param.setMargins(toInt(8),toInt(8),toInt(8),toInt(16))
        button1.setBackgroundResource(R.drawable.buttonstylee)
        button1.layoutParams = button1param
        button1.setText("button s")

        val button2param = LinearLayout.LayoutParams(toInt(0),toInt(50))
        button2param.weight = 1F
        button2.setBackgroundResource(R.drawable.buttonstylee)
        button2param.setMargins(toInt(8),toInt(8),toInt(8),toInt(16))
        button2.layoutParams = button2param
        button2.setText("button c")

        val button3param = LinearLayout.LayoutParams(toInt(0),toInt(50))
        button3param.weight = 1F
        button3.setBackgroundResource(R.drawable.buttonstylee)
        button3param.setMargins(toInt(16),toInt(8),toInt(8),toInt(8))
        button3.layoutParams = button3param

        button3.setText("button e")
        asosiyliner.addView(button1)
        asosiyliner.addView(button2)
        asosiyliner.addView(button3)

        val umumiyliner = LinearLayout(this)
        val umumiyparam = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)
        umumiyliner.layoutParams = umumiyparam

        val gameliner = LinearLayout(this)
        val gameparam = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)
        gameliner.layoutParams = gameparam
        gameliner.orientation = LinearLayout.VERTICAL


        val scroll = ScrollView(this)
        val scrollparam = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)

        scroll.fullScroll(ScrollView.FOCUS_DOWN)
        scroll.layoutParams = scrollparam

        scroll.addView(gameliner)


        buttonclear.setOnClickListener {
            gameliner.removeAllViews()
        }
        button1.setOnClickListener {
            val startbutton = Button(this)
            val startparam = LinearLayout.LayoutParams(toInt(120),toInt(50))

            startparam.gravity = Gravity.START
            setcolor(startbutton)
            startparam.setMargins(toInt(8),toInt(8),toInt(8),toInt(8))
            startbutton.layoutParams = startparam
            gameliner.addView(startbutton)


            scroll.fullScroll(ScrollView.FOCUS_DOWN)
        }

        button2.setOnClickListener {

            val startbutton = Button(this)
            val startparam = LinearLayout.LayoutParams(toInt(120),toInt(50))
            startparam.gravity = Gravity.CENTER_HORIZONTAL
            startparam.setMargins(toInt(8),toInt(8),toInt(8),toInt(8))
            startbutton.layoutParams = startparam
            setcolor(startbutton)
            gameliner.addView(startbutton)


            scroll.fullScroll(ScrollView.FOCUS_DOWN)
        }

        button3.setOnClickListener {
            val startbutton = Button(this)
            val startparam = LinearLayout.LayoutParams(toInt(120),toInt(50))
            startparam.gravity = Gravity.END
            startparam.setMargins(toInt(8),toInt(8),toInt(8),toInt(8))
            setcolor(startbutton)
            startbutton.layoutParams = startparam
            gameliner.addView(startbutton)

            scroll.fullScroll(ScrollView.FOCUS_DOWN)
        }

        umumiyliner.orientation = LinearLayout.VERTICAL
        umumiyliner.addView(asosiyliner)
        umumiyliner.addView(pastliner)
        umumiyliner.addView(scroll)
        setContentView(umumiyliner)

    }
    fun toInt(params:Int):Int{
        return (params * Resources.getSystem().displayMetrics.density + 0.5f).toInt()
    }


    @SuppressLint("ResourceType")
    fun setcolor(it:View){

        val button = (it as Button)

        val redn = (2..255).random()
        val grenn = (2..255).random()
        val blun = (2..255).random()

        val rgbn = Color.rgb(redn,grenn,blun)
        button.setBackgroundColor(rgbn)

    }
}

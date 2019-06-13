package kgu.klab.highandlow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_sub.*
import android.graphics.drawable.Drawable
import android.content.res.TypedArray

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val one = 1
        val two = 2
        val three = 3
        val four = 4
        val five = 5
        val six = 6
        val seven = 7
        val eight = 8
        val nine = 9
        val ten = 10
        val eleven = 11
        val twelve = 12
        val thirteen =13

        val card = Math.floor(Math.random() * 13+1).toInt()
        when(card)
        {
            one -> image.setImageResource(R.drawable.one)
            two -> image.setImageResource(R.drawable.two)
            three -> image.setImageResource(R.drawable.three)
            four -> image.setImageResource(R.drawable.four)
            five -> image.setImageResource(R.drawable.five)
            six-> image.setImageResource(R.drawable.six)
            seven-> image.setImageResource(R.drawable.seven)
            eight -> image.setImageResource(R.drawable.eight)
            nine -> image.setImageResource(R.drawable.nine)
            ten-> image.setImageResource(R.drawable.ten)
            eleven -> image.setImageResource(R.drawable.eleven)
            twelve-> image.setImageResource(R.drawable.twelve)
            thirteen-> image.setImageResource(R.drawable.thirteen)
        }

        val number = intent.getIntExtra("result",0)

        if(number==0)
        {
            if(card<7)
            {
                answertext.text = "あなたの勝ち"
            }
            else
            {
                answertext.text = "あなたの負け"
            }
        }
        if(number == 1)
        {
            if(card<7)
            {
                answertext.text = "あなたの負け"
            }
            else
            {
                answertext.text = "あなたの勝ち"
            }
        }

        button2.setOnClickListener {
            val intent = Intent(application, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
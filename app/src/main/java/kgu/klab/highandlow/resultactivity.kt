package kgu.klab.highandlow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultactivity.*
import kotlinx.android.synthetic.main.activity_resultactivity.view.*

class resultactivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultactivity)
        val snunber = intent.getIntExtra("number",0)

        //ランダムな値
        val cnumber = (Math.random()*13+1).toInt()
        when(cnumber){
            1->resultview.setImageResource(R.drawable.one)
            2->resultview.setImageResource(R.drawable.two)
            3->resultview.setImageResource(R.drawable.three)
            4->resultview.setImageResource(R.drawable.four)
            5->resultview.setImageResource(R.drawable.five)
            6->resultview.setImageResource(R.drawable.six)
            7->resultview.setImageResource(R.drawable.seven)
            8->resultview.setImageResource(R.drawable.eight)
            9->resultview.setImageResource(R.drawable.nine)
            10->resultview.setImageResource(R.drawable.ten)
            11->resultview.setImageResource(R.drawable.eleven)
            12->resultview.setImageResource(R.drawable.twelbe)
            13->resultview.setImageResource(R.drawable.thirteen)
        }
        if(snunber == 0){
            if(cnumber<7){
                resulttext.text = "あなたの勝ち"
            }
            else{
                resulttext.text = "あなたの負け"
            }
        }
        if (snunber == 1){
            if(cnumber>=7){
                resulttext.text = "あなたの勝ち"
            }
            else{
                resulttext.text = "あなたの負け"
            }
        }
        returnbutton.setOnClickListener { finish() }
    }
}

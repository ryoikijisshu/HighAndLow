package kgu.klab.highandlow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val id = intent.getIntExtra("HighLow",0)

        val ran = ((Math.random() * 13) + 1).toInt()
        when(ran){
            1 -> ranCard.setImageResource(R.drawable.one)
            2 -> ranCard.setImageResource(R.drawable.two)
            3 -> ranCard.setImageResource(R.drawable.three)
            4 -> ranCard.setImageResource(R.drawable.four)
            5 -> ranCard.setImageResource(R.drawable.five)
            6 -> ranCard.setImageResource(R.drawable.six)
            7 -> ranCard.setImageResource(R.drawable.seven)
            8 -> ranCard.setImageResource(R.drawable.eight)
            9 -> ranCard.setImageResource(R.drawable.nine)
            10 -> ranCard.setImageResource(R.drawable.ten)
            11 -> ranCard.setImageResource(R.drawable.eleven)
            12 -> ranCard.setImageResource(R.drawable.twelve)
            13 -> ranCard.setImageResource(R.drawable.thirteen)
        }

        when(id){
            R.id.up -> when(ran){
                in 1..6 -> result.setText("LOWでした！どんまい！")
                in 7..13 -> result.setText("大正解！！")
            }
            R.id.down -> when(ran){
                in 1..6 -> result.setText("大正解！！")
                in 7..13 -> result.setText("HIGHでした！どんまい！")
            }
        }

        back.setOnClickListener{
            finish()
        }
    }

}

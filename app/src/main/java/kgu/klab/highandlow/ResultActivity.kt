package kgu.klab.highandlow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

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
    val thirteen = 13

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val comHand = (Math.random() * 13 + 1 ).toInt()
        when(comHand){
            one -> comHandImage.setImageResource(R.drawable.one)
            two -> comHandImage.setImageResource(R.drawable.two)
            three -> comHandImage.setImageResource(R.drawable.three)
            four -> comHandImage.setImageResource(R.drawable.four)
            five-> comHandImage.setImageResource(R.drawable.five)
            six -> comHandImage.setImageResource(R.drawable.six)
            seven -> comHandImage.setImageResource(R.drawable.seven)
            eight -> comHandImage.setImageResource(R.drawable.eight)
            nine -> comHandImage.setImageResource(R.drawable.nine)
            ten -> comHandImage.setImageResource(R.drawable.ten)
            eleven -> comHandImage.setImageResource(R.drawable.eleven)
            twelve -> comHandImage.setImageResource(R.drawable.twelve)
            thirteen -> comHandImage.setImageResource(R.drawable.thirteen)
        }
        back_button.setOnClickListener {
            finish()
        }
    }
}

package kgu.klab.highandlow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    val card_one = 1
    val card_two = 2
    val card_three = 3
    val card_four = 4
    val card_five = 5
    val card_six = 6
    val card_seven = 7
    val card_eight = 8
    val card_nine = 9
    val card_ten = 10
    val card_eleven = 11
    val card_twelve = 12
    val card_thirteen = 13

    val less_than_seven = 1
    val seven_or_more = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val id = intent.getIntExtra("MY_SELECT",0)
        val myHand:Int
        myHand = when(id){
            R.id.reverse_button -> {
                less_than_seven
            }
            R.id.reverse_button2 -> {
                seven_or_more
            }
            else ->  less_than_seven
        }



        val comHand = (Math.random() * 13 + 1 ).toInt()
        when(comHand){
            card_one -> comHandImage.setImageResource(R.drawable.one)
            card_two -> comHandImage.setImageResource(R.drawable.two)
            card_three -> comHandImage.setImageResource(R.drawable.three)
            card_four -> comHandImage.setImageResource(R.drawable.four)
            card_five-> comHandImage.setImageResource(R.drawable.five)
            card_six -> comHandImage.setImageResource(R.drawable.six)
            card_seven -> comHandImage.setImageResource(R.drawable.seven)
            card_eight -> comHandImage.setImageResource(R.drawable.eight)
            card_nine -> comHandImage.setImageResource(R.drawable.nine)
            card_ten -> comHandImage.setImageResource(R.drawable.ten)
            card_eleven -> comHandImage.setImageResource(R.drawable.eleven)
            card_twelve -> comHandImage.setImageResource(R.drawable.twelve)
            card_thirteen -> comHandImage.setImageResource(R.drawable.thirteen)
        }
        var comvalue = 0
        if( comHand <= 6 )
        {
            comvalue = 1
        }
        else{
            comvalue = 2
        }
        val gameResult = Math.abs(myHand - comvalue)
        when(gameResult){
            0 -> resultLabel.setText(R.string.result_win)
            1 -> resultLabel.setText(R.string.result_lose)
        }
        back_button.setOnClickListener {
            finish()
        }
    }
}

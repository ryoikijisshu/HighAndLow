package kgu.klab.highandlow

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    val card_one = 0
    val card_two = 1
    val card_three = 2
    val card_four = 3
    val card_five = 4
    val card_six = 5
    val card_seven = 6
    val card_eight = 7
    val card_nine = 8
    val card_ten = 9
    val card_eleven = 10
    val card_twelve = 11
    val card_thirteen = 12

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val id = intent.getIntExtra("MY_CARD",0)

        val myHand: Int
        myHand = when(id){
            R.id.open_button1 -> {
                card_six
            }
            R.id.open_button2 -> {
                card_seven
            }
            else -> card_seven
        }

        val result_card = (Math.random() * 13).toInt()
        when(result_card){
            card_one -> resultImage.setImageResource(R.drawable.one)
            card_two -> resultImage.setImageResource(R.drawable.two)
            card_three -> resultImage.setImageResource(R.drawable.three)
            card_four -> resultImage.setImageResource(R.drawable.four)
            card_five -> resultImage.setImageResource(R.drawable.five)
            card_six -> resultImage.setImageResource(R.drawable.six)
            card_seven -> resultImage.setImageResource(R.drawable.seven)
            card_eight -> resultImage.setImageResource(R.drawable.eight)
            card_nine -> resultImage.setImageResource(R.drawable.nine)
            card_ten -> resultImage.setImageResource(R.drawable.ten)
            card_eleven -> resultImage.setImageResource(R.drawable.eleven)
            card_twelve -> resultImage.setImageResource(R.drawable.twelve)
            card_thirteen -> resultImage.setImageResource(R.drawable.thirteen)
        }

        if(myHand==card_six){
            if (myHand>=result_card){
                resultLabel.setText(R.string.result_win)
            }
            else{
                resultLabel.setText(R.string.result_lose)
            }
        }
        if (myHand==card_seven){
            if (myHand<=result_card){
                resultLabel.setText(R.string.result_win)
            }
            else{
                resultLabel.setText(R.string.result_lose)
            }
        }

        back_button.setOnClickListener { finish() }
    }

}

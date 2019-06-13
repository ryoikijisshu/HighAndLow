package kgu.klab.highandlow

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*
import java.util.*
import kotlin.random.Random

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val judge = intent.getIntExtra("result",0)


        var num = Random.nextInt(13) + 1

        when(num){

            1 -> uracard.setImageResource(R.drawable.one)
            2 -> uracard.setImageResource(R.drawable.two)
            3 -> uracard.setImageResource(R.drawable.three)
            4 -> uracard.setImageResource(R.drawable.four)
            5 -> uracard.setImageResource(R.drawable.five)
            6 -> uracard.setImageResource(R.drawable.six)
            7 -> uracard.setImageResource(R.drawable.seven)
            8 -> uracard.setImageResource(R.drawable.eight)
            9 -> uracard.setImageResource(R.drawable.nine)
            10 -> uracard.setImageResource(R.drawable.ten)
            11 -> uracard.setImageResource(R.drawable.eleven)
            12 -> uracard.setImageResource(R.drawable.twelve)
            13 -> uracard.setImageResource(R.drawable.thirteen)

        }


        if(judge ==1 && num < 7){

            text.setText(R.string.result_win)

        }
        else if(judge == 1 && num >= 7){

            text.setText(R.string.result_lose)

        }
        else if(judge == 2 && num >= 7){

            text.setText(R.string.result_win)

        }
        else{

            text.setText(R.string.result_lose)

        }



        onemore.setOnClickListener{finish()}


    }

}

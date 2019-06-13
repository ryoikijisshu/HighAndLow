package kgu.klab.highandlow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import android.view.View


class ResultActivity : AppCompatActivity() {
    
    val one = 0
    val two = 1
    val three = 2
    val four = 3
    val five = 4
    val six = 5
    val seven = 6
    val eight = 7
    val nine = 8
    val ten = 9
    val jack = 10
    val queen = 11
    val king = 12

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val  id = intent.getIntExtra("MY_CHOICE",0)
        val Choice: Int
        Choice = when(id){
            R.id.low -> six
            R.id.high -> seven
            else -> six
        }
        
        val card = Math.floor(Math.random() * 13).toInt()
        when(card){
            one -> front.setImageResource(R.drawable.one)
            two -> front.setImageResource(R.drawable.two)
            three -> front.setImageResource(R.drawable.three)
            four -> front.setImageResource(R.drawable.four)
            five -> front.setImageResource(R.drawable.five)
            six -> front.setImageResource(R.drawable.six)
            seven -> front.setImageResource(R.drawable.seven)
            eight -> front.setImageResource(R.drawable.eight)
            nine -> front.setImageResource(R.drawable.nine)
            ten -> front.setImageResource(R.drawable.ten)
            jack -> front.setImageResource(R.drawable.jack)
            queen -> front.setImageResource(R.drawable.queen)
            king -> front.setImageResource(R.drawable.king)
        }
        
        if(Choice<seven){
            if(card<seven){
                Resulttext.setText("あなたの勝ち")
            }
            else{
                Resulttext.setText("あなたの負け")
            }
        }
        else{
            if(card<seven){
                Resulttext.setText("あなたの負け")
            }
            else{
                Resulttext.setText("あなたの勝ち")
            }
        }

        
        back.setOnClickListener{finish()}
    }
}

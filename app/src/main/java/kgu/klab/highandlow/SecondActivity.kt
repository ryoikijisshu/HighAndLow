package kgu.klab.highandlow

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val rand :Int = Random.nextInt(13)+1
        val choice:Int=intent.getIntExtra("choice",2)

        when(rand){
            1 -> cardResult.setImageResource(R.drawable.c1)
            2 -> cardResult.setImageResource(R.drawable.c2)
            3 -> cardResult.setImageResource(R.drawable.c3)
            4 -> cardResult.setImageResource(R.drawable.c4)
            5 -> cardResult.setImageResource(R.drawable.c5)
            6 -> cardResult.setImageResource(R.drawable.c6)
            7 -> cardResult.setImageResource(R.drawable.c7)
            8 -> cardResult.setImageResource(R.drawable.c8)
            9 -> cardResult.setImageResource(R.drawable.c9)
            10 -> cardResult.setImageResource(R.drawable.c10)
            11 -> cardResult.setImageResource(R.drawable.c11)
            12 -> cardResult.setImageResource(R.drawable.c12)
            13 -> cardResult.setImageResource(R.drawable.c13)
        }

        if( (rand>=7 && choice==0) || (rand<7 && choice==1)){
            textResult.setText("あなたの勝ち!!")
        }else{
            textResult.setText("あなたの負け!!")
        }

        backToMain.setOnClickListener{
            finish()
        }
    }
}

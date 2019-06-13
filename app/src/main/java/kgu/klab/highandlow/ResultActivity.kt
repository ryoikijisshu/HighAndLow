package kgu.klab.highandlow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import kotlin.random.Random

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val cardNumber = Random.nextInt(13) + 1
        val judgeID = intent.extras.get("JUDGE_ID")

        when(cardNumber){
             2 -> cardImage.setImageResource(R.drawable.card2)
             3 -> cardImage.setImageResource(R.drawable.card3)
             4 -> cardImage.setImageResource(R.drawable.card4)
             5 -> cardImage.setImageResource(R.drawable.card5)
             6 -> cardImage.setImageResource(R.drawable.card6)
             7 -> cardImage.setImageResource(R.drawable.card7)
             8 -> cardImage.setImageResource(R.drawable.card8)
             9 -> cardImage.setImageResource(R.drawable.card9)
            10 -> cardImage.setImageResource(R.drawable.card10)
            11 -> cardImage.setImageResource(R.drawable.card11)
            12 -> cardImage.setImageResource(R.drawable.card12)
            13 -> cardImage.setImageResource(R.drawable.card13)
        }

        if(judgeID == 1 && cardNumber < 7){
            resultText.text = "勝ち"
        }
        else if(judgeID == 1 && cardNumber >= 7){
            resultText.text = "負け"
        }
        else if(judgeID == 2 && cardNumber < 7){
            resultText.text = "負け"
        }
        else{
            resultText.text = "勝ち"
        }

        returnButton.setOnClickListener {
            finish()
        }
    }
}

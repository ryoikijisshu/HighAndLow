package kgu.klab.highandlow

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

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
    val j = 10
    val q = 11
    val k = 12

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val id = intent.getIntExtra("MY_ANSWER",0)
        BackButton.setOnClickListener{onButtonTapped(it)}

        val Result = (Math.random() * 13).toInt()
        when(Result) {
            one -> ResultImage.setImageResource(R.drawable.one)
            two -> ResultImage.setImageResource(R.drawable.two)
            three -> ResultImage.setImageResource(R.drawable.three)
            four -> ResultImage.setImageResource(R.drawable.four)
            five -> ResultImage.setImageResource(R.drawable.five)
            six -> ResultImage.setImageResource(R.drawable.six)
            seven -> ResultImage.setImageResource(R.drawable.seven)
            eight -> ResultImage.setImageResource(R.drawable.eight)
            nine -> ResultImage.setImageResource(R.drawable.nine)
            ten -> ResultImage.setImageResource(R.drawable.ten)
            j -> ResultImage.setImageResource(R.drawable.j)
            q -> ResultImage.setImageResource(R.drawable.q)
            k -> ResultImage.setImageResource(R.drawable.k)
        }

        val gameResult = (7 - (Result+1))
        when(id){
            R.id.HighButton -> {
                if(gameResult <= 0){
                    ResultText.setText(R.string.result_win)
                }
                if(gameResult > 0){
                    ResultText.setText(R.string.result_lose)
                }
            }
            R.id.LowButton -> {
                if(gameResult > 0){
                    ResultText.setText(R.string.result_win)
                }
                if(gameResult <= 0){
                    ResultText.setText(R.string.result_lose)
                }
            }
        }
    }

    fun onButtonTapped(view: View?){
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("MY_ANSWER",view?.id)
        startActivity(intent)
    }
}

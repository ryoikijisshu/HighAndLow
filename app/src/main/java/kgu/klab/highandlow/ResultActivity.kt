package kgu.klab.highandlow

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val trump1=1
        val trump2=2
        val trump3=3
        val trump4=4
        val trump5=5
        val trump6=6
        val trump7=7
        val trump8=8
        val trump9=9
        val trump10=10
        val trump11=11
        val trump12=12
        val trump13=13
        val trump=getTrump()
        when(trump) {
            trump1 -> {
                resultimage.setImageResource(R.drawable.one)
            }
            trump2 -> {
                resultimage.setImageResource(R.drawable.two)
            }
            trump3 -> {
                resultimage.setImageResource(R.drawable.three)
            }
            trump4 -> {
                resultimage.setImageResource(R.drawable.four)
            }
            trump5 -> {
                resultimage.setImageResource(R.drawable.five)
            }
            trump6 -> {
                resultimage.setImageResource(R.drawable.six)
            }
            trump7 -> {
                resultimage.setImageResource(R.drawable.seven)
            }
            trump8 -> {
                resultimage.setImageResource(R.drawable.eight)
            }
            trump9 -> {
                resultimage.setImageResource(R.drawable.nine)
            }
            trump10 -> {
                resultimage.setImageResource(R.drawable.ten)
            }
            trump11 -> {
                resultimage.setImageResource(R.drawable.eleven)
            }
            trump12 -> {
                resultimage.setImageResource(R.drawable.twelve)
            }
            trump13 -> {
                resultimage.setImageResource(R.drawable.thirteen)
            }
        }
        returnbutton.setOnClickListener{
            val intent=Intent(application,MainActivity::class.java)
            startActivity(intent)
        }
    }
    private fun getTrump():Int{
        var resluttrump=Math.floor((Math.random()*13+1)).toInt()

        return  resluttrump
    }

}

package kgu.klab.highandlow

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        up.setOnClickListener{
            onButtonTapped(it)
        }

        down.setOnClickListener{
            onButtonTapped(it)
        }
    }

    fun onButtonTapped(view: View?){
        val intent = Intent(this, Main2Activity::class.java)
        intent.putExtra("HighLow", view?.id)
        startActivity(intent)
    }

}

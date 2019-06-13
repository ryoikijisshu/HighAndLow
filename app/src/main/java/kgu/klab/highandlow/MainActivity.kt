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
        HighButton.setOnClickListener{onButtonTapped(it)}
        LowButton.setOnClickListener{onButtonTapped(it)}
    }

    fun onButtonTapped(view: View?){
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("MY_ANSWER",view?.id)
        startActivity(intent)
    }
}

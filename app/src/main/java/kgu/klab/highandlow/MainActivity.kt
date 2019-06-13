package kgu.klab.highandlow

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         reverse_button.setOnClickListener {
            val  intent1 =  Intent(this, ResultActivity::class.java)
            intent1.putExtra("MY_SELECT",R.id.reverse_button)
            startActivity(intent1)
        }
        reverse_button2.setOnClickListener {
            val intent2 = Intent(this,ResultActivity::class.java)
            intent2.putExtra("MY_SELECT",R.id.reverse_button2)
            startActivity(intent2)
        }


    }
}

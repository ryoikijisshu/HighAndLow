package kgu.klab.highandlow

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        low.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("JUDGE_ID", 1)
            startActivity(intent)
        }
        high.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("JUDGE_ID", 2)
            startActivity(intent)
        }
    }
}
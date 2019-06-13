package kgu.klab.highandlow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val intent = Intent(application, SubActivity::class.java)
            intent.putExtra("result",0)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(application, SubActivity::class.java)
            intent.putExtra("result",1)
            startActivity(intent)
        }
    }
}

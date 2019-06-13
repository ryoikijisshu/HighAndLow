package kgu.klab.highandlow

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greaterEqual7.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("choice",0)
            startActivity(intent)
        }

        lessThan7.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("choice", 1)
            startActivity(intent)
        }
    }
}

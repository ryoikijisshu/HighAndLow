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

        button1.setOnClickListener { onbutton1Tapped(it) }
        button2.setOnClickListener { onbutton2Tapped(it) }
    }

    fun onbutton1Tapped(view: View?){
        val intent = Intent(this,resultactivity::class.java)
        intent.putExtra("number",0)
        startActivity(intent)
    }
    fun onbutton2Tapped(view: View?){
        val intent = Intent(this,resultactivity::class.java)
        intent.putExtra("number",1)
        startActivity(intent)
    }
}

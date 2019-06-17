package kgu.klab.highandlow

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{onbuttonTapped(it)}
        button2.setOnClickListener{onbutton2Tapped(it)}


    }
    fun onbuttonTapped(view: View?){
        val intent= Intent(this,ResultActivity::class.java)
        intent.putExtra("myid",1)
        startActivity(intent)
    }
    fun onbutton2Tapped(view: View?){
        val intent= Intent(this,ResultActivity::class.java)
        intent.putExtra("myid",2)
        startActivity(intent)
    }
}

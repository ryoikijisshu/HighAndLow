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

    }
    fun onbuttonTapped(view: View?){
        val intent= Intent(this,ResultActivity::class.java)
        intent.putExtra("trump",view?.id)
        startActivity(intent)
    }
}

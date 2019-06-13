package kgu.klab.highandlow

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSevenlowButtonTapped(view: View?){

        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra("result",1)
        startActivity(intent)

    }

    fun onSevenhighButtonTapped(view: View?){

        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra("result",2)
        startActivity(intent)

    }
}

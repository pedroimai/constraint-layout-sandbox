package br.com.pedroimai.birds

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.custom_view.view.*
import kotlinx.android.synthetic.main.responsive_linear_layout.*

class ResponsiveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.responsive_constraint_layout)
        //setContentView(R.layout.responsive_linear_layout)

        custom_view_1.button.setOnClickListener { toast("botao 1") }
        custom_view_2.button.setOnClickListener { toast("botao 2") }
        custom_view_3.button.setOnClickListener { toast("botao 3") }
    }
}

fun Activity.toast(text: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}

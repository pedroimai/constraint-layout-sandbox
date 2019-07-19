package br.com.pedroimai.birds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_starter.*

class StarterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starter)

        btn_animacao.setOnClickListener{startActivity(Intent(this,AnimatedActivity::class.java))}
        btn_responsivo.setOnClickListener{startActivity(Intent(this,ResponsiveActivity::class.java))}
        btn_form.setOnClickListener{startActivity(Intent(this,FormActivity::class.java))}
        btn_guideline.setOnClickListener{startActivity(Intent(this,GuidelineActivity::class.java))}
    }
}

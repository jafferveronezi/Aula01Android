package br.com.jaffer.primeiroprojeto

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val handle = Handler()
        handle.postDelayed({ mostrarLogin() }, 1000)

    }

    private fun mostrarLogin() {
        val intent = Intent(this@SplashScreenActivity,
                FormularioActivity::class.java)
        startActivity(intent)
        finish()
    }
}

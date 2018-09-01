package br.com.jaffer.primeiroprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.jaffer.primeiroprojeto.utils.ConstantesExtra

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val peso = intent.extras.getString(ConstantesExtra.KEY_PESO)
        val altura = intent.extras.getString(ConstantesExtra.KEY_ALTURA)

//        Toast.makeText(this, peso, Toast.LENGTH_LONG).show()
    }
}

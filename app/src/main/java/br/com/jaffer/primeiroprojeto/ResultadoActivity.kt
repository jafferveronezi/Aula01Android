package br.com.jaffer.primeiroprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import br.com.jaffer.primeiroprojeto.extensions.format
import br.com.jaffer.primeiroprojeto.utils.ConstantesExtra
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val peso = intent.extras.getString(ConstantesExtra.KEY_PESO)
        val altura = intent.extras.getString(ConstantesExtra.KEY_ALTURA)

        calcularIMC(peso.toDouble(), altura.toDouble())
    }

    private fun calcularIMC(peso: Double, altura: Double) {
        val imc = peso/(altura * altura)

        tvIMC.text = imc.format(1)

        when(imc) {
            in 0..17 -> {
                setImagem(R.drawable.magreza)
                tvIMCDescricao.text = getString(R.string.label_magreza)
            }
            in 17.1..18.5 -> {
                setImagem(R.drawable.abaixo)
                tvIMCDescricao.text = getString(R.string.label_abaixo)
            }
            in 18.6..24.9 -> {
                setImagem(R.drawable.ideal)
                tvIMCDescricao.text = getString(R.string.label_ideal)
            }
            in 25.0..29.9 -> {
                setImagem(R.drawable.sobre)
                tvIMCDescricao.text = getString(R.string.label_sobre)
            }
            in 30.0..34.9 -> {
                setImagem(R.drawable.obesidade)
                tvIMCDescricao.text = getString(R.string.label_obesidade1)
            }
            in 35.0..39.9 -> {
                setImagem(R.drawable.obesidade)
                tvIMCDescricao.text = getString(R.string.label_obesidade2)
            }
            else -> {
                setImagem(R.drawable.obesidade)
                tvIMCDescricao.text = getString(R.string.label_obesidade3)
            }
        }
    }

    private fun setImagem(resourceId: Int) {
        ivIMC.setImageDrawable(ContextCompat.getDrawable(this, resourceId))
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}

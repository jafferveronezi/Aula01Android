package br.com.jaffer.primeiroprojeto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.jaffer.primeiroprojeto.extensions.myClear
import br.com.jaffer.primeiroprojeto.extensions.value
import br.com.jaffer.primeiroprojeto.utils.ConstantesExtra
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        btn_limpar.setOnClickListener {
            input_peso.myClear()
            input_altura.myClear()
        }

        btn_calcular.setOnClickListener {
            chamarTelaResultado()
        }




    }

    private fun chamarTelaResultado() {
        val telaResultado = Intent(this, ResultadoActivity::class.java)
        telaResultado.putExtra(ConstantesExtra.KEY_PESO, input_peso.value())
        telaResultado.putExtra(ConstantesExtra.KEY_ALTURA, input_altura.value())
        startActivity(telaResultado)
    }

}

package br.com.jaffer.primeiroprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        val peso = findViewById<EditText>(R.id.edit_peso)
        val altura = findViewById<EditText>(R.id.edit_altura)
        val botaoCalcular = findViewById<Button>(R.id.btn_calcular)
        val botaoLimpar = findViewById<Button>(R.id.btn_limpar)


    }

}

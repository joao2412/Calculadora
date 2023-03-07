package com.example.aula3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Infla o XML
        setContentView(R.layout.activity_main)

        //Binding
        //1 - findViewById
        val editValor1: EditText = findViewById(R.id.editValor1)
        val editValor2: EditText = findViewById(R.id.editValor2)
        val editResultado: EditText = findViewById(R.id.editResultado)
        val buttonSomar: Button = findViewById(R.id.buttonSomar)
        val buttonSubtrair: Button = findViewById(R.id.buttonSubtrair)
        val buttonMultiplicar: Button = findViewById(R.id.buttonMultiplicar)
        val buttonDividir: Button = findViewById(R.id.buttonDividir)

        //Eventos
        //Closute, função seta(arrow function), listener
        //Closure do botão somar
        buttonSomar.setOnClickListener {


            val valor1 = editValor1.text.toString().toFloat()
            val valor2 = editValor2.text.toString().toFloat()

            val resultado = valor1 + valor2

            editResultado.setText(resultado.toString())


        }
        // Closure do botão subtrair

        buttonSubtrair.setOnClickListener{

            val valor1 = editValor1.text.toString().toFloat()
            val valor2 = editValor2.text.toString().toFloat()

            val resultado = valor1 - valor2

            editResultado.setText(resultado.toString())
        }
        buttonMultiplicar.setOnClickListener{

            val valor1 = editValor1.text.toString().toFloat()
            val valor2 = editValor2.text.toString().toFloat()

            val resultado = valor1 * valor2

            editResultado.setText(resultado.toString())

        }
        buttonDividir.setOnClickListener{
            val valor1 = editValor1.text.toString().toFloat()
            val valor2 = editValor2.text.toString().toFloat()

            val resultado = valor1 / valor2

            editResultado.setText(resultado.toString())

        }

    }
}
package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Inicializar as variáveis correspondentes às minhas views
        val pesoEditText = findViewById<EditText>(R.id.editTextNumberDecimal)
        val alturaEditText = findViewById<EditText>(R.id.editTextNumberDecimal2)
        val resultadoTextView = findViewById<TextView>(R.id.result)
        //Inicializar os botões
        val calcularButton = findViewById<Button>(R.id.button)
        val limparButton = findViewById<Button>(R.id.button2)
        //Adicionar os listeners dos botões
        calcularButton.setOnClickListener {
            val peso = pesoEditText.text.toString().toDouble()
            val altura = alturaEditText.text.toString().toDouble()
            val imc = calculaIMC(peso, altura)
            resultadoTextView.text = "$imc"
        }
        limparButton.setOnClickListener {
            pesoEditText.text.clear()
            alturaEditText.text.clear()
            resultadoTextView.text = ""
        }

    }
    //Calcular o IMC
    fun calculaIMC(peso: Double, altura: Double): Double {
        return peso / (altura * altura)
    }
}
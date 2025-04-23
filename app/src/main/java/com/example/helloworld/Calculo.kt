package com.example.helloworld

class Calculo {
    fun calculaIMC(peso: Double, altura: Double): Double {
        return peso / (altura * altura)
    }
}
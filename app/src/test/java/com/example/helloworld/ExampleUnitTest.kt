package com.example.helloworld

import org.junit.Test

import org.junit.Assert.*

import com.example.helloworld.Calculo

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun imcCorreto(){
        assertEquals(30.86, Calculo().calculaIMC(100.0, 1.80), 0.01)
    }
}
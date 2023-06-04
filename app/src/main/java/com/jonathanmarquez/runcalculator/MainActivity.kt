package com.jonathanmarquez.runcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jonathanmarquez.runcalculator.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTitle.text = "Hola, acabo de pasar la primer prueba!!"
    }

    //LLamada a la funcion de calcular velocidad
    /*var run1: Run = Run(11.32f, 45.39f)
    println("La velocidad de tu carrera es de ${run1.calculateVelocity().toString()}")*/
}
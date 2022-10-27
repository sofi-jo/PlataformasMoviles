package com.example.miapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edadPersonas()
        multiplicacionAsceYDes()
        listadoEstudiantes()
        calculoIva()
        
    }

    fun edadPersonas(){
        var edad = 15
        if (edad > 18)
            println("Es mayor de edad")
        else
            println("Es menor de edad")
    }

    fun multiplicacionAsceYDes(){
        var num = 8
        var res = 0
        for (num in i..10)
            res = num * i
            println(res)
    }

    fun listadoEstudiantes(){
        val lista: List<String> = listOf("Erick Antonio Alvarado Cuenca",
            "Miguel Angel Caraguay Correa", "Carlos Alberto Castillo Jumbo",
            "Erick Leonardo Cañar Cuenca","Anthony Damian Espinosa Campoverde",
            "Jhoselin Anai Guachizaca Vargas", "Steven Andres Silva Jara",
            "Adriana Sofia Jaramillo Ochoa", "Andres Alejandro Jimenez Castillo",
            "Mateo Sebastian Martinez Velasquez", "Pablo Andres Montaño Bustos",
            "Rommel Alexander Ojeda Riera","Joselito Miguel Ordoñez Sanmartin",
            "Diego Alejandro Pardo Alberca", "Bryan Anthony Rodriguez Alvarado",
            "Pablo Jose Sanchez Saraguro", "Jose Isaias Silva Leon", "Carlos Andres Tandazo Malla"
        )

        for (lista in l)
            println(lista[l])
    }

    fun propiedadesVehiculo(){
        var vehiculo: List<String> = listOf()
    }

    fun calculoIva(){
        var iva = 0.12
        var precio = 12.5
        var incremento = precio * iva
        var total = precio + incremento
        println(total)
    }

    fun validacionCedula(){
        val numCedula = listOf<Int>(1,1,5,0,5,6,3,9,8,7)
        val numAlgo = listOf<Int>(2,1,2,1,2,1,2,1,2)
        var sum = 0
        var mul = 0
        var acum = 0
        for (numAlgo in n)
            mul = numAlgo[n] * numCedula[n]
            if ( mul < 10)
                acum = acum + mul
            else
                sum =

    }

}
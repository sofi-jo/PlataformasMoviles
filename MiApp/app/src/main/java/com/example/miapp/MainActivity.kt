package com.example.miapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edadPersonas()
        listadoEstudiantes()
        calculoIva()
        validacionCedula()

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
        for (a in 0..10)
            res = a * num
            println("$a * $num = $res")

        for (d in 0 downTo 10)
            res = d * num
            println("$d * $num = $res")
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

        println("Lista de estudiantes Plataformas Moviles")
        for (l in lista) {
            println(l)
        }

        println("Subgrupos por proyectos")
        println("Proyecto 1")
        println("Grupo 1: ${lista.get(0)},${lista.get(11)}, ${lista.get(2)}")
        println("Grupo 2: ${lista.get(1)},${lista.get(6)}, ${lista.get(7)}")
        println("Grupo 3: ${lista.get(13)},${lista.get(14)}, ${lista.get(15)}")
        println("Proyecto 2")
        println("Grupo 4: ${lista.get(9)},${lista.get(12)}, ${lista.get(10)}")

    }

    fun propiedadesVehiculo(){
        var vehiculo: List<String> = listOf()
    }

    fun calculoIva(){
        var iva = 0.12
        var precio = 12.5
        var incremento = precio * iva
        var total = precio + incremento
        println("El total precio total con iva es: $total")
    }

    fun validacionCedula(){
        val numCedula = listOf<Int>(1,1,5,0,5,6,3,9,8,7)
        val numAlgo = listOf<Int>(2,1,2,1,2,1,2,1,2)
        var acum = 0
        var total = 0
        for (n in numAlgo){
            var mul = 0
            mul = numAlgo[n] * numCedula[n]
            if (mul < 10)
                acum = acum + mul
            else
                mul = mul - 9
                acum = acum + mul
        }
        total = 40 - acum
        if (total == numCedula[0])
            println("Es un numero de cedula correcto")
    }

}
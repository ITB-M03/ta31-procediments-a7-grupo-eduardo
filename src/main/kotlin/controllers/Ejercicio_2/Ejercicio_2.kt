package controllers.Ejercicio_2

import utilities.iniciarScan
import java.util.Scanner

fun main() {
    val scan = iniciarScan()
    val numero = leerNumero(scan)

    val romano = roman(numero)
    println(romano)
}

fun leerNumero(scan: Scanner): Int {
    println("Ingresa un número entre 1 y 3999 y te lo convierto a romanos: ")
    var resultado = scan.nextInt()
    return resultado
}

fun esValid(numero: Int): Boolean {
    var resultat: Boolean = false
    if (numero !in 1..3999) {
        println("ERROR: El número debe estar entre 1 y 3999.")
    } else resultat = true
    return resultat
}

fun roman(numero: Int): String {
    var miles : String = ""
    var centena : String = ""
    var decena : String = ""
    var unidad : String = ""
    if (esValid(numero)){
        miles = convertirMiles(numero / 1000)
        centena = convertirCentenas(numero % 1000)
        decena = convertirDecenas(numero % 100)
        unidad = convertirUnidades(numero % 10)
    }
    return miles + centena + decena + unidad
}

fun convertirMiles(n: Int): String {
    return "M".repeat(n)
}

fun convertirCentenas(n: Int): String {
    val centena = arrayOf("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
    return centena[n / 100]
}

fun convertirDecenas(n: Int): String {
    val decena = arrayOf("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
    return decena[n / 10]
}

fun convertirUnidades(n: Int): String {
    val unidad = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
    return unidad[n]
}

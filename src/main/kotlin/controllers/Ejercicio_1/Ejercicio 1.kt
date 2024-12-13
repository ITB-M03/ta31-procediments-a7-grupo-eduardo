package controllers.Ejercicio_1

import utilities.iniciarScan

import java.util.*

fun main() {
    val scan = iniciarScan()
    var preu = leerPrecio(scan)
    var fecha = obtenerFecha(scan)
    var anyo= comprobarAnyoIva(fecha)
    var tipusIva = llegirTipusIVA(scan)
    var lista = llistaIva(scan)
    var precioFinal = calcularIva(preu,anyo,tipusIva,lista)
    println(precioFinal)
}

fun leerPrecio(scan: Scanner): Int {
    println("Introduzca el precio:")
    var resultat: Int = scan.nextInt()
    scan.nextLine()
    return resultat
}

fun obtenerFecha(scan: Scanner): List<String> {
    println("Introduzca la fecha:")
    var resultat: List<String> = scan.nextLine().split("-")
    scan.nextLine()
    return resultat
}

fun llegirTipusIVA(scan: Scanner): Int {
    println("Introduzca el tipo de IVA:")
    var tipus: String = scan.nextLine()
    var resultat : Int = 0
    if (tipus=="General") resultat=0
    else if (tipus == "Reduït")resultat=1
    else if (tipus=="Superreduit")resultat=2
    else if (tipus=="Exempt") resultat=3
    return resultat
}

fun llistaIva(scan: Scanner): MutableList<MutableList<Double>> {
    var resultat: MutableList<MutableList<Double>>
    resultat = mutableListOf(
        mutableListOf(0.12, 0.06, 0.12, 0.0),
        mutableListOf(0.15, 0.06, 0.12, 0.0),
        mutableListOf(0.15, 0.06, 0.03, 0.0),
        mutableListOf(0.16, 0.07, 0.04, 0.0),
        mutableListOf(0.18, 0.08, 0.04, 0.0),
        mutableListOf(0.21, 0.10, 0.04, 0.0)
    )
    return resultat
}

fun comprobarAnyoIva(fecha : List<String>): Int {
   var resultat = when(fecha[2].toInt()) {
       in 1986..1991 -> 0
       in 1992..1992 -> 1
       in 1993..1994 -> 2
       in 1995..2009 -> 3
       in 2010..2011 -> 4
       2012 -> when( fecha[1].toInt()) {
           in 0..6 -> 4
           7 -> if (fecha[0].toInt() <15) 4 else 5
            else -> 5
       }
       else -> 5
    }
    return resultat
}

fun calcularIva(preu: Int, anyo:Int,tipusIva:Int, lista:MutableList<MutableList<Double>>) : Int{
    var resultat = 0
    resultat = preu+(preu * lista[anyo][tipusIva]).toInt()
    return resultat
}
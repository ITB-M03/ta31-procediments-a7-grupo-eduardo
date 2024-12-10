package controllers.Ejercicio_1

import utilities.iniciarScan

import java.util.*

fun main() {
    val scan = iniciarScan()
    var preu = leerPrecio(scan)
    var fecha = obtenerFecha(scan).split("-")
    var anyo = fecha[2].toInt()
    anyo= comprobarAnyoIva(anyo)
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

fun obtenerFecha(scan: Scanner): String {
    println("Introduzca la fecha:")
    var resultat: String = scan.next()
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

fun comprobarAnyoIva(anyo: Int): Int {
    var resultat: Int = 0
    if (anyo >= 1986 && anyo < 1992) resultat = 0
    else if (anyo >= 1992 && anyo < 1993) resultat = 1
    else if (anyo >= 1993 && anyo < 1995) resultat = 2
    else if (anyo >= 1995 && anyo < 2010) resultat = 3
    else if (anyo >= 2010 && anyo < 2012) resultat = 4
    else if (anyo >= 1992) resultat = 5
    return resultat
}

fun calcularIva(preu: Int, anyo:Int,tipusIva:Int, lista:MutableList<MutableList<Double>>) : Int{
    var resultat = 0
    resultat = preu+(preu * lista[anyo][tipusIva]).toInt()
    return resultat
}
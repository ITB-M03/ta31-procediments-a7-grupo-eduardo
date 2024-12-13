package controllers.Ejercicio_1

import utilities.iniciarScan

import java.util.*

/**
 * ## Funcion principal
 * @author Ivan Torres & Denis Coello
 * @param preu llamamos a leerPrecio
 * @param fecha llamamos a obtenerFecha
 * @param anyo llamamos a comprobar Iva
 * @param lista llamamos a llistaIVA
 * @param precioFinal llamamos a calcularIva
 */
fun main() {
    val scan = iniciarScan()
    var preu = leerPrecio(scan)
    var fecha = obtenerFecha(scan)
    var anyo= comprobarIva(fecha)
    var tipusIva = llegirTipusIVA(scan)
    var lista = llistaIva(scan)
    var precioFinal = calcularIva(preu,anyo,tipusIva,lista)
    println(precioFinal)
}

/**
 * ## Funcion para leer precio
 * @author Ivan Torres & Denis Coello
 * @param scan llamamos al escaner
 * @return precio introducido
 */
fun leerPrecio(scan: Scanner): Int {
    println("Introduzca el precio:")
    var resultat: Int = scan.nextInt()
    scan.nextLine()
    return resultat
}

/**
 * ## Funcion para obtener la fecha
 * @author Ivan Torres & Dennis Coello
 * @param scan llamamos al escaner
 * @return lista amb la data separada en dia, mes i any
 */
fun obtenerFecha(scan: Scanner): List<String> {
    println("Introduzca la fecha:")
    var resultat: List<String> = scan.nextLine().split("-")
    return resultat
}
/**
 * ## Funcion para leer eñl tipo de IVA
 * @author Ivan Torres & Dennis Coello
 * @param scan llamamos al escaner
 * @return numero en que s'indica la posició en que es troba el iva corresponent a la llista
 */
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
/**
 * ## Funcion para iniciar la lista de IVA
 * @author Ivan Torres & Dennis Coello
 * @param scan llamamos al escaner
 * @return retorna una llista en que es troban el percentatge de cada tipus d'IVA
 */
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
/**
 * ## Funcion para comprobar el IVA vigente
 * @author Ivan Torres & Dennis Coello
 * @param fecha data introduida
 * @return numero que representa la psoició del any correponents a la llista
 */
fun comprobarIva(fecha : List<String>): Int {
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
/**
 *## Funcion para calcular el precio con IVA
 * @author Ivan Torres & Dennis Coello
 * @param preu precio introducido anteriormente
 * @param anyo año introducido anteriormente
 * @param tipusIva tipo de iva seleccionado anteriormente
 * @param lista lista generada anteriormente con los valores del iva de cad aaño y de cada tipo
 * @return preu multiplicat per l'IVA corresponent per a l'any indicat
 */
fun calcularIva(preu: Int, anyo:Int,tipusIva:Int, lista:MutableList<MutableList<Double>>) : Int{
    var resultat = 0
    resultat = preu+(preu * lista[anyo][tipusIva]).toInt()
    return resultat
}
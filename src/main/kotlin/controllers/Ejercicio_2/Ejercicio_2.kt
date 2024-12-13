package controllers.Ejercicio_2

import utilities.iniciarScan
import java.util.Scanner

/**
 * ## Funcion principal
 * @author Ivan Torres & Denis Coello
 * @param scan llamamos la función iniciarScan
 * @param numero llamamos la funcion leerNumero
 * @param romano llamamos la funcion roman
 */
fun main() {
    val scan = iniciarScan()
    val numero = leerNumero(scan)
    val romano = roman(numero)
    println(romano)
}
/**
 * ## Funcion para leer un numero
 * @author Ivan Torres & Denis Coello
 * @param scan llamamos al escaner
 * @return devuelve el numero introducido
 */
fun leerNumero(scan: Scanner): Int {
    println("Ingresa un número entre 1 y 3999 y te lo convierto a romanos: ")
    var resultado = scan.nextInt()
    return resultado
}
/**
 * ## Funcion para comprobar si el numero es valido
 * @author Ivan Torres & Denis Coello
 * @param numero numero para pasar a romanos
 * @return devuelve en una variable booleana si el numero es valido o no
 * */
fun esValid(numero: Int): Boolean {
    var resultat: Boolean = false
    if (numero !in 1..3999) {
        println("ERROR: El número debe estar entre 1 y 3999.")
    } else resultat = true
    return resultat
}
/**
 * ## Funcion para pasar a numeros romanos
 * @author Ivan Torres & Denis Coello
 * @param numero numero para pasar a romanos
 * @return nombre en numeros roman
 */
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
/**
 * ## Funcion para pasar miles
 * @author Ivan Torres & Denis Coello
 * @param n numero de milers
 * @return milers en  numeros romans
 */
fun convertirMiles(n: Int): String {
    return "M".repeat(n)
}
/**
 * ## Funcion para pasar centenas
 * @author Ivan Torres & Denis Coello
 * @param n numero de centenas
 * @return centenas en numeros romans
 */
fun convertirCentenas(n: Int): String {
    val centena = arrayOf("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
    return centena[n / 100]
}
/**
 * ## Funcion para pasar decenas
 * @author Ivan Torres & Denis Coello
 * @param n numero de decenas
 * @return decenes en romans
 */
fun convertirDecenas(n: Int): String {
    val decena = arrayOf("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
    return decena[n / 10]
}
/**
 * ## Funcion para pasar unidades
 * @author Ivan Torres & Denis Coello
 * @param n numero de unidades
 * @return unidades en romans
 */
fun convertirUnidades(n: Int): String {
    val unidad = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
    return unidad[n]
}

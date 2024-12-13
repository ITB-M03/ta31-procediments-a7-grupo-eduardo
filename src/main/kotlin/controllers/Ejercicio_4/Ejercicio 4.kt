package controllers.Ejercicio_4

import utilities.iniciarScan
import utilities.cerrarScan
import java.util.Scanner

/**
 * ## Funcion Principal
 * @author Ivan Torres & Denis Coello
 * @param scan iniciar escaner
 * @param mensaje  llamar a la funcion leer mensaje
 */
fun main(){
    val scan = iniciarScan()
    val mensaje = leerMensaje(scan)
    titol(mensaje)
    cerrarScan(scan)
}
/**
 * ## Funcion para leer el mensaje
 * @author Ivan Torres & Denis Coello
 * @param scan llamamos al escaner
 * @return mensaje introducido
 */
fun leerMensaje(scan: Scanner) : String{
    println("Introduzca un mensaje:")
    val mensaje : String = scan.nextLine()
    return mensaje
}
/**
 * ## Funcion para escribir el Titulo
 * @author Ivan Torres & Denis Coello
 * @param mensaje mensaje introducido anteriormente
 */
fun titol(mensaje : String){
    val espacios = espaciosEnBlanco(mensaje)
    for (i in 1 until espacios){
        print(" ")
    }
    print(mensaje)
    for (i in 1 until espacios){
        print(" ")
    }
}
/**
 * ## Funcion para generar espacios en blanco
 * @author Ivan Torres & Denis Coello
 * @param mensaje mensaje introducido anteriormente
 * @return cantidad de espacios en blanco
 */
fun espaciosEnBlanco(mensaje : String) : Int{
    val tamanyoMensaje : Int = mensaje.length
    val tamanyoLibre : Int = 80 - tamanyoMensaje
    var espacioUtil : Int
    if (tamanyoLibre % 2 == 0){
        espacioUtil = tamanyoLibre / 2
    }
    else espacioUtil = tamanyoLibre / 2 - 1
    return espacioUtil
}
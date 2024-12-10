package controllers.Ejercicio_4

import utilities.iniciarScan
import utilities.cerrarScan
import java.util.Scanner

fun main(){
    val scan = iniciarScan()
    val mensaje = leerMensaje(scan)
    titol(mensaje)
    cerrarScan(scan)
}

fun leerMensaje(scan: Scanner) : String{
    println("Introduzca un mensaje:")
    val mensaje : String = scan.nextLine()
    return mensaje
}

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
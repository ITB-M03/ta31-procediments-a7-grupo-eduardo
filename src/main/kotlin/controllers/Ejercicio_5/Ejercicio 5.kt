package controllers.Ejercicio_5

import utilities.iniciarScan
import utilities.cerrarScan
import java.awt.Menu
import java.util.*
import java.util.Scanner

fun main() {
    val scan = iniciarScan()
   menu2(scan)
    cerrarScan(scan)
}

fun menu(scan: Scanner): Int {
    var resultat: Int
    println(
        """
        1-Afegir un numero (Push)
        2-Treure un numero (Pop)
        3-Mostrar el contingut de la pila
        4-Sortir"""
    )
    resultat = scan.nextInt()
    return resultat
}

fun push(scan: Scanner) {
    print("introduzca bnumero")
    var numero: Int = scan.nextInt()
    print("prueba")
}

fun pop(scan: Scanner){
    var numero : Int = scan.nextInt()
    print("prueba")
}
fun mostrar(){
    print("prueba")
}

fun menu2(scan: Scanner) {
   var menu : Int = menu(scan)
    while (menu !=4){
       when (menu) {
           1 -> { push(scan)  }
           2 -> { pop(scan)  }
           3-> { mostrar() }
           else -> { println("Opcion invalida") }
       }
        menu = menu(scan)
   }
    if(menu == 4) print("Adios")
}
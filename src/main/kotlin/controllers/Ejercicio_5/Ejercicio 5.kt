package controllers.Ejercicio_5

import utilities.iniciarScan
import java.awt.Menu
import java.util.Scanner

fun main() {
    val scan = iniciarScan()
    menu(scan)
    menu2(menu, scan)


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
    var numero: Int = scan.nextInt()
}


fun menu2(menu: Int, scan: Scanner) {
    when (menu) {
        1 -> push(scan); menu(scan)
        2 -> pop(); menu(scan)
        3-> mostrar(); menu(scan)
        4-> salir()
        else -> {
            println("Opcion invalida")
            menu(eleccion)
        }
    }
}
package controllers.Ejercicio_5

import utilities.iniciarScan
import utilities.cerrarScan
import java.util.Scanner

fun main() {
    val scan = iniciarScan()
    menu2(scan)
    cerrarScan(scan)
}

fun array() : Array<Int>{
    var resultat = Array<Int>(10) { -1 }
    return resultat
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

fun push(scan: Scanner, array: Array<Int>) {
    if (array[9] == -1){
        println("Introduzca numero: ")
        var numero: Int = scan.nextInt()
        print("Numero añadido!")
    }

}

fun pop(scan: Scanner) {
    println("Introduzca su numero: ")
    var numero: Int = scan.nextInt()
    print("Numero eliminado!")
}

fun mostrar() {
    print("prueba")
}

fun menu2(scan: Scanner) {
    var menu: Int = menu(scan)
    while (menu != 4) {
        when (menu) {
            1 -> {
                push(scan, array())
            }

            2 -> {
                pop(scan)
            }

            3 -> {
                mostrar()
            }

            else -> {
                println("Opcion invalida")
            }
        }
        menu = menu(scan)
    }
    if (menu == 4) print("Adiós!!")
}
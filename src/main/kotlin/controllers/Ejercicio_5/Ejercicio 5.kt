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
    if (array.last() == -1){
        println("Introduzca numero: ")
        var numero: Int = scan.nextInt()
        var primerNumero = false
        for (i in 0 until 10){
            if (array[i] == -1 && !primerNumero){
                array[i] = numero
                primerNumero = true
            }
        }
        print("Numero añadido!")
    }
    else println("La pila está llena, no se puede añadir ningún número")
}

fun pop(scan: Scanner) {

    println("Introduzca su numero: ")
    var numero: Int = scan.nextInt()
    print("Numero eliminado!")
}

fun mostrar(array: Array<Int>) {
    for (i in 0 until 10){
        if (array[i] != -1) print("El contenido de la pila es: ${array[i]}")
    }

}

fun menu2(scan: Scanner) {
   var menu : Int = menu(scan)
    val array = array()
    while (menu !=4){
       when (menu) {
           1 -> push(scan, array)
           2 -> pop(scan)
           3-> mostrar(array)
           else -> println("Opcion invalida")
       }
        menu = menu(scan)
    }
    if (menu == 4) print("Adiós!!")
}
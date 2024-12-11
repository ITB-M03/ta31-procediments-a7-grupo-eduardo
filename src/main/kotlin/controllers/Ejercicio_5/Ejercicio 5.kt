package controllers.Ejercicio_5

import utilities.iniciarScan
import java.awt.Menu
import java.util.*
import java.util.Scanner

fun main() {
    val scan = iniciarScan()
   val menu = menu(scan)
   menu2(menu,scan)
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

fun menu2(menu: Int, scan: Scanner) {
   while (menu !=4){
       when (menu) {
           1 -> { push(scan) ; menu(scan) }
           2 -> { pop(scan) ; menu(scan) }
           3-> { mostrar() ; menu(scan) }
           else -> { println("Opcion invalida") ; menu(scan) }
       }
   }
    if(menu == 4) print("Adios")
}
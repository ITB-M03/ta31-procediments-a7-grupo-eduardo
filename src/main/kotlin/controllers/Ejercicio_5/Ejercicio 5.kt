package controllers.Ejercicio_5

import utilities.iniciarScan
import utilities.cerrarScan
import java.util.Scanner

/**
 * ## Funcion principal
 * @author Ivan Torres & Denis Coello
 * @param scan iniciar escaner
 */
fun main() {
    val scan = iniciarScan()
   menu2(scan)
    cerrarScan(scan)
}
/**
 * ## Funcion para iniciar el array
 * @author Ivan Torres & Denis Coello
 *@return array creat
 */
fun array() : Array<Int>{
    var resultat = Array<Int>(10) { -1 }
    return resultat
}
/**
 * ## Funcion para mostrar el menu
 * @author Ivan Torres & Denis Coello
 * @param scan llamamos al escaner
 *@return numero que indica la seleccion del menú
 */
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
/**
 * ## Funcion para hacer el push
 * @author Ivan Torres & Denis Coello
 * @param scan llamamos al escaner
 * @param array array en que guardarem els numeros de la pila
 */
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
/**
 * ## Funcion para hacer el pop
 * @author Ivan Torres & Denis Coello
 * @param array en que estan los numeros de la pila
 */
fun pop(array: Array<Int>) {
    if (array.first() != -1){
        var primerNumero = false
        for (i in 9 downTo 0){
            if (array[i] != -1 && !primerNumero){
                array[i] = -1
                primerNumero = true
            }
        }
        print("Numero eliminado!")
    }
    else println("La pila está vacia")
}
/**
 * ## Funcion para mostrar el array
 * @author Ivan Torres & Denis Coello
 * @param array array en que estan los numeros de la pila
 */
fun mostrar(array: Array<Int>) {
   if (array.first() == -1) println("La pila está vacia")
   else {
       print("El contenido de la pila es: ")
       for (i in 0 until 10){
           if (array[i] != -1) print("[${array[i]}]")
       }
   }
}
/**
 * ## Funcion que analiza y redirije segun la eleccion del menu
 * @author Ivan Torres & Denis Coello
 * @param scan llamamos al escaner
 */
fun menu2(scan: Scanner) {
   var menu : Int = menu(scan)
    val array = array()
    while (menu !=4){
       when (menu) {
           1 -> push(scan, array)
           2 -> pop(array)
           3-> mostrar(array)
           else -> println("Opcion invalida")
       }
        menu = menu(scan)
    }
    if (menu == 4) print("Adiós!!")
}
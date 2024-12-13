package controllers.Ejercicio_3

import utilities.iniciarScan
import utilities.cerrarScan
import java.util.*

/**
 * ## Funcion principal
 * @author Ivan Torres y Denis Coello
 * @param scan iniciar escaner
 */
fun main(){
    val scan = iniciarScan()
    validarSuperusuari( scan)
    cerrarScan(scan)
}
/**
 * ## Funcion para leer la contraseña
 * @author Ivan Torres y Denis Coello
 * @param scan llamar al escaner
 * @return contraseña introducida
 */
fun leerContrasenya(scan : Scanner) : String{
    println("Introduzca la contraseña:")
    val intento = scan.nextLine()
    return intento
}
/**
 * ## Funcion  para validar superusuario
 * @author Ivan Torres y Denis Coello
 * @param scan llamar al escaner
 */
fun validarSuperusuari(scan: Scanner){
    var contadorErrores = 0
    while (contadorErrores <= 3){
        val intento = leerContrasenya(scan)
        var contrasenyaCorrecta = comprobarContrasenya(intento)
        if (contrasenyaCorrecta){
            println("Contrasenya correcta")
            contadorErrores = 4
        }
        else {
            println("Contrasenya incorrecta")
            contadorErrores++
        }
    }
}
/**
 * ## Funcion para comprobar las contraseña
 * @author Ivan Torres y Denis Coello
 * @param mensaje
 * @return booleano que indica si la contraseña es correcta o no
 */
fun comprobarContrasenya(mensaje: String) : Boolean{
    val contrasenya = contrasenya()
    var correcto : Boolean = false
    if (mensaje == contrasenya) {
        correcto = true
    }
    return correcto
}
/**
 * ## Funcion que establece la contraseña
 * @author Ivan Torres y Denis Coello
 * @return contraseña del superusuari
 */
fun contrasenya() : String{
    val contrasenya = "contrasenya"
    return contrasenya
}
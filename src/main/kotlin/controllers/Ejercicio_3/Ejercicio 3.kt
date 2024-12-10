package controllers.Ejercicio_3

import utilities.iniciarScan
import utilities.cerrarScan
import java.util.*

fun main(){
    val scan = iniciarScan()
    validarSuperusuari( scan)
    cerrarScan(scan)
}

fun leerContrasenya(scan : Scanner) : String{
    println("Introduzca la contraseña:")
    val intento = scan.nextLine()
    return intento
}
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

fun comprobarContrasenya(mensaje: String) : Boolean{
    val contrasenya = contrasenya()
    var correcto : Boolean = false
    if (mensaje == contrasenya) {
        correcto = true
    }
    return correcto
}

fun contrasenya() : String{
    val contrasenya = "contrasenya"
    return contrasenya
}
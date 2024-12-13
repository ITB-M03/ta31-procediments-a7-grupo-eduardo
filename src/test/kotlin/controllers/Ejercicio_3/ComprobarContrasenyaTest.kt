package controllers.Ejercicio_3

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class ComprobarContrasenyaTest {

@Test
 fun comprobarContrasenya1Test() {
 val esperado = true
 kotlin.test.assertEquals(esperado, comprobarContrasenya("contrasenya"))
 }
@Test
fun comprobarContrasenya2Test(){
 val esperado = false
 kotlin.test.assertEquals(esperado, comprobarContrasenya("Contrasenya"))
}
@Test
fun comprobarContrasenya3Test(){
 val esperado = false
 kotlin.test.assertEquals(esperado, comprobarContrasenya("cOntrasenya"))
}
}
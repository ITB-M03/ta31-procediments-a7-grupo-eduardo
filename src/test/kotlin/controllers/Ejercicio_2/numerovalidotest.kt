package controllers.Ejercicio_2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class numerovalidotest {

@Test
 fun esValid1Test() {
  val esperado = true
 kotlin.test.assertEquals(esperado, esValid(300))
 }
@Test
fun esValidad2test(){
 val esperado = false
 kotlin.test.assertEquals(esperado, esValid(40000))
}
@Test
fun esValidad3Test() {
 val esperado = false
 kotlin.test.assertEquals(esperado, esValid(-1))
}
}
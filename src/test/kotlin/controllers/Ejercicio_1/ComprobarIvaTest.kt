package controllers.Ejercicio_1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class ComprobarIvaTest {

@Test
 fun comprobarIva1Test() {
  val esperado = 0
  assertEquals(esperado, comprobarIva(listOf("21","7","1989")))
 }
  @Test
  fun comprobarIva2Test() {
   val esperado = 5
   assertEquals(esperado, comprobarIva(listOf("21","07","2012")))
  }
  @Test
  fun comprobarIva3Test() {
   val esperado = 4
   assertEquals(esperado, comprobarIva(listOf("14","07","2012")))
  }
}
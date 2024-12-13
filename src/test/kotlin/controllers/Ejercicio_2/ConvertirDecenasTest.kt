package controllers.Ejercicio_2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class ConvertirDecenasTest {

@Test
 fun convertirDecenas1Test() {
  val esperado = "X"
 assertEquals(esperado, convertirDecenas(10))
 }
  @Test
  fun convertirDecenas2Test() {
   val esperado = "XX"
   assertEquals(esperado, convertirDecenas(20))
  }
  @Test
  fun convertirDecenas3Test() {
   val esperado = ""
   assertEquals(esperado, convertirDecenas(0))
  }
}
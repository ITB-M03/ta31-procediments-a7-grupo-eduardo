package controllers.Ejercicio_2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class PasarANumeroRomanoTest {

@Test
 fun roman1Test() {
  val esperado = "XXX"
 assertEquals(esperado,roman(30))
 }
  @Test
  fun roman2Test() {
   val esperado = "MCV"
   assertEquals(esperado,roman(1105))
  }
  @Test
  fun roman3Test() {
   val esperado = "I"
   assertEquals(esperado,roman(1))
  }
}
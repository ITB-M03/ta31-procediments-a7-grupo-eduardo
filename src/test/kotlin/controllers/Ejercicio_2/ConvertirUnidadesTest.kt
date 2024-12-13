package controllers.Ejercicio_2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class ConvertirUnidadesTest {

@Test
 fun convertirUnidades1Test() {
  val esperado = "I"
 assertEquals(esperado, convertirUnidades(1))
 }
  @Test
  fun convertirUnidades2Test() {
   val esperado = ""
   assertEquals(esperado, convertirUnidades(0))
  }
  @Test
  fun convertirUnidades3Test() {
   val esperado = "IX"
   assertEquals(esperado, convertirUnidades(9))
  }
}
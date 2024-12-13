package controllers.Ejercicio_2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class convertirMilesTest {

@Test
 fun convertirMiles() {
  var esperado = "M"
 assertEquals(esperado, convertirMiles(1))
 }
  @Test
  fun convertirMiles2() {
   var esperado = "MMM"
   assertEquals(esperado, convertirMiles(3))
  }
  @Test
  fun convertirMiles3() {
   var esperado = "MMMMM"
   assertEquals(esperado, convertirMiles(5))
  }
}
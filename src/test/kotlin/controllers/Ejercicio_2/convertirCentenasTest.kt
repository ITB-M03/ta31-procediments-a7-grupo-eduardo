package controllers.Ejercicio_2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class convertirCentenasTest {

@Test
 fun convertirCentenas() {
  var esperado = ""
 assertEquals(esperado, controllers.Ejercicio_2.convertirCentenas(1))
 }
  @Test
  fun convertirCentenas2() {
   var esperado = "C"
   assertEquals(esperado, controllers.Ejercicio_2.convertirCentenas(100))
  }
  @Test
  fun convertirCentenas3() {
   var esperado = "CCC"
   assertEquals(esperado, controllers.Ejercicio_2.convertirCentenas(300))
  }
}
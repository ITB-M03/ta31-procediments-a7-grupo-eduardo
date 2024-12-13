package controllers.Ejercicio_2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class ConvertirDecenasTest {

@Test
 fun convertirDecenas1Test() {
  val esperado = "X"
 assertEquals(esperado, convertirDecenas(10))
 }
}
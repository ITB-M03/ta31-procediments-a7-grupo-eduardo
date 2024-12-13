package controllers.Ejercicio_4

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class EspaciosEnBlancoTest {

@Test
 fun espaciosEnBlanco1Test() {
  val esperado = 40
 kotlin.test.assertEquals(esperado, espaciosEnBlanco(""))
 }
  @Test
  fun espaciosEnBlanco2Test() {
   val esperado = -1
   kotlin.test.assertEquals(esperado, espaciosEnBlanco("Disfrutar cada momento es clave para vivir una vida plena y llena de felicidadd"))
  }
  @Test
  fun espaciosEnBlanco3Test() {
   val esperado = 20
   kotlin.test.assertEquals(esperado, espaciosEnBlanco("La vida es corta, disfruta cada instante"))
  }
}
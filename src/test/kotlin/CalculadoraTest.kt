import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest{

    @Test
    fun subTest() {
        assertEquals(20, Calculadora.sub(30, 10))
    }

    @Test
    fun subTest2() {
        assertEquals(15.0, Calculadora.sub(25.0, 10.0))
    }
    //----------------------------------------------------------------------------
    @Test
    fun somaTest(){
        assertEquals(10.0,  Calculadora.soma(5.0, 5.0) )
        assertEquals(20, Calculadora.soma(10, 10))
    }

    @Test
    fun multTest() {
        assertEquals(350.0,  Calculadora.mult(35.0, 10.0) )
        assertEquals(300, Calculadora.mult(30, 10))
    }

    @Test
    fun div() {
        assertEquals(12.0,  Calculadora.div(60.0, 5.0) )
        assertEquals(200, Calculadora.div(400, 2))
    }
}
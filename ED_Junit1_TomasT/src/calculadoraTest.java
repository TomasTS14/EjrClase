import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {

	@Test
	void testSuma() {

		assertEquals(100, Calculadora.suma(80, 20));

	}

	@Test
	void testResta() {

		assertEquals(80, Calculadora.resta(100, 20));

	}

	@Test
	void testMultiplicacion() {

		assertEquals(2000, Calculadora.multiplicacion(100, 20));
	}

	@Test
	void testDivision() {
		assertEquals(50, Calculadora.division(100, 2));
	}

	@Test
	void testRestoDivision() {

		assertEquals(2, Calculadora.restoDivision(47, 5));
	}

	@Test
	void testResultadoPotencia() {
		
		assertEquals(27.0, Calculadora.resultadoPotencia(3, 3));
	}

	@Test
	void testResultRaizCuadrada() {
		
		assertEquals(4.0, Calculadora.resultRaizCuadrada(16));

	}
}

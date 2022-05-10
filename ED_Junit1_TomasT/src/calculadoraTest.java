import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class calculadoraTest {
	
	private Stream<double> arguments(double a, double b , double c) {
		return Stream.of(a, b, c);
	}

	@ParameterizedTest
	@MethodSource("twoNumbers")
	
	void testSuma(int a, int b, int c) {

		assertEquals(a, Calculadora.suma( b , c));

	}
	
	private static Stream<Arguments> twoNumbers(){
		
		return Stream.of(
				arguments(40, 25, 15),
				arguments(2000, 1999, 1),
				arguments (9, -5 , 9)
				);
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

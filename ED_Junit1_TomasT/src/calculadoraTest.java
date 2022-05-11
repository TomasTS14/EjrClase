import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class calculadoraTest {
	
	

	@ParameterizedTest
	@ValueSource ( doubles={3,4,10,20,17})
	
	void testSuma(double number) {

		assertEquals(number*3, Calculadora.suma( number , number));

	}
	

	@ParameterizedTest
	@CsvSource ({"9,6,3","10,9,1","1239,12,1227","0.9,0.2, 0.7"})
	void testResta(double val1, double val2, double result) {

		assertEquals(result, Calculadora.resta(val1, val2));

	}

	@Test
	void testMultiplicacion() {
		
		
		assertTimeout(Duration.ofMillis(20), () ->
		{
			Calculadora.multiplicacion(2500000000000000.99, 89006786876876867000099.11);
		});
	}

	@Test
	void testDivision() {
		assertThrows(ArithmeticException.class, ()->{
			Calculadora.division(0, 9);
		});
		assertEquals(50, Calculadora.division(100, 2));
	}

	@ParameterizedTest
	@CsvSource({ "0,40","0,47","1000000,9","0,58" })
	void testRestoDivision(Double result, Double dividendo) {
		
		assumeTrue(result <9999);
		assertEquals(result, Calculadora.restoDivision(dividendo, 2));
	}

	@Test
	void testResultadoPotencia() {
		
		assertEquals(27.0, Calculadora.resultadoPotencia(3, 3));
	}

	@Test
	void testResultRaizCuadrada() {
		assertTrue(Double.isNaN(Calculadora.resultRaizCuadrada(-9)));
		assertEquals(4.0, Calculadora.resultRaizCuadrada(16));

	}
}

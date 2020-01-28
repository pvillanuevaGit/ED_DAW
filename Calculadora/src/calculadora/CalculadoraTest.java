package calculadora;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;


@RunWith(value = Parameterized.class)
public class CalculadoraTest {
	
	private int num1, num2, resultadoEsperado;
	Calculadora miCalculadora;
	
	public CalculadoraTest(int num1, int num2, int resultadoEsperado) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultadoEsperado = resultadoEsperado;
	}
	
	@Parameters
	public static Collection<Object[]> datos(){
		Object[][] datos = new Object[][] {{10,5,15},{5,10, 15},{0,5, 5},{5,0, 5}};
		return Arrays.asList(datos);
	}
	
	@Test
	public void testSuma() {		
		miCalculadora = new Calculadora(num1, num2);
		int resultado = miCalculadora.suma();
		assertEquals(resultadoEsperado, resultado);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	@Test
	public void testSuma() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testMultiplica() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testResta() {
		num1 = 10;
		num2 = 0;
		int resultadoEsperado = 10;
		miCalculadora = new Calculadora(num1, num2);
		int resultado = miCalculadora.resta();
		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	public void testResta2() {
		num1 = 5;
		num2 = 10;
		miCalculadora = new Calculadora(num1, num2);
		boolean resultado = miCalculadora.resta2();
		assertFalse(resultado);
	}*/

	/*
	 * @Test public void testResta2_true() { num1 = 15; num2 = 10; miCalculadora =
	 * new Calculadora(num1, num2); boolean resultado = miCalculadora.resta2();
	 * assertTrue(resultado); }
	 */
/*
	@Test
	public void testDivide2() {
		num1 = 6;
		num2 = 2;
		miCalculadora = new Calculadora(num1, num2);
		Integer resultado = miCalculadora.divide2();
		assertNotNull(resultado);
	}
*/
}

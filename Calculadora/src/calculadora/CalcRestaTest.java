package calculadora;


import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;


@RunWith(value = Parameterized.class)
public class CalcRestaTest{
	private int num1, num2, resultadoEsperado;
	Calculadora miCalculadora;
	
	public CalcRestaTest(int num1, int num2, int resultadoEsperado) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultadoEsperado = resultadoEsperado;
	}
	
	@Parameters
	public static Collection<Object[]> datos(){
		Object[][] datos = new Object[][] {{6,2,4},{2,6, -4},{-2,-5, 3},{5,0, 5},{0,5,-5}};
		return Arrays.asList(datos);
	}
	
	@Test
	public void testMultiplica() {		
		miCalculadora = new Calculadora(num1, num2);
		int resultado = miCalculadora.resta();
		assertEquals(resultadoEsperado, resultado);
	}
}

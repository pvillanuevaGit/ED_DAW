package calculadora;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;


@RunWith(value = Parameterized.class)
public class CalcSumaTest {
	
	private int num1, num2, resultadoEsperado;
	Calculadora miCalculadora;
	
	public CalcSumaTest(int num1, int num2, int resultadoEsperado) {
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
	

}

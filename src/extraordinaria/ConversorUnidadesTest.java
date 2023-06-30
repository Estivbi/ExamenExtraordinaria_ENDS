package extraordinaria;

import static org.junit.Assert.*;


import org.junit.Test;

public class ConversorUnidadesTest {

	@Test
	public void testLibrasAKilogramos() {
		
		double kg = ConversorUnidades.librasAKilogramos(5);
		double expected = 2.2679618500000003; 
		extracted(kg, expected);
		return  kg * 0.45359237;
	}


	@Test
	public void testKilogramosALibras() {
		
	}

	@Test
	public void testEurosADolares() {
		
	}

	@Test
	public void testDolaresAEuros() {
		
	}

}

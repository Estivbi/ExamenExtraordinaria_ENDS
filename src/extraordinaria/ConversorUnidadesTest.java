package extraordinaria;

import static org.junit.Assert.*;


import org.junit.Test;

public class ConversorUnidadesTest {

	private double kg;
	private double expected;
	private double libras;
	private double dolares;
	private double euros;

	@Test
	public void testLibrasAKilogramos() {
		
		kg = ConversorUnidades.librasAKilogramos(5);
		expected = 2.2679618500000003;
		System.out.println(" libras son equivalentes a " + kg + " kg");
	}


	@Test
	public void testKilogramosALibras() {
		libras = ConversorUnidades.kilogramosALibras(5);
		expected = 11.0231131;
		System.out.println(" kg son equivalentes a " + libras + " libras");
	}

	@Test
	public void testEurosADolares() {
		dolares = ConversorUnidades.eurosADolares(5);
		expected = 5.6000000000000005;
		System.out.println(" euros son equivalentes a " + dolares + " dólares");
	}

	@Test
	public void testDolaresAEuros() {
		euros = ConversorUnidades.dolaresAEuros(5);
		expected = 4.45;
		System.out.println( " dólares son equivalentes a " + euros + " euros");
	}

}

package extraordinaria;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez DAM online
 *
 *         Apartado 1. Crea las pruebas unitarias correspondientes para
 *         comprobar el correcto funcionamiento de cada uno de los m閠odos de la
 *         clase ConversorUnidades.java. Llama a la clase en la que vayas a
 *         codificar las pruebas ConversorUnidadesTest.
 * 
 *         Apartado 2. Crea un repositorio local (puedes llamarlo como quieras),
 *         a馻de todos los archivos del proyecto y realiza un commit que incluya
 *         un mensaje con la hora en la que realizas el commit.
 * 
 *         Apartado 3. Sube el proyecto a github.
 * 
 */
public class ConversorUnidades {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Conversor de unidades");
		System.out.println("1. Libras a Kilogramos");
		System.out.println("2. Kilogramos a Libras");
		System.out.println("3. Euros a D贸lares");
		System.out.println("4. D贸lares a Euros");
		System.out.print("Seleccione una opci贸n: ");
		int opcion = scanner.nextInt();

		double valor;

		switch (opcion) {
		case 1:
			System.out.print("Ingrese el valor en libras: ");
			valor = scanner.nextDouble();
			double kg = ConversorUnidades.librasAKilogramos(valor);
			System.out.println(valor + " libras son equivalentes a " + kg + " kg");
			break;
		case 2:
			System.out.print("Ingrese el valor en kilogramos: ");
			valor = scanner.nextDouble();
			double libras = ConversorUnidades.kilogramosALibras(valor);
			System.out.println(valor + " kg son equivalentes a " + libras + " libras");
			break;
		case 3:
			System.out.print("Ingrese el valor en euros: ");
			valor = scanner.nextDouble();
			double dolares = ConversorUnidades.eurosADolares(valor);
			System.out.println(valor + " euros son equivalentes a " + dolares + " d贸lares");
			break;
		case 4:
			System.out.print("Ingrese el valor en d贸lares: ");
			valor = scanner.nextDouble();
			double euros = ConversorUnidades.dolaresAEuros(valor);
			System.out.println(valor + " d贸lares son equivalentes a " + euros + " euros");
			break;
		default:
			System.out.println("Opci贸n inv谩lida");
			break;
		}

		scanner.close();
	}

	// Conversi贸n de libras a kg
	public static double librasAKilogramos(double libras) {
		return libras * 0.45359237;
	}

	// Conversi贸n de kg a libras
	public static double kilogramosALibras(double kg) {
		return kg * 2.20462262;
	}

	// Conversi贸n de euros a d贸lares
	public static double eurosADolares(double euros) {
		return euros * 1.12; // Tipo de cambio aproximado
	}

	// Conversi贸n de d贸lares a euros
	public static double dolaresAEuros(double dolares) {
		return dolares * 0.89; // Tipo de cambio aproximado
	}
}
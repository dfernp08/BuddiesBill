package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a operadores matematicos. La clase
 * "Math"
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030103 extends Apartado {

	protected String obtenerPractica() {
		return "P-VAR";
	}

	protected String obtenerBloque() {
		return "Operadores matematicos - Clase <<Math>>";
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio1.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo
	 * necesario para realizar la operacion: obtener la raiz cuadrada de 256
	 */
	public void ejercicio01() {
		cabecera("01", "Calcular la raiz cuadrada de un numero");

		// Inicio modificacion
		double a;
		a = Math.sqrt(256);
		System.out.println ("La raiz cuadrada de 256 es"+" " + a);
		// Fin modificacion
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio2.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo
	 * necesario para realizar la operacion: obtener el resultado de elevar al
	 * cubo el numero 9
	 */
	public void ejercicio02() {
		cabecera("02", "Calcular potencias");

		// Inicio modificacion
		double b;
		b = Math.pow(9,3);
		System.out.println ("9 elevado al cubo es" + " " + b);
		// Fin modificacion
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio3.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo
	 * necesario para generar un numero aleatorio contenido entre 5 y 10
	 */
	public void ejercicio03() {
		cabecera("03", "Generar numeros aleatorios");

		// Inicio modificacion
		double valorentre5y10;
		//Si antes del Math.random se pone Math.floor no daría números decimales, puse esa forma porque creo que en el ejercicio no
		//te exige que te den cifras con decimales
		valorentre5y10 =Math.random()*6+5;
		System.out.println (valorentre5y10);
		// Fin modificacion
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio4.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo necesario
	 * para conocer la superficie de un circulo de diez unidades de radio.
	 */
	public void ejercicio04() {
		cabecera("04", "Calcular la superficie de un circulo");

		// Inicio modificacion
		double area;
		double radio;
		radio = 10;
		area = Math.PI * Math.pow (radio,2);
		System.out.println ("El área de un círculo de radio 10 es" + " " + area);
		// Fin modificacion
	}
}

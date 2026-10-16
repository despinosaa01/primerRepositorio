package dia2.inicio;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Esta clase nos va a servir para hacer los ejercicios básicos
 * 
 * @author ProfDiurno
 */
public class EjerciciosBasicos {

	/**
	 * Método principal
	 * 
	 * @param args Argumentos de entrada, no los utilizamos en este ejercicio
	 */
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Introduce un número:");
//		System.out.println(ejercicio1(s.nextInt()));
		for(int i = -100; i< 100; i = i + 10) {
			System.out.println(ejercicio1(i));

		}
		System.out.println(ejercicio1(0));

	}

	/**
	 * Ejercicio1
	 * 
	 * @param n Número que se va a procesar para indicar si es positivo o negativo
	 * @return Una cadena con el texto Negativo, Positivo o Cero, en funcion del
	 *         valor de n
	 */
	public static String ejercicio1(int n) {
		if (n == 0)
			return "Cero";
		else if (n > 0)
			return "Positivo";
		else
			return "Negativo";
	}
}

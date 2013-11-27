package EjerciciosParaPracticar;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// Lee un número por consola y comprueba si es palíndromo (capicúa).

		Scanner teclado = new Scanner(System.in);
		String numero = "";
		int contador = 0;

		System.out
				.print("Comprueba si un numero es capicua.\n\nIntroduce el numero completo y presiona intro: ");
		numero = teclado.next();

		for (int i = 0; i < numero.length() / 2; i++) {

			if (numero.charAt(i) != numero.charAt(numero.length() - 1 - i)) {
				contador++;
				System.out.print("El numero " + numero + " no es capicua.");
				break;
			}
		}
		if (contador == 0) {
			System.out.print("El numero " + numero + " es capicua.");
		}
	}
}

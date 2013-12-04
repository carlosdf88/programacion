package EjerciciosParaPracticar;

import java.util.Scanner;

public class Ejercicio1Fibonacci {

	public static void main(String[] args) {
		// Crea una colección con los primeros X números de la serie de
		// Fibonacci, donde X es un número que pedirás al usuario. Después
		// pregunta números y di si está en esa serie o no. El programa
		// terminará cuando el usuario introduzca un 0.
		Scanner teclado = new Scanner(System.in);
		int[] numeros = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377 };
		int usuario, contador = 0;

		while (true) {

			System.out.print("\nEscribe un numero: ");
			usuario = teclado.nextInt();

			if (usuario == 0) {
				System.out.print("FIN");
				break;
			}

			for (int i = 0; i < numeros.length; i++) {

				if ((usuario>0)&&(usuario == numeros[i])) {
					contador++;
				}

			}// for

			if (contador != 0) {
				System.out.print("El numero " + usuario
						+ " esta dentro de la serie de Fibonacci.\n");
			} else {
				System.out.print("El numero " + usuario
						+ " no esta dentro de la serie de Fibonacci.\n");
			}

		}// while
	}

}

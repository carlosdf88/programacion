package EjerciciosParaPracticar;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Escribe un programa que pida los datos de empleados, en concreto su
		// nombre y sueldo. Realizará una pregunta tipo "¿Otro [s/n]?" para
		// saber cuando parar. El programa calculará la media del sueldo y
		// mostrará el nombre de los empleados que cobran por encima de la
		// media.

		Scanner input = new Scanner(System.in);
		int sueldos[], sueldos2[], i = 0, media = 0;
		sueldos = new int[2];
		sueldos2 = new int[2];
		String nombres[], nombres2[];
		nombres = new String[2];
		nombres2 = new String[2];

		System.out.print("Base de datos de empleados\n");

		while (true) {

			if (i > nombres.length - 1) {
				nombres2 = new String[nombres.length];
				sueldos2 = new int[sueldos.length];

				for (int x = 0; x < nombres.length; x++) {
					nombres2[x] = nombres[x];
					sueldos2[x] = sueldos[x];
				}

				nombres = new String[i + 1];
				sueldos = new int[i + 1];

				for (int x = 0; x < nombres2.length; x++) {
					nombres[x] = nombres2[x];
					sueldos[x] = sueldos2[x];
				}

			}

			System.out.print("\nIntroduce el nombre del trabajador: ");
			nombres[i] = input.next();

			System.out.print("Introduce el sueldo en € de " + nombres[i] + ": ");
			sueldos[i] = input.nextInt();

			System.out.print("\n¿Desea introducir otro trabajador? si/no: ");

			if (input.next().equalsIgnoreCase("no")) {
				break;
			}
			i++;

		} // while

		for (int x = 0; x < sueldos.length; x++) {
			media = media + sueldos[x];
		}

		media = media / sueldos.length;

		System.out.print("\nLa media del sueldo es: " + media + "€.\n\n");
		System.out
				.print("Los trabajadores que cobran por encima de la media son:\nNombres.\tSueldo.\n\n");

		for (int x = 0; x < sueldos.length; x++) {

			if (sueldos[x] > media) {
				System.out.print(nombres[x] + "\t\t" + sueldos[x] + "€\n");

			}
		}

	}
}

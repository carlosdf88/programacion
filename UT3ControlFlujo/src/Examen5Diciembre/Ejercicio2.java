package Examen5Diciembre;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double temp = 0, his = 0, actual = 0;
		boolean estado = false;

		System.out.print("Dime la temperatura a la que quieres estar?: ");
		temp = teclado.nextDouble();

		System.out.print("Con que histeresis trabajamos?: ");
		his = teclado.nextDouble();

		while (true) {

			System.out.print("Temperatura actual?: ");
			actual = teclado.nextDouble();

			if (actual >= (temp + his)) {
				estado = false;
			} else if (actual <= temp - his) {
				estado = true;

			}

			if (estado) {
				System.out.print("Encendido\n");
			} else {
				System.out.print("Apagado\n");
			}

		}

	}

}

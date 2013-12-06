package Examen5Diciembre;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int usuario = 0, fila = 0, contador = 0, extra = 0;

		while (true) {

			System.out.print("Dame el tamaño de las figuras: ");
			usuario = teclado.nextInt();

			if (usuario <= 0) {
				System.out.print("Tienes que poner un numero mayor que 0.\n\n");
			} else {
				break;
			}
		}

		System.out.print("\nFigura 1.\n");

		for (int x = 0; x < usuario; x++) {

			for (int i = 0; i < usuario - x; i++) {

				System.out.print("@ ");

			}
			System.out.print("\n");
		}

		System.out.print("\nFigura 2.\n");

		for (int x = 0; x < usuario; x++) {
			contador = 0;
			while (true) {

				if (contador == fila) {
					break;
				} else {
					System.out.print("  ");
					contador++;
				}

			}

			for (int i = 0; i < usuario - x; i++) {
				System.out.print("@ ");

			}
			System.out.print("\n");
			fila++;
		}

		System.out.print("\nFigura 3.\n");

		fila = 0;
		for (int i = 0; i < usuario; i++) {
			extra = 0;
			while (true) {
				if (extra == (usuario - fila)) {
					break;
				} else {
					System.out.print("  ");
					extra++;
				}
			}

			extra = 0;
			while (true) {
				if (extra == i + 1) {
					break;
				} else {
					System.out.print("@   ");
					;
					extra++;
				}
			}
			System.out.print("\n");
			fila++;
		}

	}

}

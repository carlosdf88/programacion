package Examen5Diciembre;

import java.util.Scanner;

import graphics.Rectangle;
import graphics.Color;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int lado = 0, rojo = 0, verde = 0, azul = 0;
		Rectangle cuadrado;
		Color color;

		while (true) {

			System.out.print("Introduce el lado del cuadrado: ");
			lado = teclado.nextInt();

			if ((lado >= 100) && (lado <= 200)) {
				break;
			} else {
				System.out.print("Introduce un numero entre 100 y 200.\n");

			}

		}

		while (true) {

			System.out.print("Introduce los valores del color (R,G,B): ");
			rojo = teclado.nextInt();
			verde = teclado.nextInt();
			azul = teclado.nextInt();

			if (((rojo <= 255) && (rojo >= 0))
					&& ((verde <= 255) && (verde >= 0))
					&& ((azul <= 255) && (azul >= 0))) {
				break;
			} else {
				System.out.print("Introduce un numero entre 0 y 256.\n");

			}

		}

		cuadrado = new Rectangle(10, 10, lado, lado);
		cuadrado.draw();
		color = new Color(rojo, verde, azul);
		cuadrado.setColor(color);
		cuadrado.fill();
	}
}

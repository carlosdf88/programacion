package Simulacro;

import java.util.Scanner;

import graphics.Rectangle;
import graphics.Ellipse;
import graphics.Text;
import graphics.Color;

public class Ejercicio2 {

	public static void main(String[] args) throws InterruptedException {

		Scanner teclado = new Scanner(System.in);
		int tamaño = 0, figuras = 0, x = 0, contador = 0;
		Rectangle lienzo;
		Color color;

		System.out
				.print("Introduce el ancho del lienzo:(se recomienda superior a 500: ");
		tamaño = teclado.nextInt();

		System.out.print("Introduce el numero de figuras: ");
		figuras = teclado.nextInt();

		lienzo = new Rectangle(10, 10, tamaño, tamaño);
		lienzo.draw();

		if (figuras > 0) {

			for (int i = 0; i < figuras; i++) {

				contador++;
				if (contador == 4) {
					contador = 1;
				}

				switch (contador) {

				case 1:
					Rectangle figura1;
					figura1 = new Rectangle((int) (Math.random() * 300 + 15),
							(int) (Math.random() * 300 + 15), 50, 50);
					figura1.draw();
					color = new Color((int) (Math.random() * 256),
							(int) (Math.random() * 256),
							(int) (Math.random() * 256));
					figura1.setColor(color);
					figura1.fill();

					while (x < 100) {
						Thread.sleep(5);
						figura1.translate(1, 0);
						x++;
					}

					while (x > 100) {
						Thread.sleep(5);
						figura1.translate(-1, 0);
						x--;
					}

					break;

				case 2:
					Ellipse figura2;
					figura2 = new Ellipse((int) (Math.random() * 300 + 15),
							(int) (Math.random() * 300 + 15), 50, 50);
					figura2.draw();
					color = new Color((int) (Math.random() * 256),
							(int) (Math.random() * 256),
							(int) (Math.random() * 256));
					figura2.setColor(color);
					figura2.fill();

					while (x < 100) {
						Thread.sleep(5);
						figura2.translate(1, 1);
						x++;
					}

					while (x > 100) {
						Thread.sleep(5);
						figura2.translate(1, 1);
						x--;
					}

					break;

				case 3:
					Text figura3;
					figura3 = new Text((int) (Math.random() * 300 + 15),
							(int) (Math.random() * 300 + 15), "DAW");
					figura3.draw();
					color = new Color((int) (Math.random() * 256),
							(int) (Math.random() * 256),
							(int) (Math.random() * 256));
					figura3.setColor(color);

					while (x < 100) {
						Thread.sleep(5);
						figura3.translate(1, 1);
						x++;
					}

					while (x > 100) {
						Thread.sleep(5);
						figura3.translate(1, 1);
						x--;
					}

					break;

				}// case

			}// for

		}// if

	}

}

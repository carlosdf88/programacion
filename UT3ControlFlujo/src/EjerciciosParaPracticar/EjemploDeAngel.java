package EjerciciosParaPracticar;

import graphics.Color;
import graphics.Ellipse;

public class EjemploDeAngel {

	public static void main(String[] args) throws InterruptedException {
		// Meter objetos dentro de un array, por ejemplo meter colores en un
		// array.

		Color[] colores;
		colores = new Color[5];

		colores[0] = new Color(255, 0, 0);
		colores[1] = Color.CYAN;
		colores[2] = Color.GREEN;
		colores[3] = Color.YELLOW;
		colores[4] = new Color(125, 255, 0);

		Ellipse circulo = new Ellipse(10, 10, 300, 300);

		while (true) {
			circulo.setColor(colores[(int) (Math.random() * 5)]);
			circulo.fill();
			Thread.sleep(500);
		}

	}

}

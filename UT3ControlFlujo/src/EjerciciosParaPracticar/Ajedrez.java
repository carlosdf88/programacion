package EjerciciosParaPracticar;

import graphics.Color;
import graphics.Rectangle;

public class Ajedrez {
	public static void main(String[] args) {

		int tamaño = 40;
		Rectangle cuadrado;
		boolean comodin = false;

		for (int x = 0; x < 8; x++) {

			for (int i = 0; i < 8; i++) {

				if (comodin) {

					cuadrado = new Rectangle(tamaño * i, tamaño * x, tamaño,
							tamaño);
					cuadrado.draw();
					cuadrado.setColor(Color.BLACK);
					cuadrado.fill();
				}
				comodin = !comodin;

			}
			comodin = !comodin;
		}

	}
}
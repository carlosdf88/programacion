package EjerciciosParaPracticar;

import graphics.Color;
import graphics.Rectangle;

public class Ajedrez {
	public static void main(String[] args) {

		int tama�o = 40;
		Rectangle cuadrado;
		boolean comodin = false;

		for (int x = 0; x < 8; x++) {

			for (int i = 0; i < 8; i++) {

				if (comodin) {

					cuadrado = new Rectangle(tama�o * i, tama�o * x, tama�o,
							tama�o);
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
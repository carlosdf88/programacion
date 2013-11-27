package EjerciciosParaPracticar;

import graphics.Canvas;
import graphics.Line;

public class Ejercicio3DIbujos {

	public static void main(String[] args) {

		// Escribe un programa que cree estas figuras:

		Canvas lienzo;
		lienzo = Canvas.getInstance();
		Line linea1, linea2, linea3;

		// medio triangulo a derechas

		linea1 = new Line(100, 400, 100, 100);
		linea1.draw();

		linea2 = new Line(200, 400, 100, 100);
		linea2.draw();

		linea3 = new Line(100, 400, 200, 400);
		linea3.draw();

		// medio triangulo a izquierdas
		
		linea1 = new Line(300, 400, 400, 100);
		linea1.draw();

		linea2 = new Line(400, 400, 400, 100);
		linea2.draw();

		linea3 = new Line(300, 400, 400, 400);
		linea3.draw();
		
		//triangulo completo
		
		linea1 = new Line(500, 400, 600, 100);
		linea1.draw();
		
		linea2 = new Line(700, 400, 600, 100);
		linea2.draw();
		
		linea3 = new Line(500, 400, 700, 400);
		linea3.draw();
		
		

	}
}

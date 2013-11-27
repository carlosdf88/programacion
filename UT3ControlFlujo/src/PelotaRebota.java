import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Canvas;
import graphics.Text;

public class PelotaRebota {

	public static void main(String[] args) throws InterruptedException {
		// Pelota: Crea un programa que dibuje un círculo en la pantalla. Haz
		// que el círculo se mueva por la pantalla, rebotando en sus bordes.

		Canvas lienzo;
		Rectangle rectangulo;
		Ellipse pelota;
		lienzo = Canvas.getInstance();
		Text t1;
		int p1 = 10, p2 = 255, p3 = 200, p4 = 200, x = 0;

		rectangulo = new Rectangle(10, 10, 690, 690);
		rectangulo.draw();

		pelota = new Ellipse(p1, p2, p3, p4);
		pelota.draw();

		pelota.setColor(Color.ORANGE);
		pelota.fill();

		t1 = new Text(105, 345, "★");
		t1.draw();

		// Movimiento.
		while (true) {
			while (x < 245) {
				Thread.sleep(3);
				pelota.translate(1, -1);
				t1.translate(1, -1);
				x++;
			}

			while (x > 0) {
				Thread.sleep(3);
				pelota.translate(1, 1);
				t1.translate(1, 1);
				x--;
			}

			while (x < 245) {
				Thread.sleep(3);
				pelota.translate(-1, 1);
				t1.translate(-1, 1);
				x++;
			}

			while (x > 0) {
				Thread.sleep(3);
				pelota.translate(-1, -1);
				t1.translate(-1, -1);
				x--;
	}
		}
	}
}

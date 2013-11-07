package Ejemplos.graficos;

import graphics.Canvas;
import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Color;


public class Semaforo {

	public static void main(String[] args) throws InterruptedException {
	
		Canvas lienzo;
		Rectangle rectangulo,rectangulo2,rectangulo3,rectangulo4;
		Ellipse rojo,ambar,verde,otro,otro2,otro3;
		lienzo= Canvas.getInstance();
		Color gris;	
		gris=new Color(200, 200, 200); 
	
		
		rectangulo = new Rectangle(100,100,110,200);
		rectangulo.draw();
		rectangulo2=new Rectangle(100,100,110,200);
		rectangulo2.draw();
		rectangulo3=new Rectangle(150,300,20,200);
		rectangulo3.draw();
		rectangulo4=new Rectangle(150,300,20,200);
		rectangulo4.draw();
		
				otro=new Ellipse(130,110,50,50);
					otro.draw();
		
				otro2=new Ellipse(130,170,50,50);
					otro.draw();
		
				otro3=new Ellipse(130,230,50,50);
					otro.draw();
			
		rojo=new Ellipse(130,110,50,50);
		rojo.draw();
		
		ambar=new Ellipse(130,170,50,50);
		ambar.draw();
		
		verde=new Ellipse(130,230,50,50);
		verde.draw();
		
		rectangulo.setColor(gris);	
		rectangulo.fill();		
		rectangulo3.setColor(gris);	
		rectangulo3.fill();	

	
		otro.setColor(Color.BLACK);
		
		otro2.setColor(Color.BLACK);
		
		otro3.setColor(Color.BLACK);

		
	
		rojo.setColor(Color.RED);
		rojo.fill();
		
		Thread.sleep(3000);
		
		ambar.setColor(Color.YELLOW);
		ambar.fill();
		
		otro.setColor(Color.BLACK);
	
		otro2.setColor(Color.BLACK);
		
		otro3.setColor(Color.BLACK);

		
		rojo.setColor(gris);
		rojo.fill();
		
		
		Thread.sleep(5000);
		
		otro.setColor(Color.BLACK);
		
		otro2.setColor(Color.BLACK);
		
		otro3.setColor(Color.BLACK);

		
		
		verde.setColor(Color.GREEN);
		verde.fill();
	
		ambar.setColor(gris);
		ambar.fill();
		
		rojo.setColor(gris);
		rojo.fill();
	
	
		
		
		
		
	}

}

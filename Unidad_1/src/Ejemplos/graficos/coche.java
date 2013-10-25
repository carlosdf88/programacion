package Ejemplos.graficos;


import graphics.Canvas;
import graphics.Rectangle;
import graphics.Color;
import graphics.Line;
import graphics.Text;
import graphics.Ellipse;


public class coche {

	public static void main(String[] args) throws InterruptedException {
	
		//Creacion de variables.
		Canvas lienzo;
		lienzo= Canvas.getInstance();
		
		Rectangle r1,r2;
		Ellipse rueda1,rueda2;
		Line suelo,antena;
		int x=0;
		
		
		//creo Habitaculo
		r1=new Rectangle(100,150,400,70);
		r1.draw();
		
		r2=new Rectangle(200,100,200,70);
		r2.draw();
		
		//creo ruedas
		
		rueda1=new Ellipse(365,175,60,60);
		rueda1.draw();
		
		rueda2=new Ellipse(165,175,60,60);
		rueda2.draw();
		
		//Coloreo tanto los rectangulos como las rudas
		
		r1.setColor(Color.RED);	
		r1.fill();	
		
		r2.setColor(Color.RED);	
		r2.fill();	
		
		rueda1.setColor(Color.BLACK);	
		rueda1.fill();	
		
		rueda2.setColor(Color.BLACK);	
		rueda2.fill();	

		//creo el suelo
		
		suelo=new Line(10,235,1000,235);
		suelo.draw();
		
		//creo antena al buga.
		
		antena=new Line (380,100,320,70);
		antena.draw();
		
		
		
		
		
		//Movimiento.
		x=0;
		
		
	while (10==10){	
		
		while (x!=70){
		
			Thread.sleep(10);
		
			r1.translate(5,0);
			r2.translate(5,0);
			rueda1.translate(5,0);
			rueda2.translate(5,0);
			antena.translate(5,0);
			x++;
				
		}
	
		while (x!=0){
			
			Thread.sleep(10);
		
			r1.translate(-5,0);
			r2.translate(-5,0);
			rueda1.translate(-5,0);
			rueda2.translate(-5,0);
			antena.translate(-5,0);
			x--;
				
		}
		
	}
		
		
	
	
	
	}
}

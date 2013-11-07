package Ejemplos.graficos;


import java.util.Scanner;

import graphics.Canvas;
import graphics.Rectangle;
import graphics.Color;
import graphics.Line;
import graphics.Text;
import graphics.Ellipse;


public class coche {

	public static void main(String[] args) throws InterruptedException {
	
		Scanner input=new Scanner (System.in);
		String respuesta="0";
		int respuesta1=0;
		
		System.out.print("¿De que color quieres que sea el buga?");
		
	
		
		
		while ((respuesta1!=1)&&(respuesta1!=2)&&(respuesta1!=3)&&(respuesta1!=4)&&(respuesta1!=5)){
			
					

			System.out.print("\n\n1.- Rojo.\n2.- Amarillo.\n3.- Verde.\n4.- Azul.\n5.- Naranja.\n\nRespuesta: ");
			respuesta=input.next();
			
			
			if (respuesta.compareTo(1)){ respuesta1=Integer.parseInt(respuesta); }
			if (respuesta=="2"){ respuesta1=Integer.parseInt(respuesta); }
			if (respuesta=="3"){ respuesta1=Integer.parseInt(respuesta); }
			if (respuesta=="4"){ respuesta1=Integer.parseInt(respuesta); }
			if (respuesta=="5"){ respuesta1=Integer.parseInt(respuesta); }
			
			
	
			System.out.print("\nTe as confundido, introduce una respuesta correcta");
				
				
			
				
					
					
					
				
			
	
			System.out.print("\nrespuesta: "+respuesta+"\nrespuesta1: "+respuesta1);
		
		}
						
		

		
		
		//Creacion de variables.
		
		Canvas lienzo;
		lienzo= Canvas.getInstance();
		
		Rectangle r1,r2,ventana1,ventana2;
		Ellipse rueda1,rueda2;
		Line suelo,antena;
		int x=0;
		
		
		//creo Habitaculo
		r1=new Rectangle(100,150,400,70);
		r1.draw();
		
		r2=new Rectangle(200,100,200,70);
		r2.draw();
		
		//creo las ventanillas
		
		
		ventana1=new Rectangle(310,110,80,40);
		ventana1.draw();
		
		ventana2=new Rectangle(210,110,80,40);
		ventana2.draw();
		
		
		
		//creo ruedas
		
		rueda1=new Ellipse(365,175,75,60);
		rueda1.draw();
		
		rueda2=new Ellipse(165,175,70,60);
		rueda2.draw();
		
		//Coloreo los rectangulos
		


	
	
	switch (respuesta1){
		
		case 1:
			
			r1.setColor(Color.RED);	
			r1.fill();	
		
			r2.setColor(Color.RED);	
			r2.fill();	
			break;
			
		case 2: 
			
			r1.setColor(Color.YELLOW);	
			r1.fill();	
			
			r2.setColor(Color.YELLOW);	
			r2.fill();	
			break;
			
		case 3:
		
			r1.setColor(Color.GREEN);	
			r1.fill();	
			
			r2.setColor(Color.GREEN);	
			r2.fill();	
				
			break;
			
		case 4:
			
			r1.setColor(Color.BLUE);	
			r1.fill();	
			
			r2.setColor(Color.BLUE);	
			r2.fill();	
			break;
			
		case 5:
			
			r1.setColor(Color.ORANGE);	
			r1.fill();	
			
			r2.setColor(Color.ORANGE);	
			r2.fill();	
			break;
		}
		
		
		//Coloreo lo demas
		
		rueda1.setColor(Color.BLACK);	
		rueda1.fill();	
		
		rueda2.setColor(Color.BLACK);	
		rueda2.fill();	

		ventana1.setColor(Color.WHITE);	
		ventana1.fill();
		
		ventana2.setColor(Color.WHITE);	
		ventana2.fill();
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
				ventana1.translate(5, 0);
				ventana2.translate(5, 0);
				x++;
					
			}
		
			while (x!=0){
				
				Thread.sleep(10);
			
				r1.translate(-5,0);
				r2.translate(-5,0);
				rueda1.translate(-5,0);
				rueda2.translate(-5,0);
				antena.translate(-5,0);
				ventana1.translate(-5, 0);
				ventana2.translate(-5, 0);
				x--;
					
			}
			
		}
		
	
		
	
	
	
	}
}

package Ejemplos.graficos;

import graphics.Canvas;
import graphics.Ellipse;
import graphics.Rectangle;
import graphics.Color;



public class SemaforoFormula1 {

	public static void main(String[] args) throws InterruptedException {
				
		Canvas lienzo;
		Rectangle rectangulo;
		Ellipse rojo1,rojo2,rojo3,rojo4,rojo5,rojo6,rojo7,rojo8,rojo9,rojo10,rojo11,rojo12;
		lienzo= Canvas.getInstance();
		
		rectangulo = new Rectangle(100,100,320,100);
		rectangulo.draw();
		
		rojo1=new Ellipse(120,110,35,35);
		rojo1.draw();
		rojo2=new Ellipse(120,155,35,35);
		rojo2.draw();
		
		rojo3=new Ellipse(170,110,35,35);
		rojo3.draw();
		rojo4=new Ellipse(170,155,35,35);
		rojo4.draw();
		rojo5=new Ellipse(220,110,35,35);
		rojo5.draw();
		rojo6=new Ellipse(220,155,35,35);
		rojo6.draw();
		rojo7=new Ellipse(270,110,35,35);
		rojo7.draw();
		rojo8=new Ellipse(270,155,35,35);
		rojo8.draw();
		rojo9=new Ellipse(320,110,35,35);
		rojo9.draw();
		rojo10=new Ellipse(320,155,35,35);
		rojo10.draw();
		rojo11=new Ellipse(370,110,35,35);
		rojo11.draw();
		rojo12=new Ellipse(370,155,35,35);
		rojo12.draw();
		
		//coloreo
		
		Thread.sleep(1100);
		rojo1.setColor(Color.RED);
		rojo1.fill();
		rojo2.setColor(Color.RED);
		rojo2.fill();
		
		Thread.sleep(1100);
		rojo3.setColor(Color.RED);
		rojo3.fill();
		rojo4.setColor(Color.RED);
		rojo4.fill();
		
		Thread.sleep(1100);
		rojo5.setColor(Color.RED);
		rojo5.fill();
		rojo6.setColor(Color.RED);
		rojo6.fill();
		
		Thread.sleep(1100);
		rojo7.setColor(Color.RED);
		rojo7.fill();
		rojo8.setColor(Color.RED);
		rojo8.fill();
		
		Thread.sleep(1100);
		rojo9.setColor(Color.RED);
		rojo9.fill();
		rojo10.setColor(Color.RED);
		rojo10.fill();
		
		Thread.sleep(1100);
		rojo11.setColor(Color.RED);
		rojo11.fill();
		rojo12.setColor(Color.RED);
		rojo12.fill();
		
		Thread.sleep(1100);
		rojo1.setColor(Color.GREEN);
		rojo1.fill();
		rojo2.setColor(Color.GREEN);
		rojo2.fill();
		rojo3.setColor(Color.GREEN);
		rojo3.fill();
		rojo4.setColor(Color.GREEN);
		rojo4.fill();
		rojo5.setColor(Color.GREEN);
		rojo5.fill();
		rojo6.setColor(Color.GREEN);
		rojo6.fill();
		rojo7.setColor(Color.GREEN);
		rojo7.fill();
		rojo8.setColor(Color.GREEN);
		rojo8.fill();
		rojo9.setColor(Color.GREEN);
		rojo9.fill();
		rojo10.setColor(Color.GREEN);
		rojo10.fill();
		rojo11.setColor(Color.GREEN);
		rojo11.fill();
		rojo12.setColor(Color.GREEN);
		rojo12.fill();
		
		
		
		

	}

}

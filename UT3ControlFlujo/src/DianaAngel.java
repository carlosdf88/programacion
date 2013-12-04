import graphics.Color;
import graphics.Ellipse;


public class DianaAngel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ellipse circulo;
		Color color;
		int p1=25,p2=25,p3=500,p4=500,contador=0;
		
	
		while (contador<10){
			
			circulo=new Ellipse (p1,p2,p3,p4);
			circulo.draw();
		
			p1=p1+25;
			p2=p2+25;
			p3=p3-50;
			p4=p4-50;
			
			color=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
			circulo.setColor(color);
			circulo.fill();
			
			contador++;
		}
		
		
	}

}

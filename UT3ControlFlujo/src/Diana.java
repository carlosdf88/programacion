

	
import graphics.Canvas;
import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;


public class Diana {
	
	
	public static void main(String[] args) {
			
		
		Canvas lienzo;
		Ellipse circulo;
		lienzo= Canvas.getInstance();
		
		int p1=25,p2=25,p3=500,p4=500,contador=0;
				
		
		Canvas.getInstance();
				
		while (contador<=10){
		
			circulo=new Ellipse (p1,p2,p3,p4);
			circulo.draw();
		
			p1=p1+25;
			p2=p2+25;
			p3=p3-50;
			p4=p4-50;

			switch ((int )(Math.random() * 13+1)){
			
			case 1:
				circulo.setColor(Color.BLACK);
				circulo.fill();
				break;
			case 2:
				circulo.setColor(Color.BLUE);
				circulo.fill();
				break;
			case 3:	
				circulo.setColor(Color.CYAN);
				circulo.fill();
				break;
			case 4:	
				circulo.setColor(Color.DARK_GRAY);
				circulo.fill();
				break;
			case 5:			
				circulo.setColor(Color.GRAY);
				circulo.fill();
				break;
			case 6:	
				circulo.setColor(Color.GREEN);
				circulo.fill();
				break;
			case 7:			
				circulo.setColor(Color.LIGHT_GRAY);
				circulo.fill();
				break;
			case 8:	
				circulo.setColor(Color.MAGENTA);
				circulo.fill();
				break;
			case 9:			
				circulo.setColor(Color.ORANGE);
				circulo.fill();
				break;
			case 10:	
				circulo.setColor(Color.PINK);
				circulo.fill();
				break;
			case 11:	
				circulo.setColor(Color.RED);
				circulo.fill();
				break;
			case 12:
				circulo.setColor(Color.YELLOW);
				circulo.fill();
				break;
			case 13:
				circulo.setColor(Color.WHITE);
				circulo.fill();
				break;
			
			}
			
		contador++;
		
		}
	}

}

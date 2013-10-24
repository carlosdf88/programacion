package Ejemplos.graficos;

import graphics.Canvas;
import graphics.Rectangle;
import graphics.Color;
import graphics.Line;
import graphics.Text;


public class Diagrama_barras {

	public static void main(String[] args) {
	
		Canvas lienzo;
		lienzo= Canvas.getInstance();
		
		Line line1,line2,line3,line4,line5,line6,line7,line8,line9,line10;
		
		Text t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,m1,m2,m3,m4,m5,m6;
		
		Rectangle b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
		
		//Aki creo todas las barritas del diagrama y el numero de los porcentajes.
			line1=new Line(100,100,950,100);
			line1.draw();
				t1=new Text(65,93,"1.2%");
				t1.draw();
			line2=new Line(100,130,950,130);
			line2.draw();
				t2=new Text(65,123,"   1%");
				t2.draw();
			line3=new Line(100,160,950,160);
			line3.draw();
				t3=new Text(65,153,"0.8%");
				t3.draw();
			line4=new Line(100,190,950,190);
			line4.draw();
				t4=new Text(65,183,"0.6%");
				t4.draw();		
			line5=new Line(100,220,950,220);
			line5.draw();
				t5=new Text(65,213,"0.4%");
				t5.draw();		
			line6=new Line(100,250,950,250);
			line6.draw();
				t6=new Text(65,243,"0.2%");
				t6.draw();
			line7=new Line(100,280,950,280);  //linea0
			line7.draw();
				t7=new Text(65,273,"   0%");
				t7.draw();
			line8=new Line(100,310,950,310);
			line8.draw();
				t8=new Text(65,303,"-0.2%");
				t8.draw();
			line9=new Line(100,340,950,340);
			line9.draw();
				t9=new Text(65,333,"-0.4%");
				t9.draw();
			line10=new Line(100,100,100,340);
			line10.draw();
		
		//Aki creo los nombres de los meses.
			
				m1=new Text(175,347,"Oct-2012");
				m1.draw();
				
				m2=new Text(305,347,"Dic-2012");
				m2.draw();
				
				m3=new Text(435,347,"Feb-2013");
				m3.draw();
				
				m4=new Text(565,347,"Abril-2013");
				m4.draw();
				
				m5=new Text(695,347,"Jun-2013");
				m5.draw();
				
				m6=new Text(825,347,"Agosto-2013");
				m6.draw();
			
		
			//Aki se crean las barritas del diagrama.
				
				
				b1=new Rectangle(110,115,50,165);
				b1.draw();
					b1.setColor(Color.BLUE);	
					b1.fill();	
			
				b2=new Rectangle(175,190,50,90);
				b2.draw();
					b2.setColor(Color.BLUE);	
					b2.fill();	
			
				b3=new Rectangle(240,220,50,60);
				b3.draw();
					b3.setColor(Color.BLUE);	
					b3.fill();	
			
			
				b4=new Rectangle(305,205,50,75);
				b4.draw();
					b4.setColor(Color.BLUE);	
					b4.fill();	
						
				b5=new Rectangle(370,265,50,15);
				b5.draw();
					b5.setColor(Color.BLUE);	
					b5.fill();	
			
				b6=new Rectangle(435,115,50,165);
				b6.draw();
					b6.setColor(Color.BLUE);	
					b6.fill();	
		
				b7=new Rectangle(500,280,50,45);
				b7.draw();
					b7.setColor(Color.BLUE);	
					b7.fill();	
					
				b8=new Rectangle(565,250,50,30);
				b8.draw();
					b8.setColor(Color.BLUE);	
					b8.fill();	
				b9=new Rectangle(630,205,50,75);
				b9.draw();
					b9.setColor(Color.BLUE);	
					b9.fill();	
								
				b10=new Rectangle(695,175,50,105);
				b10.draw();
					b10.setColor(Color.BLUE);	
					b10.fill();	
								
				b11=new Rectangle(760,220,50,60);
				b11.draw();
					b11.setColor(Color.BLUE);	
					b11.fill();	
										
				b12=new Rectangle(825,250,50,30);
				b12.draw();
					b12.setColor(Color.BLUE);	
					b12.fill();	
											
											
				//Cuadradito explicando que datos se estan trabajando
					
					t10=new Text(80,60,"Crecimiento mensual en las ventas minoristas.");
					t10.draw();
					
					b13=new Rectangle(55,60,15,15);
					b13.draw();
						b13.setColor(Color.BLUE);	
						b13.fill();	
					
									
	}

}
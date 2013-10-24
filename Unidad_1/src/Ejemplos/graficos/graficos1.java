package Ejemplos.graficos;

import graphics.Canvas;
import graphics.Rectangle;
import graphics.Color;

public class graficos1 {

	public static void main(String[] args) {
		
		Canvas lienzo;
		Rectangle rectangulo;
		
		lienzo= Canvas.getInstance();			//creamos un lienzo "sitio en el que trabajar", con esto creamos una 
												//ventana en el que apareceran todas las movidas que vayamos haciendo.
		
				
				
		rectangulo = new Rectangle(100,100,100,50); //Aki ponemos como queremos el rectangulo, las dos primeras cifras
												  // indican cuanto queremos que se aleje de los bordes (x,y) y las dos
												  // siguientes indican el tamaño del rectangulo.
				
		rectangulo.draw();						//con este comando dibujamos el objeto que hemos creado.
		Canvas.pause();						  // en este paso se pausa el programa y te sale una ventanita. Hasta que no le des a aceptar no continua.
		rectangulo.translate(250,0);  		// en este paso mueve el rectangulo de sitio.
		
		rectangulo.setColor(Color.ORANGE);	//Con esto aplicamos el color naranja, esto solo colorea el borde.
		rectangulo.fill();					//Con esto coloreamos el objeto dibujado
		
		Color gris;							//Con esto creamos un color nuevo de tipo Color.
		gris=new Color(200, 200, 200);     //Aqui Modificamos el color gris creado que esta vacio y le asignamos los valores del color gris.
		Canvas.pause();	
		rectangulo.setColor(gris);			//Aqui coloreamos del color gris.
	}

}

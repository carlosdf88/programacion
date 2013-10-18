package Ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		double peso,onza=35.2739619,total;
		
		
		System.out.println ("Crea un programa que pida un peso en Kilogramos y realice la conversión a onzas, sabiendo que 1 Kilogramo (Kg) = 35.2739619 Onzas (oz)");
		System.out.println ("Introduce su peso en Kg: ");
		peso= teclado.nextDouble();

		total=onza*peso;
		
		System.out.println("La conversion de "+peso+" kg a onzas es:  "+total+" onzas.");
		
		
		
	}

}

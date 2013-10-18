package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		double base, altura, perimetro,area;
		Scanner teclado=new Scanner(System.in);
		
		
		System.out.println ("Calculen el perímetro y área de un rectángulo dada su base y su altura.");
		System.out.println ("Introduce la base del rectangulo: ");
		base= teclado.nextDouble();

		System.out.println ("Introduce la altura del rectangulo: ");
		altura= teclado.nextDouble();
		
		perimetro=(base*2)+(altura*2);
		area=base*altura;
		
		System.out.println("El primetro de un rectangulo con base "+base+" y altura "+altura+" es: "+perimetro);	
		System.out.println("El area de un rectangulo con base "+base+" y altura "+altura+" es: "+area);
		
	}

}

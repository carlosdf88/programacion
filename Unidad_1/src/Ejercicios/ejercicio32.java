package Ejercicios;

import java.util.Scanner;

public class ejercicio32 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		double radio, area, perimetro,pi=3.1416;
		
		
		System.out.println ("Calculen el perímetro y área de un círculo dado su radio.");
		System.out.println ("Introduce el radio de un circulo: ");
		radio= teclado.nextDouble();

		area=pi*(radio*radio);
		perimetro=pi*(radio*2);
		
		System.out.println("El primetro de un circulo dado su radio "+radio+" es: "+perimetro);
		System.out.println("El area de un circulo dado su radio "+radio+" es: "+area);
		
		
		
		
	}

}

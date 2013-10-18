package Ejercicios;

import java.util.Scanner;

public class ejercicio33 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		double radio,volumen,pi=3.1416;
		
		
		System.out.println ("Calculen el volumen de una esfera dado su radio..");
		System.out.println ("Introduce el radio de la esfera: ");
		radio= teclado.nextDouble();

		volumen=((4/3)*pi)*((radio*radio)*radio);
		
		
		System.out.println("El volumen de la esfera dado su radio "+radio+" es: "+volumen+" cm3");

				
		
	}

}

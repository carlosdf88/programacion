package Ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		double peso,velocidad,seg;
		
		System.out.println ("Crea un programa que pida el tama�o de un archivo (Mbytes) y la velocidad de una l�nea de datos (Mbps), y muestre el tiempo que tardar� en transmitirlo usando dicha l�nea.");
		System.out.println ("Introduce cuanto ocupa el archivo en Mb: ");
		peso= teclado.nextDouble();

		System.out.println ("Introduce que velocidad tiene tu conexion en Mbps: ");
		velocidad= teclado.nextDouble();

		
		seg=(peso/velocidad);
				
		System.out.println("El archivo de: "+peso+" Mb tardar�: "+seg+" segundos en enviarse.");
		
		
		
		

	}

}

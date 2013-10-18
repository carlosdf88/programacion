package Ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		double peso,velocidad,seg;
		
		System.out.println ("Crea un programa que pida el tamaño de un archivo (Mbytes) y la velocidad de una línea de datos (Mbps), y muestre el tiempo que tardará en transmitirlo usando dicha línea.");
		System.out.println ("Introduce cuanto ocupa el archivo en Mb: ");
		peso= teclado.nextDouble();

		System.out.println ("Introduce que velocidad tiene tu conexion en Mbps: ");
		velocidad= teclado.nextDouble();

		
		seg=(peso/velocidad);
				
		System.out.println("El archivo de: "+peso+" Mb tardará: "+seg+" segundos en enviarse.");
		
		
		
		

	}

}

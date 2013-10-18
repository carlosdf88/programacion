package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
	
	double  num1,num2, suma, media, producto;
	Scanner teclado=new Scanner(System.in);
		
		
		
		System.out.println ("Introduce el primer numero: ");
		num1= teclado.nextDouble();

		System.out.println ("Introduce el segundo numero: ");
		num2= teclado.nextDouble();
		
		suma=num1+num2;
		producto=num1*num2;
		media=(num1+num2)/2;
		
		
		System.out.println("La Suma de los numeros " +num1+" y "+num2+" es: "+suma);	
		System.out.println("El Producto de los numeros " +num1+" y "+num2+" es: "+producto);	
		System.out.println("La Media de los numeros " +num1+" y "+num2+" es: "+media);	
		
	}

}

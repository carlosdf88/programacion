package Ejercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		double a=0,b=0,resultado=0;
		Scanner input=new Scanner (System.in);
		int x=1;
		
	
		System.out.println("Calculadora");
		
		
		System.out.println("Introduce el primer numero: ");
		a=input.nextDouble();
		
		System.out.println("Introduce el segundo numero: ");
		b=input.nextDouble();
		
		
		System.out.println("¿Que desea hacer con "+a+" y "+b+" ?");
		
		System.out.println("1.- Sumar.\n2.- Restar.\n3.- Multiplicar.\n4.- Dividir");
		x=input.nextInt();
		
		
		switch (x){
		
		case 1: 
			resultado=(a+b);
			
		
		case 2:
			resultado=(a-b);
			
		
		case 3:
			resultado=(a*b);
			
		
		case 4:
			resultado=(a/b);
						
		}
		System.out.println("El resultado de la operacion es: "+resultado);
		
		//System.out.println("Te as confundido, introduce un numero valido");	
			
	
	
		
		

		
		
		
		
		
		
		
		
		
	}
}


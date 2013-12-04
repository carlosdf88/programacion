package Simulacro;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numeros[], positivos = 0, negativos = 0,total=0;
		double media = 0;
		
		System.out.print("Introduce la cantidad de numeros que vas a introducir: ");
		total = teclado.nextInt();
		numeros = new int[total];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce un numero: ");
			numeros[i] = teclado.nextInt();
			media = media + numeros[i];
			if (numeros[i] > 0) {
				positivos++;
			}
			if (numeros[i] < 0) {
				negativos++;
			}

		}

		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i]+"\t");
		}
		
		
		System.out.print("\nPositivos: "+positivos+"\nNegativos: "+negativos+"\nMedia: "+(media/numeros.length));
		
		
	}

}

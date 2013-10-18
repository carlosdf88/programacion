package Ejercicios;

import java.util.Scanner;

public class ejercicio35 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		double catetoa,catetob,hipotenusa,pi=3.1416;
		
		
		System.out.println ("Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.");

		System.out.println ("Introduce el cateto A: ");
		catetoa= teclado.nextDouble();

		System.out.println ("Introduce el cateto B: ");
		catetob= teclado.nextDouble();

		hipotenusa=Math.sqrt(catetoa*catetoa)+(catetob*catetob);
		
		System.out.println("Dado el cateto A: "+catetoa+", y el cateto B "+catetob+". Su hipotenusa es: "+hipotenusa);

	}

}

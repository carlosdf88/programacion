import java.util.Scanner;


public class AñoBisiento {

	public static void main(String[] args) {
	
		
		/*
		 * Un año es bisiesto si es divisible entre 4, excepto el último de cada siglo (aquel divisible por 100), salvo que este 
		 * último sea divisible por 400 http://es.wikipedia.org/wiki/Año_bisiesto. Haz un programa que pida un año y muestre un
		 *  mensaje de si es o no bisiesto.
		 */
		
		
		int ano;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Escribe un año para saber si es bisiesto: ");
		ano=teclado.nextInt();
			
		
	if (ano==0){
		
				System.out.print("Introduce un numero correcto.");
				
		
	}else if ((ano%4==0)&&((ano%100!=0)||(ano%400==0))){
				
				System.out.print("El año "+ano+" es bisiesto.");	
				
			}else{
				
				System.out.print("El año "+ano+" no es bisiesto.");
			}
		
		

	}

}

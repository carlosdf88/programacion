import java.util.Scanner;


public class A�oBisiento {

	public static void main(String[] args) {
	
		
		/*
		 * Un a�o es bisiesto si es divisible entre 4, excepto el �ltimo de cada siglo (aquel divisible por 100), salvo que este 
		 * �ltimo sea divisible por 400 http://es.wikipedia.org/wiki/A�o_bisiesto. Haz un programa que pida un a�o y muestre un
		 *  mensaje de si es o no bisiesto.
		 */
		
		
		int ano;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Escribe un a�o para saber si es bisiesto: ");
		ano=teclado.nextInt();
			
		
	if (ano==0){
		
				System.out.print("Introduce un numero correcto.");
				
		
	}else if ((ano%4==0)&&((ano%100!=0)||(ano%400==0))){
				
				System.out.print("El a�o "+ano+" es bisiesto.");	
				
			}else{
				
				System.out.print("El a�o "+ano+" no es bisiesto.");
			}
		
		

	}

}

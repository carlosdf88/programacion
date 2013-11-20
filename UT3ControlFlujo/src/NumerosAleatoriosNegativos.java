import java.util.Scanner;


public class NumerosAleatoriosNegativos {

	public static void main(String[] args) {

/*
 * Escribir un programa que lea tantos números como el usuario quiera (hasta que se inserte un número negativo). 
 * El primer número hay que visualizarlo en la pantalla.
 *  		
 */
		
		int numero=0,contador=0;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("El programa parara cuando se introduzca un numero negativo. ");
		
		while(true){
		
			System.out.print("\n\nIntroduce un numero: ");
			numero=teclado.nextInt();	
		
					if (numero<0){
						System.out.print("\nFIN");
						break;
					}else if (contador==0){
						System.out.print("\nEl numero "+numero+" es entero, sigue intentandolo");
					}
		
		contador=1;			
		}
		
		

	}

}
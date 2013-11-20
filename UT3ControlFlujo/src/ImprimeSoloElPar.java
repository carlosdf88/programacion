import java.util.Scanner;


public class ImprimeSoloElPar {

	public static void main(String[] args) {

/*Escribe un programa que lea una serie de números, muestre el primero, no el segundo, si el tercero y así sucesivamente. 
 *Termina cuando insertamos un número negativo. El número negativo no se imprimirá.		
 */
		int numero=0,contador=1;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("El programa parara cuando se introduzca un numero negativo. ");
		
		while(true){
		
			System.out.print("\nIntroduce un numero: ");
			numero=teclado.nextInt();	
		
					if (numero<0){
						System.out.print("\nFIN");
						break;
					}else if (contador%2!=0){
						System.out.print("\nEl numero "+numero+" es entero, sigue intentandolo");
					}
		
		contador++;		
		}
		
		

	}

}

import java.util.Scanner;


public class ImprimeSoloElPar {

	public static void main(String[] args) {

/*Escribe un programa que lea una serie de n�meros, muestre el primero, no el segundo, si el tercero y as� sucesivamente. 
 *Termina cuando insertamos un n�mero negativo. El n�mero negativo no se imprimir�.		
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

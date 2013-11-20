import java.util.Scanner;


public class PedirNumeroPar {

	public static void main(String[] args) {

/*
Escribir un programa que pida varios números hasta que el usuario inserte un número par. 
Hay que ir mostrando cada uno de los números insertados (excepto el par).
*/		
		int numero=0;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("El programa parara cuando se introduzca un numero par. ");
		
		while(true){
		
			System.out.print("\n\nIntroduce un numero: ");
			numero=teclado.nextInt();	
		
					if (numero%2==0){
						System.out.print("\nFIN");
						break;
					}else{
						System.out.print("\nEl numero "+numero+" es impar, sigue intentandolo");
					}
		
		}
		
		

	}

}

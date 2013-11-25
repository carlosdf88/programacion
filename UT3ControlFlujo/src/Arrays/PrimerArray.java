package Arrays;

import java.util.Scanner;

public class PrimerArray {

	public static void main(String[] args) {

		int [] numero;
		numero=new int [9];
		int valor=0;
		Scanner teclado=new Scanner (System.in);		
		
		
		for (int i=0;i<=numero.length-1;i++){
			
	
			valor=teclado.nextInt();
			numero[i]=valor;			
		}
		
		System.out.print("\n");
		
		for (int i=numero.length-1;i>=0;i--){
		
			System.out.print(numero[i]+"\t");
						
		}
	}

}

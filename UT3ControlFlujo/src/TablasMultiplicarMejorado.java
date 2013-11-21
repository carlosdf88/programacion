import java.util.Scanner;


public class TablasMultiplicarMejorado {

	/*
	 * Modifica el ejercicio de la tabla de multiplicar de forma que el usuario vaya introduciendo números y se 
	 * vayan imprimiendo las tablas correspondientes. El programa termina cuando se introduce un número 
	 * no esté entre 1 y 10.
	 */
	
	
	public static void main(String[] args) {

		int numero=1;
		Scanner teclado=new Scanner (System.in);
				
		System.out.print("Tablas de multiplicar");		
		
	while (true){
		
		
		System.out.print("\n\nIntroduce un numero: ");
		numero=teclado.nextInt();
		
		
		if ((numero>0)&&(numero<=10)){
			
					
			for (int i=1;i<=10;i++){
				System.out.print("\n"+numero+" x "+i+" = "+(numero*i));
				
			}
		}else{
			System.out.print("\nFIN");
			break;	
		}
	}

}
}

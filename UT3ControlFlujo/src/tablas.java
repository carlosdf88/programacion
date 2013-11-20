import java.util.Scanner;

public class tablas {

	public static void main(String[] args) {
		
		int contador=0, numero=0;
		Scanner teclado=new Scanner (System.in);
				
		System.out.print("Tablas de multiplicar");
		System.out.print("\n\nIntroduce un numero: ");
		numero=teclado.nextInt();
		
		while (contador<=10){
			
			System.out.print("\n"+numero+" x "+contador+" = "+(numero*contador));
			contador++;
		}
	

	}
}

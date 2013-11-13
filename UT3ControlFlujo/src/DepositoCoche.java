import java.util.Scanner;


public class DepositoCoche {

	public static void main(String[] args) {

		double tamaño, lleno, consumo,totaldeposito,autonomia;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Escribe el tamaño del deposito en litros: ");
		tamaño=teclado.nextInt();
			
		System.out.print("Porcentaje del deposito lleno: ");
		lleno=teclado.nextInt();
		
		System.out.print("Consumo a los 100km en litros: ");
		consumo=teclado.nextInt();
			
		//Total del deposito con la cantidad de litros que tiene en el deposito.

		totaldeposito=(tamaño*lleno);
		autonomia=(totaldeposito/consumo);
		
		
		if (((tamaño<=0)||(consumo>=0))&&(lleno<0)){
			System.out.print("Te has confundido al meter los datos. Intentelo de nuevo.");
		
		}else if (autonomia<=30){
			
			System.out.print("Tiene una autonomia de: "+autonomia+"km. Tienes que repostar.");	
		}else {
					
			System.out.print("Tiene una autonomia de: "+autonomia+"km. No te preocupes.");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

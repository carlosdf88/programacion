import java.util.Scanner;


public class DepositoCoche {

	public static void main(String[] args) {

		double tama�o, lleno, consumo,totaldeposito,autonomia;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Escribe el tama�o del deposito en litros: ");
		tama�o=teclado.nextInt();
			
		System.out.print("Porcentaje del deposito lleno: ");
		lleno=teclado.nextInt();
		
		System.out.print("Consumo a los 100km en litros: ");
		consumo=teclado.nextInt();
			
		//Total del deposito con la cantidad de litros que tiene en el deposito.

		totaldeposito=(tama�o*lleno);
		autonomia=(totaldeposito/consumo);
		
		
		if (((tama�o<=0)||(consumo>=0))&&(lleno<0)){
			System.out.print("Te has confundido al meter los datos. Intentelo de nuevo.");
		
		}else if (autonomia<=30){
			
			System.out.print("Tiene una autonomia de: "+autonomia+"km. Tienes que repostar.");	
		}else {
					
			System.out.print("Tiene una autonomia de: "+autonomia+"km. No te preocupes.");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

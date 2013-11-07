import java.util.Scanner;


public class DiaFestivoconIF {

	public static void main(String[] args) {
	
		int dia=0;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Escribe un numero de 1 al 7: ");
		dia=teclado.nextInt();
			
		
		
		if ((dia>=1)&&(dia<=5)){
			System.out.print("El dia es laborable");
		
		}else if ((dia==6)||(dia==7)){
			System.out.print("El dia es festivo");
		}else{
			System.out.print("Eres tonto");
			
		}
		
		
		
		
		
		
		
		

	}

}

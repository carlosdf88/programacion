import java.util.Scanner;


public class DiaFestivoConSwitch {

	public static void main(String[] args) {

		int dia;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Escribe un numero de 1 al 7 para saber si es fesivo: ");
		dia=teclado.nextInt();
			
		
		
		
		switch (dia){
		
		case 1: 
			System.out.print("El lunes es laboral.");
			break;
			
		case 2: 
			System.out.print("El Martes es laboral.");
			break;
			
		case 3: 
			System.out.print("El Miercoles es laboral.");
			break;
			
		case 4: 
			System.out.print("El Jueves es laboral.");
			break;
			
		case 5: 
			System.out.print("El Viernes es laboral.");
			break;
			
		case 6: 
			System.out.print("El Sabado es festivo.");
			break;
			
		case 7: 
			System.out.print("El Domingo es festivo.");
			break;
			
		default:
			
			System.out.print("Eres tonto");
			break;
		}
		
		
		
	}

}

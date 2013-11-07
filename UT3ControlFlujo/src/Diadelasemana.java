import java.util.Scanner;


public class Diadelasemana {

	public static void main(String[] args) {
		
		int dia;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Escribe un numero de 1 al 7: ");
		dia=teclado.nextInt();
			
		
		
		
		switch (dia){
		
		case 1: 
			System.out.print("Lunes");
			break;
			
		case 2: 
			System.out.print("Martes");
			break;
			
		case 3: 
			System.out.print("Miercoles");
			break;
			
		case 4: 
			System.out.print("Jueves");
			break;
			
		case 5: 
			System.out.print("Viernes");
			break;
			
		case 6: 
			System.out.print("Sabado");
			break;
			
		case 7: 
			System.out.print("Domingo");
			break;
			
		default:
			
			System.out.print("Eres tonto");
			break;
		}
		
		
		
		
		
		
		
		
		
	}

}

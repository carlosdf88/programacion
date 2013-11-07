import java.util.Scanner;


public class Numeropar {

	public static void main(String[] args) {
		
		
		double numerodado;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Escribe un numero: ");
		numerodado=teclado.nextDouble();
				
		if (numerodado==0) { 
			System.out.print("El numero 0 no es ni par ni impar.");
		
		}
	
		if ((numerodado%2)==0){
			
			System.out.print("El numero "+numerodado+" es par.");
			
		
		}else{
				System.out.print("El numero "+numerodado+" es impar.");
				
				if (numerodado%5==0){ System.out.print(" Y por el culo te la inco");}
			
	
		}
		
	}
}

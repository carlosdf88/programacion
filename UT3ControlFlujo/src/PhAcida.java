import java.util.Scanner;


public class PhAcida {

	public static void main(String[] args) {

/*
 * Escribe un programa que pida el ph de una 
 * soluci�n y muestre el mensaje de si la soluci�n 
 * es �cida (ph < 7.0) o peligr�samente �cida: ph < 3.0).
 */
		
		double solucion;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Escribe el ph de una solucion: ");
		solucion=teclado.nextDouble();
		
		if(solucion<7&&solucion>=3){
			System.out.print("El Ph de la solucion "+solucion+" es acida.");
			
		}else if(solucion<3){
			System.out.print("El Ph de la solucion "+solucion+" es peligrosamente acida.");
			
		}else{
			System.out.print("No tienes por que preocuparte.");
		}
		
		
		
		
		
		
		
		
	}

}

import java.util.Scanner;


public class PiedraPapelTijera {

	public static void main(String[] args) {

/*El juego de piedra/papel/tijera. Haz un programa para jugar a piedra/papel/tijera con el ordenador. 
 *Solo una ronda por ejecución.
 */

		int contador,respuesta=0; 
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Juego: Piedra, Papel o Tijera: ");
		System.out.print("\n\n1.- Piedra.\n2.- Papel.\n3.- Tijera.\n\nRespuesta: ");
		respuesta=teclado.nextInt();
	
		
		//Con esto asigno aleatoriamente numeros del 1 al 3 y le asigno su valor en el juego.
		
		switch ((int )(Math.random() * 3 + 1)){
		
		case 1:
			if (respuesta==1){
				System.out.println("\n\nUsuario: Piedra.");
				System.out.println("Maquina: Piedra.");
				System.out.println("Ganador: Empate.");		
			}else if (respuesta==2){
				System.out.println("\n\nUsuario: Papel.");
				System.out.println("Maquina: Piedra.");
				System.out.println("Ganador: Usuario.");
			}else if (respuesta==3){
				System.out.println("\n\nUsuario: Tijera.");
				System.out.println("Maquina: Piedra.");
				System.out.println("Ganador: Maquina.");
			}else if (respuesta!=1&&respuesta!=2&&respuesta!=3){
				System.out.println("\n\nTe has confundido.");
			}
			break;		
	
		case 2:
			if (respuesta==1){
				System.out.println("\n\nUsuario: Piedra.");
				System.out.println("Maquina: Papel.");
				System.out.println("Ganador: Maquina.");		
			}else if (respuesta==2){
				System.out.println("\n\nUsuario: Papel.");
				System.out.println("Maquina: Papel.");
				System.out.println("Ganador: Empate.");
			}else if (respuesta==3){
				System.out.println("\n\nUsuario: Tijera.");
				System.out.println("Maquina: Papel.");
				System.out.println("Ganador: Usuario.");
			}else if (respuesta!=1&&respuesta!=2&&respuesta!=3){
				System.out.println("\n\nTe has confundido.");
			}
			break;				
			
		case 3:
			if (respuesta==1){
				System.out.println("\n\nUsuario: Piedra.");
				System.out.println("Maquina: Tijera.");
				System.out.println("Ganador: Usuario.");		
			}else if (respuesta==2){
				System.out.println("\n\nUsuario: Papel.");
				System.out.println("Maquina: Tijera.");
				System.out.println("Ganador: Maquina.");
			}else if (respuesta==3){
				System.out.println("\n\nUsuario: Tijera.");
				System.out.println("Maquina: Tijera.");
				System.out.println("Ganador: Empate.");
			}else if (respuesta!=1&&respuesta!=2&&respuesta!=3){
				System.out.println("\n\nTe has confundido.");
			}
			break;	
			
			
		}	
			
			
			
			
		
			
			
		}
	}



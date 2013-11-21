import java.util.Scanner;


public class PiedraPapelTijeraMejorado {

	public static void main(String[] args) {
		
	/*
	 * Mejora el juego de piedra/papel/tijera haciendo dos cosas:
		* Que se compruebe lo que el usuario escribe, y si no está {"piedra","papel","tijera"} 
		* 	vuelva a pedir que introduzca su elección.
		* Al finalizar la partida, deberá preguntarse "¿Otra partida [s/n]?". 
		* Si el usuario contesta que si, deberá volver a dejarnos jugar una nueva partida. 	
	 */
		
		
		int contador;
		String respuesta="",respuesta2="";
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Juego: Piedra, Papel o Tijera: ");
	
while(true){		
		
		
		while (true){
			
			System.out.print("\nIntroduce piedra, papel o tijera: ");
				respuesta=teclado.next();
			
			if ((respuesta.equalsIgnoreCase("Piedra")==false)&&(respuesta.equalsIgnoreCase("Papel")==false)&&(respuesta.equalsIgnoreCase("Tijera")==false)){
				System.out.print("\nTu respuesta: "+respuesta+" no es correcta, introduce piedra, papel o tijera.");
			}else{
				break;
			}
			
		}
	
		
		switch ((int )(Math.random() * 3 + 1)){
		
			case 1:
				if (respuesta.equalsIgnoreCase("Piedra")){
					System.out.println("\n\nUsuario: Piedra.");
					System.out.println("Maquina: Piedra.");
					System.out.println("Ganador: Empate.");		
				}else if (respuesta.equalsIgnoreCase("Papel")){
					System.out.println("\n\nUsuario: Papel.");
					System.out.println("Maquina: Piedra.");
					System.out.println("Ganador: Usuario.");
				}else if (respuesta.equalsIgnoreCase("Tijera")){
					System.out.println("\n\nUsuario: Tijera.");
					System.out.println("Maquina: Piedra.");
					System.out.println("Ganador: Maquina.");
				}else {
					System.out.println("\n\nTe has confundido.");
				}
			break;		
	
			case 2:
				if (respuesta.equalsIgnoreCase("Piedra")){
					System.out.println("\n\nUsuario: Piedra.");
					System.out.println("Maquina: Papel.");
					System.out.println("Ganador: Maquina.");		
				}else if (respuesta.equalsIgnoreCase("Papel")){
					System.out.println("\n\nUsuario: Papel.");
					System.out.println("Maquina: Papel.");
					System.out.println("Ganador: Empate.");
				}else if (respuesta.equalsIgnoreCase("Tijera")){
					System.out.println("\n\nUsuario: Tijera.");
					System.out.println("Maquina: Papel.");
					System.out.println("Ganador: Usuario.");
				}else{
					System.out.println("\n\nTe has confundido.");
				}
			break;				
			
			case 3:
				if (respuesta.equalsIgnoreCase("Piedra")){
					System.out.println("\n\nUsuario: Piedra.");
					System.out.println("Maquina: Tijera.");
					System.out.println("Ganador: Usuario.");		
				}else if (respuesta.equalsIgnoreCase("Papel")){
					System.out.println("\n\nUsuario: Papel.");
					System.out.println("Maquina: Tijera.");
					System.out.println("Ganador: Maquina.");
				}else if (respuesta.equalsIgnoreCase("Tijera")){
					System.out.println("\n\nUsuario: Tijera.");
					System.out.println("Maquina: Tijera.");
					System.out.println("Ganador: Empate.");
				}else{
					System.out.println("\n\nTe has confundido.");
				}
			break;			
		}	
			
			
		System.out.println("\n\n¿Otra partida? si/no: ");	
		
		if (teclado.next().equalsIgnoreCase("NO")){
			System.out.println("\n\nFIN");
			break;
		}
}		
		
			
			
		}
	}


		
		
		
		
	
package EjerciciosParaPracticar;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * El juego de adivina el número.El programa "pensará" un número del 1
		 * al 100 que el jugador tendrá que adivinar. El programa va preguntando
		 * un número tras otro al jugador. Si el jugador dice uno mayor, el
		 * programa le dice que el número oculto es menor (y al revés si dice
		 * uno menor). El jugador tiene como máximo 10 oportunidades para
		 * adivinar el número. Realiza una primera versión lo más sencilla
		 * posible. Ve mejorardola poco a poco. No te olvides escribir
		 * comentarios en el código para aclarar lo que hace en cada paso.
		 * Mejora: Crea un contandor de tiempo en el programa, de forma que te
		 * diga los segundos que llevas jugando tras cada intento.
		 */

		Scanner teclado = new Scanner(System.in);
		int usuario, premio;
		premio = (int) (Math.random() * 100 + 1); // Aqui asigno un valor al
													// azar del 1 al 100.

		System.out.print("Adivina el numero.\n\n");

		for (int i = 0; i <= 10; i++) { // creo un bucle con 10 intentos que son
										// los que dispone el usuario.

			System.out.print("Introduce el numero: ");
			usuario = teclado.nextInt();
			// Aqui compruebo si el numero es igual, mayor o menos y le asigno
			// un texto que imprimira dependiendo si es igual, mayor o menor.
			
			if (usuario == premio) {
				System.out.print("\n\nEnorabuena, has adivinado el numero secreto "
						+ premio + "\n\n\nFIN");
				break;
			} else if (usuario > premio) {
				System.out
						.print("El numero secreto es menor que el introducido.\n");
			} else if (usuario < premio) {
				System.out
						.print("El numero secreto es mayor que el introducido.\n");
			}else if (i==10){
				System.out.print("Fallaste....El numero secreto era: "+premio);
			}

			// Aqui creo el segundero.
			 long start = System.currentTimeMillis();
			 long intervalo;
			  // tareas a medir
			 intervalo = (System.currentTimeMillis() - start)/1000;
			 
				System.out.print("\nTiempo transcurrido: "+intervalo+" seg\n\n");	
			
		}

	}

}

package EjerciciosParaPracticar;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Un programa que pida al usuario una contrase�a (en el programa
		// escribe la palabra oculta que quieras). El programa volver� a pedir
		// la contrase�a hasta que la adivine el jugador o se llege a los 3
		// intentos, lo que ocurra primero. Mostrar� un mensaje de aceptaci�n de
		// la contrase�a o el de error por hacer tres intentos fallidos.

		Scanner teclado = new Scanner(System.in);
		int contador = 0;
		String usuario = "", pass = "programacion";

		while (true) {
			
			System.out.print("\n\nEscribe la contrase�a: ");
			usuario = teclado.next();
			contador++;
			
			if (usuario.equalsIgnoreCase(pass)) {
				System.out.print("Contrase�a correcta");
				break;
			}else{
				System.out.print("Contrase�a incorrecta");
			}
			if (contador==3){
				System.out.print("\n\nSe acabaron los intentos");
				break;
			}

		}

	}

}

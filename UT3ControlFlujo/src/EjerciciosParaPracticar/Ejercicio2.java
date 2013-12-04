package EjerciciosParaPracticar;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Un programa que pida al usuario una contraseña (en el programa
		// escribe la palabra oculta que quieras). El programa volverá a pedir
		// la contraseña hasta que la adivine el jugador o se llege a los 3
		// intentos, lo que ocurra primero. Mostrará un mensaje de aceptación de
		// la contraseña o el de error por hacer tres intentos fallidos.

		Scanner teclado = new Scanner(System.in);
		int contador = 0;
		String usuario = "", pass = "programacion";

		while (true) {
			
			System.out.print("\n\nEscribe la contraseña: ");
			usuario = teclado.next();
			contador++;
			
			if (usuario.equalsIgnoreCase(pass)) {
				System.out.print("Contraseña correcta");
				break;
			}else{
				System.out.print("Contraseña incorrecta");
			}
			if (contador==3){
				System.out.print("\n\nSe acabaron los intentos");
				break;
			}

		}

	}

}

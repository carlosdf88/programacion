package Examen5Diciembre;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String menu[], opcion = "", opcion2 = "";
		menu = new String[10];
		int contador = 0, extra = 0, extra2 = 0;

		while (true) {

			System.out.print("Introduce una opcion: ");
			opcion = teclado.next();

			if (opcion.equalsIgnoreCase("*")) {
				break;
			} else {
				menu[contador] = opcion;
			}
			contador++;
		}

		while (true) {

			System.out.print("\n\nMENU\n");

			for (int i = 0; i < contador; i++) {

				System.out.print((i + 1) + ".- " + menu[i] + ".\n");

			}
			System.out.print((contador + 1) + ".- Salir.\nOpcion elegida: ");
			opcion2 = teclado.next();
			extra2 = 0;
			for (int i = 0; i < contador; i++) {

				if (opcion2.equalsIgnoreCase(menu[i])) {
					System.out.print("Ha elegido la opcion: " + (i + 1));
					extra2++;
				} else if ((opcion2.equalsIgnoreCase("salir") && (extra == 0))) {
					System.out.print("Ha elegido la opcion: " + (contador + 1));
					extra++;
				} else if ((extra == 0) && (extra2 == 0) && (i == contador - 1)) {
					System.out
							.print("La opcion elegida no se encuentra en el menu.\n");
				}

			}

			if (extra != 0) {
				System.out.print("\n\nFIN");
				break;
			}

		}

	}
}

import java.util.Scanner;


public class Numeromayor {

	public static void main(String[] args) {
		double numerodado1=0,numerodado2=0;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Escribe un numero: ");
		numerodado1=teclado.nextDouble();

		System.out.print("Escribe un numero: ");
		numerodado2=teclado.nextDouble();
		
		
		if (numerodado1 == numerodado2){
			System.out.print("Los numeros son iguales "+numerodado1);

		}else if (numerodado1 > numerodado2){
			System.out.print("El numero "+numerodado1+" es el mayor");
		}else{
			System.out.print("El numero "+numerodado2+" es el mayor");
		}
		
	}

}

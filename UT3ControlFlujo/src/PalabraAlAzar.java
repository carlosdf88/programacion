import java.util.Scanner;


public class PalabraAlAzar {

	public static void main(String[] args) {
		
		
		Scanner teclado=new Scanner (System.in);
		String respuesta="a";
		boolean total;
		
		
		System.out.print("Escribe una palabra: ");
		respuesta=teclado.next();
		
		
		total=(respuesta.equals("programacion"));
		
		
		if (total==true){
			System.out.print("Ha adivinado la contraseña");
		}else{
			System.out.print("La contraseña es incorrecta");
		}
		
		
		
		
		
		
		
		
		
	}

}

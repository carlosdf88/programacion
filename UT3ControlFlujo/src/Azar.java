import java.util.Scanner;


public class Azar {

	public static void main(String[] args) {
		
		int num,premio;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Escribe un numero: ");
		num=teclado.nextInt();
	
		premio = (int)(Math.random() * 10);
	

		if (premio==num){
		
			System.out.print("Ha adivinado el numero secreo");
		}else{
			System.out.print("El numero premiado era: "+premio+" y usted a puesto el numero: "+num);
		}
		
		
	
	
	}

}

import java.util.Scanner;


public class NumeroMenorDeTres {

	public static void main(String[] args) {


		double numerodado1=0,numerodado2=0,numerodado3=0;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Escribe el primer numero: ");
		numerodado1=teclado.nextDouble();

			if (numerodado1==5){ System.out.print("\nPor el culo te la inco\n");}
		
		System.out.print("Escribe el segundo numero: ");
		numerodado2=teclado.nextDouble();
		
			if (numerodado2==5){ System.out.print("\nPor el culo te la inco\n");}
		
		System.out.print("Escribe el tercer numero: ");
		numerodado3=teclado.nextDouble();
		
			if (numerodado3==5){ System.out.print("\nPor el culo te la inco\n");}
		
			
		
			
		if ((numerodado1<=numerodado2)&&(numerodado1<=numerodado3)){
			
				System.out.print("El numero menor es: "+numerodado1);
			
		}
		
		if ((numerodado2<=numerodado3)&&(numerodado2<=numerodado1)){
			
			System.out.print("El numero menor es: "+numerodado2);
		
		}
		
		if ((numerodado3<=numerodado1)&&(numerodado3<=numerodado2)){
			
			System.out.print("El numero menor es: "+numerodado3);
		
		}
		
		
		
		
		
		
		
		
	}

}

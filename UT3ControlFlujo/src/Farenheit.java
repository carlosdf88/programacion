import java.util.Scanner;


public class Farenheit {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.print("Dime la temperatura (�F): ");
		double temperatura=teclado.nextDouble();
		
		temperatura=(temperatura-32)/1.8;
		
		if (temperatura<=0){ System.out.print("\nTemperatura: "+temperatura+"� C\nHay riesgo de congelacion.");
		}else{
			System.out.print("\nTemperatura: "+temperatura+"� C\nNo hay riesgo de congelacion.");
		}
		
		
	}

}

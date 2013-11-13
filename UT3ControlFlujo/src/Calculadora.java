import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {

		int num1,num2,respuesta,total;
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Escribe el primer numero: ");
		num1=teclado.nextInt();
			
		System.out.print("Escribe el primer numero: ");
		num2=teclado.nextInt();
			
		System.out.print("\n¿Que desea hacer con los numeros "+num1+" y "+num2+"?\n\n1.- Sumar.\n2.- Restar.\n3.- Multiplicar.\n4.- Dividir.\n\nRespuesta: ");
		respuesta=teclado.nextInt();
		
		switch (respuesta){
		
		case 1:
			total=num1+num2;
			System.out.print("El resultado de la Suma es: "+total);
			break;
			
		case 2: 
			total=num1-num2;
			System.out.print("El resultado de la Resta es: "+total);
			break;
			
		case 3: 
			total=num1*num2;
			System.out.print("El resultado de la Multiplicacion es: "+total);
			break;
			
		case 4: 
			total=num1/num2;
			System.out.print("El resultado de la Division es: "+total);
			break;
			
		default:
			System.out.print("Eres tonto");
			break;
			
		}
		
		
		
		
		

	}

}

import java.util.Scanner;



public class factorial {

public static void main(String[] args) {
		
	
/*
 * Escribe un programa que pida un n�mero con el fin de calcular el factorial de dicho n�mero. 
 * Hay que validar que el n�mero insertado sea positivo (incluido el 0). Si no es as�, se volver� a pedir dicho n�mero. 
 * Posteriormente, el programa le preguntar� al usuario si quiere insertar otro n�mero, con un mensaje como este: 
 * "�Quiere insetar otro n�mero [s/n]?". Debes validar tambi�n esta respuesta.
 **/
		
		int num,total;
		String resultado="";
		Scanner teclado=new Scanner (System.in);
			
		
		while (true){
			num=-1;
			total=1;
			
				while (num<=0){
					
				System.out.print("Escribe un numero: ");
				num=teclado.nextInt();
				
					if ((num==0)||(num<0)){
						System.out.print("\nTe has confundido, introduce un numero valido.");
						System.out.print("\n");
					}
			
					System.out.print("\n");
				
				}//cierro while
			
				
				
				for (int i=num; i>=1; i--){
				total=total*i;
				}
	
	
			System.out.print("El factorial de "+num+" es "+total+".\n\n");
			
		
			System.out.print("�Quires introducir otro numero? si/no: ");
			resultado=teclado.next();
		
			if (resultado.equalsIgnoreCase("Si")==false){
				System.out.print("\n\nFIN");
				break;
			}
		System.out.print("\n");
	}	
	
}
}

import java.util.Scanner;


public class Ejercicio5FOR {

	public static void main(String[] args) {

/*
Escribe un programa que pida dos n�meros con el fin de visualizar la suma de todos los n�meros que hay entre ambos 
n�meros (incluidos dichos n�meros). Si el primer n�mero que inserte el usuaruio es mayor que el segundo, se volver�n
a pedir otros dos n�meros hasta que el primer n�mero insertado sea menor o igual que el segundo.
*/	

	int n1=1,n2=0,total=0;
	Scanner teclado=new Scanner (System.in);
	
	
	
	
	
	while (n1>n2){
		
		System.out.print("Escribe un numero: ");
		n1=teclado.nextInt();
	
		System.out.print("Escribe un numero: ");
		n2=teclado.nextInt();
		
		if (n1>n2){System.out.print("\n\n\nEl segundo numero tiene que ser mayor que el primero \n\n");}

	}
	
	System.out.print("\n\n");
	
	
	System.out.print("Entre los numeros "+n1+" y "+n2+", ellos incluidos estan los numeros:\n\n");
	
	
	
			for (int i=n1; i<=n2; i++){
		
					total=total+i;
					System.out.print(i+"\t");
			
					if (n1==n2){
					System.out.print(i+"\t");
					}
			}
	
	
	
	
	if (n1==n2){ total=n1+n2;}
	
	
	System.out.print("\n\nLa suma total de todos los numeros es: "+total);
		

	}

}

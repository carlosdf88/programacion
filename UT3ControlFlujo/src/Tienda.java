import java.util.Scanner;


public class Tienda {

	public static void main(String[] args) {
		
		double gasto,total;
		
		Scanner teclado=new Scanner (System.in);
		
		
		System.out.print("Introduce el gasto que vas a hacer en la tienda: ");
		gasto=teclado.nextDouble();
			
		if (gasto<=0){ 
			System.out.println("\nTe as confundido, introduce un valor correcto");
			
		}else if (gasto<20){ 
			total=0.1*gasto;
			System.out.println("\nSu gasto de "+gasto+"€, genera un descuento del 10%");
			System.out.println(gasto+"€ - "+total+"€.");
			System.out.println("Total a pagar "+(gasto-total)+"€");
		} else if ((gasto>=20)&&(gasto<=50)){ 
			total=0.2*gasto;
			System.out.println("\nSu gasto de "+gasto+"€, genera un descuento del 20%");
			System.out.println(gasto+"€ - "+total+"€.");
			System.out.println("Total a pagar "+(gasto-total)+"€");
		}else if (gasto>50){ 
			total=0.25*gasto;
			System.out.println("\nSu gasto de "+gasto+"€, genera un descuento del 25%");
			System.out.println(gasto+"€ - "+total+"€.");
			System.out.println("Total a pagar "+(gasto-total)+"€");
		}
		
		
		
		
		
		
		
	}

}


public class NumerosAleatoriosHasta0 {

	public static void main(String[] args) {
		int aleatorio, total=1,n=0,impresion=0;;
				
	    System.out.print("El programa multiplicara los numeros automaticamente hasta que se genere el numero 0.");	
		System.out.print("\n\nLos numeros son: \n\n");
				
			while (true){
				
				
					aleatorio=(int)(Math.random() * 5);
				
					//Con esto doy un intro cuando se han imprimido 16 lineas, de esta forma salen los numeros mas organizados.
					if (impresion==15){ System.out.print(aleatorio+"\n"); impresion=0; }
			
					System.out.print(aleatorio+"\t");
					
					
						if ((n==0)&&(aleatorio==0)){
							total=0;
							break;
							
						}else if (aleatorio==0){
							break;
						
						}else if (aleatorio !=0){
							total=total*aleatorio;	
						}
						n=1;
						impresion++;
			}
				
		System.out.print("\n\nTotal de la multiplicacion: "+total+".");

	}
}

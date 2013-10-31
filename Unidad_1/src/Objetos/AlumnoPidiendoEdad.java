package Objetos;

import java.util.Scanner;

public class AlumnoPidiendoEdad {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		int x=0,edad=0,totaledad=0;
		String nombre="",total="";
		
		
				
		while (x<3){
			
					
				System.out.print("Introduce el nombre del alumno:");
				nombre=input.next();
				
				System.out.println("Introduce la edad de "+nombre+":");
				edad=input.nextInt();
				
				if (x==0){
				total="\n"+nombre+" tiene "+edad+" años.";
				
				}
	
				if (x!=0){
				total=total+"\n"+nombre+" tiene "+edad+" años.";
				
				}
				
				x++;
				totaledad=totaledad+edad;
		}

		
		System.out.println("\nListado de alumnos"+total);
		System.out.println("\nLa media de edad de los alumnos es de "+(totaledad/contador)+" años.");

	}		
		

	}

package Objetos;

import java.util.Scanner;

public class AlumnoPidiendoEdad {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		int contador=0,x=0,edad=0;
		String nombre="",total="";
		
		System.out.println("¿Cuantos alumnos vas a introducir? ");
		contador=input.nextInt();		
				
		while (x<contador){
			
					
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
		}

		
		System.out.println("Listado de alumnos\n"+total);
		

	}

		
		
		
		
		

	}

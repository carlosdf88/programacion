package Objetos;

import java.util.Scanner;

public class Alumno {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner (System.in);
		int x=0,edad=0;
		String nombre="",total="";
		
				
		while (x<3){
			
				if (x==0){
					System.out.println("Introduce la edad de los alumnos: ");
					edad=input.nextInt();
				}
			
				System.out.print("Introduce el nombre del alumno:");
				nombre=input.next();
				
				if (x==0){
				total=nombre;
				}
	
				if (x!=0){
				total=total+", "+nombre;
				}
				x++;
		}

		
		
		System.out.println("Los alumnos son: "+total+" y su edad es: "+edad+" años.");
		
		

}
	

}
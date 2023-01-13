/**
 * 
 */
package com.unab;

import java.util.Scanner;

/**
 * @author susanamunoz
 *
 */
public class Aprobacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float nota1, nota2, nota3;
		
		System.out.println("Ingrese Nota 1: ");
		nota1 = entrada.nextFloat();
		
		System.out.println("Ingrese Nota 2: ");
		nota2 = entrada.nextFloat();
		
		System.out.println("Ingrese Nota 3: ");
		nota3 = entrada.nextFloat();
		
		float promedio = (nota1 + nota2 + nota3) ;
		promedio = promedio /3;
		
		
		if (promedio >= 5) {
			System.out.println("Aprobado");
		}
		if(promedio < 4) {
			System.out.println("Reprobado");
		}
		if(promedio >= 4 && promedio < 5 ) {
			System.out.println("Examen");
		}
		
		
		
	}

}

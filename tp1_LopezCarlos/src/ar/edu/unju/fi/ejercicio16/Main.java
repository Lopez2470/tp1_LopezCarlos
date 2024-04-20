package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean correcto;
		
		//creacion del array
		String [] nombresDePersonas = new String [5];
		
		//Ingresar los nombres de persona al array
		System.out.println("Ingreso de nombres al array");
		System.out.println("---------------------------");
		for (int i = 0; i < nombresDePersonas.length; i++) {
			System.out.println(String.format("Ingresar un nombre de persona(%d): ", i+1));
			nombresDePersonas[i] = scanner.nextLine();
		}
		
		//Mostrar los nombres de personas dentro del array	
		System.out.println();
		System.out.println("Nombres de las personas en orden de ingreso");
		System.out.println("-------------------------------------------");
		int i=0;
		while (i < nombresDePersonas.length) {
		//for (int i = 0; i < nombresDePersonas.length; i++) {
				System.out.println(String.format("Nombre de la persona Nº %d del array: %s.",
				i+1, nombresDePersonas[i]));
				i++;
		}
		//Mostrar la dimension del array
		System.out.println();
		System.out.println("Tamaño del array de nombres: " + nombresDePersonas.length);
		System.out.println();
		
		//Pedir por consola el elemento a borrar, 
		//Se pide el ingreso del ordel del elemento, no la ubicacion del elemento
		correcto = false;
		byte elementoABorrar=0;
		while (!correcto) {
			System.out.println("Ingrese el elemento a borrar.");
			System.out.println("Debe estar en el rango de  [1-5]: ");
			elementoABorrar = scanner.nextByte();
			if (elementoABorrar >= 1 && elementoABorrar <=5) {
				int posicion = elementoABorrar-1;

				if (posicion != (nombresDePersonas.length-1)) {
					for (int j = posicion; j < nombresDePersonas.length-1; j++) {
						nombresDePersonas[j] = nombresDePersonas[j+1];
					}
					
				}
				nombresDePersonas[nombresDePersonas.length-1] = " ";
				correcto = true;
				scanner.nextLine();
			}else {
				System.out.println("El valor ingresado no se encuentra en el rango de [1-5]");
			}
				//nombresDePersonas[nombresDePersonas.length-1] = " ";
				
		    }
		
		//Mostrar los nombres de personas dentro del array despues de la eliminacion	
				System.out.println();
				System.out.println("Nombres restantes de las personas en orden de ingreso");
				System.out.println("-----------------------------------------------------");
				for (i = 0; i < nombresDePersonas.length; i++) {
						System.out.println(String.format("Nombre de la persona Nº %d del array: %s",
						i+1, nombresDePersonas[i]));
				}
		
		
		
		
		/*
		 * 
		 
	
		

		

		
		

		
		//Mostrar los nombres de personas dentro del array	
		System.out.println();
		System.out.println("Nombres de las personas en orden de ingreso");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < nombresDePersonas.length; i++) {
				System.out.println(String.format("Nombre de persona en la posición Nº %d del array: %s.",
				i, nombresDePersonas[i]));
		}
		
		//Mostrar los nombres de personas dentro del array en forma inversa	
		System.out.println();
		System.out.println("Nombres de las personas en orden inverso");
		System.out.println("----------------------------------------");
		for (int i = nombresDePersonas.length-1; i >= 0 ; i--) {
				System.out.println(String.format("Nombre de persona en la posición Nº %d del array: %s.",
				i, nombresDePersonas[i]));
		}	
		 */

	}

}

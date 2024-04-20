package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Ingrese por consola un número entero, que se encuentre en el rango [5,10]. 
		 * Crear un array de tipo String donde el tamaño del array es el número ingresado.
		 * Ingrese (de forma iterativa) por consola un nombre de persona para guardarlo en el array. 
		 * Mostrar el valor de cada posición comenzando por el primer índice 0. 
		 * Mostrar el contenido del array pero comenzando con la última posición del array.
		 * */
		
		Scanner scanner = new Scanner(System.in);
		byte tamanio=0;
		boolean correcto;

		
		//Ingreso del valor del tamaño del array
		correcto = false;
		while (!correcto) {
			System.out.println("Ingrese un valor entre [5-10]: ");
			tamanio = scanner.nextByte();
			if (tamanio>=5 && tamanio<=10) {
				correcto = true;
			}else {
				System.out.println("El valor ingresado no se encuentra en el rango de [5-10]");
			}
			scanner.nextLine();
		}
		//creacion del array
		String [] nombresDePersonas = new String [tamanio];
		
		//Ingresar los nombres de persona al array
		for (int i = 0; i < nombresDePersonas.length; i++) {
			System.out.println(String.format("Ingresar un nombre de persona(%d): ", i+1));
			nombresDePersonas[i] = scanner.nextLine();
		}
		
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
	}

}

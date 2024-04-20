package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crear un array de 8 elementos, que permita almacenar números enteros. 
		 * Los valores deben ser pedidos por consola.
		 * Mostrar por consola el índice y el valor almacenado en esa posición.
		 */
		Scanner scanner = new Scanner(System.in);
		//Array de 8 elemntos
		int[] numerosEnteros = new int [8];
		//Ingresar los valores de los numeros enteros al array
		for (int i = 0; i < numerosEnteros.length; i++) {
			System.out.println(String.format("Ingresar un numero entero en la posición "+ i + ": "));
			numerosEnteros[i] = scanner.nextInt();
			scanner.nextLine();
		}
		//Mostrar los elementos del array
		System.out.println("Valores Almacenados en el array");
		for (int i = 0; i < numerosEnteros.length; i++) {
			System.out.println(String.format("Elemento %d del array  - Valor: %d (posicion %d)",
					i+1, numerosEnteros[i], i));
		}

	}

}

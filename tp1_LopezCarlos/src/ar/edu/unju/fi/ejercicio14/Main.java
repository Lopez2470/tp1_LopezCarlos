package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 *Ingrese por consola un número entero, que se encuentre en el rango [3,10]. 
		 *Crear un array de tipo entero donde el tamaño del array es el númeroingresado por el usuario. 
		 *Solicitar al usuario (de forma iterativa) que ingrese por consola un número entero para guardarlo en el array. 
		 *Mostrar el valor de cada posición.
		 *Mostrar la suma de todos los valores.
		 * */
		Scanner scanner = new Scanner(System.in);
		boolean correcto;
		byte tamanio=0;
		int sumaDeValores=0;
		//Ingreso del valor del tamaño del array
		correcto = false;
		while (!correcto) {
			System.out.println("Ingrese un número entre los valores [3-10]: ");
			tamanio = scanner.nextByte();
			if (tamanio>=3 && tamanio<=10) {
				correcto = true;
			}else {
				System.out.println("El valor ingresado no se encuentra en el rango de [3-10]");
			}
			scanner.nextLine();
		}
		
		//creacion del array
		int[] numerosEnteros = new int [tamanio];
		
		//Ingresar los valores de los numeros enteros al array
		for (int i = 0; i < numerosEnteros.length; i++) {
			System.out.println(String.format("Ingresar un numero entero en la posición "+ i + ": "));
			numerosEnteros[i] = scanner.nextInt();
			sumaDeValores+=numerosEnteros[i] ;
			scanner.nextLine();
		}
		
		//Mostrar los valores de cada elemento del array	
		System.out.println("Valores de cada elemento del array");
		for (int i = 0; i < numerosEnteros.length; i++) {
				System.out.println(String.format("Posición %d del array  - Valor: %d",
				i, numerosEnteros[i]));
		}
		
		//Mostrar la Suma de los valores del array
		System.out.println();
		System.out.println(String.format("La suma de los valores del array es %d.", sumaDeValores));
	}
	
	

}

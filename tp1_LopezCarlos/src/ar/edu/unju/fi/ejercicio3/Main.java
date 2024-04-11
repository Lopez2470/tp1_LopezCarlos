package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Solicitar al usuario que ingrese por consola un número entero que debe ser almacenado en una
		 * variable. Si el número ingresado es impar mostrar el doble del número y si es par mostrar el triple del número.
		 * Utilizar la clase Scanner para poder ingresar datos por consola.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número entero: ");
		byte numeroIngresado = scanner.nextByte();
		int resultadoNumero = (numeroIngresado%2 == 0)==true? numeroIngresado*3:numeroIngresado*2;
		String paridad = (numeroIngresado%2 != 0)==true? "Impar":"Par";
		
		//Si el número ingresado es impar mostrar el doble del número y si es par mostrar el triple del número.
		System.out.println(String.format("El numero ingresado es %s. %n" + 
										 "El resultado de la operacion es: %d", paridad, resultadoNumero));
		scanner.close();
	}

}

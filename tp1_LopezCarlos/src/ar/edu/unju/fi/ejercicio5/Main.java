package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroIngresado;
		boolean booleano=true;
		/**
		Declare las variables necesarias para solicitar al usuario que ingrese por consola un número
		entero que esté comprendido entre [1,9].
		Mostrar por consola la tabla de multiplicar correspondiente al número ingresado. 
		Usar la estructura de control iterativa for.
		 */
		
		//'Valida' que el número ingresado está en el rango pedido
		while (booleano) {
			System.out.println("Ingrese un Número entre [1-9]: ");
			numeroIngresado = scanner.nextInt();
			if ((numeroIngresado < 1) || (numeroIngresado >9)) {
				System.out.println("Error al ingresar el número");
			} else {
				booleano = false;
				System.out.println("Tabla de Multiplicar del numero "+numeroIngresado);
				calcularTablaDeMultiplicar(numeroIngresado);
			}
		}
	}
	//Calculo del factorial
	public static void calcularTablaDeMultiplicar(int numero) {
		for (int i = 0; i <=10 ; i++) {
			System.out.println(numero + " x " + i + " = " + numero*i);
		}
	}

}



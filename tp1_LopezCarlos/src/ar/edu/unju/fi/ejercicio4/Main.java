package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroIngresado;
		boolean booleano=true;
		/**
		 * Declare las variables necesarias para realizar el cálculo del factorial de un número que se introduce
		por consola y está dentro del rango numérico [0,10]. 
		Utilice una estructura de control iterativa While para resolver el ejercicio. 
		Muestre el resultado por consola.
		 */
		//'Valida' que el número ingresado está en el rango pedido
		while (booleano) {
			System.out.println("Ingrese un Número entre [0-10]: ");
			numeroIngresado = scanner.nextInt();
			if ((numeroIngresado < 0) || (numeroIngresado >10)) {
				System.out.println("Error al ingresar el número");
			} else {
				booleano = false;
				//Mostrar el resultado del factorial
				System.out.println(String.format("El factorial del número ingresado %d, es igual a %d.", 
				numeroIngresado, calcularFactorial(numeroIngresado)));
			
			}
		}
	}
	//Calculo del factorial
	public static int calcularFactorial(int i) {
		int factorial=1;
		while (i!=0) {
             factorial=factorial*i;
             i--;
         }
		return factorial;
	}
	
	

}
 
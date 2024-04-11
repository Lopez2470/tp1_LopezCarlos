package ar.edu.unju.fi.ejercicio1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//Declare 5 variables de tipo entero para almacenar valores numéricos.
		 int numeroUno;
		 int numeroDos;
		 int numeroTres;
		 int numeroCuatro;
		 int numeroCinco;
		 
		 double promedio;
		 
		 //Asigne valores numéricos a cada una de las variables.
		 numeroUno=8;
		 numeroDos=5;
		 numeroTres=1;
		 numeroCuatro=20;
		 numeroCinco=9;
		
		 //Calcule el promedio y guarde el resultado en otra variable. 
		 promedio=calcularPromedio(numeroUno, numeroDos, numeroTres, numeroCuatro, numeroCinco);
		 
		 //Muestre por consola el resultado obtenido.
		 
		 System.out.println("El resultado obtenido es: "+promedio);

	}
	
	 public static double calcularPromedio(int uno, int dos, int tres, int cuatro, int cinco) {
	        return (uno + dos + tres + cuatro + cinco)/5.0;
	    }

}

package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculadoraEspecial calculadoraEspecial = new CalculadoraEspecial();
        int valor;
        System.out.println("Ingresar un valor: ");
        valor = scanner.nextInt();
        /*System.out.println("-----------------------------------------------------");
        System.out.println(String.format("El resultado de la Sumatoria del valor ingresado %d, es %d, y %n",
        		           "el resutaldo de la productoria es %d", valor, calculadoraEspecial.calcularSumatoria(valor)
        		           , calculadoraEspecial.calcularProductoria(valor)));*/
        System.out.println("-----------------------------------------------------");
        System.out.println("Resultado de la Sumatoria para el valor "+ valor +" es: "
        					+calculadoraEspecial.calcularSumatoria(valor));
        System.out.println("Resultado de la Productoria para el valor "+ valor +" es: "
				+calculadoraEspecial.calcularProductoria(valor));
        System.out.println("-----------------------------------------------------");
        
        
        scanner.close();
	}

}

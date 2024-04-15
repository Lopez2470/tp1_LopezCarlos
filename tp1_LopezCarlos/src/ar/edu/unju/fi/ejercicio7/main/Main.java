package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Empleado empleado;
		
		
		System.out.println("Ingrese nombre del empleado: ");
		String nombre= scanner.nextLine();
		
		System.out.println("Ingrese el legajo del empleado: ");
		int legajo= scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Ingrese el monto del salario: ");
		float salario =scanner.nextFloat();
		scanner.nextLine();
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
			
		/*System.out.println(empleado.getNombre());
		System.out.println(empleado.getLegajo());
		System.out.println(empleado.getSalario());*/
		
		System.out.println("---------------------------------------");
		System.out.println("Datos de empleado con sueldo inicial");
		empleado.mostrarDatosDelEmpleado();
		
		empleado.aumentarSalario();
		
		System.out.println("---------------------------------------");
		System.out.println("Datos de empleado con sueldo incrementado");
		empleado.mostrarDatosDelEmpleado();
		
		scanner.close();
	}

}

package ar.edu.unju.fi.ejercicio12.main;

import java.util.GregorianCalendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona persona = new Persona();
		boolean correcto;
		int dia=0;
		int mes=0;
		int anio=0;
		//Calendar fechaDeNacimento;
		
		System.out.println("Ingrese nombre de Persona: ");
		String nombre = scanner.nextLine();
		persona.setNombre(nombre);
		
		correcto = false;
		while (!correcto) {
			System.out.println("Ingrese dia de Nacimiento: [1-31]");
			dia = scanner.nextInt();
			if (dia>=1 && dia<=31) {
				correcto = true;
			}else {
				System.out.println("Ingrese un dia entre [1-31]");
			}
			scanner.nextLine();
		}
		
		correcto = false;
		while (!correcto) {
			System.out.println("Ingrese mes de Nacimiento: [1-12]");
			mes = scanner.nextInt();
			if (mes>=1 && mes<=12) {
				correcto = true;
			}else {
				System.out.println("Ingrese un mes entre [1-12]");
			}
			scanner.nextLine();
		}
		
		System.out.println("Ingrese el año de nacimiento: [YYYY]");
		anio = scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		GregorianCalendar fechaDeNaciemnto = new GregorianCalendar(anio,mes-1, dia,0,0,0);
		persona.setFechaDeNacimiento(fechaDeNaciemnto);

		//Mostrar datos
		persona.mostrarDatosPersona();

	}

}

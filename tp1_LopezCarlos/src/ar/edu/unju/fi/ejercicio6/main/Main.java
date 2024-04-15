package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {
	
	static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		/*
		 Construir un objeto perteneciente a la clase Persona utilizando el constructor por defecto. 
		 Una vez creado el objeto mostrar el mismo por la consola.
		 Mostrar todos los datos, incluyendo la edad y si es mayor de edad.
	   */
		/*
		System.out.println("Persona1");
		Persona persona1 = new Persona();
		ingresarDatosDNI(persona1);
		ingresarDatosNombre(persona1); 
		ingresarDatosFechaNacimiento(persona1);
		ingresarDatosProvincia(persona1);
		System.out.println("Datos Personales de Persona 1");
		System.out.println("-----------------------------");
		persona1.mostrarDatos();
		*/
		System.out.println("Persona1");
		Persona persona1 = new Persona();
		ingresarDatosPersona1(persona1);
		persona1.mostrarDatos();
		System.out.println();
		
		/*
		 *Construir un objeto perteneciente a la clase Persona utilizando el constructor
		parametrizado. 
		Una vez creado el objeto mostrar el mismo por la consola.
		M ostrar todos los datos, incluyendo la edad y si es mayor de edad).
		 * */
	
		System.out.println("Persona2");
		Persona persona2 = new Persona();
		ingresarDatosPersona2(persona2);
		System.out.println();
		
		/*
		 *Construir un objeto perteneciente a la clase Persona utilizando el constructor que lleva 
		 *como parámetros el dni, nombre y fecha de nacimiento. 
		 *Mostrar el mismo por la consola.
		 *Mostrar todos los datos, incluyendo la edad y si es mayor de edad).
		 * */
		
		System.out.println("Persona3");
		Persona persona3 = new Persona();
		ingresarDatosPersona3(persona3);
		System.out.println();	
	}
	/*
	public static void ingresarDatosDNI(Persona persona) {
		System.out.println("Ingrese DNI de la Persona: ");
		persona.setDni(scanner.next());
	}
	
	public static void ingresarDatosNombre( Persona persona) {
		System.out.println("Ingrese Nombre de la Persona: ");
		persona.setNombre(scanner.next());
	}
	
	public static void ingresarDatosFechaNacimiento( Persona persona) {
		System.out.println("Ingrese el dia de Nacimiento: ");
		int dia = scanner.nextInt();
		System.out.println("Ingrese el mes de Nacimiento: ");
		int mes = scanner.nextInt();
		System.out.println("Ingrese el año de Nacimiento: ");
		int anio = scanner.nextInt();
		persona.setFechaNacimiento(LocalDate.of(anio, mes, dia));
		
	}
	
	public static void ingresarDatosProvincia( Persona persona) {
		System.out.println("Ingrese la provincia de la Persona: ");
		persona.setProvincia(scanner.next());
	}
	*/
	
	public static void ingresarDatosPersona1(Persona persona) {
		persona.setDni(ingresarDatosDNI() );
		persona.setNombre(ingresarDatosNombre( ));
		System.out.println("Ingrese el dia de Nacimiento: ");
		int dia = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese el mes de Nacimiento: ");
		int mes = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese el año de Nacimiento: ");
		int anio = scanner.nextInt();
		scanner.nextLine();
		persona.setFechaNacimiento(LocalDate.of(anio, mes, dia));
		persona.setProvincia(ingresarDatosProvincia());
		System.out.println("-----------------------------");
		System.out.println("Datos Personales de Persona 1");
		System.out.println("-----------------------------");
		
	}
	
	public static void  ingresarDatosPersona2(Persona persona) {
		String dni = ingresarDatosDNI();
		String nombre = ingresarDatosNombre( );
		System.out.println("Ingrese el dia de Nacimiento: ");
		int dia = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese el mes de Nacimiento: ");
		int mes = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese el año de Nacimiento: ");
		int anio = scanner.nextInt();
		scanner.nextLine();
		String provincia = ingresarDatosProvincia();
		persona = new Persona(dni, nombre, LocalDate.of(anio, mes, dia), provincia);
		System.out.println("-----------------------------");
		System.out.println("Datos Personales de Persona 2");
		System.out.println("-----------------------------");
		persona.mostrarDatos();
		
	}
	
	public static void  ingresarDatosPersona3(Persona persona) {
		String dni = ingresarDatosDNI();
		String nombre = ingresarDatosNombre( );
		System.out.println("Ingrese el dia de Nacimiento: ");
		int dia = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese el mes de Nacimiento: ");
		int mes = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ingrese el año de Nacimiento: ");
		int anio = scanner.nextInt();
		scanner.nextLine();
		persona = new Persona(dni, nombre, LocalDate.of(anio, mes, dia));
		System.out.println("-----------------------------");
		System.out.println("Datos Personales de Persona 3");
		System.out.println("-----------------------------");
		persona.mostrarDatos();
		
	}
	
	
	public static String ingresarDatosDNI() {
		System.out.println("Ingrese DNI de la Persona: ");
		String dni = scanner.nextLine();
		return dni;
	}
	
	public static String ingresarDatosNombre( ) {
		System.out.println("Ingrese Nombre de la Persona: ");
		String nombre = scanner.nextLine();
		return nombre;
	}
	
	/*public static void ingresarDatosFechaNacimiento( Persona persona) {
		System.out.println("Ingrese el dia de Nacimiento: ");
		int dia = scanner.nextInt();
		System.out.println("Ingrese el mes de Nacimiento: ");
		int mes = scanner.nextInt();
		System.out.println("Ingrese el año de Nacimiento: ");
		int anio = scanner.nextInt();
		persona.setFechaNacimiento(LocalDate.of(anio, mes, dia));
		
	}*/
	
	public static String ingresarDatosProvincia() {
		System.out.println("Ingrese la provincia de la Persona: ");
		String provincia = scanner.nextLine();
		return provincia;
	}

}

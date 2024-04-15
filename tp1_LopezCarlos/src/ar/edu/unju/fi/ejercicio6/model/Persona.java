package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	/**/
	public int calcularEdad(LocalDate fechaNacimiento) {
		return Period.between(fechaNacimiento,LocalDate.now()).getYears();
	}
	/**/
	public boolean verificarSiEsMayorDeEdad(int edad){
		return edad>=18;
	}
	
	/**/
	public void mostrarDatos() {
		//Mostrar Leyenda Mayorde edad o no
		
		String leyendaMayorDeEdad = (verificarSiEsMayorDeEdad(calcularEdad(fechaNacimiento))==true?
			"La persona ingresada es mayor de edad":"La persona ingresada es menor de edad");
		System.out.println(String.format("Numero de DNI: %s %n" +
										  "Nombre: %s  %n"+
										  "Fecha de Nacimiento: %s %n"+
										  //"Fecha de Nacimiento: %tA %<td de %<tB de %<tY %n"+
										  "Verificacion de edad: %s %n" +
										  "Provincia de la persona: %s"
										  , dni, nombre, fechaNacimiento, leyendaMayorDeEdad, provincia));
		System.out.println();
	}

}

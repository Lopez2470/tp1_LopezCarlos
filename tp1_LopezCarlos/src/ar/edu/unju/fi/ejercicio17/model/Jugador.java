package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	private String nacionalidad;
	private float estatura;
	private float peso;
	private String posicion;
	
	public Jugador() {
	}

	public Jugador(String nombre, String apellido, LocalDate fechaDeNacimiento, String nacionalidad, float estatura,
			float peso, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	//Calcular edad
	public int calcularEdad() {
		return Period.between(fechaDeNacimiento,LocalDate.now()).getYears();
	}
	
	//Formatear la fecha de nacimiento
	public String mostrarFechaFormateada() {
		String fechaSalida;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return fechaSalida = fechaDeNacimiento.format(dtf);	
	}
	
	//Mostrar Datos de un Jugador
	public void mostrarDatosDeUnJugador() {
		System.out.println("          Datos del Jugador");
		System.out.println("-------------------------------------------");
		System.out.println("Nombre del Jugador : "+this.nombre + " " +this.apellido );
		System.out.println("Fecha de Nacimiento del Jugador : "+mostrarFechaFormateada());
		System.out.println("Edad del Jugador : "+calcularEdad() + " años.");
		System.out.println("Nacionalidad del Jugador : "+this.nacionalidad);
		System.out.println("Estatura del Jugador : "+this.estatura + " cm.");
		System.out.println("Peso del Jugador : "+this.peso + " kg.");
		System.out.println("Posicion del Jugador : "+this.posicion);
		System.out.println("-------------------------------------------");

	}

	@Override
	public String toString() {
		return "  " + apellido + ", " + nombre +  "         " + mostrarFechaFormateada() +  "    " + calcularEdad();
	}
	
	
}

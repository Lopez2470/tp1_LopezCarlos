package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private Float salario;
	
	/*
	 * Decalaracion de Constantes
	 * */
	final Float SALARIO_MINIMO=210000.0f;
	final Float AUMENTO_MERITO=20000.0f;
	
	/*
	 * Constructores
	 * */
	public Empleado() {
	}

	public Empleado(String nombre, int legajo, Float salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		/*
		 * Asignacion del salario
		 * */
		this.salario = (salario >= SALARIO_MINIMO)? salario: SALARIO_MINIMO;
	}
	
	/*
	 * Getters 'n Setters
	 * */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}
	/*
	 * Método que permita mostrar los datos del empleado,
	 * */
	public void mostrarDatosDelEmpleado() {

		
		System.out.println("---------------------------------------");
		System.out.println("Nombre del empleado: " +nombre);
		System.out.println("Nro de Legajo del empleado: "+legajo);
		System.out.println("Salario del empleado: "+salario);
		System.out.println("---------------------------------------");
		/*
		System.out.println("---------------------------------------");
		System.out.println(String.format("Nombre del empleado: %s %n",
                						"Legajo: %d %n",
                						"Salario $: %.2f %n", 
                						this.nombre, legajo, salario));
                						*/
	}
	/*
	 * Metodo que permite dar un aumento al salario del empleado.
	 * */
	public void aumentarSalario() {
		this.salario += AUMENTO_MERITO;
	}

}

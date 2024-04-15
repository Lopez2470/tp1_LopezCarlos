package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
    private int codigo;
    private double precio;
    private Byte descuento;
    
  public Producto() {
}

public Producto(String nombre, int codigo, double precio, Byte descuento) {
	this.nombre = nombre;
	this.codigo = codigo;
	this.precio = precio;
	this.descuento = descuento;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public Byte getDescuento() {
	return descuento;
}

public void setDescuento(Byte descuento) {
	this.descuento = descuento;
}  
  
 public double calcularDescuento() {
	return precio - (descuento*precio/100);
 } 
 
 public void mostrarDatos() {
	 System.out.println("----------------------------------");
	 System.out.println("Nombre del Producto: " + nombre);
	 System.out.println("Código del Producto: " + codigo);
	 System.out.println("Precio del Producto: $" + precio);
	 System.out.println("Descuento del Producto: " + descuento+"%");
	 if (descuento == 0) {
		 System.out.println("El Producto no tiene descuento");
		 System.out.println("Precio final del Producto: $" +precio);
	 } else {
		 System.out.println("El producto con descuento es : $" + calcularDescuento());
	 }
	 System.out.println("----------------------------------");
 }
    
}

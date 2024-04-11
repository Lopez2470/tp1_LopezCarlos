package ar.edu.unju.fi.ejercicio2;

public class Main {

	public static void main(String[] args) {
		/* Declare variables que permitan almacenar los siguientes datos en el lenguaje Java:
			- El nombre de un país.
			- La edad de una persona.
			- La altura de un edificio.
			- El precio de un producto de supermercado.
			- Número de teléfono.
			- El cálculo de coseno de 0.5
		 */
		String nombrePais;
        byte edadPersona;
        double alturaEdificio;
        float precioProducto;
        String numeroTelefono;
        double valorCoseno;
        
        //Asigne valores a cada variable
        nombrePais="Brazil";
        edadPersona=40;
        alturaEdificio=35722222.05;
        precioProducto=1000.50f;
        numeroTelefono="3884123456";
        valorCoseno=Math.cos(0.5);
        
        //muéstrelas por consola.
        System.out.println(String.format("Nombre de Pais ingresado: %s %n" + 
        								 "Edad de una Persona ingresada: %d años %n"+
        								 "Altura de un Edificio ingresada: %.2f metros %n"+
        								 "Precio de un Producto ingresado: $%.2f %n"+
        								  "Numero telefonico Ingresado: %s %n"+
        								  "Valor del coseno de 0.5: %.2f", nombrePais, edadPersona, alturaEdificio,
        								  precioProducto, numeroTelefono, valorCoseno));
        
        
	}

}

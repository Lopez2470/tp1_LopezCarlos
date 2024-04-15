package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Producto producto = new  Producto();
		
		for (int i = 1; i <= 3; i++){
			System.out.println("Ingresar el nombre del producto: ");
			producto.setNombre(scanner.nextLine());
						
			System.out.println("Ingresar el código del producto: ");
			producto.setCodigo(scanner.nextInt());
			scanner.nextLine();
			
			System.out.println("Ingresar el precio del producto: ");
			producto.setPrecio(scanner.nextDouble());
			scanner.nextLine();
			
			boolean correcto = false;
			while (!correcto) {
				System.out.println("Ingresar el descuento del producto entre [0-50%]: ");
				byte descuento = scanner.nextByte();
				scanner.nextLine();
				if (descuento >= 0 && descuento <= 50){
					producto.setDescuento(descuento);
					correcto = true;
				}else {
					System.out.println("El descuento debe estar en el rango [0-50]");
				}
			}
			
			producto.mostrarDatos();
		}
		
		scanner.close();


	}

}

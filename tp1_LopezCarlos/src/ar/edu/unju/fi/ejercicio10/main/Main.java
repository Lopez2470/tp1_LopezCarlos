package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++)  {
			Pizza pizza = new Pizza();
			System.out.println("************* Pizza " + i + " *************");
			//Diametro de la pizza
			boolean correcto = false;
			while (!correcto) {
				System.out.println("Ingresar el diametro de la pizza [20-30-40]: ");
				byte diametro = scanner.nextByte();
				scanner.nextLine();
				if (diametro == 20 || diametro == 30 || diametro == 40){
					pizza.setDiametro(diametro);
					correcto = true;
				}else {
					System.out.println("Diametros disponibles: [20-30-40]");
				}
			}
			//ingredientes especiales
			correcto = false;
			while (!correcto) {
				System.out.println("Pizza con ingredientes especiales?");
				System.out.println("Si: Ingrese [true],  No: Ingrese [false] :");
				String ingredEspec = scanner.nextLine().toLowerCase();

				if (ingredEspec.equals("false") || ingredEspec.equals("true")){
				//if (Boolean.valueOf(ingredEspec) == false || Boolean.valueOf(ingredEspec) == true){	
					pizza.setIngredientesEspeciales(Boolean.parseBoolean(ingredEspec.toLowerCase()));
					correcto = true;
				}else {
					System.out.println("Debe ingresar: Si: [true], ó  No: [false] :");
				}
			}
			//Calcular el Area
			pizza.setArea(pizza.calcularArea());
			
			//Calcular el precio
			pizza.setPrecio(pizza.calcularPrecio());
			
			//Mostrar los resultados
			System.out.println("---------------------------------------");
			System.out.println("** Pizza " + i + " **");
			pizza.mostrarResultados();	
		}
	}

}

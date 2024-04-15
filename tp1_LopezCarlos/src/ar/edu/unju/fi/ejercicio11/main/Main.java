package ar.edu.unju.fi.ejercicio11.main;

public class Main {

	public static void main(String[] args) {
		/*
		 * Utilice la estructura de control iterativa for para mostrar por consola una secuencia numérica.
		 * Las únicas variables que se utilizan son i, j tanto en la sección de inicialización e incremento.
		 * 	j inicia en 40 e i inicia en 2.
		 * Si el valor de j es negativo se finaliza.
		 * La serie de números se imprime en una sola línea.
		 * */
		
		for (int j = 40,  i=2; j>0; j--, i++) {
			System.out.print(j*i + " ");
		}
		
	}

}

package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	
private int n;
	
	public CalculadoraEspecial() {
	}

	public CalculadoraEspecial(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int calcularSumatoria(int numero) {
		int sumatoria=0;
		for (int i = 1; i <= numero; i++) {
			//Se usa el cast para realizar la division
			sumatoria += (int) (Math.pow((i*(i+1)/2), 2));
		}
		return sumatoria;
	}
	
	public int calcularProductoria(int numero) {
		int productoria=1;
		for (int i = 1; i <= numero; i++) {
			productoria *= i*(i+4);
		}
		return productoria;
	}

}

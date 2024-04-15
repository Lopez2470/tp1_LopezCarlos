package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
    private int precio;
    private double area;
    private boolean ingredientesEspeciales;

    private final int ADICIONAL_INGREDIENTES_ESPECIALES_20 = 500;
    private final int ADICIONAL_INGREDIENTES_ESPECIALES_30 = 750;
    private final int ADICIONAL_INGREDIENTES_ESPECIALES_40 = 1000;
    
    
    private final int PRECIO_DIAMETRO_20 = 4500;
    private final int PRECIO_DIAMETRO_30 = 4800;
    private final int PRECIO_DIAMETRO_40 = 5500;
    
    public Pizza() {
	}

	public Pizza(int diametro, int precio, double area, boolean ingredientesEspeciales) {
		this.diametro = diametro;
		this.precio = precio;
		this.area = area;
		this.ingredientesEspeciales = ingredientesEspeciales;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
    
    public int calcularPrecio() {
    	int precioFinal=0;
    	switch(this.diametro) {
    	  case 20:
    		  precioFinal = (ingredientesEspeciales)? (PRECIO_DIAMETRO_20 + ADICIONAL_INGREDIENTES_ESPECIALES_20): PRECIO_DIAMETRO_20 ;
    	    break;
    	  case 30:
    		precioFinal = (ingredientesEspeciales)? (PRECIO_DIAMETRO_30 + ADICIONAL_INGREDIENTES_ESPECIALES_30): PRECIO_DIAMETRO_30 ;
    		break;
    	  case 40:
    		precioFinal = (ingredientesEspeciales)? (PRECIO_DIAMETRO_40 + ADICIONAL_INGREDIENTES_ESPECIALES_40): PRECIO_DIAMETRO_40 ;
    	    break;
    	}
    	return precioFinal;
    }
    
    public double calcularArea() {
    	//double areaCirculo = Math.PI*Math.pow(diametro/2, 2);
    	return Math.PI*Math.pow(diametro/2, 2);
    }	
    
    public void mostrarResultados() {
    	
    	System.out.println("Diametro: " + this.diametro);
    	System.out.println("Ingredientes especiales: " + this.ingredientesEspeciales);
    	System.out.println("Precio pizza: " + this.precio);
    	System.out.println("Area de la pizza: "+ this.area);
    	System.out.println("---------------------------------------");
    }
    
    
}

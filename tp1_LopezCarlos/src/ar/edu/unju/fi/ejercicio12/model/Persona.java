package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
	private String nombre;
    private Calendar fechaDeNacimiento;
    
    public Persona() {
	}

	public Persona(String nombre, Calendar fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Calendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
    
    public long calcularEdad() {
    	Calendar ahora = Calendar.getInstance();
    	long edad = (ahora.getTimeInMillis() - fechaDeNacimiento.getTimeInMillis())
                / 1000 / 60 / 60 / 24/365;
    	return edad;
    }
    
    public String calcularSignoZodiacal() {
    	
    	int dia = fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);
        int mes = fechaDeNacimiento.get(Calendar.MONTH);

        switch (mes) {
            case 0:  {
                return ((dia < 20)?"Capricornio":"Acuario");
            }
            case 1: {
                return ((dia < 19)?"Acuario":"Piscis");
            }
            case 2: {
                return ((dia < 21)?"Piscis":"Aries");
            }
            case 3: {
                return ((dia < 20)?"Aries":"Tauro");
            }
            case 4: {
            	return ((dia < 21)?"Tauro":"Géminis");
            }
            case 5: {
            	return ((dia < 21)?"Géminis":"Cáncer");
            }
            case 6: {
            	return ((dia < 23)?"Cáncer":"Leo");
            }
            case 7: {
            	return ((dia < 23)?"Leo":"Virgo");
            }
            case 8: {
            	return ((dia < 23)?"Virgo":"Libra");
            }
            case 9: {
            	return ((dia < 23)?"Libra":"Escorpio");
            }
            case 10: {
            	return ((dia < 22)?"Escorpio":"Sagitario");
            }
            case 11: {
            	return ((dia < 22)?"Sagitario":"Capricornio");
            }
            //Si no agrego el default me marca error.
            default: {
                return "";
            }
        }
    }
    
    public String calcularEstacion() {

    	//Verano
    	Calendar fechaFinVerano = Calendar.getInstance();
    	fechaFinVerano.set(fechaDeNacimiento.get(Calendar.YEAR), 2, 20,0,0,0);
    	Calendar fechaInicioVerano = Calendar.getInstance();
    	fechaInicioVerano.set(fechaDeNacimiento.get(Calendar.YEAR), 11, 21,0,0,0);
    	
    	//Otoño
    	Calendar fechaInicioOtonio = Calendar.getInstance();
    	fechaInicioOtonio.set(fechaDeNacimiento.get(Calendar.YEAR), 2, 21,0,0,0);
    	Calendar fechaFinOtonio = Calendar.getInstance();
    	fechaFinOtonio.set(fechaDeNacimiento.get(Calendar.YEAR), 5, 20,0,0,0);
    	
    	//Invierno
    	Calendar fechaFinIvierno = Calendar.getInstance();
    	fechaFinIvierno.set(fechaDeNacimiento.get(Calendar.YEAR), 8, 20,0,0,0);
    	Calendar fechaInicioInvierno = Calendar.getInstance();
    	fechaInicioInvierno.set(fechaDeNacimiento.get(Calendar.YEAR), 5, 21,0,0,0);
    	
    	//Primavera
    	Calendar fechaInicioPrimavera = Calendar.getInstance();
    	fechaInicioPrimavera.set(fechaDeNacimiento.get(Calendar.YEAR), 8, 21,0,0,0);
    	Calendar fechaFinPrimavera = Calendar.getInstance();
    	fechaFinPrimavera.set(fechaDeNacimiento.get(Calendar.YEAR), 11, 20,0,0,0);
    	//System.out.println("FinDePrimavera"+fechaFinPrimavera.getTime());
    	  	
    	String estacion="";
    	//System.out.println("FEchaNac"+fechaDeNacimiento.getTime());
    	//Estacion Verano
    	if (fechaDeNacimiento.before(fechaInicioOtonio) /*&& fechaDeNacimiento.before(fechaFinPrimavera)*/) {
    		estacion = "Verano";
    	}
    	//System.out.println(estacion);
     	
    	//Estacion Otoño
    	if (fechaDeNacimiento.after(fechaFinVerano) && fechaDeNacimiento.before(fechaInicioInvierno)){
    		estacion = "Otoño";
    	}
    	//System.out.println(estacion);
    	//Estacion Invierno
    	if (fechaDeNacimiento.after(fechaFinOtonio) && fechaDeNacimiento.before(fechaInicioPrimavera)){
    		estacion = "Invierno";
    	}
    	//System.out.println(estacion);
    	//Estacion Primavera
    	if (fechaDeNacimiento.after(fechaFinIvierno) && fechaDeNacimiento.before(fechaInicioVerano)){
    		estacion = "Primavera";
    	}
    	//System.out.println(estacion);
    	
    	if(fechaDeNacimiento.after(fechaFinPrimavera)) {
    		estacion = "Verano";
    	}
    	return estacion;
    }
    
    public void mostrarDatosPersona() {
    	//Formatear la salida del calendar variable 'fechaDeNacimento'
    	String fechaNacimientoFormatted;
    	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
    	fechaNacimientoFormatted = sdf.format(fechaDeNacimiento.getTime());
    	
    	System.out.println(String.format("Nombre: %s %n"+
    			"Fecha nacimiento: %s %n"+
    			"Edad: %d años %n"+
    			"Signo del Zodíaco: %s %n"+
    			"Estación: %s"
    			,this.nombre, fechaNacimientoFormatted, calcularEdad(), calcularSignoZodiacal(), 
    			calcularEstacion()));
    }
}

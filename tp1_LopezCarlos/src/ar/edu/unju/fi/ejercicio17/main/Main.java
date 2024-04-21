package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	
	static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		
		//Scanner scanner = new Scanner(System.in);
		List<Jugador> jugadores = new ArrayList<Jugador>();
        byte opcion = 0;

        while (opcion !=8) {
        	System.out.println("------------------------");
            System.out.println("          MENU");
            System.out.println("------------------------");
            System.out.println("1- Alta de jugador.");
            System.out.println("2- Mostrar datos del jugador.");
            System.out.println("3- Mostrar todos los jugadores ordenados por apellido.");
            System.out.println("4- Modificar los datos de un jugador.");
            System.out.println("5- Eliminar un jugador.");
            System.out.println("6- Mostrar cantidad total de jugadores.");
            System.out.println("7- Mostrar la cantidad de jugadores que pertenecen a una nacionalidad.");
            System.out.println("8- Salir del menu.");
            System.out.print("Ingrese una opción: ");

            try {
                opcion = scanner.nextByte();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1:
                        ingresarJugador(jugadores);
                        break;
                    case 2:
                       mostrarDatoDeUnJugador(jugadores);
                        break;
                    case 3:
                       ordenarJugadoresPorApellido(jugadores);
                        break;
                    case 4:
                        modificarDatosJugador(jugadores);
                        break;
                    case 5:
                        eliminarUnJugador(jugadores);
                        break;
                    case 6:
                    	System.out.println("--------------------------------------------------");
                        System.out.println("La cantidad de jugadores en el sistema es de :" + jugadores.size() );
                        System.out.println("--------------------------------------------------");
                        break;
                    case 7:
                        mostrarJugadoresPorNacionalidad(jugadores);
                        break;
                    case 8:
                        System.out.println("Salida del Menu");
                        break;
                    default:
                        System.out.println("Error: Ingrese una opcion correcta: [1-8].");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar numeros enteros.");
                scanner.nextLine(); 
            }   finally {
               // System.out.println("       Fin");
                
            }
        }
        scanner.close();
	}
	
	
	private static void ingresarJugador(List<Jugador> jugadores) {
        try {
        	String nombre="";
        	boolean correcto=false;
        	//Ingreso de nombre
        	while (!correcto) {
	            System.out.print("Ingrese el nombre del jugador: ");
	            nombre = scanner.nextLine();
	            if(nombre.isBlank()){
	            	System.out.println("Error: Debe ingresar un nombre");
	            }else {
	            	correcto=true;
	            }
        	}
        	
        	//Ingreso de apellido
        	String apellido="";
        	while (correcto) {
	            System.out.print("Ingrese el apellido del jugador: ");
	            apellido = scanner.nextLine();
	            if(apellido.isBlank()){
	            	System.out.println("Error: Debe ingresar un apellido");
	            }else {
	            	correcto=false;
	            }
         	}
        	
        	//Ingreso de fecha de nacimiento
        	//Ingreso del dia
        	int dia=0;
        	correcto = false;
    		while (!correcto) {
    			System.out.println("Ingrese dia de Nacimiento: [1-31]");
    			dia = scanner.nextInt();
    			if (dia>=1 && dia<=31) {
    				correcto = true;
    			}else {
    				System.out.println("Ingrese un dia entre [1-31]");
    			}
    			scanner.nextLine();
    		}
        	
        	//Ingreso del mes
    		int mes=0;
    		correcto = false;
    		while (!correcto) {
    			System.out.println("Ingrese mes de Nacimiento: [1-12]");
    			mes = scanner.nextInt();
    			if (mes>=1 && mes<=12) {
    				correcto = true;
    			}else {
    				System.out.println("Ingrese un mes entre [1-12]");
    			}
    			scanner.nextLine();
    		}
    		
    		//Ingreso del año
    		int anio=0;
    		System.out.println("Ingrese el año de nacimiento: [YYYY]");
    		anio = scanner.nextInt();
    		scanner.nextLine();
    		
    		LocalDate fechaDeNacimiento = LocalDate.of(anio, mes, dia);
    		
    		//Ingreso de nacionalidad
            System.out.print("Ingrese la nacionalidad del jugador: ");
            String nacionalidad = scanner.nextLine();
            
            //Ingreso de la estatura
            System.out.print("Ingrese la estatura del jugador [cm]: ");
            float estatura = scanner.nextFloat();
            scanner.nextLine();

            System.out.print("Ingrese el peso del jugador [kg]: ");
            float peso = scanner.nextFloat();
            scanner.nextLine();
            
            //Ingreso de posicion del jugador
            correcto=false;
            String posicion="";
            while(!correcto) {
	            System.out.print("Ingrese la posición del jugador [delantero, medio, defensa, arquero]: ");
	            posicion = scanner.nextLine().toLowerCase();
	            if (posicion.equals("delantero") || posicion.equals("medio") || posicion.equals("defensa") || posicion.equals("arquero"))
	            /*if(posicion == "delantero" || posicion == "medio" || posicion == "defensa" || 
	            		posicion == "arquero") */{
	            	correcto=true;
	            }else {
	            	System.out.println("Ingrese la opcion correcta de la posicion");
	            }
            }
            //Agregar un jugador a la lista
            Jugador jugador = new Jugador(nombre, apellido, fechaDeNacimiento, nacionalidad, estatura, peso, posicion);
            if (jugadores.add(jugador)) {
            	System.out.println("--------------------------------------");
            	System.out.println("Jugador dado de alta correctamente.");
            	System.out.println("Jugadores dados de alta: " + jugadores.size());
            	System.out.println("--------------------------------------");
            }else {
            	System.out.println("Error al dar de alta a un jugador");
            }
            
        } catch (Exception e) {
            System.out.println("Error al dar de alta al jugador");
        }
    }
	
	/******************************************************************************/
	//Mostrar datos de un jugador buscado
	private static void mostrarDatoDeUnJugador(List<Jugador> jugadores) {
		if (jugadores.isEmpty()) {
			System.out.println("No hay registros de jugadores");
		}else {
			//Ingreso de nombre y apellido del jugador
			String nombre="";
        	boolean correcto=false;
        	//Ingreso de nombre
        	while (!correcto) {
	            System.out.print("Ingrese el nombre del jugador a buscar: ");
	            nombre = scanner.nextLine();
	            if(nombre.isBlank()){
	            	System.out.println("Error: Debe ingresar un nombre");
	            }else {
	            	correcto=true;
	            }
        	}
        	//Ingreso de apellido
        	String apellido="";
        	while (correcto) {
	            System.out.print("Ingrese el apellido del jugador a buscar: ");
	            apellido = scanner.nextLine();
	            if(apellido.isBlank()){
	            	System.out.println("Error: Debe ingresar un apellido");
	            }else {
	            	correcto=false;
	            }
         	}
        	//Buscar jugador
        	Jugador jugador = buscarJugador(nombre, apellido, jugadores);
        	if (jugador != null) {
        		jugador.mostrarDatosDeUnJugador();
        	}else {
        		System.out.println("Jugador no encontrado.");
            }
		}	
	}
	//Buscar jugador
	private static Jugador buscarJugador(String nombre, String apellido, List<Jugador> jugadores) {
		Jugador auxJugador = new Jugador();
	    auxJugador=null;
        for (Jugador jug : jugadores) {
        	if (jug.getApellido().equals(apellido) && jug.getNombre().equals(nombre)) {
        		auxJugador = jug;
            }                
       }
       return auxJugador;
    }
	/***********************************************************************************/
	// Ordenar y mostrar los jugadores por apellido
   private static void ordenarJugadoresPorApellido(List<Jugador> jugadores) {
	   //Collections.sort(jugadores,Comparator.comparing(Jugador::getApellido));
	   if (jugadores.isEmpty()) {
			System.out.println("No hay registros de jugadores");
		}else {
		   jugadores.sort(Comparator.comparing(Jugador::getApellido));
		   
		   System.out.println("Apellido y Nombre   Fecha de Nac.     Edad");
		   for (Jugador jug : jugadores) {
			   System.out.println(jug);
				//System.out.println("\n Jugador : "+jug.getApellido()+"   posicion : "+jug.getPosicion());
			}
		}
	}
   /*****************************************************************/
   //Modificar datos de jugador
   private static void modificarDatosJugador(List<Jugador> jugadores) {
	   if (jugadores.isEmpty()) {
			System.out.println("No hay registros de jugadores");
		}else {
			//Ingreso de nombre y apellido del jugador
			String nombre="";
       	boolean correcto=false;
       	//Ingreso de nombre
       	while (!correcto) {
	            System.out.print("Ingrese el nombre del jugador a buscar: ");
	            nombre = scanner.nextLine();
	            if(nombre.isBlank()){
	            	System.out.println("Error: Debe ingresar un nombre");
	            }else {
	            	correcto=true;
	            }
       	}
       	//Ingreso de apellido
       	String apellido="";
       	while (correcto) {
	            System.out.print("Ingrese el apellido del jugador a buscar: ");
	            apellido = scanner.nextLine();
	            if(apellido.isBlank()){
	            	System.out.println("Error: Debe ingresar un apellido");
	            }else {
	            	correcto=false;
	            }
        	}
       	//Buscar jugador
       	Jugador jugador = buscarJugador(nombre, apellido, jugadores);
       	if (jugador != null) {
       		jugador.mostrarDatosDeUnJugador();
       		System.out.println("Datos a modificar");
       		System.out.println("- Nacionalidad");
			System.out.println("- Estatura");
			System.out.println("- Peso");
			System.out.println("- Posicion");
			System.out.println("Jugador: " + nombre + " " + apellido);
       		
       		//Ingreso de nacionalidad
            System.out.print("Ingrese la nacionalidad del jugador: ");
            String nacionalidad = scanner.nextLine();
            
            //Ingreso de la estatura
            System.out.print("Ingrese la estatura del jugador [cm]: ");
            float estatura = scanner.nextFloat();
            scanner.nextLine();

            System.out.print("Ingrese el peso del jugador [kg]: ");
            float peso = scanner.nextFloat();
            scanner.nextLine();
            
            //Ingreso de posicion del jugador
            correcto=false;
            String posicion="";
            while(!correcto) {
	            System.out.print("Ingrese la posición del jugador [delantero, medio, defensa, arquero]: ");
	            posicion = scanner.nextLine().toLowerCase();
	            if (posicion.equals("delantero") || posicion.equals("medio") || posicion.equals("defensa") || posicion.equals("arquero"))
	            /*if(posicion == "delantero" || posicion == "medio" || posicion == "defensa" || 
	            		posicion == "arquero") */{
	            	correcto=true;
	            }else {
	            	System.out.println("Ingrese la opcion correcta de la posicion");
	            }
            }
       		//Guardar las modificaciones
            jugador.setNacionalidad(nacionalidad);
            jugador.setEstatura(estatura);
            jugador.setPeso(peso);
            jugador.setPosicion(posicion);
            System.out.println("Modificacion correcta");
       	
       	}else {
       		System.out.println("Jugador no encontrado.");
           }
		}	
	   	   
   }
   /*********************************************************************************/
   //Eliminar un jugador
   private static void eliminarUnJugador(List<Jugador> jugadores) {
	   if (jugadores.isEmpty()) {
			System.out.println("No hay registros de jugadores");
		}else {
			//Ingreso de nombre y apellido del jugador
			String nombre="";
	      	boolean correcto=false;
	      	//Ingreso de nombre
	      	while (!correcto) {
		            System.out.print("Ingrese el nombre del jugador a buscar: ");
		            nombre = scanner.nextLine();
		            if(nombre.isBlank()){
		            	System.out.println("Error: Debe ingresar un nombre");
		            }else {
		            	correcto=true;
		            }
	      	}
	      	//Ingreso de apellido
	      	String apellido="";
	      	while (correcto) {
		            System.out.print("Ingrese el apellido del jugador a buscar: ");
		            apellido = scanner.nextLine();
		            if(apellido.isBlank()){
		            	System.out.println("Error: Debe ingresar un apellido");
		            }else {
		            	correcto=false;
		            }
	       	}
	      	//Eliminar el jugador
	      	Iterator<Jugador> iterator = jugadores.iterator();
	      	while(iterator.hasNext()) {
	      		Jugador j = iterator.next();
	      		if (j.getNombre().equalsIgnoreCase(nombre) && j.getApellido().equalsIgnoreCase(apellido)) {
	      			j.mostrarDatosDeUnJugador();
	      			iterator.remove();
	      			System.out.println("Registro del jugador eliminado");
	      		}else {
	      			System.out.println("Jugador no encontrado");
	      		}
	      			
	      	}
	      	
      	
		}
	   }
   /**********************************************************************************/
   
   //contar
   private static void mostrarJugadoresPorNacionalidad(List<Jugador> jugadores) {
	   if (!(jugadores.isEmpty())) {
		   String nacionalidad="";
		   boolean control= false;
		   //System.out.println(jugadores.stream().filter(j->j.getNacionalidad().equals(nacionalidad)).count());
		 
		   System.out.println("Ingresar la nacionalidad a filtrar: ");
		   nacionalidad = scanner.nextLine().toLowerCase();
		   for (Jugador jug : jugadores) {
			   if(jug.getNacionalidad().equals(nacionalidad)) {
				   System.out.println("Jugador: " + jug.getNombre() + " " + jug.getApellido() + "  -  Nacionalidad: " + jug.getNacionalidad());
				   control=true;
				} 
		   }
		   if (!control) {
			   System.out.println("No hay jugadores de la nacionalidad " + nacionalidad);
		   }
	   } else {
		   System.out.println("No hay registros de jugadores");
	   }
	   
   } 
   
   }

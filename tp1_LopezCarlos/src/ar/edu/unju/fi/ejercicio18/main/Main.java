package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	static Scanner scanner= new Scanner(System.in);
	static List <Pais> paises = new ArrayList<>();
	//List<DestinoTuristico> destinoTuristico = new ArrayList<DestinoTuristico>();

	public static void main(String[] args) {
		//List <Pais> paises = new ArrayList<Pais>();	
		List<DestinoTuristico> destinoTuristico = new ArrayList<DestinoTuristico>();
		//Precargar paises
		paises.add(new Pais("01", "Argentina"));
		paises.add(new Pais("02", "Bolivia"));
		paises.add(new Pais("03", "Brasil"));
		paises.add(new Pais("04", "Chile"));
		paises.add(new Pais("05", "Colombia"));
		paises.add(new Pais("06", "Ecuador"));	
		paises.add(new Pais("07", "Uruguay"));	
		paises.add(new Pais("11", "España"));
		//
		
		byte opcion = 0;

        while (opcion !=9) {
        	System.out.println("1 - Alta de destino turistico.");
			System.out.println("2 - Mostrar todos los destinos turisticos.");
			System.out.println("3 - Modificar el pais de un destino turistico.");
			System.out.println("4 - Limpiar arraylist de destinos turisticos.");
			System.out.println("5 - Eliminar un destino turistico.");
			System.out.println("6 - Mostrar destinos turisticos ordenados por nombre.");
			System.out.println("7 - Mostrar todos los paises.");
			System.out.println("8 - Mostrar los destinos turisticos que pertenecen a un pais.");
			System.out.println("9 - Salir.");
			System.out.println("Ingrese una opcion: ");
            

            try {
                opcion = scanner.nextByte();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1:
                       ingresarDestinoTuristico(destinoTuristico);
                        break;
                    case 2:
                        mostrarDestinos(destinoTuristico);
                        break;
                    case 3:
                        modificarPaisDT(destinoTuristico);
                        break;
                    case 4:
                        limpiarDestinosT(destinoTuristico);
                    case 5:
                    	eliminarDestinosT(destinoTuristico);
                        break;
                    case 6:
                    	mostrarDestinosTuristicosOrdenados(destinoTuristico);
                        break;
                    case 7:
                       mostrarPaises(paises);
                        break;
                    case 8:
                    	mostrarDTPorPais(destinoTuristico);
                        break;   
                    case 9:
                        System.out.println("Salida del Menu");
                        break;
                    default:
                        System.out.println("Error: Ingrese una opcion correcta: [1-9].");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar numeros enteros.");
                scanner.nextLine(); 
            }   finally {
               
            }
        }
	}
	/*
	public static void precargarPaises() {
		//Precargar Pais		
		paises.add(new Pais("01", "Argentina"));
		paises.add(new Pais("02", "Bolivia"));
		paises.add(new Pais("03", "Brasil"));
		paises.add(new Pais("04", "Chile"));
		paises.add(new Pais("05", "Colombia"));
		paises.add(new Pais("06", "Ecuador"));	
		paises.add(new Pais("07", "Uruguay"));	
		paises.add(new Pais("11", "España"));	
	}
	*/
	//Agregar destino turnsitico
	static void ingresarDestinoTuristico(List<DestinoTuristico> destino) {
		 try {
			 
			//Ingreso de codigo de dt
			 String codigoDT="";
	         boolean correcto=false;
	         while (!correcto) {
	        	 System.out.print("Ingrese el codigo de destino turistico: ");
		         codigoDT = scanner.nextLine();
		         if(codigoDT.isBlank()){
		        	 System.out.println("Error: Debe ingresar el codigo");
		         }else {
		        	 correcto=true;
		         }
	         }
	       //Ingreso del nombre del dt
			 String nombreDT="";
	         correcto=false;
	         while (!correcto) {
	        	 System.out.print("Ingrese el nombre del destino turistico: ");
		         nombreDT = scanner.nextLine();
		         if(nombreDT.isBlank()){
		        	 System.out.println("Error: Debe ingresar el nombre");
		         }else {
		        	 correcto=true;
		         }
	         }
	         
	       //Ingreso del precio del dt
			 float precioDT=0;
	         correcto=false;
	         while (!correcto) {
	        	 System.out.print("Ingrese el precio del destino turistico: ");
	    
		         precioDT = scanner.nextFloat();
		         if(precioDT==0){
		        	 System.out.println("Error: Debe ingresar el precio");
		         }else {
		        	 correcto=true;
		        	 scanner.nextLine();
		         }
	         }
	       //Ingreso del pais del dt
	        Pais paisAux=null;
	        String codigoP="";
	     	do {
	     		System.out.println("Ingrese codigo del pais: ");
	     		codigoP = scanner.nextLine();
	     		for(Pais pais : paises ) {
	     			if(pais.getCodigo().equals(codigoP)) {
	     					paisAux = pais;
	     				}
	     		}
	     		if (paisAux == null) {
	     				System.out.println("Pais no Encontrado.");
	     				System.out.println("Intente otra vez.");
	     			}
	     		}while(paisAux == null);
	     	
	         //Ingreso de los dias
	     	int diasDT=0;
	         correcto=false;
	         while (!correcto) {
	        	 System.out.print("Ingrese la cantidad de dias: ");
	    
		         diasDT = scanner.nextInt();
		         if(diasDT==0){
		        	 System.out.println("Error: Debe ingresar los dias");
		         }else {
		        	 correcto=true;
		        	 scanner.nextLine();
		         }
	         }	 
	         DestinoTuristico dt = new DestinoTuristico(codigoDT, nombreDT, precioDT, paisAux, diasDT);
	            if (destino.add(dt)) {
	            	System.out.println("--------------------------------------");
	            	System.out.println("Destino Tursitico dado de alta correctamente.");
	            	System.out.println("Destinos Turisticos dados de alta: " + destino.size());
	            	System.out.println("--------------------------------------");
	            }else {
	            	System.out.println("Error al dar de alta a un jugador");
	            }
	         
	         //destino.add(new DestinoTuristico(codigoDT, nombreDT, precioDT, paisAux, diasDT));	        	
	        } catch (Exception e) {
	            System.out.println("Error al dar de alta");
	        }
		
	} 
	
	/**********************************************************/
	//Mostrar Destinos turisticos
	public static void mostrarDestinos(List<DestinoTuristico> destino) {
		if(destino.isEmpty()) {
			System.out.println("Sin registros de Destinos Turisticos");
		}else {
			System.out.println("Destinos turisticos");
			destino.forEach(d->System.out.println(d));
		}	
	}
	
	/**********************************************************/
	//Modificar pais de destino turistico
	public static void modificarPaisDT(List<DestinoTuristico> destino) {
		if(destino.isEmpty()) {
			System.out.println("Sin registros de Destinos Turisticos");
		}else {
			//Ingreso de codigo de dt
			String codigoDT="";
	        boolean correcto=false;
	        while (!correcto) {
	        	System.out.print("Ingrese el codigo de destino turistico: ");
		        codigoDT = scanner.nextLine();
		        if(codigoDT.isBlank()){
		        	System.out.println("Error: Debe ingresar el codigo");
		         }else {
		        	 correcto=true;
		         }
	        }
	        //Buscar codigo
	        DestinoTuristico destinoT = buscarDestino(codigoDT, destino);
	        if (destinoT != null) {
	        	System.out.println(destinoT.toString());
	        	//Modificar el pais del dt
		        Pais paisAux=null;
		        String codigoP="";
		     	do {
		     		System.out.println("Ingrese codigo del pais: ");
		     		codigoP = scanner.nextLine();
		     		for(Pais pais : paises ) {
		     			if(pais.getCodigo().equals(codigoP)) {
		     					paisAux = pais;
		     				}
		     		}
		     		if (paisAux == null) {
		     				System.out.println("Pais no Encontrado.");
		     				System.out.println("Intente otra vez.");
		     			}
		     	}while(paisAux == null);	
		     	
		     	//Modificar pais
		     	destinoT.setPais(paisAux);
		     	System.out.println("Codigo de Pais modificado");
		     	
	        	
	        }else {
	        	System.out.println("Codigo de Destino Turistico no encontrado");
	        }
	        
		}
	
		}
	
	/****************************************************/
	//Buscar destino
		private static DestinoTuristico buscarDestino(String codigoDT, List<DestinoTuristico> destino) {
			
			DestinoTuristico auxDestino = new DestinoTuristico();
		    auxDestino=null;
	        for (DestinoTuristico dt : destino) {
	        	if (dt.getCodigo().equals(codigoDT)) {
	        		auxDestino = dt;
	            }                
	       }
	       return auxDestino;
	    }
		
	/*******/
		//Limpiar el arrayList
		private static void limpiarDestinosT(List<DestinoTuristico> destino)  {
			if(destino.isEmpty()) {
				System.out.println("Sin registros de Destinos Turisticos");
			}else {
				destino.clear();
				System.out.println("Se eliminaron los registros de Destinos Turisticos");
			}
		}
		
		
		//Eliminar un Destino Turistico
		private static void eliminarDestinosT(List<DestinoTuristico> destino) {
			   if (destino.isEmpty()) {
					System.out.println("No hay registros de destinos turisticos");
				}else {
					///Ingreso de codigo de dt
					String codigoDT="";
			        boolean correcto=false;
			        while (!correcto) {
			        	System.out.print("Ingrese el codigo de destino turistico: ");
				        codigoDT = scanner.nextLine();
				        if(codigoDT.isBlank()){
				        	System.out.println("Error: Debe ingresar el codigo");
				         }else {
				        	 correcto=true;
				         }
			        }
			      
			        
			      	//Eliminar el Destino Turistico
			      	Iterator<DestinoTuristico> iterator = destino.iterator();
			      	while(iterator.hasNext()) {
			      		DestinoTuristico dt = iterator.next();
			      		if (dt.getCodigo().equals(codigoDT)) {
			      			//mostrar
			      			iterator.remove();
			      			System.out.println("Registro del Destino Turistico eliminado");
			      		}else {
			      			System.out.println("Codigo de Destino no encontrado");
			      		}
			      			
			      	}
			      	
		      	
				}
			   }
	/******/
	//Mostrar Destinos turisticos ordenados
		private static void mostrarDestinosTuristicosOrdenados(List<DestinoTuristico> destino) {
			if (destino.isEmpty()) {
					System.out.println("No hay registros de Destinos Turisticos");
				}else {
					destino.sort(Comparator.comparing(DestinoTuristico::getNombre));
				   			   
				   for (DestinoTuristico dt : destino) {
					   System.out.println(dt);
					}
				}
		}
		
		///***************************************/
		//Mostrar los paises
		private static void mostrarPaises(List<Pais> paises) {
			System.out.println("      Lista de Paises disponibles");
			paises.forEach(p->System.out.println(p));
		}
		
		/*********/
		//Mostrar destinos turisticos por pais
		 private static void mostrarDTPorPais(List<DestinoTuristico> destino) {
			   if (!(destino.isEmpty())) {
				   String codigoP="";
				   boolean control= false;
				 
				   System.out.println("Ingresar el codigo por el pais a mostrar: ");
				   codigoP = scanner.nextLine();
				   for (DestinoTuristico dt : destino) {
					   if(dt.getPais().getCodigo().equals(codigoP)) {
						   System.out.println(dt.toString());
						   control=true;
						} 
				   }
				   if (!control) {
					   System.out.println("No hay destinos turisticos de esa nacionalidad ");
				   }
			   } else {
				   System.out.println("No hay registros de Destinos Turisticos");
			   }
			   
		   } 
	
}

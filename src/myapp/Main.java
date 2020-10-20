package myapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        boolean salir = false;
        String opcion; 
        String usuario, password;     
    
        
        while (!salir) {           
            try { 
            	
                System.out.println("0. Inscripción Usuario");
                System.out.println("1. Ingresar Persona");
                System.out.println("2. Calcular IMC");
                System.out.println("3. Mostrar Listado");
                System.out.println("4. Salir");
                System.out.println("---------------------------");
                System.out.println("Escribe una de las opciones");             
                opcion = input.nextLine(); 
                switch (opcion) {
                   case "0": 
                	   String opcion0 = null;
                	   boolean salir0 = false;
                	   while (!salir0) {
                		   System.out.println("Inscripción de Usuario");
                           System.out.println("------------------------------");                         
                           System.out.println("Inserte Correo Electronico");                     
                           String newCorreo = input.nextLine();
                           System.out.println("Inserte Cotraseña Usuario");                 
                           String newPass = input.nextLine();
                           Usuario newUsuario = new Usuario(newCorreo, newPass);
                           System.out.println("------------------------------");
                           System.out.println("Usuario Registrado con Exito!!");
                           System.out.println("[v] Para Volver - [i] Ingresar Otro Usuario");
                           opcion0 = input.nextLine();
                           if (opcion0.equals("v")) {
                        	   salir0 = true;
                        	   break;  
                           }
                	   }	
                	   break;                                                   
                  case "1":
                	String opcion1 = null;
               	   	boolean salir1 = false;
               	   	while (!salir1) {
                        System.out.println("Ingrear Persona");
                        System.out.println("------------------------------");  
                        System.out.println("Datos Usuario Autenticado");
                        System.out.println("------------------------------"); 
                        System.out.println("Inserte Nombre");
                        String newName = input.nextLine();
                        System.out.println("Inserte Apellido");
                        String newApellido = input.nextLine();
                        System.out.println("Inserte Sexo [M] o [F]");
                        String newSexo = input.nextLine();
                        System.out.println("Fecha Nacimiento dd/mm/aaaa");
                        String newFecha = input.nextLine();
                        System.out.println("Atleta [A] - Persona Natural [N]");   
                        String newTipoPersona = input.nextLine();
                        Persona newPersona = new Persona(newName, newApellido, newSexo, newFecha, newTipoPersona);
                        System.out.println("------------------------------");  
                        System.out.println("Persona Registrada con Exito!!");
                        System.out.println("[v] Para Volver - [i] Ingresar Otra Persona");
                        opcion0 = input.next();
                        if (opcion1.equals("v")) {
                     	   salir1 = true;
                     	   break;  
                        	}
               	 		}
                        break;
                    case "2":
                        System.out.println("Calculo de IMC");
                        System.out.println("------------------------------"); 
                        System.out.println("Datos Usuario Autenticado");
                        System.out.println("------------------------------"); 
                        System.out.println("Fecha Actual dd/mm/aaaa");
                        String newFecha = input.nextLine();
                        System.out.println("Ingrese su Peso");
                        double newPeso = input.nextDouble();
                        System.out.println("Ingrese su Altura");
                        double newAltura = input.nextDouble();
                        System.out.println("-------------------------");
                        System.out.println("Su Indice de Masa Corporal");
                        break;
                    case "3":
                        System.out.println("Listado de Estados Nutricionales");
                        System.out.println("--------------------------------");
                        break;
                    case "4":
                    	System.out.println("Aplicacion Finalizada");
                    	System.out.println("--------------------------------");
                        salir = true;
                        break;
				default:
                        System.out.println("Solo valores entre 0 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor no Valido");
                input.next();
            }
        }
 
    }

}



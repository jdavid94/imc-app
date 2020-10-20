package myapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        boolean salir = false;
        String opcion;    
        Usuario newUsuario = null;
        
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
                           newUsuario = new Usuario(newCorreo, newPass);
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
               	   	boolean salir1 = false;
               	   	while (!salir1) {
               	   		if (newUsuario == null) {
               	   		System.out.println("Debe generar Usuario - Opcion [1]"); 
               	   		System.out.println("---------------------------------"); 
               	   		break;               	   		
               	   		}
	               	   	System.out.println("Debe Autenticarse");
	                    System.out.println("------------------------------");  
	                    System.out.println("Ingrese Correo");
	                    String correo = input.nextLine();
	                    System.out.println("Ingrese Password");
	                    String pass = input.nextLine();
	                    if (newUsuario.getCorreo().contentEquals(correo) && newUsuario.getPassword().contentEquals(pass)) {
	                        System.out.print("Usuario Valido");
	                        System.out.println("------------------------------"); 
	                        System.out.println("Ingrear Persona");
	                        System.out.println("------------------------------");  
	                        System.out.println("Datos Usuario Autenticado");
	                        System.out.println("------------------------------"); 
	                        System.out.println("Inserte Nombre");
	                        String newName = input.nextLine();
	                        System.out.println("Inserte Apellido");
	                        String newApellido = input.nextLine();
	                        System.out.println("Inserte Sexo [m] o [f]");
	                        String newSexo = input.nextLine();
	                        System.out.println("Fecha Nacimiento dd/mm/aaaa");
	                        String newFecha = input.nextLine();
	                        System.out.println("Atleta [a] - Persona Natural [n]");   
	                        String newTipoPersona = input.nextLine();	                        
	                        Persona newPersona = new Persona(newName, newApellido, newSexo, newFecha, newTipoPersona);
	                        newUsuario.setPersona(newPersona);
	                        System.out.println("------------------------------");  
	                        System.out.println("Persona Registrada con Exito!!");	
	                        salir0 = true;
	                        break;	                        
		                    } else {
		                        System.out.println("Error usuario o password no valido");
		                    }             	   		
                        }
                        break;
                    case "2":
                    	if (newUsuario == null) {
                   	   		System.out.println("Debe generar Usuario - Opcion [1]"); 
                   	   		System.out.println("---------------------------------"); 
                   	   		break;               	   		
                   	   	}
                    	System.out.println("Debe Autenticarse");
	                    System.out.println("------------------------------");  
	                    System.out.println("Ingrese Correo");
	                    String correo = input.nextLine();
	                    System.out.println("Ingrese Password");
	                    String pass = input.nextLine();
	                    if (newUsuario.getCorreo().contentEquals(correo) && newUsuario.getPassword().contentEquals(pass)) {
	                    	System.out.print("Usuario Valido");
	                    	System.out.print("Ficha de Usuario:");	                    	
	                        System.out.println("------------------------------"); 
	                        System.out.println("Nombre: " + newUsuario.getPersona().getNombre());
	                        System.out.println("Apellido: " + newUsuario.getPersona().getApellido());
	                        System.out.println("Fecha Nacimiento: " + newUsuario.getPersona().getFechaNacimiento());
	                        System.out.println("Sexo: " + newUsuario.getPersona().getSexo());
	                        System.out.println("Tipo Persona: " + newUsuario.getPersona().getTipoPersona());	                  
	                        System.out.println("------------------------------"); 
	                        System.out.println("Toma de Datos - IMC");
	                        System.out.println("------------------------------"); 
	                        System.out.println("Ingrese Fecha Actual dd/mm/aaaa");
	                        String newFecha = input.nextLine();
	                        System.out.println("Ingrese su Peso");
	                        double newPeso = input.nextDouble();
	                        System.out.println("Ingrese su Altura");
	                        double newAltura = input.nextDouble();
	                        Imc imc = new Imc(newFecha, newPeso, newAltura);
	                        newUsuario.getPersona().setImc(imc);
	                        double result = imc.calcularImc();
	                        System.out.println("-------------------------");
	                        System.out.println("Su Indice de Masa Corporal");
	                        System.out.println("-------------------------");
	                        if (newUsuario.getPersona().getSexo().equals("m")) {
	                        	// Hombres
		                        if(result < 20.00){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Bajo Peso");
		                        }else if(result>=20.00 && result<=24.9){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Normal");
		                        }else if(result>=25.00 && result<=29.9){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Obesidad Leve");
		                        }else if(result>=30.00 && result<=40.00){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Obesidad Severa");
		                        }else if(result > 40.00){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Obesidad Muy Severa");	                     
		                        }else{
		                        	System.out.println("Sin Clasificacón - Consulte a su Medico");
		                        }
	                        }else {
	                        	 // Mujeres
		                        if(result < 20.00){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Bajo Peso");
		                        }else if(result>=20.00 && result<=23.9){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Normal");
		                        }else if(result>=24.00 && result<=28.9){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Obesidad Leve");
		                        }else if(result>=29.00 && result<=37.00){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Obesidad Severa");
		                        }else if(result > 37.00){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Obesidad Muy Severa");	                     
		                        }else{
		                        	System.out.println("Sin Clasificacón - Consulte a su Medico");
		                        }
	                        }                                     
	                               
	                        break;	                    	
	                    } else {
	                        System.out.print("Error usuario o password no valido");
	                    }                         
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



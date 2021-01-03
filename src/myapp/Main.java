package myapp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        boolean salir = false;
        String opcion;    
        Usuario newUsuario = null;
        List<Imc> imcList = new ArrayList<Imc>();
        
        while (!salir) {           
            try { 
            	
                System.out.println("0. Inscripcion Usuario");
                System.out.println("1. Ingresar Persona");
                System.out.println("2. Calcular IMC");
                System.out.println("3. Mostrar Listado");
                System.out.println("4. Salir");
                System.out.println("---------------------------");
                System.out.println("Escribe una de las opciones");             
                opcion = input.nextLine(); 
                switch (opcion) {
                   case "0":  
                	  
                	   boolean salir0 = false;
                	   while (!salir0) {
                		   System.out.println("Inscripción de Usuario");
                           System.out.println("------------------------------");                         
                           System.out.println("Inserte Correo Electronico");                     
                           String newCorreo = input.nextLine();
                           // Validamos que sea un correo electronico valido.
                           if (!newUsuario.validarMail(newCorreo)) {
                        	   while (!newUsuario.validarMail(newCorreo)) {
                        		   System.out.println("Correo no valido!!");   
                            	   System.out.println("Inserte Correo Electronico");                     
                                   newCorreo = input.nextLine();
                        	   }                        	   
                           }
                           System.out.println("Inserte Cotraseña Usuario");                 
                           String newPass = input.nextLine();
                           // Validamos que la contraseña sea mayor a 4 caracteres
                           if (newUsuario.validarLargoPassword(newPass)) {
                        	   while (newUsuario.validarLargoPassword(newPass)) {
                        		   System.out.println("Minimo 4 Caracteres!!");   
                            	   System.out.println("Inserte Cotraseña Usuario");                     
                            	   newPass = input.nextLine();
                        	   }                        	   
                           }
                           newUsuario = new Usuario(newCorreo, newPass);
                           System.out.println("------------------------------");
                           System.out.println("Usuario Registrado con Exito!!");                     
                           System.out.println("\n");                                             
                           salir0 = true;
                           break;  
                         
                	   }	
                	   break;                                                   
                  case "1":                	
               	   	boolean salir1 = false;
               	   	while (!salir1) {
               	   		if (newUsuario == null) {
               	   		System.out.println("Debe Registrarse - Opcion [0]"); 
               	   		System.out.println("---------------------------------"); 
               	   		break;               	   		
               	   		}
	               	   	System.out.println("Debe Autenticarse");
	                    System.out.println("------------------------------");  
	                    System.out.println("Ingrese Correo");
	                    String correo = input.nextLine();
	                    System.out.println("Ingrese Password");
	                    String pass = input.nextLine();
	                    if ((newUsuario.validarCorreos(newUsuario.getCorreo(), correo)) && newUsuario.validarPasswords(newUsuario.getPassword(), pass)) {
	                        System.out.println("Usuario Valido");
	                        System.out.println("------------------------------"); 
	                        System.out.println("Ingresar Persona");
	                        System.out.println("------------------------------");  
	                        System.out.println("Datos Usuario Autenticado");
	                        System.out.println("------------------------------"); 
	                        System.out.println("Inserte Nombre");
	                        String newName = input.nextLine();
	                        System.out.println("Inserte Apellido");
	                        String newApellido = input.nextLine();
	                        System.out.println("Inserte Sexo Masculino [m] o Femenino [f]");
	                        String newSexo = input.nextLine();
	                        System.out.println("Fecha Nacimiento dd/mm/aaaa");
	                        String newFecha = input.nextLine();
	                        System.out.println("Atleta [a] - Persona Natural [n]");   
	                        String newTipoPersona = input.nextLine();	                        
	                        Persona newPersona = new Persona(newName, newApellido, newSexo, newFecha, newTipoPersona);
	                        newUsuario.setPersona(newPersona);
	                        System.out.println("------------------------------");  
	                        System.out.println("Persona Registrada con Exito!!");	
	                        System.out.println("\n"); 
	                        salir1 = true;
	                        break;	                        
		                    } else {
		                        System.out.println("Error usuario o password no valido");
		                        System.out.println("\n"); 
		                        break;
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
	                    	System.out.println("Usuario Valido");
	                    	System.out.println("Ficha de Usuario:");	                    	
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
	                        System.out.println("Ingrese su Altura - [0,00]");
	                        double newAltura = input.nextDouble();
	                        Imc imc = new Imc(newFecha, newPeso, newAltura);                  
	                        double result = imc.calcularImc();
	                        System.out.println("-------------------------");
	                        System.out.println("Su Indice de Masa Corporal");
	                        System.out.println("-------------------------");
	                        if (newUsuario.getPersona().getSexo().equals("m")) {
	                        	// Hombres
		                        if(result < 20.00){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Bajo Peso");	
		                        	imc.setInterpretacion("Bajo Peso");
		                        }else if(result>=20.00 && result<=24.9){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Normal");
		                        	imc.setInterpretacion("Normal");
		                        }else if(result>=25.00 && result<=29.9){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Obesidad Leve");
		                        	imc.setInterpretacion("Obesidad Leve");
		                        }else if(result>=30.00 && result<=40.00){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Obesidad Severa");
		                        	imc.setInterpretacion("Obesidad Severa");
		                        }else if(result > 40.00){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Obesidad Muy Severa");
		                        	imc.setInterpretacion("Obesidad Muy Severa");
		                        }else{
		                        	System.out.println("Sin Clasificacón - Consulte a su Medico");
		                        	imc.setInterpretacion("Sin Clasificacón");
		                        }
	                        }else {
	                        	 // Mujeres
		                        if(result < 20.00){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Bajo Peso");
		                        	imc.setInterpretacion("Bajo Peso");
		                        }else if(result>=20.00 && result<=23.9){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Normal");
		                        	imc.setInterpretacion("Normal");
		                        }else if(result>=24.00 && result<=28.9){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Obesidad Leve");
		                        	imc.setInterpretacion("Obesidad Leve");
		                        }else if(result>=29.00 && result<=37.00){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Obesidad Severa");
		                        	imc.setInterpretacion("Obesidad Severa");
		                        }else if(result > 37.00){
		                        	System.out.println("Valor : " + result);
		                        	System.out.println("Obesidad Muy Severa");
		                        	imc.setInterpretacion("Obesidad Muy Severa");
		                        }else{
		                        	System.out.println("Sin Clasificacón - Consulte a su Medico");
		                        	imc.setInterpretacion("Sin Clasificacón");
		                        }
	                        }
	                        // Agregamos IMC con todos los datos a la lista
	                        imcList.add(imc);
	                        // Asociamos la lista a la persona.
	                        newUsuario.getPersona().setImc(imcList);
	                        System.out.println("\n");       
	                        break;	                    	
	                    } else {
	                        System.out.println("Error usuario o password no valido");	                        
	                        System.out.println("\n"); 	                      
	                    }                         
                        break;
                    case "3":
                    	if (newUsuario == null) {
                   	   		System.out.println("Debe generar Usuario - Opcion [1]"); 
                   	   		System.out.println("---------------------------------"); 
                   	   		break;               	   		
                   	   	}
                    	System.out.println("Ficha de Usuario:");	                    	
                        System.out.println("------------------------------"); 
                        System.out.println("Nombre: " + newUsuario.getPersona().getNombre());
                        System.out.println("Apellido: " + newUsuario.getPersona().getApellido());
                        System.out.println("Fecha Nacimiento: " + newUsuario.getPersona().getFechaNacimiento());
                        System.out.println("Sexo: " + newUsuario.getPersona().getSexo());
                        System.out.println("Tipo Persona: " + newUsuario.getPersona().getTipoPersona());	                  
                        System.out.println("------------------------------"); 
                        System.out.println("Listado de Estados Nutricionales");
                        System.out.println("--------------------------------");
                        for (int i = 0; i <= imcList.size() - 1; i++) {
                            System.out.println("Fecha Toma : " + imcList.get(i).getFecha());
                            System.out.println("Altuma cm : " + imcList.get(i).getAltura());
                            System.out.println("Peso Kg : " + imcList.get(i).getPeso());
                            System.out.println("IMC : " + imcList.get(i).calcularImc());
                            System.out.println("Observacion : " + imcList.get(i).getInterpretacion());
                            System.out.println("--------------------------------");
                            System.out.println("\n"); 
                        }
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
        input.close();
 
    }	
	
	


}



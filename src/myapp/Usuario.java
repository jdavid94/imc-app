package myapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
	
	private String correo;
	private String password;
	private Persona persona;
		

	public Usuario(String correo, String password) {
		super();
		this.correo = correo;
		this.password = password;
		this.persona = null;
	}

	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public boolean validarCorreos(String emailA, String emailB) {
		boolean validador = false;
		if(emailA.equals(emailB)) {
			validador = true;
		}
		return validador;
	}
	
	public boolean validarPasswords(String pswd1, String pswd2) {
		boolean validador = false;
		if(pswd1.equals(pswd2)) {
			validador = true;
		}
		return validador;
	}
	
	public boolean validarMail(String email) {
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); 
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }
	
	public boolean validarLargoPassword(String password) {
		boolean validador = false;
		if (password.length() > 4) {
            validador = true;         	   
        }
		return validador;
	}
}

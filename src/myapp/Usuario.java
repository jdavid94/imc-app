package myapp;

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
	
	
	
	
}

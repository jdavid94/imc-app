package myapp;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String sexo;
	private String fechaNacimiento;
	private String tipoPersona;
	private Imc imc;
	
		
   public Persona(String nombre, String apellido, String newSexo, String fechaNacimiento, String newTipoPersona) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = newSexo;
		this.fechaNacimiento = fechaNacimiento;
		this.tipoPersona = newTipoPersona;
		this.imc = null;		
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getTipoPersona() {
		return tipoPersona;
	}
	
	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public Imc getImc() {
		return imc;
	}

	public void setImc(Imc imc) {
		this.imc = imc;
	}
	

}

package myapp;

public class Imc {
	
	private String fecha;
	private double peso;
	private double altura;
	private String interpretacion;
	
		
	public Imc(String fecha, double peso, double altura) {
		super();
		this.fecha = fecha;
		this.peso = peso;
		this.altura = altura;
		this.interpretacion = "";
	}

	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public double calcularImc() {
		return this.peso/(this.altura*this.altura);
	}
	
	

}

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
		return this.peso / (this.altura * this.altura);
	}

	public void mostrarIMC(String sexo, double peso, double altura) {
		double result = calcularImc();
		if (sexo.equals("m")) {
			if (result < 20.00) {
				System.out.println("Valor : " + result);
				System.out.println("Bajo Peso");
				setInterpretacion("Bajo Peso");
			} else if (result >= 20.00 && result <= 24.9) {
				System.out.println("Valor : " + result);
				System.out.println("Normal");
				setInterpretacion("Normal");
			} else if (result >= 25.00 && result <= 29.9) {
				System.out.println("Valor : " + result);
				System.out.println("Obesidad Leve");
				setInterpretacion("Obesidad Leve");
			} else if (result >= 30.00 && result <= 40.00) {
				System.out.println("Valor : " + result);
				System.out.println("Obesidad Severa");
				setInterpretacion("Obesidad Severa");
			} else if (result > 40.00) {
				System.out.println("Valor : " + result);
				System.out.println("Obesidad Muy Severa");
				setInterpretacion("Obesidad Muy Severa");
			} else {
				System.out.println("Sin Clasificacón - Consulte a su Medico");
				setInterpretacion("Sin Clasificacón");
			}
		}else {
			   if(result < 20.00){
               	System.out.println("Valor : " + result);
               	System.out.println("Bajo Peso");
               	setInterpretacion("Bajo Peso");
               }else if(result>=20.00 && result<=23.9){
               	System.out.println("Valor : " + result);
               	System.out.println("Normal");
               	setInterpretacion("Normal");
               }else if(result>=24.00 && result<=28.9){
               	System.out.println("Valor : " + result);
               	System.out.println("Obesidad Leve");
               	setInterpretacion("Obesidad Leve");
               }else if(result>=29.00 && result<=37.00){
               	System.out.println("Valor : " + result);
               	System.out.println("Obesidad Severa");
               	setInterpretacion("Obesidad Severa");
               }else if(result > 37.00){
               	System.out.println("Valor : " + result);
               	System.out.println("Obesidad Muy Severa");
               	setInterpretacion("Obesidad Muy Severa");
               }else{
               	System.out.println("Sin Clasificacón - Consulte a su Medico");
               	setInterpretacion("Sin Clasificacón");
               }
		}

	}

}

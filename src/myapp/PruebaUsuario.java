package myapp;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PruebaUsuario {

	@Test
	public void pruebaFormatoEmail() {
		Usuario user = new Usuario();
		//assertTrue("Se valida el formato del email", user.validarMail("jota.avello@gmail.com"));
		assertFalse("Se valida el formato del email", user.validarMail("jota.****@gmail.com"));
	}
	
	@Test
	public void pruebaLargoPassword() {
		Usuario user = new Usuario();
		assertFalse("Se valida el largo de la password ", user.validarLargoPassword("1234"));
	}
	
	@Test
	public void pruebaIMC() {
		Imc imc = new Imc("03/01/2020",120,1.80);
		imc.mostrarIMC("m");
		assertEquals("Obesidad Severa", imc.getInterpretacion());
	}
	
}

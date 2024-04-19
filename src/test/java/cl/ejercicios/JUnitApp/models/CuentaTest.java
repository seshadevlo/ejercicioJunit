package cl.ejercicios.JUnitApp.models;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuentaTest {
	
	//test al cosntructor
	@Test
	void testNombreCuenta() {
		Cuenta cuenta = new Cuenta("seba", new BigDecimal("15000.00405050"));
		
		String loEsperado = "seba";
		String loObtenido = cuenta.getPersona();
		
		Assertions.assertEquals(loEsperado, loObtenido);
	}
	/* test a dos instancias de diferente referencia,
	 * pero con el mismo contenido.*/ 
	@Test
	void testReferenciaCuenta() {
		
		//¿son iguales?
		Cuenta cuenta = new Cuenta("seba", new BigDecimal("15000.00405050"));
		Cuenta cuenta2 = new Cuenta("seba", new BigDecimal("15000.00405050"));
		
		//comparacion de dos registros similares.
		Assertions.assertEquals(cuenta, cuenta2);
	}
	
	
	@Test
	void testSaldoCuenta() {
		Cuenta cuenta = new Cuenta("seba", new BigDecimal("15000.00405050"));
		Assertions.assertEquals(15000.00405050,cuenta.getSaldo().doubleValue());
	}
}

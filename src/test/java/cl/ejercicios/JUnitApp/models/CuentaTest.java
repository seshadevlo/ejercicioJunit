package cl.ejercicios.JUnitApp.models;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuentaTest {
	
	@Test
	void testNombreCuenta() {
		Cuenta cuenta = new Cuenta("seba", new BigDecimal("15000.00405050"));
		
		String loEsperado = "seba";
		String loObtenido = cuenta.getPersona();
		
		Assertions.assertEquals(loEsperado, loObtenido);
	}

}

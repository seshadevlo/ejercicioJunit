package cl.ejercicios.JUnitApp.models;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	private Calculadora calculadora;
	
	@BeforeAll
	static void setUpAll() {
		System.out.println("una configuracion inicial para todas las pruebas");
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("una configuracion especifica para cada prueba");
		
		//se crea la instancia individualmente.
		calculadora = new Calculadora();
	}	
	
	@Test
	public void testSumar() {
		Assertions.assertEquals(5, calculadora.sumar(2, 3));
	}
	
	@Test
	public void testRestar() {
		Assertions.assertEquals(1, calculadora.restar(3, 2));	
	}
	
	@Test
	public void testMultiplicar() {
		Assertions.assertEquals(6, calculadora.multiplicar(2, 3));	
	}
	
	@Test
	public void testDividir() {
		Assertions.assertEquals(3, calculadora.dividir(18, 6));	
	}
	
	//test que divide por cero esperando la excepcion.
	@Test
	public void testDeDivisiorEnCero() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			calculadora.dividir(20, 0);
		});
	}
	
	@AfterEach
	void tearDown() {
		calculadora = null;
		System.out.println("Limpieza de recursos posterior a la prueba");
	}

	@AfterAll
	static void tearDownAll() {
		System.out.println("Limpieza de recursos posterior a todas las prueba");
	}
	
	

}

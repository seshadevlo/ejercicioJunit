package cl.ejercicios.JUnitApp.models;

public class Calculadora {
	
	public int sumar(int primerNumero, int segundoNumero) {
		return primerNumero + segundoNumero;
	}
	public int restar (int primerNumero, int segundoNumero) {
		return primerNumero - segundoNumero;		
	}
	public int multiplicar(int primerNumero, int segundoNumero) {
		return primerNumero*segundoNumero;
	}
	public int dividir(int primerNumero, int segundoNumero) {
		if(segundoNumero == 0) {
			throw new IllegalArgumentException("no es posible dividir por cero");
		}
		return primerNumero/segundoNumero;
	}

}

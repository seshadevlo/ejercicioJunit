package cl.ejercicios.JUnitApp.models;

import java.math.BigDecimal;

public class Cuenta {
	private String persona;
	private BigDecimal saldo;
	
	public Cuenta(String persona, BigDecimal saldo) {
		this.persona = persona;
		this.saldo = saldo;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	
	/* este override sobre la clase obj, permite comparar ambas 
	 * instancias respecto a su contenido mas alla de la
	 *  ubicacion en la memoria que utilizan con la prueba aplicada*/
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Cuenta)) {
			return false;
		}
		
		Cuenta cuenta = (Cuenta) obj;
		
		if(this.persona == null || this.saldo == null) {
			return false;
		}
		
		return this.persona.equals(cuenta.getPersona()) && this.saldo.equals(cuenta.getSaldo());
	}
	
}

package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador{

	private String estiloPreferido;

	public Nadador(Integer nroDeSocio, String nombre, String estiloPreferido) {
		super(nroDeSocio, nombre);
		this.estiloPreferido= estiloPreferido;
	}

	public String getEstiloPreferido() {
		return estiloPreferido;
	}

	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}
	
}

package ar.edu.unlam.pb2.eva03;

public class Deportista {

	private Integer numeroDeSocio;
	private String nombre;

	public Deportista (Integer nroDeSocio, String nombre) {
		this.numeroDeSocio= nroDeSocio;
		this.nombre= nombre;
	}

	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}

	public void setNumeroDeSocio(Integer numeroDeSocio) {
		this.numeroDeSocio = numeroDeSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}

package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public class Triatleta extends Deportista{

	private String distanciaPreferida;
	private TipoDeBicicleta tipoDeBicicleta;

	public Triatleta(Integer nroDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tipo) {
		super(nroDeSocio, nombre);
		this.distanciaPreferida= distanciaPreferida;
		this.tipoDeBicicleta= tipo;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

}

package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	private Integer numeroDeInscripcion= 0;

	public Club(String nombre) {
		this.nombre= nombre;
		this.socios= new HashSet<Deportista>();
		this.competencias= new TreeMap<String, Evento>();
	}

	public void agregarDeportista(Deportista deportista) {
		socios.add(deportista);
	}
	
	public void crearEvento(TipoDeEvento tipoDeEvento, String nombre) {
		competencias.put(nombre, new Evento(tipoDeEvento));
	}
	
	public Integer inscribirEnEvento(String nombreEvento, Deportista depoAInscribir) throws NoEstaPreparado{
		
		Evento eventoAInscribir = competencias.get(nombreEvento);
		
		switch (eventoAInscribir.getTipo()) {
		case CARRERA_5K:
		case CARRERA_10K:
		case CARRERA_21K:
		case CARRERA_42K:
			this.numeroDeInscripcion+= eventoAInscribir.agregarParticipante(depoAInscribir);
			break;
		case DUATLON:
			if (depoAInscribir instanceof ICiclista)
				this.numeroDeInscripcion += eventoAInscribir.agregarParticipante(depoAInscribir);
			else {
				throw new NoEstaPreparado("Debe ser ciclista para inscribirse");
			}
			break;
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
		case CARRERA_NATACION_EN_PICINA:
			if (depoAInscribir instanceof INadador)
				this.numeroDeInscripcion += eventoAInscribir.agregarParticipante(depoAInscribir);
			else
				throw new NoEstaPreparado("Debe ser nadador para inscribirse");
			break;
		case TRIATLON_IRONMAN:
		case TRIATLON_MEDIO:
		case TRIATLON_OLIMPICO:
		case TRIATLON_SHORT:
			if (depoAInscribir instanceof INadador && depoAInscribir instanceof ICiclista)
				this.numeroDeInscripcion+= eventoAInscribir.agregarParticipante(depoAInscribir);
			else
				throw new NoEstaPreparado("Debe ser nadador y ciclista para inscribirse");
			break;
		}
		return numeroDeInscripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadSocios() {
		return socios.size()-1;
	}
	
	public Set<Deportista> getSocios() {
		return socios;
	}

	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}
	
}

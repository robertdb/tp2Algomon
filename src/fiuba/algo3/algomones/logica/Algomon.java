package fiuba.algo3.algomones.logica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import fiuba.algo3.algomones.logica.excepciones.AtaqueNoDisponibleException;

public abstract class Algomon {

	private int vida;
	private int vidaOriginal = -1;
	
	private String nombre;
	
	private ArrayList<String> imagenes = new ArrayList<String>();
	
	private HashMap<String, Ataque> ataques = new HashMap<String, Ataque>();
	
	private ContextoEstado estado = new ContextoEstado();
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		if (this.vidaOriginal == -1) {
			this.vidaOriginal = vida;
		}
		this.vida = vida;
	}
	
	public void aumentarVida(int puntos) {
		this.setVida(this.vida + puntos);
	}
	
	public int getVidaOriginal() {
		return this.vidaOriginal;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	protected void setImagenes(String frente, String espalda) {
		this.imagenes.add(frente);
		this.imagenes.add(espalda);
	}
	
	public String getImagenFrente() {
		return this.imagenes.get(0);
	}
	
	public String getImagenEspalda() {
		return this.imagenes.get(1);
	}
	
	protected HashMap<String, Ataque> getAtaques() {
		return ataques;
	}
	
	public ArrayList<Ataque> getListadoAtaques() {
		return new ArrayList<Ataque>(ataques.values());
	}
	
	public void aumentarTodosLosAtaques(int cantidad) {
		for (Ataque ataque : this.ataques.values()) {
		    ataque.aumentarCantidad(cantidad);
		}
	}
	
	protected void agregarAtaque(Ataque ataque) {
		this.ataques.put(ataque.getNombre(), ataque);
	}
	
	public void atacar(Algomon algomon, String nombreAtaque) {
		estado.aplicarEfectos(this);
		Ataque ataque = ataques.get(nombreAtaque);
		if (ataque == null) {
			throw new AtaqueNoDisponibleException();
		}
		ataque.utilizar(this, algomon);
	}

	public int recibirAtaque(Ataque ataque) {
		int danio = ataque.getDanioContraNormal();
		this.recibirDanio(danio);;
		return danio;
	}
	
	public void recibirDanio(int danio) {
		this.vida = this.vida - danio;
	}

	public void setEstadoPersistente(EstadoAlgomon estado) {
		this.estado.setEstadoPersistente(estado);
	}
	
	public void setEstadoEfimero(EstadoAlgomon estado) {
		this.estado.setEstadoEfimero(estado);
	}

	public void aplicarElemento(Elemento elemento) {
		elemento.aplicar(this);
	}

}
package fiuba.algo3.algomones.logica;

import java.util.ArrayList;
import java.util.HashMap;

import fiuba.algo3.algomones.logica.estadosdealgomones.*;
import fiuba.algo3.algomones.logica.excepciones.AtaqueNoDisponibleException;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public abstract class Algomon {

	private int vida;
	private int vidaOriginal = -1;
	
	private String nombre;
	
	private ArrayList<String> imagenes = new ArrayList<String>();
	
	private HashMap<String, Ataque> ataques = new HashMap<String, Ataque>();
	
	private ContextoEstado estado = new ContextoEstado();
	
	private final SimpleStringProperty vidaProperty = new SimpleStringProperty();
	
	private final SimpleBooleanProperty estaDormidoProperty = new SimpleBooleanProperty();
	
	private final SimpleBooleanProperty estaQuemadoProperty = new SimpleBooleanProperty();
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		if (this.vidaOriginal == -1) {
			this.vidaOriginal = vida;
		}
		if (vida < 0) {
			vida = 0;
		}
		this.vida = vida;
		this.vidaProperty.setValue(String.valueOf(vida));
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
		this.estado.aplicarEfectosAtaque(this);
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
		this.setVida(this.getVida() - danio);
	}

	public void setEstadoPersistente(EstadoAlgomon estado) {
		this.estado.setEstadoPersistente(estado);
		this.estaQuemadoProperty.setValue(estado.getClass().equals(EstadoQuemado.class));
	}
	
	public void setEstadoEfimero(EstadoAlgomon estado) {
		this.estado.setEstadoEfimero(estado);
		this.estaDormidoProperty.setValue(estado.getClass().equals(EstadoDormido.class));
	}
	
	public EstadoAlgomon getEstadoPersistente() {
		return this.estado.getEstadoPersistente();
	}
	
	public EstadoAlgomon getEstadoEfimero() {
		return this.estado.getEstadoEfimero();
	}

	public void aplicarElemento(Elemento elemento) {
		this.estado.aplicarEfectosElemento(this);
		elemento.aplicar(this);
	}

	public SimpleStringProperty getVidaProperty() {
		return this.vidaProperty;
	}
	
	public SimpleBooleanProperty getEstaDormidoProperty() {
		return this.estaDormidoProperty;
	}

	public SimpleBooleanProperty getEstaQuemadoProperty() {
		return this.estaQuemadoProperty;
	}

}
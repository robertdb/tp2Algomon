package fiuba.algo3.algomones.logica;

import java.util.Random;

import javafx.beans.property.SimpleStringProperty;

public class Juego {
	
	private Jugador jugador1;
	private Jugador jugador2;
	
	private Jugador jugadorActivo;
	
//	private int etapa = 0;
	
	private SimpleStringProperty nombreJugadorActivoProperty = new SimpleStringProperty();
	
	public void setJugador1(String nombre) {
		this.jugador1 = new Jugador(nombre);
	}
	
	public void setJugador2(String nombre) {
		this.jugador2 = new Jugador(nombre);
	}
	
	public Jugador getJugador1() {
		return this.jugador1;
	}
	
	public Jugador getJugador2() {
		return this.jugador2;
	}
	
	public Jugador getJugadorActivo() {
		return this.jugadorActivo;
	}
	
	private void setJugadorActivo(Jugador jugador) {
		this.jugadorActivo = jugador;
		this.nombreJugadorActivoProperty.setValue(jugador.getNombre());
	}
	
	public void cambiarTurno() {
		if (this.jugadorActivo == jugador1) {
			setJugadorActivo(jugador2);
		}
		else {
			setJugadorActivo(jugador1);
		}
	}

	public void setJugadorActivoRandom() {
		Random random = new Random();
		if (random.nextBoolean()) {
			setJugadorActivo(this.getJugador1());
		}
		else {
			setJugadorActivo(this.getJugador2());
		}
	}
	
	public SimpleStringProperty getNombreJugadorActivoProperty() {
		return this.nombreJugadorActivoProperty;
	}

	public Jugador getJugadorInactivo() {
		if (this.jugadorActivo == jugador1) {
			return jugador2;
		}
		else {
			return jugador1;
		}
	}
	
//	public void setEtapa(int etapa) {
//		this.etapa = etapa;
//	}
	
//	public int getEtapa() {
//		return this.etapa;
//	}
	
}

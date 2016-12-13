package fiuba.algo3.algomones;

import java.util.Random;

import javafx.beans.property.SimpleStringProperty;

public class Juego {
	private Jugador activo;
	private Jugador pasivo;
	
	private final SimpleStringProperty nombreJugadorActivoProperty = new SimpleStringProperty();

	public Juego() {
		activo = new Jugador();
		pasivo = new Jugador();
	}
	public void siguienteTurno() {
		Jugador aux = activo;
		activo = pasivo;
		pasivo = aux;
		nombreJugadorActivoProperty.setValue(activo.getNombre());
	}
	public Jugador getActivo(){
		return  activo;
	}
	public Jugador getPasivo(){
		return  pasivo;
	}
	public void introducirAlgomon(EspecieAlgomon algomon){
		this.activo.ingresarAlgomon(algomon,algomon.nuevo());
	}
	public void introducirNombre(String nombre){
		activo.setNombre(nombre);
		
	}

	public void setJugadorActivoRandom() {
		Random random = new Random();
		if (random.nextBoolean()) {
			siguienteTurno();
		}
	}
	
	public SimpleStringProperty getNombreJugadorActivoProperty() {
		return nombreJugadorActivoProperty;
	}

}

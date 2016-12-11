package fiuba.algo3.algomones;

import fiuba.algo3.algomones.excepciones.AlgomonesDeJugadorMuertosExeption;
import fiuba.algo3.algomones.interfaz.Ventana;

public class Juego {
	private Jugador activo;
	private Jugador pasivo;

	public Juego() {
		activo = new Jugador();
		pasivo = new Jugador();
	}
	public void siguienteTruno() {
		Jugador aux = activo;
		activo = pasivo;
		pasivo = aux;
	}
	public Jugador setActivo(){
		return  activo;
	}
	public Jugador setPasivo(){
		return  pasivo;
	}
	public void introducirAlgomon(EspecieAlgomon algomon){
		this.activo.ingresarAlgomon(algomon,algomon.nuevo());
	}
	public void introducirNombre(String nombre){
		activo.setNombre(nombre);
		
	}

}

package fiuba.algo3.algomones;

import fiuba.algo3.algomones.Jugador;

public class Juego {
	private Jugador activo;
	private Jugador pasivo;

	public Juego(Jugador jugador1, Jugador jugador2) {
		activo = jugador1;
		pasivo = jugador2;
	}

	public Jugador jugadorActivo() {
		// TODO Auto-generated method stub
		return activo;
	}

	public void siguienteTruno() {
		Jugador aux = activo;
		activo = pasivo;
		pasivo = aux;
		
	}

	public Jugador jugadorPasivo() {
		// TODO Auto-generated method stub
		return pasivo;
	}

}

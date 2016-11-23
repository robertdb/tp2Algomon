package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.Juego;
import fiuba.algo3.algomones.Jugador;

public class juegoTest {

	@Test
	public void test() {
		Jugador jugador1 = new Jugador(null,null,null);
		Jugador jugador2 = new Jugador(null,null,null);
		
		Juego juego = new Juego(jugador1,jugador2);
		
		Jugador jugadorAux = juego.jugadorActivo();
		assertTrue(jugadorAux == jugador1);
		
		juego.siguienteTruno();
		
		jugadorAux = juego.jugadorActivo();
		assertFalse(jugadorAux == jugador1);
		
		assertTrue(jugador1 == juego.jugadorPasivo());
	}

}

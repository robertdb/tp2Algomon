package fiuba.algo3.test;


import org.junit.Test;

import fiuba.algo3.algomones.logica.Juego;
import fiuba.algo3.algomones.logica.Jugador;
import fiuba.algo3.algomones.logica.especiesdealgomones.*;

public class JuegoTest {

	@Test
	public void testJuegoIngresarAlgomones() {
		Jugador jugador1 = new Jugador("Fede");
		Jugador jugador2 = new Jugador("Pablo");
		
		Juego juego = new Juego();
		
		juego.setJugador1(jugador1);
		juego.setJugador2(jugador2);
		juego.setJugadorActivoRandom();
		
		juego.getJugadorActivo().agregarAlgomon(new Bulbasaur());
		juego.getJugadorActivo().agregarAlgomon(new Charmander());
		juego.getJugadorActivo().agregarAlgomon(new Jigglypuff());
    	juego.cambiarTurno();
    	juego.getJugadorActivo().agregarAlgomon(new Squirtle());
    	juego.getJugadorActivo().agregarAlgomon(new Rattata());
    	juego.getJugadorActivo().agregarAlgomon(new Chansey());
		
		
	}

}

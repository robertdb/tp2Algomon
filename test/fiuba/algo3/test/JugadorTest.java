package fiuba.algo3.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.Ataque;
import fiuba.algo3.algomones.logica.Elemento;
import fiuba.algo3.algomones.logica.Jugador;
import fiuba.algo3.algomones.logica.especiesdealgomones.*;

public class JugadorTest {

	@Test
	public void testJugadorInicialConalgomones() {
		
		Algomon rattata = new Rattata();
		Algomon charmander = new Charmander();
		Algomon bulbasaur = new Bulbasaur();
		
		
		Jugador jugador = new Jugador("Daniel");
		
		assertFalse(jugador.tieneAlgomonActivo());
		
		jugador.agregarAlgomon(rattata);
		jugador.agregarAlgomon(charmander);
		jugador.agregarAlgomon(bulbasaur);
		
		jugador.setAlgomonActivo(charmander);
		
		assertTrue(jugador.tieneAlgomonActivo());
		
		jugador.setAlgomonActivo(rattata);
		
		assertEquals(rattata, jugador.getAlgomonActivo());

		
	}
	@Test
	public void testJugadorDevuelveElementos(){ 
		
		
		Jugador jugador = new Jugador("Maria");
		ArrayList<Elemento> listaElementos = jugador.getListadoElementos(); 
		assertTrue(listaElementos.size() == 4);
	}
	
	@Test
	public void testJugadorDevuelveLosAtaqueDelAlgomonActual(){
		Algomon rattata = new Rattata();
		
		Jugador jugador = new Jugador("Sandra");
		
		jugador.agregarAlgomon(rattata);
		
		ArrayList<Ataque> listaAtaques = jugador.getListadoAlgomones().get(0).getListadoAtaques();
		
		assertTrue(listaAtaques.size() == 3);
	}

}

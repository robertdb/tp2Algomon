package fiuba.algo3.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Elemento;
import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.Jugador;
import fiuba.algo3.algomones.NombreDelAtaque;
import fiuba.algo3.algomones.TipoElemento;

public class jugadorTest {

	@Test
	public void testJugadorInicialConalgomones() {
		
		Algomon rattata = EspecieAlgomon.RATTATA.nuevo();
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		Algomon bulbasour = EspecieAlgomon.BULBASAUR.nuevo();
		
		
		Jugador jugador = new Jugador();
		
		assertEquals(null,jugador.statusAlgomonActual());
		
		jugador.ingresarAlgomon(EspecieAlgomon.RATTATA,rattata);
		jugador.ingresarAlgomon(EspecieAlgomon.CHARMANDER,charmander);
		jugador.ingresarAlgomon(EspecieAlgomon.BULBASAUR,bulbasour);
		
		assertEquals(rattata,jugador.statusAlgomonActual());
		
		jugador.elegirAlgomon(EspecieAlgomon.CHARMANDER);
		
		assertEquals(charmander,jugador.statusAlgomonActual());
		
		
		jugador.elegirAlgomon(EspecieAlgomon.BULBASAUR);
		
		assertEquals(bulbasour,jugador.statusAlgomonActual());
		
		Set<EspecieAlgomon> listaElementos = jugador.getAlgomones(); 
		assertTrue(listaElementos.size() == 3);
		
		
	}
	@Test
	public void testJugadorDevuelveElementos(){ 
		
		
		Jugador jugador = new Jugador();
		Set<TipoElemento> listaElementos = jugador.getElementos(); 
		assertTrue(listaElementos.size() == 4);
	}
	@Test
	public void testJugadorDevuelveLosAtaqueDelAlgomonActual(){
		Algomon rattata = EspecieAlgomon.RATTATA.nuevo();
		
		Jugador jugador = new Jugador();
		
		jugador.ingresarAlgomon(EspecieAlgomon.RATTATA, rattata);
		
		Set<NombreDelAtaque> listaAtaques = jugador.getAtaqueAlgomon();
		
		assertTrue(listaAtaques.size() == 3);
	}

}

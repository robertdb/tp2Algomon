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
		EnumMap<EspecieAlgomon, Algomon> algomones = new EnumMap<EspecieAlgomon,Algomon >(EspecieAlgomon.class);
		
		
		Algomon rattata = EspecieAlgomon.RATTATA.nuevo();
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		Algomon bulbasour = EspecieAlgomon.BULBASOUR.nuevo();
		algomones.put(EspecieAlgomon.RATTATA, rattata);
		algomones.put(EspecieAlgomon.CHARMANDER, charmander);
		algomones.put(EspecieAlgomon.BULBASOUR, bulbasour);
		
		
		Jugador jugador = new Jugador(algomones,rattata,null);
		
		assertEquals(rattata,jugador.statusAlgomonActual()); 
		
		jugador.elegirAlgomon(EspecieAlgomon.CHARMANDER);
		
		assertEquals(charmander,jugador.statusAlgomonActual());
		
		jugador.elegirAlgomon(EspecieAlgomon.BULBASOUR);
		
		assertEquals(bulbasour,jugador.statusAlgomonActual());
		
		Set<EspecieAlgomon> listaElementos = jugador.getAlgomones(); 
		assertTrue(listaElementos.size() == 3);
		
		
	}
	@Test
	public void testJugadorDevuelveElementos(){ 
		
		EnumMap<TipoElemento,Elemento> elementos = new EnumMap<TipoElemento,Elemento>(TipoElemento.class);
		
		elementos.put(TipoElemento.POCION, TipoElemento.POCION.nuevo());
		elementos.put(TipoElemento.SUPERPOCION, TipoElemento.SUPERPOCION.nuevo());
		elementos.put(TipoElemento.VITAMINA, TipoElemento.VITAMINA.nuevo());
		elementos.put(TipoElemento.RESTAURADOR, TipoElemento.RESTAURADOR.nuevo());
		
		Jugador jugador = new Jugador(null,null,elementos);
		Set<TipoElemento> listaElementos = jugador.getElementos(); 
		assertTrue(listaElementos.size() == 4);
	}
	@Test
	public void testJugadorDevuelveLosAtaqueDelAlgomonActual(){
		Algomon rattata = EspecieAlgomon.RATTATA.nuevo();
		EnumMap<EspecieAlgomon, Algomon> algomones = new EnumMap<EspecieAlgomon,Algomon >(EspecieAlgomon.class);
		
		Jugador jugador = new Jugador(algomones,rattata,null);
		
		Set<NombreDelAtaque> listaAtaques = jugador.getAtaqueAlgomon();
		
		assertTrue(listaAtaques.size() == 3);
	}

}

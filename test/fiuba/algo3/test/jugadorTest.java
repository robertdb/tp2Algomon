package fiuba.algo3.test;

import static org.junit.Assert.*;

import java.util.EnumMap;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Elemento;
import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.Jugador;
import fiuba.algo3.algomones.TipoElemento;

public class jugadorTest {

	@Test
	public void test() {
		EnumMap<EspecieAlgomon, Algomon> algomones = new EnumMap<EspecieAlgomon,Algomon >(EspecieAlgomon.class);
		EnumMap<TipoElemento,Elemento> elementos = new EnumMap<TipoElemento,Elemento>(TipoElemento.class);
		Jugador jugador = new Jugador(algomones,elementos);
		
	}

}

package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Elemento;
import fiuba.algo3.algomones.elementos.SuperPocion;
import fiuba.algo3.algomones.especiesdealgomones.*;
import fiuba.algo3.algomones.excepciones.ElementoAgotadoException;

public class SuperPocionTest {

	@Test
	public void testUsarPocionEnAlgomonCon20ptsDeDanioRecuperaTodaSuVida() {
		
		Algomon squirtle = new Squirtle();
					
		Algomon rattata = new Rattata();
		
		int vidaOriginalRattata  = rattata.getVida();
		
		squirtle.atacar(rattata, "Canon De Agua");
		squirtle.atacar(rattata, "Canon De Agua");
		
		assertEquals(vidaOriginalRattata - 40,  rattata.getVida() );
		
		Elemento pocion = new SuperPocion();
		
		pocion.aplicar(rattata);
		
		assertEquals(vidaOriginalRattata , rattata.getVida() );
		
	}
	
	@Test(expected = ElementoAgotadoException.class)
	public void testAlgomonAgoto2PocionesYnoPuedeUtilizarMasPociones(){
		
		Algomon rattata = new Rattata();
		
		Elemento pocion = new SuperPocion();
	
		pocion.aplicar(rattata);
		pocion.aplicar(rattata);
		
		assertTrue(true);
		
		pocion.aplicar(rattata);
		
	}
	
}

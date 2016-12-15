package fiuba.algo3.test;

import static org.junit.Assert.*;
import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Elemento;
import fiuba.algo3.algomones.elementos.Pocion;
import fiuba.algo3.algomones.especiesdealgomones.*;
import fiuba.algo3.algomones.excepciones.ElementoAgotadoException;

public class PocionTest {

	@Test
	public void testUsarPocionEnAlgomonCon20ptsDeDanioRecuperaTodaSuVida() {
		
		Algomon squirtle = new Squirtle();
					
		Algomon rattata = new Rattata();
		
		int vidaOriginalRattata  = rattata.getVida();
		
		squirtle.atacar(rattata, "Canon De Agua");
		
		assertEquals(vidaOriginalRattata - 20,  rattata.getVida() );
		
		Elemento pocion = new Pocion();
		
		pocion.aplicar(rattata);
		
		assertEquals(vidaOriginalRattata , rattata.getVida() );
		
	}
	
	@Test(expected = ElementoAgotadoException.class)
	public void testAlgomonAgoto4PocionesYnoPuedeUtilizarMasPociones(){
		
		Algomon rattata = new Rattata();
		
		Elemento pocion = new Pocion();
	
		pocion.aplicar(rattata);
		pocion.aplicar(rattata);
		pocion.aplicar(rattata);
		pocion.aplicar(rattata);
		
		assertTrue(true);
		
		pocion.aplicar(rattata);
		
	}
	
	

}

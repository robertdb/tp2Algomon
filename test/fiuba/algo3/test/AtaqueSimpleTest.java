package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.Algomones.Algomon;
import fiuba.algo3.Algomones.EspecieAlgomon;

public class AtaqueSimpleTest {

	@Test
	public void testAtacarConBurbujaQuita20ptsAunAlgomonTipoFuego() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		assertEquals(20, squirtle.atacar(charmander) );
		
	}

}

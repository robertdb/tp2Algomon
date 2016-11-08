package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.Algomones.Algomon;
import fiuba.algo3.Algomones.EspecieAlgomon;
import fiuba.algo3.Algomones.NombreDelAtaque;
import fiuba.algo3.Algomones.TipoDeAtaque;

public class AtaqueSimpleTest {

	@Test
	public void testAtacarConBurbujaQuita20ptsAunAlgomonTipoFuego() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		double vidaOriginal = charmander.vida();
		
		squirtle.atacar(charmander, NombreDelAtaque.BURBUJA);
		
		assertEquals(vidaOriginal - 20,  charmander.vida() , 0.001D);
		
	}
	
	@Test
	public void testAtacarConCanionDeAguaQuita40ptsAunAlgomonTipoFuego() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		double vidaOriginal = charmander.vida();
		
		squirtle.atacar(charmander, NombreDelAtaque.CANION_DE_AGUA);
		
		assertEquals(vidaOriginal - 40,  charmander.vida() , 0.001D);
		
	}

}
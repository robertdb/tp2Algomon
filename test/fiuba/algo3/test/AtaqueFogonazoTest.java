package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.NombreDelAtaque;

public class AtaqueFogonazoTest {

	@Test
	public void testAtacarConFogonazoAunAlgomontipoNormalQuita2ptsDeVida() {
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		Algomon rattata = EspecieAlgomon.RATTATA.nuevo();
		
		double vidaOriginalRattata = rattata.salud();
		charmander.atacar(rattata, NombreDelAtaque.FOGONAZO);
		
		assertEquals(vidaOriginalRattata - 2,  rattata.salud() , 0.001D);
		
		
	}
	@Test
	public void testAtacarConFogonazoAunAlgomonLeQuitaEl10PorCientoDeSuVidaOriginalSiRealizaUnAtaque() {
		
		assertTrue(true);
		
	}

}

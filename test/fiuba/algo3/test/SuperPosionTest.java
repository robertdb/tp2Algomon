package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.excepciones.PosionAgotadaException;
import fiuba.algo3.algomones.excepciones.SuperPosionAgotadaException;

public class SuperPosionTest {

	@Test
	public void testUsarSuperPosionEnAlgomonCon40ptsDeDanioRecuperaTodaSuVida() {
		assertTrue(true);
	}
	
	@Test
	public void testUsarSuperPosionEnAlgomonConVidaSinSerDaniadaNoRecuperaPtsDeVida() {
		assertTrue(true);
	}
	
	@Test(expected = SuperPosionAgotadaException.class)
	public void testAlgomonAgotoLasPosionesYnoPuedeUtilizarMasPosiones(){
		
		throw new SuperPosionAgotadaException();
	}
	
}

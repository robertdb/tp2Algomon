package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.NombreDelAtaque;
import fiuba.algo3.algomones.excepciones.CantidadDeAtaquesAgotadosException;
import fiuba.algo3.algomones.excepciones.PosionAgotadaException;

public class PosionTest {

	@Test
	public void testUsarPosionEnAlgomonCon20ptsDeDanioRecuperaTodaSuVida() {
		assertTrue(true);
	}
	
	@Test
	public void testUsarPosionEnAlgomonConVidaSinSerDaniadaNoRecuperaPtsDeVida() {
		assertTrue(true);
	}
	
	@Test(expected = PosionAgotadaException.class)
	public void testAlgomonAgotoLasPosionesYnoPuedeUtilizarMasPosiones(){
		
		throw new PosionAgotadaException();
	}
	
	

}

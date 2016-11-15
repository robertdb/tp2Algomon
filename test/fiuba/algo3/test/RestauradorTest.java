package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.excepciones.RestauradorAgotadoException;
import fiuba.algo3.algomones.excepciones.SuperPosionAgotadaException;

public class RestauradorTest {

	@Test
	public void testUsarRestauradorEnAlgomonBajoEfectoQuemadoVuelveAestadoNormal() {
		assertTrue(true);
	}
	
	@Test
	public void testUsarRestauradorEnAlgomonBajoEfectoDomidoVuelveAestadoNormal() {
		assertTrue(true);
	}
	
	@Test(expected = RestauradorAgotadoException.class)
	public void testAlgomonAgotoLasPosionesYnoPuedeUtilizarMasPosiones(){
		
		
		
		throw new RestauradorAgotadoException();
	}
	
}

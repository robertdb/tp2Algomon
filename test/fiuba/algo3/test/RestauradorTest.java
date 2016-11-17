package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.excepciones.RestauradorAgotadoException;
import fiuba.algo3.algomones.excepciones.SuperPocionAgotadaException;

public class RestauradorTest {

	@Test
	public void testUsarRestauradorEnAlgomonBajoEfectoQuemadoPuedeAtacar() {
		assertTrue(true);
	}
	
	@Test
	public void testUsarRestauradorEnAlgomonBajoEfectoDomidoPuedeAtacar() {
		assertTrue(true);
	}
	
	@Test(expected = RestauradorAgotadoException.class)
	public void testAlgomonAgotoLasPosionesYnoPuedeUtilizarMasPosiones(){
		
		
		
		throw new RestauradorAgotadoException();
	}
	
}

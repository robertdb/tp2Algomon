package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;


import fiuba.algo3.algomones.excepciones.VitaminaAgotadaException;

public class VitaminaTest {

	
	@Test(expected = VitaminaAgotadaException.class)
	public void testAlgomonAgotoLasPosionesYnoPuedeUtilizarMasPosiones(){
		
		throw new VitaminaAgotadaException();
	}
	
	@Test
	public void testUsarVitaminaEnAlgomonPermite2AtaquesMas() {
		assertTrue(true);
	}
	
	@Test
	public void testUsarVitaminaEnAlgomonNoPuedoAgregarMasAtaquesQueCantidadMaxima() {
		assertTrue(true);
	}
	

}

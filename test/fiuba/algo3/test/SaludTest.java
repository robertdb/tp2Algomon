package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.Salud;

public class SaludTest {

	@Test
	public void testVidaDeSaludNoPuedeSerUnValorNegativo() {
		
		Salud salud = new Salud(100);
		
		int danioInferidoAlaSalud = 200;
		
		salud.reducirVida(danioInferidoAlaSalud);
		
		assertFalse( salud.vida() < 0);
	}
	
	@Test
	public void testVidaDeSaludTerminadaConVidaIgualA0() {
		
		Salud salud = new Salud(100);
		
		int danioInferidoAlaSalud = 200;
		
		salud.reducirVida(danioInferidoAlaSalud);
		
		assertTrue( salud.vida() == 0);
		assertTrue( salud.terminada());
	}
	
	

}

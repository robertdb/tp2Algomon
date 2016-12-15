package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Elemento;
import fiuba.algo3.algomones.elementos.Vitamina;
import fiuba.algo3.algomones.especiesdealgomones.*;
import fiuba.algo3.algomones.excepciones.*;

public class VitaminaTest {

	
	@Test(expected = ElementoAgotadoException.class)
	public void testAlgomonAgoto5VitaminasYnoPuedeUtilizarMas(){
		
		Algomon rattata = new Rattata();
		
		Elemento vitamina = new Vitamina();
	
		vitamina.aplicar(rattata);
		vitamina.aplicar(rattata);
		vitamina.aplicar(rattata);
		vitamina.aplicar(rattata);
		vitamina.aplicar(rattata);
		
		assertTrue(true);
		
		vitamina.aplicar(rattata);
	
	}
	
	@Test
	public void testUsarVitaminaEnAlgomonPermite2AtaquesMas() {
		
		Algomon charmander = new Charmander();
		
		Algomon squirtle = new Squirtle();
		
		charmander.atacar(squirtle, "Fogonazo");
		
		charmander.atacar(squirtle, "Fogonazo");
		
		charmander.atacar(squirtle, "Fogonazo");
		
		charmander.atacar(squirtle, "Fogonazo");
		
		try{
			// No se efectua el ataque, se agotaron sus ataques.
			charmander.atacar(squirtle, "Fogonazo");
			
		}catch(AtaqueAgotadoException e){}
		
		Elemento vitamina = new Vitamina();
		
		vitamina.aplicar(charmander);
		
		// El algomon tiene 2 ataques.
		charmander.atacar(squirtle, "Fogonazo");
		charmander.atacar(squirtle, "Fogonazo");
		assertEquals(144,squirtle.getVida(),0.001D);
		
	}
	

}

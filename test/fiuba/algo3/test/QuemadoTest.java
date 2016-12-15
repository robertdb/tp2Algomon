package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.ContextoEstado;
import fiuba.algo3.algomones.especiesdealgomones.Bulbasaur;
import fiuba.algo3.algomones.estadosdealgomones.EstadoQuemado;

public class QuemadoTest {

	@Test
	public void testEfectoQuemadoQuita10PorcientoDeVidaOriginal(){

		Algomon bulbasaur = new Bulbasaur();
		
		ContextoEstado contexto = new ContextoEstado();
		
		contexto.setEstadoPersistente(new EstadoQuemado());
		
		contexto.aplicarEfectosElemento(bulbasaur);
		
		assertEquals(126, bulbasaur.getVida(), 0.001D);
		
		contexto.aplicarEfectosAtaque(bulbasaur);
		
		assertEquals(112, bulbasaur.getVida(), 0.001D);
				
	}
	
	

}

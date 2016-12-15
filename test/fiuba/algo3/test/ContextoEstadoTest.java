package fiuba.algo3.test;

import static org.junit.Assert.*;
import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.ContextoEstado;
import fiuba.algo3.algomones.elementos.Restaurador;
import fiuba.algo3.algomones.especiesdealgomones.*;
import fiuba.algo3.algomones.estadosdealgomones.*;
import fiuba.algo3.algomones.excepciones.AlgomonDormidoNoPuedeAtacarException;

	public class ContextoEstadoTest {

	
	@Test
	public void testSeAplicanEfectosDormidoYQuemadoAlAlgomon(){
		
		AlgomonDormidoNoPuedeAtacarException err1 = null;
		AlgomonDormidoNoPuedeAtacarException err2 = null;
		AlgomonDormidoNoPuedeAtacarException err3 = null;
		AlgomonDormidoNoPuedeAtacarException err4 = null;
		
		Algomon bulbasaur = new Bulbasaur();

		ContextoEstado contexto = new ContextoEstado(); 
		
		contexto.setEstadoEfimero(new EstadoDormido());
		
		contexto.setEstadoPersistente(new EstadoQuemado());
		
		
		try{
			
			contexto.aplicarEfectosAtaque(bulbasaur);
			contexto.aplicarEfectosElemento(bulbasaur);
			
		}catch(AlgomonDormidoNoPuedeAtacarException exep){
			
			err1 = exep;
			
		}
		
		try{
			
			contexto.aplicarEfectosAtaque(bulbasaur);
			contexto.aplicarEfectosElemento(bulbasaur);
			
		}catch(AlgomonDormidoNoPuedeAtacarException exep){
			
			err2 = exep;
			
		}
		try{
			
			contexto.aplicarEfectosAtaque(bulbasaur);
			contexto.aplicarEfectosElemento(bulbasaur);
			
		}catch(AlgomonDormidoNoPuedeAtacarException exep){
			
			err3 = exep;
		}

		try{
			contexto.aplicarEfectosAtaque(bulbasaur);
			contexto.aplicarEfectosElemento(bulbasaur);
			
		}catch(AlgomonDormidoNoPuedeAtacarException exep){
			
			err4 = exep;
		}
		
		assertTrue(err1 instanceof AlgomonDormidoNoPuedeAtacarException);
		assertTrue(err2 instanceof AlgomonDormidoNoPuedeAtacarException);
		assertTrue(err3 instanceof AlgomonDormidoNoPuedeAtacarException);
		assertFalse(err4 instanceof AlgomonDormidoNoPuedeAtacarException);
		assertEquals(70,bulbasaur.getVida(),0.01D);
		
		
	}
	
	
	@Test
	public void testElEfectoQuemadoCausaDanioEnElAlgomonAntesDeDesactivarse(){
		
		
		Algomon bulbasaur = new Bulbasaur();
		
		bulbasaur.setEstadoPersistente(new EstadoQuemado());
		
		Restaurador restaurador = new Restaurador();
		
		bulbasaur.aplicarElemento(restaurador);
		
		assertEquals(126, bulbasaur.getVida(),0.01D);
		
	}
	
	
}

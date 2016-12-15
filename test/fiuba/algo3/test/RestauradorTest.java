package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.Elemento;
import fiuba.algo3.algomones.logica.elementos.Restaurador;
import fiuba.algo3.algomones.logica.especiesdealgomones.*;
import fiuba.algo3.algomones.logica.excepciones.*;

public class RestauradorTest {

	@Test
	public void testUsarRestauradorEnAlgomonBajoEfectoQuemadoPuedeAtacar() {
		
		Algomon charmander = new Charmander();
		
		Algomon squirtle = new Squirtle();
		
		charmander.atacar(squirtle, "Fogonazo");
		assertEquals(149,squirtle.getVida(),0.001D);
		
		// squirtle bajo el efecto quemado.
		squirtle.atacar(charmander, "Ataque Rapido");
		assertEquals(134,squirtle.getVida(),0.001D);
		
		Elemento restaurador = new Restaurador();
		
		squirtle.aplicarElemento(restaurador);
		
		// squirtle se quema por ultima vez al aplicarse el restaurador.
		squirtle.atacar(charmander, "Ataque Rapido");
		assertEquals(119,squirtle.getVida(),0.001D);
		
		// squirtle no esta mas bajo el efecto quemado.
		squirtle.atacar(charmander, "Ataque Rapido");
		assertEquals(119,squirtle.getVida(),0.001D);
			
	}
	
	@Test
	public void testUsarRestauradorEnAlgomonBajoEfectoDomidoPuedeAtacar() {
		
		Algomon chansey = new Chansey();
		
		Algomon squirtle = new Squirtle();
		
		chansey.atacar(squirtle, "Canto");
		
		try{
			
			squirtle.atacar(chansey, "Ataque Rapido");
		
		}catch(AlgomonDormidoNoPuedeAtacarException exception){}
		
		assertEquals(130,chansey.getVida(),0.001D);
		
		Elemento restaurador = new Restaurador();
		
		squirtle.aplicarElemento(restaurador);;
		
		squirtle.atacar(chansey, "Ataque Rapido");
		
		assertEquals(120,chansey.getVida(),0.001D);
			
	}
	
	@Test(expected = ElementoAgotadoException.class)
	public void testAlgomonAgotoLosRestauradoresYnoPuedeUtilizarMas(){
		
		Algomon rattata = new Rattata();
		
		Elemento restaurador = new Restaurador();
	
		restaurador.aplicar(rattata);
		restaurador.aplicar(rattata);
		restaurador.aplicar(rattata);
		
		assertTrue(true);
		
		restaurador.aplicar(rattata);
		
	}
	
}

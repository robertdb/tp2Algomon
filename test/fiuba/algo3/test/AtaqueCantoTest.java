package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.excepciones.AlgomonDormidoNoPuedeAtacarException;
import fiuba.algo3.algomones.logica.especiesdealgomones.*;

public class AtaqueCantoTest {

	@Test
	public void testAtacarConCantoYelAtacadoNoPuedeAtacarDurante3Turnos() {
		
		Algomon chansey = new Chansey();
		
		Algomon squirtle = new Squirtle();
		
		chansey.atacar(squirtle, "Canto");
		
		try{
			
			squirtle.atacar(chansey, "Ataque Rapido");
		
		}catch (AlgomonDormidoNoPuedeAtacarException exception){}
		
		try{
			
			squirtle.atacar(chansey, "Ataque Rapido");
		
		}catch (AlgomonDormidoNoPuedeAtacarException exception){}
		
		try{
			
			squirtle.atacar(chansey, "Ataque Rapido");
		
		}catch (AlgomonDormidoNoPuedeAtacarException exception){}
		
		assertEquals(130,chansey.getVida(),0.001D);
		
		squirtle.atacar(chansey, "Ataque Rapido");
		
		assertEquals(120,chansey.getVida(),0.001D);

		
	}
}

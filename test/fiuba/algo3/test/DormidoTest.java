package fiuba.algo3.test;

import org.junit.Test;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.especiesdealgomones.*;
import fiuba.algo3.algomones.logica.estadosdealgomones.EstadoDormido;
import fiuba.algo3.algomones.logica.excepciones.AlgomonDormidoNoPuedeAtacarException;

public class DormidoTest {

	@Test(expected = AlgomonDormidoNoPuedeAtacarException.class)
	public void testEfectoDormirProduceUnaExcepcion(){
	
		Algomon bulbasaur = new Bulbasaur();
		
		Algomon charmander = new Charmander();

		bulbasaur.setEstadoEfimero(new EstadoDormido());
		
		bulbasaur.atacar(charmander, "Latigo Cepa");
		
	}
	
}

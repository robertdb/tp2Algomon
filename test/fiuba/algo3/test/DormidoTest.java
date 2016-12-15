package fiuba.algo3.test;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.especiesdealgomones.*;
import fiuba.algo3.algomones.estadosdealgomones.EstadoDormido;
import fiuba.algo3.algomones.excepciones.AlgomonDormidoNoPuedeAtacarException;

public class DormidoTest {

	@Test(expected = AlgomonDormidoNoPuedeAtacarException.class)
	public void testEfectoDormirProduceUnaExcepcion(){
	
		Algomon bulbasaur = new Bulbasaur();
		
		Algomon charmander = new Charmander();

		bulbasaur.setEstadoEfimero(new EstadoDormido());
		
		bulbasaur.atacar(charmander, "Latigo Cepa");
		
	}
	
}

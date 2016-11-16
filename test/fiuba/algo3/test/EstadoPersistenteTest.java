package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.AlgomonEstado;
import fiuba.algo3.algomones.ContextoEstado;
import fiuba.algo3.algomones.Dormido;
import fiuba.algo3.algomones.Efecto;
import fiuba.algo3.algomones.EstadoEfimero;
import fiuba.algo3.algomones.EstadoPersistente;
import fiuba.algo3.algomones.Quemado;
import fiuba.algo3.algomones.Salud;
import fiuba.algo3.algomones.TipoPlanta;

public class EstadoPersistenteTest {

	@Test
	public void testAlgomonEnEstadoPersistenteSeQuema(){
				
		Efecto quemado = new Quemado();
		
		AlgomonEstado persistente = new EstadoPersistente(quemado);
		
		Algomon venusaur = new Algomon("Venusaur", new TipoPlanta(), null, new Salud(400));
		
		persistente.aplicarEfecto(venusaur);
		
		assertEquals(360,venusaur.salud(),0.01D);
		
		persistente.aplicarEfecto(venusaur);
		
		assertEquals(320,venusaur.salud(),0.01D);
		
	}

}

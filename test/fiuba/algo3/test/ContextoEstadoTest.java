package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.AlgomonEstado;
import fiuba.algo3.algomones.ContextoEstado;
import fiuba.algo3.algomones.Dormido;
import fiuba.algo3.algomones.Efecto;
import fiuba.algo3.algomones.EstadoEfimero;
import fiuba.algo3.algomones.EstadoPersistente;
import fiuba.algo3.algomones.Quemado;

public class ContextoEstadoTest {

	@Test
	public void testContextoEstadoInicial() {
		ContextoEstado contexto = new ContextoEstado(); 
		
		assertEquals(false,contexto.estaAfectado());
		
		Efecto dormido = new Dormido();
		AlgomonEstado efimero = new EstadoEfimero(dormido);
		contexto.estadoNuevo(efimero);
		
		Efecto quemado = new Quemado();
		AlgomonEstado persistente = new EstadoPersistente(quemado);
		contexto.estadoNuevo(persistente);
		
		assertEquals(true,contexto.estaAfectado());
		
		
		
	}

}

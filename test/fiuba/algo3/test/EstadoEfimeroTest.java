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
import fiuba.algo3.algomones.excepciones.AtacarDormidoNoPuedeRealizarseException;

public class EstadoEfimeroTest {

	@Test(expected = AtacarDormidoNoPuedeRealizarseException.class)
	public void testAlgomonEnEstadoEfimeroNoPuedeAtacar(){
		
		Algomon venusaur = new Algomon("Venusaur", new TipoPlanta(), null, new Salud(400));
		
		Efecto dormido = new Dormido();
		
		AlgomonEstado efimero = new EstadoEfimero(dormido);
		
		efimero.aplicarEfecto(venusaur);
		
	}
	
}

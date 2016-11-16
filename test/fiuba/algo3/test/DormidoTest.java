package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Dormido;
import fiuba.algo3.algomones.Efecto;
import fiuba.algo3.algomones.Quemado;
import fiuba.algo3.algomones.Salud;
import fiuba.algo3.algomones.Tipo;
import fiuba.algo3.algomones.TipoPlanta;
import fiuba.algo3.algomones.excepciones.AtacarDormidoNoPuedeRealizarseException;

public class DormidoTest {

	@Test(expected = AtacarDormidoNoPuedeRealizarseException .class)
	public void testContextoConAlgomonBolbasour(){

		Efecto dormido = new Dormido();
		
		Salud salud = new Salud(400);
		
		Algomon venusaur = new Algomon("Venusaur", new TipoPlanta(), null, salud);
				
		dormido.aplicarEfecto(venusaur);
		
	}

}

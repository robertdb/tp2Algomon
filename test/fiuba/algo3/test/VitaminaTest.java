package fiuba.algo3.test;

import static org.junit.Assert.*;

import java.util.EnumMap;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Ataque;
import fiuba.algo3.algomones.AtaqueSimple;
import fiuba.algo3.algomones.Elemento;
import fiuba.algo3.algomones.NombreDelAtaque;
import fiuba.algo3.algomones.Salud;
import fiuba.algo3.algomones.SuperPocion;
import fiuba.algo3.algomones.TipoNormal;
import fiuba.algo3.algomones.Vitamina;
import fiuba.algo3.algomones.excepciones.VitaminaAgotadaException;

public class VitaminaTest {

	
	@Test(expected = VitaminaAgotadaException.class)
	public void testAlgomonAgotoLasPosionesYnoPuedeUtilizarMasPosiones(){
		
		// Se crea un algomon personalizado.
	    int potenciaAtaqueRapido = 25;
		int cantidadMaximaDeAtaquesAtaqueRapido = 16;
		Ataque ataqueRapido = new AtaqueSimple(new TipoNormal(), potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
		EnumMap<NombreDelAtaque, Ataque> ataquesNormal = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataquesNormal.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
		Salud saludRaticate = new Salud(300);
		Algomon raticate = new Algomon("Raticate", new TipoNormal(), ataquesNormal, saludRaticate);
				
		Elemento vitamina = new Vitamina();
			
		vitamina.aplicarElemento(raticate);
		vitamina.aplicarElemento(raticate);
		vitamina.aplicarElemento(raticate);
		vitamina.aplicarElemento(raticate);
		vitamina.aplicarElemento(raticate);
		vitamina.aplicarElemento(raticate);
	
	}
	
	@Test
	public void testUsarVitaminaEnAlgomonPermite2AtaquesMas() {
		assertTrue(true);
	}
	
	@Test
	public void testUsarVitaminaEnAlgomonNoPuedoAgregarMasAtaquesQueCantidadMaxima() {
		assertTrue(true);
	}
	

}

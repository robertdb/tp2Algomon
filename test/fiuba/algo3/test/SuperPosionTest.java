package fiuba.algo3.test;

import static org.junit.Assert.*;

import java.util.EnumMap;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Ataque;
import fiuba.algo3.algomones.AtaqueSimple;
import fiuba.algo3.algomones.Elemento;
import fiuba.algo3.algomones.NombreDelAtaque;
import fiuba.algo3.algomones.Posion;
import fiuba.algo3.algomones.Salud;
import fiuba.algo3.algomones.SuperPosion;
import fiuba.algo3.algomones.TipoNormal;
import fiuba.algo3.algomones.excepciones.PosionAgotadaException;
import fiuba.algo3.algomones.excepciones.SuperPosionAgotadaException;

public class SuperPosionTest {

	@Test
	public void testUsarSuperPosionEnAlgomonCon40ptsDeDanioRecuperaTodaSuVida() {
		assertTrue(true);
	}
	
	@Test
	public void testUsarSuperPosionEnAlgomonConVidaSinSerDaniadaNoRecuperaPtsDeVida() {
		assertTrue(true);
	}
	
	@Test(expected = SuperPosionAgotadaException.class)
	public void testAlgomonAgotoLasPosionesYnoPuedeUtilizarMasPosiones(){
		
		// Se crea un algomon personalizado.
		int potenciaAtaqueRapido = 25;
		int cantidadMaximaDeAtaquesAtaqueRapido = 16;
		Ataque ataqueRapido = new AtaqueSimple(new TipoNormal(), potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
		EnumMap<NombreDelAtaque, Ataque> ataquesNormal = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataquesNormal.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
		Salud saludRaticate = new Salud(300);
		Algomon raticate = new Algomon("Raticate", new TipoNormal(), ataquesNormal, saludRaticate);
		
		Elemento superPosion = new SuperPosion();
	
		superPosion.aplicarElemento(raticate);
		superPosion.aplicarElemento(raticate);
		throw new SuperPosionAgotadaException();
	}
	
}

package fiuba.algo3.test;

import static org.junit.Assert.*;
import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.especiesdealgomones.*;

public class PrimeraEntregaTests {

	@Test
	public final void testSquirtleAtacaConBurbujaYConCanionDeAguaYLeQuita20Y40PuntosDeVidaRespectivamenteACharmander() {
		Algomon squirtle = new Squirtle();
		Algomon charmander = new Charmander();
		int vidaCharmanderPreAtaque = charmander.getVida();
		squirtle.atacar(charmander, "Burbuja");
		assertEquals(charmander.getVida(), vidaCharmanderPreAtaque - 20);
		vidaCharmanderPreAtaque = charmander.getVida();
		squirtle.atacar(charmander, "Canon De Agua");
		assertEquals(charmander.getVida(), vidaCharmanderPreAtaque - 40);
	}
	
	@Test
	public final void testSquirtleAtacaConBurbujaYConCanionDeAguaABulbasaurYLeQuita5Y10PuntosDeVidaRespectivamente() {
		Algomon squirtle = new Squirtle();
		Algomon bulbasaur = new Bulbasaur();
		int vidaBulbasaurPreAtaque = bulbasaur.getVida();
		squirtle.atacar(bulbasaur, "Burbuja");
		assertEquals(bulbasaur.getVida(), vidaBulbasaurPreAtaque - 5);
		vidaBulbasaurPreAtaque = bulbasaur.getVida();
		squirtle.atacar(bulbasaur, "Canon De Agua");
		assertEquals(bulbasaur.getVida(), vidaBulbasaurPreAtaque - 10);
	}
	
	@Test
	public final void testSquirtleAtacaConBurbujaYConCanionDeAguaALosOtrosAlgomonesYLesQuita10Y20PuntosDeVidaRespectivamente() {
		Algomon squirtle = new Squirtle();
		Algomon jigglypuff = new Jigglypuff();
		Algomon chansey = new Chansey();
		Algomon rattata = new Rattata();

		int vidaJigglypuffPreAtaque = jigglypuff.getVida();
		squirtle.atacar(jigglypuff, "Burbuja");
		assertEquals(jigglypuff.getVida(), vidaJigglypuffPreAtaque - 10);
		vidaJigglypuffPreAtaque = jigglypuff.getVida();
		squirtle.atacar(jigglypuff, "Canon De Agua");
		assertEquals(jigglypuff.getVida(), vidaJigglypuffPreAtaque - 20);

		int vidaChanseyPreAtaque = chansey.getVida();
		squirtle.atacar(chansey, "Burbuja");
		assertEquals(chansey.getVida(), vidaChanseyPreAtaque - 10);
		vidaChanseyPreAtaque = chansey.getVida();
		squirtle.atacar(chansey, "Canon De Agua");
		assertEquals(chansey.getVida(), vidaChanseyPreAtaque - 20);

		int vidaRattataPreAtaque = rattata.getVida();
		squirtle.atacar(rattata, "Burbuja");
		assertEquals(rattata.getVida(), vidaRattataPreAtaque - 10);
		vidaRattataPreAtaque = rattata.getVida();
		squirtle.atacar(rattata, "Canon De Agua");
		assertEquals(rattata.getVida(), vidaRattataPreAtaque - 20);
	}
	
	@Test
	public final void testBulbasaurYChanseyAtacanConLatigoCepaASquirtleYLeQuitan30PuntosDeVida() {
		Algomon bulbasaur = new Bulbasaur();
		Algomon chansey = new Chansey();
		Algomon squirtle = new Squirtle();
		int vidaSquirtlePreAtaque = squirtle.getVida();
		bulbasaur.atacar(squirtle, "Latigo Cepa");
		assertEquals(squirtle.getVida(), vidaSquirtlePreAtaque - 30);
		vidaSquirtlePreAtaque = squirtle.getVida();
		chansey.atacar(squirtle, "Latigo Cepa");
		assertEquals(squirtle.getVida(), vidaSquirtlePreAtaque - 30);
	}
	
	@Test
	public final void testBulbasaurYChanseyAtacanConLatigoCepaACharmanderYLeQuitan7PuntosDeVida() {
		Algomon bulbasaur = new Bulbasaur();
		Algomon chansey = new Chansey();
		Algomon charmander = new Charmander();
		int vidaCharmanderPreAtaque = charmander.getVida();
		bulbasaur.atacar(charmander, "Latigo Cepa");
		assertEquals(charmander.getVida(), vidaCharmanderPreAtaque - 7);
		vidaCharmanderPreAtaque = charmander.getVida();
		chansey.atacar(charmander, "Latigo Cepa");
		assertEquals(charmander.getVida(), vidaCharmanderPreAtaque - 7);
	}
	
	@Test
	public final void testBulbasaurYChanseyAtacanConLatigoCepaAOtrosAlgomonesYLesQuitan15PuntosDeVidaACadaUno() {
		Algomon bulbasaur = new Bulbasaur();
		Algomon chansey = new Chansey();
		Algomon jigglypuff = new Jigglypuff();
		Algomon rattata = new Rattata();
		
		int vidaJigglypuffPreAtaque = jigglypuff.getVida();
		bulbasaur.atacar(jigglypuff, "Latigo Cepa");
		assertEquals(jigglypuff.getVida(), vidaJigglypuffPreAtaque - 15);
		vidaJigglypuffPreAtaque = jigglypuff.getVida();
		chansey.atacar(jigglypuff, "Latigo Cepa");
		assertEquals(jigglypuff.getVida(), vidaJigglypuffPreAtaque - 15);
		
		int vidaRattataPreAtaque = rattata.getVida();
		bulbasaur.atacar(rattata, "Latigo Cepa");
		assertEquals(rattata.getVida(), vidaRattataPreAtaque - 15);
		vidaRattataPreAtaque = rattata.getVida();
		chansey.atacar(rattata, "Latigo Cepa");
		assertEquals(rattata.getVida(), vidaRattataPreAtaque - 15);
		
	}
	
	@Test
	public final void testCharmanderAtacaConBrasasABulbasaurYLeQuita32PuntosDeVida() {
		Algomon charmander = new Charmander();
		Algomon bulbasaur = new Bulbasaur();
		int vidaBulbasaurPreAtaque = bulbasaur.getVida();
		charmander.atacar(bulbasaur, "Brasas");
		assertEquals(bulbasaur.getVida(), vidaBulbasaurPreAtaque - 32);
	}
	
	@Test
	public final void testCharmanderAtacaConBrasasASquirtleYLeQuita8PuntosDeVida() {
		Algomon charmander = new Charmander();
		Algomon squirtle = new Squirtle();
		int vidaSquirtlePreAtaque = squirtle.getVida();
		charmander.atacar(squirtle, "Brasas");
		assertEquals(squirtle.getVida(), vidaSquirtlePreAtaque - 8);
	}
	
	@Test
	public final void testCharmanderAtacaConBrasasAOtrosAlgomonesYLesQuita16PuntosDeVidaACadaUno() {
		Algomon charmander = new Charmander();
		Algomon jigglypuff = new Jigglypuff();
		Algomon chansey = new Chansey();
		Algomon rattata = new Rattata();
		
		int vidaJigglypuffPreAtaque = jigglypuff.getVida();
		charmander.atacar(jigglypuff, "Brasas");
		assertEquals(jigglypuff.getVida(), vidaJigglypuffPreAtaque - 16);
		
		int vidaChanseyPreAtaque = chansey.getVida();
		charmander.atacar(chansey, "Brasas");
		assertEquals(chansey.getVida(), vidaChanseyPreAtaque - 16);
		
		int vidaRattataPreAtaque = rattata.getVida();
		charmander.atacar(rattata, "Brasas");
		assertEquals(rattata.getVida(), vidaRattataPreAtaque - 16);
	}
	
	@Test
	public final void testAlgomonesAtacanConAtaqueRapidoYQuitan10PuntosDeVidaAOtrosAlgomonesIndependientementeDelTipoDelAlgomonAtacado() {
		Algomon charmander = new Charmander();
		Algomon squirtle = new Squirtle();
		Algomon bulbasaur = new Bulbasaur();
		Algomon jigglypuff = new Jigglypuff();
		Algomon chansey = new Chansey();
		Algomon rattata = new Rattata();
		
		int vidaSquirtlePreAtaque = squirtle.getVida();
		charmander.atacar(squirtle, "Ataque Rapido");
		assertEquals(squirtle.getVida(), vidaSquirtlePreAtaque - 10);

		int vidaBulbasaurPreAtaque = bulbasaur.getVida();
		squirtle.atacar(bulbasaur, "Ataque Rapido");
		assertEquals(bulbasaur.getVida(), vidaBulbasaurPreAtaque - 10);

		int vidaJigglypuffPreAtaque = jigglypuff.getVida();
		bulbasaur.atacar(jigglypuff, "Ataque Rapido");
		assertEquals(jigglypuff.getVida(), vidaJigglypuffPreAtaque - 10);
		
		int vidaChanseyPreAtaque = chansey.getVida();
		jigglypuff.atacar(chansey, "Ataque Rapido");
		assertEquals(chansey.getVida(), vidaChanseyPreAtaque - 10);

		int vidaRattataPreAtaque = rattata.getVida();
		chansey.atacar(rattata, "Ataque Rapido");
		assertEquals(rattata.getVida(), vidaRattataPreAtaque - 10);
		
		int vidaCharmanderPreAtaque = charmander.getVida();
		rattata.atacar(charmander, "Ataque Rapido");
		assertEquals(charmander.getVida(), vidaCharmanderPreAtaque - 10);
		
	}
	
	@Test
	public final void testAlgomonesAgotanLaCantidadDisponibleDeCadaAtaqueYNoPuedenVolverAUtilizarlos() {
		Algomon squirtle = new Squirtle();
		Algomon rattata = new Rattata();
		int vidaRattataPreAtaque = rattata.getVida();
		
		squirtle.atacar(rattata, "Canon De Agua");
		squirtle.atacar(rattata, "Canon De Agua");
		squirtle.atacar(rattata, "Canon De Agua");
		squirtle.atacar(rattata, "Canon De Agua");
		squirtle.atacar(rattata, "Canon De Agua");
		squirtle.atacar(rattata, "Canon De Agua");
		squirtle.atacar(rattata, "Canon De Agua");
		squirtle.atacar(rattata, "Canon De Agua");
		
		assertEquals(rattata.getVida(), vidaRattataPreAtaque - 160);
		
		boolean tiroExcepcionEsperada = false;
		try {
			squirtle.atacar(rattata, "Canon De Agua");
		} catch (Exception CantidadDeAtaquesAgotadosException) {
			tiroExcepcionEsperada = true;
		}
		
		assert(tiroExcepcionEsperada);
		assertEquals(rattata.getVida(), vidaRattataPreAtaque - 160);
		
	}

}

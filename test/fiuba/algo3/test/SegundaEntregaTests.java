package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.logica.*;
import fiuba.algo3.algomones.logica.especiesdealgomones.*;

public class SegundaEntregaTests {

	@Test
	public final void testJigglypuffYChanseyAtacanConCantoYElAlgomonAtacadoNoPuedeAtacarPorTresTurnos() {
		Algomon jigglypuff = new Jigglypuff();
		Algomon rattata = new Rattata();
		jigglypuff.atacar(rattata, "Canto");
		int vidaOriginalJigglypuff = jigglypuff.getVida();
		boolean tiroExcepcionEsperada = false;
		try {
			rattata.atacar(jigglypuff, "Ataque Rapido");
		} catch (Exception AlgomonDormidoNoPuedeAtacarException) {
			tiroExcepcionEsperada = true;
		}
		assert(tiroExcepcionEsperada);
		try {
			rattata.atacar(jigglypuff, "Ataque Rapido");
		} catch (Exception AlgomonDormidoNoPuedeAtacarException) {
			tiroExcepcionEsperada = true;
		}
		assert(tiroExcepcionEsperada);
		try {
			rattata.atacar(jigglypuff, "Ataque Rapido");
		} catch (Exception AlgomonDormidoNoPuedeAtacarException) {
			tiroExcepcionEsperada = true;
		}
		assert(tiroExcepcionEsperada);
		rattata.atacar(jigglypuff, "Ataque Rapido");
		assertEquals(jigglypuff.getVida(), vidaOriginalJigglypuff - 10);
	}
	
	@Test
	public final void testBulbasaurAtacaConChupavidasACharmanderYLeQuita7PuntosYGan29PuntosDeVida() {
		Algomon bulbasaur = new Bulbasaur();
		Algomon charmander = new Charmander();
		int vidaOriginalBulbasaur = bulbasaur.getVida();
		int vidaOriginalCharmander = charmander.getVida();
		bulbasaur.atacar(charmander, "Chupavidas");
		assertEquals(charmander.getVida(), vidaOriginalCharmander - 7);
		assertEquals(bulbasaur.getVida(), vidaOriginalBulbasaur + 2);
	}
	
	@Test
	public final void testBulbasaurAtacaConChupavidasASquirtleYLeQuita30PuntosYGana9PuntosDeVida() {
		Algomon bulbasaur = new Bulbasaur();
		Algomon squirtle = new Squirtle();
		int vidaOriginalBulbasaur = bulbasaur.getVida();
		int vidaOriginalSquirtle = squirtle.getVida();
		bulbasaur.atacar(squirtle, "Chupavidas");
		assertEquals(squirtle.getVida(), vidaOriginalSquirtle - 30);
		assertEquals(bulbasaur.getVida(), vidaOriginalBulbasaur + 9);
	}
	
	@Test
	public final void testBulbasaurAtacaConChupavidasAOtrosAlgomonesYLesQuita15PuntosDeVidaYAumenta4PuntosDeVida() {
		Algomon bulbasaur = new Bulbasaur();
		int vidaOriginalBulbasaur = bulbasaur.getVida();
		
		Algomon chansey = new Chansey();
		int vidaOriginalChansey = chansey.getVida();
		bulbasaur.atacar(chansey, "Chupavidas");
		assertEquals(chansey.getVida(), vidaOriginalChansey - 15);
		assertEquals(bulbasaur.getVida(), vidaOriginalBulbasaur + 4);
		
		Algomon rattata = new Rattata();
		int vidaOriginalRattata = rattata.getVida();
		bulbasaur.atacar(rattata, "Chupavidas");
		assertEquals(rattata.getVida(), vidaOriginalRattata - 15);
		assertEquals(bulbasaur.getVida(), vidaOriginalBulbasaur + 4 + 4);
		
		Algomon jigglypuff = new Jigglypuff();
		int vidaOriginalJigglypuff = jigglypuff.getVida();
		bulbasaur.atacar(jigglypuff, "Chupavidas");
		assertEquals(jigglypuff.getVida(), vidaOriginalJigglypuff - 15);
		assertEquals(bulbasaur.getVida(), vidaOriginalBulbasaur + 4 + 4 + 4);
	}
	
	@Test
	public final void testCharmanderYRattataAtacanConFogonazoYElAlgomonAtacadoRecibiraUn10PorcientoDeSusPuntosDeVidaOriginalesEnCadaTurnoEnQueEsteActivoMasElDanioCorrespondienteSegunSuTipoEnElMomentoDelAtaqueFogonazo() {
		Algomon charmander = new Charmander();
		Algomon squirtle = new Squirtle();
		int vidaOriginalSquirtle = squirtle.getVida();
		charmander.atacar(squirtle, "Fogonazo");
		assertEquals(squirtle.getVida(), vidaOriginalSquirtle - 1);
		squirtle.atacar(charmander, "Burbuja");
		assertEquals(squirtle.getVida(), vidaOriginalSquirtle - 1 - 15);
		squirtle.atacar(charmander, "Ataque Rapido");
		assertEquals(squirtle.getVida(), vidaOriginalSquirtle - 1 - 15 - 15);
		squirtle.atacar(charmander, "Burbuja");
		assertEquals(squirtle.getVida(), vidaOriginalSquirtle - 1 - 15 - 15 - 15);
		
		Algomon rattata = new Rattata();
		Algomon chansey = new Chansey();
		int vidaOriginalChansey = chansey.getVida();
		rattata.atacar(chansey, "Fogonazo");
		assertEquals(chansey.getVida(), vidaOriginalChansey - 2);
		chansey.atacar(rattata, "Latigo Cepa");
		assertEquals(chansey.getVida(), vidaOriginalChansey - 2 - 13);
		chansey.atacar(rattata, "Ataque Rapido");
		assertEquals(chansey.getVida(), vidaOriginalChansey - 2 - 13 - 13);
		chansey.atacar(rattata, "Canto");
		assertEquals(chansey.getVida(), vidaOriginalChansey - 2 - 13 - 13 - 13);
		
	}

}

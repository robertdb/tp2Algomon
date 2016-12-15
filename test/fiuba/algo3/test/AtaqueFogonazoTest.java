package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.especiesdealgomones.*;

public class AtaqueFogonazoTest {

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

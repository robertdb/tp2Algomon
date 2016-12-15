package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.especiesdealgomones.*;

public class AtaqueChupavidasTest {

	@Test
	public void testAtacarConChupavidasAunAlgomontipoFuegoQuita7ptsYgana2ptsDeVida() {
	
		Algomon bulbasaur = new Bulbasaur();
		Algomon charmander = new Charmander();
		int vidaOriginalBulbasaur = bulbasaur.getVida();
		int vidaOriginalCharmander = charmander.getVida();
		bulbasaur.atacar(charmander, "Chupavidas");
		assertEquals(charmander.getVida(), vidaOriginalCharmander - 7);
		assertEquals(bulbasaur.getVida(), vidaOriginalBulbasaur + 2);
		
	}
		
	
	@Test
	public void testAtacarConChupavidasAunAlgomontipoAguaQuita30ptsYgana9ptsDeVida() {
		
		Algomon bulbasaur = new Bulbasaur();
		Algomon squirtle = new Squirtle();
		int vidaOriginalBulbasaur = bulbasaur.getVida();
		int vidaOriginalSquirtle = squirtle.getVida();
		bulbasaur.atacar(squirtle, "Chupavidas");
		assertEquals(squirtle.getVida(), vidaOriginalSquirtle - 30);
		assertEquals(bulbasaur.getVida(), vidaOriginalBulbasaur + 9);

	}
	
	@Test
	public void testAtacarConChupavidasAunAlgomontipoNormalQuita15ptsYgana4ptsDeVida() {
		
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
	public void testAtacarConChupavidasAunAlgomontipoPlantaQuita7ptsYgana2ptsDeVida() {
		
		Algomon bulbasaur = new Bulbasaur();
		
		Algomon bulbasaur2 = new Bulbasaur();
		
		int vidaOriginalBulbasaur  = bulbasaur.getVida();
		int vidaOriginalBulbasaur2  = bulbasaur2.getVida();
		
		bulbasaur.atacar(bulbasaur2, "Chupavidas");
		
		assertEquals(vidaOriginalBulbasaur2 - 7,  bulbasaur2.getVida() , 0.001D);
		
		assertEquals(vidaOriginalBulbasaur + 2, bulbasaur.getVida(), 0.001D);

	}
	

}

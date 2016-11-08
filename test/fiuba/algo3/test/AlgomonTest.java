package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.NombreDelAtaque;
import fiuba.algo3.algomones.TipoDeAtaque;
import fiuba.algo3.algomones.excepciones.CantidadDeAtaquesAgotadosException;

public class AlgomonTest {

	@Test
	public void testAtacarConBurbujaQuita20ptsAunAlgomonTipoFuego() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		double vidaOriginal = charmander.vida();
		
		squirtle.atacar(charmander, NombreDelAtaque.BURBUJA);
		
		assertEquals(vidaOriginal - 20,  charmander.vida() , 0.001D);
		
	}
	
	@Test
	public void testAtacarConCanionDeAguaQuita40ptsAunAlgomonTipoFuego() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		double vidaOriginal = charmander.vida();
		
		squirtle.atacar(charmander, NombreDelAtaque.CANION_DE_AGUA);
		
		assertEquals(vidaOriginal - 40,  charmander.vida() , 0.001D);
		
	}
	
	@Test
	public void testAtacarConBurbujaQuita5ptsAunAlgomonTipoPlanta() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		double vidaOriginal = bulbasaur.vida();
		
		squirtle.atacar(bulbasaur, NombreDelAtaque.BURBUJA);
		
		assertEquals(vidaOriginal - 5, bulbasaur.vida() , 0.001D);
		
	}
	
	@Test
	public void testAtacarConCanionDeAguaQuita10ptsAunAlgomonTipoPlanta() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		double vidaOriginal = bulbasaur.vida();
		
		squirtle.atacar(bulbasaur, NombreDelAtaque.CANION_DE_AGUA);
		
		assertEquals(vidaOriginal - 10,  bulbasaur.vida() , 0.001D);
		
	}
	
	@Test
	public void testAtacarConCanionDeAguaQuita20ptsAunAlgomonTipoNormal() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon chansey = EspecieAlgomon.CHANSEY.nuevo();
		
		Algomon rattata = EspecieAlgomon.RATTATA.nuevo();
		
		double vidaOriginalChamsey = chansey.vida();
		
		double vidaOriginalRattata = rattata.vida();
		
		squirtle.atacar(chansey, NombreDelAtaque.CANION_DE_AGUA);
		
		squirtle.atacar(rattata, NombreDelAtaque.CANION_DE_AGUA);
		
		assertEquals(vidaOriginalChamsey - 20,  chansey.vida() , 0.001D);
		
		assertEquals(vidaOriginalRattata - 20,  rattata.vida() , 0.001D);
		
	}
	
	
	@Test
	public void testAtacarConLatigoCepaQuita30ptsAunAlgomonTipoAgua() {
		
		Algomon squirtle1 = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon squirtle2 = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		Algomon chansey = EspecieAlgomon.CHANSEY.nuevo();
		
		double vidaOriginalSquirtle1 = squirtle1.vida();
		
		double vidaOriginalSquirtle2 = squirtle2.vida();
		
		bulbasaur.atacar(squirtle1, NombreDelAtaque.LATIGO_CEPA);
		
		chansey.atacar(squirtle2, NombreDelAtaque.LATIGO_CEPA);
		
		assertEquals(vidaOriginalSquirtle1 - 30,  squirtle1.vida() , 0.001D);
		
		assertEquals(vidaOriginalSquirtle2 - 30,  squirtle2.vida() , 0.001D);
		
	}
	
	
	@Test
	public void testAtacarConLatigoCepaQuita7ptsAunAlgomonTipoFuego() {
		
		Algomon charmi1 = EspecieAlgomon.CHARMANDER.nuevo();
		
		Algomon charmi2= EspecieAlgomon.CHARMANDER.nuevo();
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		Algomon chansey = EspecieAlgomon.CHANSEY.nuevo();
		
		double vidaOriginalCharmi1 = charmi1.vida();
		
		double vidaOriginaCharmi2 = charmi2.vida();
		
		bulbasaur.atacar(charmi1, NombreDelAtaque.LATIGO_CEPA);
		
		chansey.atacar(charmi2, NombreDelAtaque.LATIGO_CEPA);
		
		assertEquals(vidaOriginalCharmi1 - 7,  charmi1.vida() , 0.001D);
		
		assertEquals(vidaOriginaCharmi2  - 7,  charmi2.vida() , 0.001D);
		
	}
	
	
	@Test
	public void testAtacarConLatigoCepaQuita15ptsAunAlgomonTipoNormal() {
		
		Algomon jiggly1 = EspecieAlgomon.JIGGLYPUFF.nuevo();
		
		Algomon jiggly2 = EspecieAlgomon.JIGGLYPUFF.nuevo();
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		Algomon chansey = EspecieAlgomon.CHANSEY.nuevo();
		
		double vidaOriginalJiggly1 = jiggly1.vida();
		
		double vidaOriginaJiggly2 = jiggly2.vida();
		
		bulbasaur.atacar(jiggly1, NombreDelAtaque.LATIGO_CEPA);
		
		chansey.atacar(jiggly2, NombreDelAtaque.LATIGO_CEPA);
		
		assertEquals(vidaOriginalJiggly1 - 15,  jiggly1.vida() , 0.001D);
		
		assertEquals(vidaOriginaJiggly2 - 15,  jiggly2.vida() , 0.001D);
		
	}
	
	
	@Test
	public void testAtacarConBrasasQuita32ptsAunAlgomonTipoAgua() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		double vidaOriginal = squirtle.vida();
		
		charmander.atacar(squirtle, NombreDelAtaque.BRASAS);
		
		assertEquals(vidaOriginal - 8,  squirtle.vida() , 0.001D);
		
	}
	
	
	@Test
	public void testAtacarConBrasasQuita8ptsAunAlgomonTipoPlanta() {
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		double vidaOriginal = bulbasaur.vida();
		
		charmander.atacar(bulbasaur, NombreDelAtaque.BRASAS);
		
		assertEquals(vidaOriginal - 32,  bulbasaur.vida() , 0.001D);
		
	}
	
	@Test
	public void testAtacarConBrasasQuita16ptsAunAlgomonTipoNormal() {
		
		Algomon rattata = EspecieAlgomon.RATTATA.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		double vidaOriginal = rattata.vida();
		
		charmander.atacar(rattata, NombreDelAtaque.BRASAS);
		
		assertEquals(vidaOriginal - 16,  rattata.vida() , 0.001D);
		
	}
	
	
	@Test
	public void testAlgomonesAtacanConAtaqueRapidoYquitan10ptsDeVidaAdosAlgomones() {
		
		Algomon jiggly1 = EspecieAlgomon.JIGGLYPUFF.nuevo();
		
		Algomon jiggly2 = EspecieAlgomon.JIGGLYPUFF.nuevo();
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		Algomon chansey = EspecieAlgomon.CHANSEY.nuevo();
		
		double vidaOriginalJiggly1 = jiggly1.vida();
		
		double vidaOriginaJiggly2 = jiggly2.vida();
		
		bulbasaur.atacar(jiggly1, NombreDelAtaque.ATAQUE_RAPIDO);
		
		chansey.atacar(jiggly2, NombreDelAtaque.ATAQUE_RAPIDO);
		
		assertEquals(vidaOriginalJiggly1 - 10,  jiggly1.vida() , 0.001D);
		
		assertEquals(vidaOriginaJiggly2 - 10,  jiggly2.vida() , 0.001D);
		
	}
	
	@Test(expected = CantidadDeAtaquesAgotadosException .class)
	public void testAlgomonAgotoLaCantidadDeAtaquesLatigoCepaYnoPuedeUtilizarElAtaque(){
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		int cantidadQueSuperaAlMaximoDeAtaques = 15;
		int ataque  = 1;
		
		while (ataque < cantidadQueSuperaAlMaximoDeAtaques  ){
			
			bulbasaur.atacar(charmander, NombreDelAtaque.LATIGO_CEPA);
			ataque += 1;	
		
		}	
	}
	
	@Test(expected = CantidadDeAtaquesAgotadosException .class)
	public void testAlgomonAgotoLaCantidadDeAtaquesbrasasYnoPuedeUtilizarElAtaque(){
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		int cantidadQueSuperaAlMaximoDeAtaques = 15;
		int ataque  = 1;
		
		while (ataque < cantidadQueSuperaAlMaximoDeAtaques  ){
			
			charmander.atacar(bulbasaur, NombreDelAtaque.BRASAS);
			ataque += 1;	
		
		}	
	}
}

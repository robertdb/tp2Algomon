package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.NombreDelAtaque;
import fiuba.algo3.algomones.excepciones.AtacarDormidoNoPuedeRealizarseException;
import fiuba.algo3.algomones.excepciones.AtaqueNoPertenecienteAalgomonException;
import fiuba.algo3.algomones.excepciones.CantidadDeAtaquesAgotadosException;

public class AlgomonTest {

	@Test
	public void testAtacarConBurbujaQuita20ptsAunAlgomonTipoFuego() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		double vidaOriginal = charmander.salud();
		
		squirtle.atacar(charmander, NombreDelAtaque.BURBUJA);
		
		assertEquals(vidaOriginal - 20,  charmander.salud() , 0.001D);
		
	}
	
	@Test
	public void testAtacarConCanionDeAguaQuita40ptsAunAlgomonTipoFuego() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		double vidaOriginal = charmander.salud();
		
		squirtle.atacar(charmander, NombreDelAtaque.CANION_DE_AGUA);
		
		assertEquals(vidaOriginal - 40,  charmander.salud() , 0.001D);
		
	}
	
	@Test
	public void testAtacarConBurbujaQuita5ptsAunAlgomonTipoPlanta() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		double vidaOriginal = bulbasaur.salud();
		
		squirtle.atacar(bulbasaur, NombreDelAtaque.BURBUJA);
		
		assertEquals(vidaOriginal - 5, bulbasaur.salud() , 0.001D);
		
	}
	
	@Test
	public void testAtacarConCanionDeAguaQuita10ptsAunAlgomonTipoPlanta() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		double vidaOriginal = bulbasaur.salud();
		
		squirtle.atacar(bulbasaur, NombreDelAtaque.CANION_DE_AGUA);
		
		assertEquals(vidaOriginal - 10,  bulbasaur.salud() , 0.001D);
		
	}
	
	@Test
	public void testAtacarConCanionDeAguaQuita20ptsAunAlgomonTipoNormal() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon chansey = EspecieAlgomon.CHANSEY.nuevo();
		
		Algomon rattata = EspecieAlgomon.RATTATA.nuevo();
		
		double vidaOriginalChamsey = chansey.salud();
		
		double vidaOriginalRattata = rattata.salud();
		
		squirtle.atacar(chansey, NombreDelAtaque.CANION_DE_AGUA);
		
		squirtle.atacar(rattata, NombreDelAtaque.CANION_DE_AGUA);
		
		assertEquals(vidaOriginalChamsey - 20,  chansey.salud() , 0.001D);
		
		assertEquals(vidaOriginalRattata - 20,  rattata.salud() , 0.001D);
		
	}
	
	
	@Test
	public void testAtacarConLatigoCepaQuita30ptsAunAlgomonTipoAgua() {
		
		Algomon squirtle1 = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon squirtle2 = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		Algomon chansey = EspecieAlgomon.CHANSEY.nuevo();
		
		double vidaOriginalSquirtle1 = squirtle1.salud();
		
		double vidaOriginalSquirtle2 = squirtle2.salud();
		
		bulbasaur.atacar(squirtle1, NombreDelAtaque.LATIGO_CEPA);
		
		chansey.atacar(squirtle2, NombreDelAtaque.LATIGO_CEPA);
		
		assertEquals(vidaOriginalSquirtle1 - 30,  squirtle1.salud() , 0.001D);
		
		assertEquals(vidaOriginalSquirtle2 - 30,  squirtle2.salud() , 0.001D);
		
	}
	
	
	@Test
	public void testAtacarConLatigoCepaQuita7ptsAunAlgomonTipoFuego() {
		
		Algomon charmi1 = EspecieAlgomon.CHARMANDER.nuevo();
		
		Algomon charmi2= EspecieAlgomon.CHARMANDER.nuevo();
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		Algomon chansey = EspecieAlgomon.CHANSEY.nuevo();
		
		double vidaOriginalCharmi1 = charmi1.salud();
		
		double vidaOriginaCharmi2 = charmi2.salud();
		
		bulbasaur.atacar(charmi1, NombreDelAtaque.LATIGO_CEPA);
		
		chansey.atacar(charmi2, NombreDelAtaque.LATIGO_CEPA);
		
		assertEquals(vidaOriginalCharmi1 - 7,  charmi1.salud() , 0.001D);
		
		assertEquals(vidaOriginaCharmi2  - 7,  charmi2.salud() , 0.001D);
		
	}
	
	
	@Test
	public void testAtacarConLatigoCepaQuita15ptsAunAlgomonTipoNormal() {
		
		Algomon jiggly1 = EspecieAlgomon.JIGGLYPUFF.nuevo();
		
		Algomon jiggly2 = EspecieAlgomon.JIGGLYPUFF.nuevo();
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		Algomon chansey = EspecieAlgomon.CHANSEY.nuevo();
		
		double vidaOriginalJiggly1 = jiggly1.salud();
		
		double vidaOriginaJiggly2 = jiggly2.salud();
		
		bulbasaur.atacar(jiggly1, NombreDelAtaque.LATIGO_CEPA);
		
		chansey.atacar(jiggly2, NombreDelAtaque.LATIGO_CEPA);
		
		assertEquals(vidaOriginalJiggly1 - 15,  jiggly1.salud() , 0.001D);
		
		assertEquals(vidaOriginaJiggly2 - 15,  jiggly2.salud() , 0.001D);
		
	}
	
	
	@Test
	public void testAtacarConBrasasQuita32ptsAunAlgomonTipoAgua() {
		
		Algomon squirtle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		double vidaOriginal = squirtle.salud();
		
		charmander.atacar(squirtle, NombreDelAtaque.BRASAS);
		
		assertEquals(vidaOriginal - 8,  squirtle.salud() , 0.001D);
		
	}
	
	
	@Test
	public void testAtacarConBrasasQuita8ptsAunAlgomonTipoPlanta() {
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		double vidaOriginal = bulbasaur.salud();
		
		charmander.atacar(bulbasaur, NombreDelAtaque.BRASAS);
		
		assertEquals(vidaOriginal - 32,  bulbasaur.salud() , 0.001D);
		
	}
	
	@Test
	public void testAtacarConBrasasQuita16ptsAunAlgomonTipoNormal() {
		
		Algomon rattata = EspecieAlgomon.RATTATA.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		double vidaOriginal = rattata.salud();
		
		charmander.atacar(rattata, NombreDelAtaque.BRASAS);
		
		assertEquals(vidaOriginal - 16,  rattata.salud() , 0.001D);
		
	}
	
	
	@Test
	public void testAlgomonesAtacanConAtaqueRapidoYquitan10ptsDeVidaAdosAlgomones() {
		
		Algomon jiggly1 = EspecieAlgomon.JIGGLYPUFF.nuevo();
		
		Algomon jiggly2 = EspecieAlgomon.JIGGLYPUFF.nuevo();
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		Algomon chansey = EspecieAlgomon.CHANSEY.nuevo();
		
		double vidaOriginalJiggly1 = jiggly1.salud();
		
		double vidaOriginaJiggly2 = jiggly2.salud();
		
		bulbasaur.atacar(jiggly1, NombreDelAtaque.ATAQUE_RAPIDO);
		
		chansey.atacar(jiggly2, NombreDelAtaque.ATAQUE_RAPIDO);
		
		assertEquals(vidaOriginalJiggly1 - 10,  jiggly1.salud() , 0.001D);
		
		assertEquals(vidaOriginaJiggly2 - 10,  jiggly2.salud() , 0.001D);
		
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
	
	@Test(expected = CantidadDeAtaquesAgotadosException .class)
	public void testAlgomonAgotoLaCantidadDeAtaquesFogonazoYnoPuedeUtilizarElAtaque(){
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		charmander.atacar(bulbasaur, NombreDelAtaque.FOGONAZO);
		
		charmander.atacar(bulbasaur, NombreDelAtaque.FOGONAZO);
		
		charmander.atacar(bulbasaur, NombreDelAtaque.FOGONAZO);
		
		charmander.atacar(bulbasaur, NombreDelAtaque.FOGONAZO);
		
		charmander.atacar(bulbasaur, NombreDelAtaque.FOGONAZO);
		
	}
	
	
	
	@Test(expected = AtaqueNoPertenecienteAalgomonException.class)
	public void testAlgomonNoPuedeAtacarSiNotieneEseAtaque(){
		
		Algomon bulbasaur = EspecieAlgomon.BULBASOUR.nuevo();
		
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
			
		charmander.atacar(bulbasaur, NombreDelAtaque.BURBUJA);
			
	}
	@Test
	public void testJigglypuffAtacanConCantoAlgomonNormalPierdeTresTurnos() {
		
		Algomon jigglypuff = EspecieAlgomon.JIGGLYPUFF.nuevo();
		Algomon chansey = EspecieAlgomon.CHANSEY.nuevo();
		Algomon rattata = EspecieAlgomon.RATTATA.nuevo();
		AtacarDormidoNoPuedeRealizarseException err1 = null;
		int CantidadTurnosDormidos = 0;
		
		jigglypuff.atacar(rattata, NombreDelAtaque.CANTO);
		
		while (CantidadTurnosDormidos <3){
			try {
				rattata.atacar(jigglypuff, NombreDelAtaque.ATAQUE_RAPIDO);
				
			}catch(AtacarDormidoNoPuedeRealizarseException exep){
				
				err1 = exep;
				CantidadTurnosDormidos = CantidadTurnosDormidos + 1;
			}
		}
		
		assertTrue (err1 instanceof AtacarDormidoNoPuedeRealizarseException);
		rattata.atacar(jigglypuff, NombreDelAtaque.ATAQUE_RAPIDO);
		assertEquals(3,CantidadTurnosDormidos);
		/////////////////////////////////////////////////////////////////////
		//chansey ataca a rattata con canto
		chansey.atacar(rattata, NombreDelAtaque.CANTO);
		
		CantidadTurnosDormidos = 0;
		err1 = null;
		
		while (CantidadTurnosDormidos <3){
			try {
				rattata.atacar(chansey, NombreDelAtaque.ATAQUE_RAPIDO);
				
			}catch(AtacarDormidoNoPuedeRealizarseException exep){
				err1 = exep;
				CantidadTurnosDormidos = CantidadTurnosDormidos + 1;
			}
		}
		
		assertTrue (err1 instanceof AtacarDormidoNoPuedeRealizarseException);
		
		rattata.atacar(chansey, NombreDelAtaque.ATAQUE_RAPIDO);
		assertEquals(3,CantidadTurnosDormidos);
	}
	@Test
	public void testBulbasourAtacaConChupavidasACharmanderRecuperaVida2DeVida(){
		
		Algomon bulbasour = EspecieAlgomon.BULBASOUR.nuevo();
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		
		charmander.atacar(bulbasour, NombreDelAtaque.ATAQUE_RAPIDO);
		
		assertEquals(130,bulbasour.salud(),0.01D);
		
		bulbasour.atacar(charmander, NombreDelAtaque.CHUPAVIDAS);
		
		assertEquals(132,bulbasour.salud(),0.0001D);
		assertEquals(163,charmander.salud(),0.0001D);
	}
	@Test
	public void testBulbasourAtacaSquartleConChupavidasRecupera9Vida(){
		Algomon bulbasour = EspecieAlgomon.BULBASOUR.nuevo();
		Algomon squartle = EspecieAlgomon.SQUIRTLE.nuevo();
		
		squartle.atacar(bulbasour, NombreDelAtaque.ATAQUE_RAPIDO);
		bulbasour.atacar(squartle, NombreDelAtaque.CHUPAVIDAS);
		
		assertEquals(120,squartle.salud(),0.0001D);
		assertEquals(139,bulbasour.salud(),0.0001D);
	}
	@Test
	public void testBulbasourAtacaAlgomonNormalConChupavidasRecupera4Vida(){
		Algomon bulbasour = EspecieAlgomon.BULBASOUR.nuevo();
		Algomon rattata = EspecieAlgomon.RATTATA.nuevo();
		
		rattata.atacar(bulbasour, NombreDelAtaque.ATAQUE_RAPIDO);
		bulbasour.atacar(rattata, NombreDelAtaque.CHUPAVIDAS);
		
		assertEquals(155,rattata.salud(),0.0001D);
		assertEquals(134,bulbasour.salud(),0.0001D);
		
	}
	@Test
	public void testCharmanderRattataAtacanConFogonazoAalgomonRecibeDanioCuandoEstaActivo(){
	
		//Algomones atacando
		Algomon rattata = EspecieAlgomon.RATTATA.nuevo();
		Algomon charmander = EspecieAlgomon.CHARMANDER.nuevo();
		//Algomones a atacar
		Algomon squartle = EspecieAlgomon.SQUIRTLE.nuevo();
		Algomon bulbasour = EspecieAlgomon.BULBASOUR.nuevo();
		
		rattata.atacar(squartle, NombreDelAtaque.FOGONAZO);
		assertEquals(149,squartle.salud(),0.001D);
		
		squartle.atacar(rattata, NombreDelAtaque.ATAQUE_RAPIDO);
		assertEquals(134,squartle.salud(),0.001D);
		
		charmander.atacar(bulbasour, NombreDelAtaque.FOGONAZO);
		assertEquals(136,bulbasour.salud(),0.001D);
		
		bulbasour.atacar(charmander, NombreDelAtaque.ATAQUE_RAPIDO);
		assertEquals(122,bulbasour.salud(),0.001D);
	
	}
}

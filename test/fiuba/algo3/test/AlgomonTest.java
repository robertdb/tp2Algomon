package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.especiesdealgomones.*;
import fiuba.algo3.algomones.logica.excepciones.AlgomonDormidoNoPuedeAtacarException;
import fiuba.algo3.algomones.logica.excepciones.AtaqueAgotadoException;

public class AlgomonTest {

	@Test
	public void testAtacarConBurbujaQuita20ptsAunAlgomonTipoFuego() {

		Algomon squirtle = new Squirtle();

		Algomon charmander = new Charmander();

		int vidaOriginal = charmander.getVida();

		squirtle.atacar(charmander, "Burbuja");

		assertEquals(vidaOriginal - 20,  charmander.getVida() , 0.001D);

	}

	@Test
	public void testAtacarConCanionDeAguaQuita40ptsAunAlgomonTipoFuego() {

		Algomon squirtle = new Squirtle();

		Algomon charmander = new Charmander();

		int vidaOriginal = charmander.getVida();

		squirtle.atacar(charmander, "Canon De Agua");

		assertEquals(vidaOriginal - 40,  charmander.getVida() , 0.001D);

	}

	@Test
	public void testAtacarConBurbujaQuita5ptsAunAlgomonTipoPlanta() {

		Algomon squirtle = new Squirtle();

		Algomon bulbasaur = new Bulbasaur();

		int vidaOriginal = bulbasaur.getVida();

		squirtle.atacar(bulbasaur, "Burbuja");

		assertEquals(vidaOriginal - 5, bulbasaur.getVida() , 0.001D);

	}

	@Test
	public void testAtacarConCanionDeAguaQuita10ptsAunAlgomonTipoPlanta() {

		Algomon squirtle = new Squirtle();

		Algomon bulbasaur = new Bulbasaur();

		int vidaOriginal = bulbasaur.getVida();

		squirtle.atacar(bulbasaur, "Canon De Agua");

		assertEquals(vidaOriginal - 10,  bulbasaur.getVida() , 0.001D);

	}

	@Test
	public void testAtacarConCanionDeAguaQuita20ptsAunAlgomonTipoNormal() {

		Algomon squirtle = new Squirtle();

		Algomon chansey = new Chansey();

		Algomon rattata = new Rattata();

		int vidaOriginalChansey = chansey.getVida();

		int vidaOriginalRattata = rattata.getVida();

		squirtle.atacar(chansey, "Canon De Agua");

		squirtle.atacar(rattata, "Canon De Agua");

		assertEquals(vidaOriginalChansey - 20,  chansey.getVida() , 0.001D);

		assertEquals(vidaOriginalRattata - 20,  rattata.getVida() , 0.001D);

	}


	@Test
	public void testAtacarConLatigoCepaQuita30ptsAunAlgomonTipoAgua() {

		Algomon squirtle1 = new Squirtle();

		Algomon squirtle2 = new Squirtle();

		Algomon bulbasaur = new Bulbasaur();

		Algomon chansey = new Chansey();

		int vidaOriginalSquirtle1 = squirtle1.getVida();

		int vidaOriginalSquirtle2 = squirtle2.getVida();

		bulbasaur.atacar(squirtle1, "Latigo Cepa");

		chansey.atacar(squirtle2, "Latigo Cepa");

		assertEquals(vidaOriginalSquirtle1 - 30,  squirtle1.getVida() , 0.001D);

		assertEquals(vidaOriginalSquirtle2 - 30,  squirtle2.getVida() , 0.001D);

	}


	@Test
	public void testAtacarConLatigoCepaQuita7ptsAunAlgomonTipoFuego() {

		Algomon charmi1 = new Charmander();

		Algomon charmi2= new Charmander();

		Algomon bulbasaur = new Bulbasaur();

		Algomon chansey = new Chansey();

		int vidaOriginalCharmi1 = charmi1.getVida();

		int vidaOriginaCharmi2 = charmi2.getVida();

		bulbasaur.atacar(charmi1, "Latigo Cepa");

		chansey.atacar(charmi2, "Latigo Cepa");

		assertEquals(vidaOriginalCharmi1 - 7,  charmi1.getVida() , 0.001D);

		assertEquals(vidaOriginaCharmi2  - 7,  charmi2.getVida() , 0.001D);

	}


	@Test
	public void testAtacarConLatigoCepaQuita15ptsAunAlgomonTipoNormal() {

		Algomon jiggly1 = new Jigglypuff();

		Algomon jiggly2 = new Jigglypuff();

		Algomon bulbasaur = new Bulbasaur();

		Algomon chansey = new Chansey();

		int vidaOriginalJiggly1 = jiggly1.getVida();

		int vidaOriginaJiggly2 = jiggly2.getVida();

		bulbasaur.atacar(jiggly1, "Latigo Cepa");

		chansey.atacar(jiggly2, "Latigo Cepa");

		assertEquals(vidaOriginalJiggly1 - 15,  jiggly1.getVida() , 0.001D);

		assertEquals(vidaOriginaJiggly2 - 15,  jiggly2.getVida() , 0.001D);

	}


	@Test
	public void testAtacarConBrasasQuita32ptsAunAlgomonTipoAgua() {

		Algomon squirtle = new Squirtle();

		Algomon charmander = new Charmander();

		int vidaOriginal = squirtle.getVida();

		charmander.atacar(squirtle, "Brasas");

		assertEquals(vidaOriginal - 8,  squirtle.getVida() , 0.001D);

	}


	@Test
	public void testAtacarConBrasasQuita8ptsAunAlgomonTipoPlanta() {

		Algomon bulbasaur = new Bulbasaur();

		Algomon charmander = new Charmander();

		int vidaOriginal = bulbasaur.getVida();

		charmander.atacar(bulbasaur, "Brasas");

		assertEquals(vidaOriginal - 32,  bulbasaur.getVida() , 0.001D);

	}

	@Test
	public void testAtacarConBrasasQuita16ptsAunAlgomonTipoNormal() {

		Algomon rattata = new Rattata();

		Algomon charmander = new Charmander();

		int vidaOriginal = rattata.getVida();

		charmander.atacar(rattata, "Brasas");

		assertEquals(vidaOriginal - 16,  rattata.getVida() , 0.001D);

	}


	@Test
	public void testAlgomonesAtacanConAtaqueRapidoYquitan10ptsDeVidaAdosAlgomones() {

		Algomon jiggly1 = new Jigglypuff();

		Algomon jiggly2 = new Jigglypuff();

		Algomon bulbasaur = new Bulbasaur();

		Algomon chansey = new Chansey();

		int vidaOriginalJiggly1 = jiggly1.getVida();

		int vidaOriginaJiggly2 = jiggly2.getVida();

		bulbasaur.atacar(jiggly1, "Ataque Rapido");

		chansey.atacar(jiggly2, "Ataque Rapido");

		assertEquals(vidaOriginalJiggly1 - 10,  jiggly1.getVida() , 0.001D);

		assertEquals(vidaOriginaJiggly2 - 10,  jiggly2.getVida() , 0.001D);

	}

	@Test(expected = AtaqueAgotadoException.class)
	public void testAlgomonAgotoLaCantidadDeAtaquesLatigoCepaYnoPuedeUtilizarElAtaque(){

		Algomon bulbasaur = new Bulbasaur();

		Algomon charmander = new Charmander();

		int cantidadQueSuperaAlMaximoDeAtaques = 15;
		int ataque  = 1;

		while (ataque < cantidadQueSuperaAlMaximoDeAtaques  ){

			bulbasaur.atacar(charmander, "Latigo Cepa");
			ataque += 1;

		}
	}

	@Test(expected = AtaqueAgotadoException.class)
	public void testAlgomonAgotoLaCantidadDeAtaquesFogonazoYnoPuedeUtilizarElAtaque(){

		Algomon bulbasaur = new Bulbasaur();

		Algomon charmander = new Charmander();

		charmander.atacar(bulbasaur, "Fogonazo");

		charmander.atacar(bulbasaur, "Fogonazo");

		charmander.atacar(bulbasaur, "Fogonazo");

		charmander.atacar(bulbasaur, "Fogonazo");

		charmander.atacar(bulbasaur, "Fogonazo");

	}

	@Test
	public void testJigglypuffAtacanConCantoAlgomonNormalPierdeTresTurnos() {
		Algomon jigglypuff = new Jigglypuff();
		Algomon rattata = new Rattata();

		jigglypuff.atacar(rattata, "Canto");

		//~ trata de atacar tres veces con el algomon dormido
		//~ si no tira excepcion en todas, el test falla
		for (int i = 0; i < 3; i++) {
			try {
				rattata.atacar(jigglypuff, "Ataque Rapido");
			} catch (AlgomonDormidoNoPuedeAtacarException e) {
				continue;
			}
			fail("rattata durmio " + i + " turnos antes de despertarse");
		}

		rattata.atacar(jigglypuff, "Ataque Rapido");
	}

	@Test
	public void testBulbasaurAtacaConChupavidasACharmanderRecuperaVida2DeVida(){

		Algomon bulbasaur = new Bulbasaur();
		Algomon charmander = new Charmander();

		charmander.atacar(bulbasaur, "Ataque Rapido");

		assertEquals(130,bulbasaur.getVida(),0.01D);

		bulbasaur.atacar(charmander, "Chupavidas");

		assertEquals(132,bulbasaur.getVida(),0.0001D);
		assertEquals(163,charmander.getVida(),0.0001D);
	}
	@Test
	public void testBulbasaurAtacaSquartleConChupavidasRecupera9Vida(){
		Algomon bulbasaur = new Bulbasaur();
		Algomon squirtle = new Squirtle();

		squirtle.atacar(bulbasaur, "Ataque Rapido");
		bulbasaur.atacar(squirtle, "Chupavidas");

		assertEquals(120,squirtle.getVida(),0.0001D);
		assertEquals(139,bulbasaur.getVida(),0.0001D);
	}
	@Test
	public void testBulbasourAtacaAlgomonNormalConChupavidasRecupera4Vida(){
		Algomon bulbasour = new Bulbasaur();
		Algomon rattata = new Rattata();

		rattata.atacar(bulbasour, "Ataque Rapido");
		bulbasour.atacar(rattata, "Chupavidas");

		assertEquals(155,rattata.getVida(),0.0001D);
		assertEquals(134,bulbasour.getVida(),0.0001D);

	}
	@Test
	public void testCharmanderRattataAtacanConFogonazoAalgomonRecibeDanioCuandoEstaActivo(){

		//Algomones atacando
		Algomon rattata = new Rattata();
		Algomon charmander = new Charmander();
		//Algomones a atacar
		Algomon squartle = new Squirtle();
		Algomon bulbasour = new Bulbasaur();

		rattata.atacar(squartle, "Fogonazo");
		assertEquals(149,squartle.getVida(),0.001D);

		squartle.atacar(rattata, "Ataque Rapido");
		assertEquals(134,squartle.getVida(),0.001D);

		charmander.atacar(bulbasour, "Fogonazo");
		assertEquals(136,bulbasour.getVida(),0.001D);

		bulbasour.atacar(charmander, "Ataque Rapido");
		assertEquals(122,bulbasour.getVida(),0.001D);

	}
}

package fiuba.algo3.test;

import static org.junit.Assert.*;

import java.util.EnumMap;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Ataque;
import fiuba.algo3.algomones.AtaqueChupavidas;
import fiuba.algo3.algomones.AtaqueSimple;
import fiuba.algo3.algomones.NombreDelAtaque;
import fiuba.algo3.algomones.Salud;
import fiuba.algo3.algomones.Tipo;
import fiuba.algo3.algomones.TipoAgua;
import fiuba.algo3.algomones.TipoFuego;
import fiuba.algo3.algomones.TipoPlanta;

public class AtaqueChupavidasTest {

	@Test
	public void testAtacarConChupavidasAunAlgomontipoFuegoQuita7ptsYgana2ptsDeVida() {
		
		// Se crea un algomon personalizado.
		int potenciaLatigoCepa = 15;
		int cantidadMaximaDeAtaquesLatigoCepa = 50;
		Ataque chupavidas = new AtaqueChupavidas(new TipoPlanta(), potenciaLatigoCepa, cantidadMaximaDeAtaquesLatigoCepa );
		EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataques.put(NombreDelAtaque.CHUPAVIDAS, chupavidas);
		
		Salud salud = new Salud(400);
		Tipo planta = new TipoPlanta();
		Algomon venusaur = new Algomon("Venusaur", planta, ataques, salud);
		
		// Se crea otro algomon personalizado.
		int potenciaBrasas = 16;
		Ataque brasas = new AtaqueSimple(new TipoFuego(), potenciaBrasas, 1);
		EnumMap<NombreDelAtaque, Ataque> ataqs = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataqs.put(NombreDelAtaque.BRASAS, brasas);
		Salud saludCharizard= new Salud(400);
		Algomon charizard = new Algomon("Charizard", new TipoFuego(), ataqs , saludCharizard);
		
		double vidaOriginalCharizard = charizard.salud();
		double vidaOriginalVenusaur  = venusaur.salud();
		
		venusaur.atacar(charizard, NombreDelAtaque.CHUPAVIDAS);
		
		assertEquals(vidaOriginalCharizard - 7,  charizard.salud() , 0.001D);
		
		charizard.atacar(venusaur, NombreDelAtaque.BRASAS);
		
		assertEquals(vidaOriginalVenusaur - 32, venusaur.salud(), 0.001D);
		
		venusaur.atacar(charizard, NombreDelAtaque.CHUPAVIDAS);
		
		assertEquals(vidaOriginalVenusaur - 32 + 2, venusaur.salud(), 0.001D);
			
	}
	
	@Test
	public void testAtacarConChupavidasAunAlgomontipoAguaQuita30ptsYgana9ptsDeVida() {
		
		assertTrue(true);
		
	}
	
	@Test
	public void testAtacarConChupavidasAunAlgomontipoNormalQuita15ptsYgana4ptsDeVida() {
		
		assertTrue(true);
		
	}
	
	@Test
	public void testAtacarConChupavidasAunAlgomontipoPlantaQuita7ptsYgana2ptsDeVida() {
		
		assertTrue(true);
		
	}
	

}

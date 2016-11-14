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
import fiuba.algo3.algomones.TipoNormal;
import fiuba.algo3.algomones.TipoPlanta;

public class AtaqueChupavidasTest {

	@Test
	public void testAtacarConChupavidasAunAlgomontipoFuegoQuita7ptsYgana2ptsDeVida() {
		
		// Se crea un algomon personalizado.
		int potenciaChupavidas = 15;
		int cantidadMaximaDeAtaquesChupavidas = 50;
		Ataque chupavidas = new AtaqueChupavidas(new TipoPlanta(), potenciaChupavidas, cantidadMaximaDeAtaquesChupavidas );
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
		
		// Se crea un algomon personalizado.
		int potenciaChupavidas = 15;
		int cantidadMaximaDeAtaquesChupavidas = 50;
		Ataque chupavidas = new AtaqueChupavidas(new TipoPlanta(), potenciaChupavidas, cantidadMaximaDeAtaquesChupavidas );
		EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataques.put(NombreDelAtaque.CHUPAVIDAS, chupavidas);
		
		Salud salud = new Salud(400);
		Tipo planta = new TipoPlanta();
		Algomon venusaur = new Algomon("Venusaur", planta, ataques, salud);
		
		// Se crea otro algomon personalizado.
		int potenciaBurbuja = 20;
		int cantidadMaximaDeAtaquesBurbuja = 16;
		Ataque burbuja = new AtaqueSimple(new TipoAgua(), potenciaBurbuja, cantidadMaximaDeAtaquesBurbuja);
		EnumMap<NombreDelAtaque, Ataque> _ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		_ataques.put(NombreDelAtaque.BURBUJA, burbuja);
		Salud saludBlastoise = new Salud(400);
		Algomon blastoise = new Algomon("Blastoise", new TipoAgua(), _ataques , saludBlastoise);
		
		double vidaOriginalBlastoise  = blastoise.salud();
		double vidaOriginalVenusaur  = venusaur.salud();
		
		venusaur.atacar(blastoise, NombreDelAtaque.CHUPAVIDAS);
		
		assertEquals(vidaOriginalBlastoise - 30,  blastoise.salud() , 0.001D);
		
		blastoise.atacar(venusaur, NombreDelAtaque.BURBUJA);
		
		assertEquals(vidaOriginalVenusaur - 10, venusaur.salud(), 0.001D);
		
		venusaur.atacar(blastoise, NombreDelAtaque.CHUPAVIDAS);
		
		assertEquals(vidaOriginalVenusaur - 10 + 9, venusaur.salud(), 0.001D);

	}
	
	@Test
	public void testAtacarConChupavidasAunAlgomontipoNormalQuita15ptsYgana4ptsDeVida() {
		
		// Se crea un algomon personalizado.
		int potenciaChupavidas = 15;
		int cantidadMaximaDeAtaquesChupavidas = 50;
		Ataque chupavidas = new AtaqueChupavidas(new TipoPlanta(), potenciaChupavidas, cantidadMaximaDeAtaquesChupavidas );
		EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataques.put(NombreDelAtaque.CHUPAVIDAS, chupavidas);
		Salud salud = new Salud(400);
		Tipo planta = new TipoPlanta();
		Algomon venusaur = new Algomon("Venusaur", planta, ataques, salud);
		
		// Se crea un algomon personalizado.
		int potenciaAtaqueRapido = 25;
		int cantidadMaximaDeAtaquesAtaqueRapido = 16;
		Ataque ataqueRapido = new AtaqueSimple(new TipoNormal(), potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
		EnumMap<NombreDelAtaque, Ataque> ataquesNormal = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataquesNormal.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
		Salud saludRaticate = new Salud(300);
		Algomon raticate = new Algomon("Raticate", new TipoNormal(), ataquesNormal, saludRaticate);
		
		double vidaOriginalRaticate  = raticate.salud();
		double vidaOriginalVenusaur  = venusaur.salud();
		
		venusaur.atacar(raticate, NombreDelAtaque.CHUPAVIDAS);
		
		assertEquals(vidaOriginalRaticate - 15,  raticate.salud() , 0.001D);
		
		raticate.atacar(venusaur, NombreDelAtaque.ATAQUE_RAPIDO);
		
		assertEquals(vidaOriginalVenusaur - 25, venusaur.salud(), 0.001D);
		
		venusaur.atacar(raticate, NombreDelAtaque.CHUPAVIDAS);
		
		assertEquals(vidaOriginalVenusaur - 25 + 4, venusaur.salud(), 0.001D);

	}

	
	@Test
	public void testAtacarConChupavidasAunAlgomontipoPlantaQuita7ptsYgana2ptsDeVida() {
		
		// Se crea un algomon personalizado.
		int potenciaChupavidas = 15;
		int cantidadMaximaDeAtaquesChupavidas = 50;
		Ataque chupavidas = new AtaqueChupavidas(new TipoPlanta(), potenciaChupavidas, cantidadMaximaDeAtaquesChupavidas );
		EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataques.put(NombreDelAtaque.CHUPAVIDAS, chupavidas);
		Salud salud = new Salud(400);
		Tipo planta = new TipoPlanta();
		Algomon venusaur = new Algomon("Venusaur", planta, ataques, salud);
		
		// Se crea un algomon personalizado.
		int potenciaLatigoCepa = 25;
		int cantidadMaximaDeAtaquesLatigoCepa = 16;
		Ataque ataqueLatigoCepa = new AtaqueSimple(new TipoPlanta(), potenciaLatigoCepa , cantidadMaximaDeAtaquesLatigoCepa );
		EnumMap<NombreDelAtaque, Ataque> ataquesPlanta = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataquesPlanta.put(NombreDelAtaque.LATIGO_CEPA, ataqueLatigoCepa);
		Salud saludIvysaur = new Salud(300);
		Algomon ivysaur = new Algomon("Ivysaur", new TipoPlanta(), ataquesPlanta, saludIvysaur);
		
		double vidaOriginalIvysaur  = ivysaur.salud();
		double vidaOriginalVenusaur  = venusaur.salud();
		
		venusaur.atacar(ivysaur, NombreDelAtaque.CHUPAVIDAS);
		
		assertEquals(vidaOriginalIvysaur - 7,  ivysaur.salud() , 0.001D);
		
		ivysaur.atacar(venusaur, NombreDelAtaque.LATIGO_CEPA);
		
		assertEquals(vidaOriginalVenusaur - 12, venusaur.salud(), 0.001D);
		
		venusaur.atacar(ivysaur, NombreDelAtaque.CHUPAVIDAS);
		
		assertEquals(vidaOriginalVenusaur - 12 + 2, venusaur.salud(), 0.001D);

	}
	

}

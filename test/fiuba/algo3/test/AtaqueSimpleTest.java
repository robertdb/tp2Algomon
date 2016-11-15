package fiuba.algo3.test;

import static org.junit.Assert.*;

import java.util.EnumMap;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Ataque;
import fiuba.algo3.algomones.AtaqueSimple;
import fiuba.algo3.algomones.Tipo;
import fiuba.algo3.algomones.NombreDelAtaque;
import fiuba.algo3.algomones.Salud;
import fiuba.algo3.algomones.TipoAgua;
import fiuba.algo3.algomones.TipoPlanta;

public class AtaqueSimpleTest {

	@Test
	public void testAtacarConLatigoCepaQuita30ptsAunAlgomonTipoAgua() {
		
		// Se crea un algomon personalizado.
		int potenciaLatigoCepa = 15;
		int cantidadMaximaDeAtaquesLatigoCepa = 50;
		Tipo tipoPlanta = new TipoPlanta();
		Ataque latigoCepa = new AtaqueSimple(tipoPlanta, potenciaLatigoCepa, cantidadMaximaDeAtaquesLatigoCepa );
		EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataques.put(NombreDelAtaque.LATIGO_CEPA, latigoCepa);
		
		Salud salud = new Salud(400);
		Tipo planta = new TipoPlanta();
		Algomon venusaur = new Algomon("Venusaur", planta, ataques, salud);
		
		// Se crea otro algomon personalizado.
		Ataque nulo = new AtaqueSimple(new TipoAgua(), 0, 0);
		EnumMap<NombreDelAtaque, Ataque> ataquesSinUsoEnEsteTest = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataques.put(NombreDelAtaque.BURBUJA, nulo);
		Salud saludBlastoise = new Salud(400);
		Algomon blastoise = new Algomon("Blastoise", new TipoAgua(), ataquesSinUsoEnEsteTest , saludBlastoise);
		
		double vidaOriginalBlastoise  = blastoise .salud();
		
		venusaur.atacar(blastoise , NombreDelAtaque.LATIGO_CEPA);
		
		assertEquals(vidaOriginalBlastoise  - 30,  blastoise.salud() , 0.001D);
		
	}
}

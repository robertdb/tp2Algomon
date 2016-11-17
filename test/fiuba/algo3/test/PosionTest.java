package fiuba.algo3.test;

import static org.junit.Assert.*;

import java.util.EnumMap;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Ataque;
import fiuba.algo3.algomones.AtaqueSimple;
import fiuba.algo3.algomones.Elemento;
import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.NombreDelAtaque;
import fiuba.algo3.algomones.Pocion;
import fiuba.algo3.algomones.Salud;
import fiuba.algo3.algomones.TipoAgua;
import fiuba.algo3.algomones.TipoNormal;
import fiuba.algo3.algomones.excepciones.CantidadDeAtaquesAgotadosException;
import fiuba.algo3.algomones.excepciones.PocionAgotadaException;

public class PosionTest {

	@Test
	public void testUsarPosionEnAlgomonCon20ptsDeDanioRecuperaTodaSuVida() {
		
		// Se crea un algomon personalizado.
		int potenciaCanionDeAgua = 20;
		int cantidadMaximaDeAtaques = 8;
		Ataque canionDeAgua = new AtaqueSimple(new TipoAgua(), potenciaCanionDeAgua , cantidadMaximaDeAtaques);
		EnumMap<NombreDelAtaque, Ataque> _ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		_ataques.put(NombreDelAtaque.CANION_DE_AGUA, canionDeAgua);
		Salud saludBlastoise = new Salud(400);
		Algomon blastoise = new Algomon("Blastoise", new TipoAgua(), _ataques , saludBlastoise);
				
		
		// Se crea otro algomon personalizado.
		int potenciaAtaqueRapido = 25;
		int cantidadMaximaDeAtaquesAtaqueRapido = 16;
		Ataque ataqueRapido = new AtaqueSimple(new TipoNormal(), potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
		EnumMap<NombreDelAtaque, Ataque> ataquesNormal = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataquesNormal.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
		Salud saludRaticate = new Salud(300);
		Algomon raticate = new Algomon("Raticate", new TipoNormal(), ataquesNormal, saludRaticate);
		
		int vidaOriginalRaticate  = raticate.salud();
		
		blastoise.atacar(raticate, NombreDelAtaque.CANION_DE_AGUA);
		
		assertEquals(vidaOriginalRaticate - 20,  raticate.salud() );
		
		Elemento posion = new Pocion();
		
		posion.aplicarElemento(raticate);
		
		assertEquals(vidaOriginalRaticate , raticate.salud() );
		
	}
	
	@Test
	public void testUsarPosionEnAlgomonConVidaSinSerDaniadaNoRecuperaPtsDeVida() {
		
		// Se crea un algomon personalizado.
		int potenciaCanionDeAgua = 20;
		int cantidadMaximaDeAtaques = 8;
		Ataque canionDeAgua = new AtaqueSimple(new TipoAgua(), potenciaCanionDeAgua , cantidadMaximaDeAtaques);
		EnumMap<NombreDelAtaque, Ataque> _ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		_ataques.put(NombreDelAtaque.CANION_DE_AGUA, canionDeAgua);
		Salud saludBlastoise = new Salud(400);
		Algomon blastoise = new Algomon("Blastoise", new TipoAgua(), _ataques , saludBlastoise);
						
				
		// Se crea otro algomon personalizado.
		int potenciaAtaqueRapido = 25;
		int cantidadMaximaDeAtaquesAtaqueRapido = 16;
		Ataque ataqueRapido = new AtaqueSimple(new TipoNormal(), potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
		EnumMap<NombreDelAtaque, Ataque> ataquesNormal = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataquesNormal.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
		Salud saludRaticate = new Salud(300);
		Algomon raticate = new Algomon("Raticate", new TipoNormal(), ataquesNormal, saludRaticate);
				
		int vidaOriginalRaticate  = raticate.salud();
				
		Elemento posion = new Pocion();
				
		posion.aplicarElemento(raticate);
				
		assertEquals(vidaOriginalRaticate , raticate.salud() );
	}
	
	@Test(expected = PocionAgotadaException.class)
	public void testAlgomonAgotoLasPosionesYnoPuedeUtilizarMasPosiones(){
		
		// Se crea un algomon personalizado.
		int potenciaAtaqueRapido = 25;
		int cantidadMaximaDeAtaquesAtaqueRapido = 16;
		Ataque ataqueRapido = new AtaqueSimple(new TipoNormal(), potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
		EnumMap<NombreDelAtaque, Ataque> ataquesNormal = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataquesNormal.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
		Salud saludRaticate = new Salud(300);
		Algomon raticate = new Algomon("Raticate", new TipoNormal(), ataquesNormal, saludRaticate);
		
		Elemento posion = new Pocion();
	
		posion.aplicarElemento(raticate);
		posion.aplicarElemento(raticate);
		posion.aplicarElemento(raticate);
		posion.aplicarElemento(raticate);
		posion.aplicarElemento(raticate);
		
	}
	
	

}

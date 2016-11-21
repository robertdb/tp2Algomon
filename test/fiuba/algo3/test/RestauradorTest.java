package fiuba.algo3.test;

import static org.junit.Assert.*;

import java.util.EnumMap;

import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Ataque;
import fiuba.algo3.algomones.AtaqueCanto;
import fiuba.algo3.algomones.AtaqueFogonazo;
import fiuba.algo3.algomones.AtaqueSimple;
import fiuba.algo3.algomones.Elemento;
import fiuba.algo3.algomones.NombreDelAtaque;
import fiuba.algo3.algomones.Restaurador;
import fiuba.algo3.algomones.Salud;
import fiuba.algo3.algomones.TipoAgua;
import fiuba.algo3.algomones.TipoFuego;
import fiuba.algo3.algomones.TipoNormal;
import fiuba.algo3.algomones.Vitamina;
import fiuba.algo3.algomones.excepciones.AtacarDormidoNoPuedeRealizarseException;
import fiuba.algo3.algomones.excepciones.RestauradorAgotadoException;

public class RestauradorTest {

	@Test
	public void testUsarRestauradorEnAlgomonBajoEfectoQuemadoPuedeAtacar() {
		
		//Se crea un algomon personalizado con fogonazo.
		Ataque fogonazo = new AtaqueFogonazo(new TipoFuego(), 2, 4 );
		EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataques.put(NombreDelAtaque.FOGONAZO,fogonazo);
				
		Salud saludCharizard= new Salud(400);
		Algomon charizard = new Algomon("Charizard", new TipoFuego(), ataques , saludCharizard);
		
		// Se crea un algomon personalizado.
		Ataque ataqueRapido = new AtaqueSimple(new TipoNormal(), 10, 16 );
		EnumMap<NombreDelAtaque, Ataque> ataquesNormal = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataquesNormal.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
		
		
		Algomon blastoise = new Algomon("Blastoise", new TipoAgua(), ataquesNormal, new Salud(400));
		
		charizard.atacar(blastoise, NombreDelAtaque.FOGONAZO);
		assertEquals(399,blastoise.salud(),0.001D);
		
		// blastoise se bajo el efecto quemado.
		blastoise.atacar(charizard, NombreDelAtaque.ATAQUE_RAPIDO);
		assertEquals(359,blastoise.salud(),0.001D);
		
		Elemento restaurador = new Restaurador();
		
		restaurador.aplicarElemento(blastoise);
		
		// blastoise se quema por ultima vez al aplicarse el restaurador.
		blastoise.atacar(charizard, NombreDelAtaque.ATAQUE_RAPIDO);
		assertEquals(319,blastoise.salud(),0.001D);
		
		// blastoise que no esta bajo el efecto quemado.
		blastoise.atacar(charizard, NombreDelAtaque.ATAQUE_RAPIDO);
		assertEquals(319,blastoise.salud(),0.001D);
			
	}
	
	@Test
	public void testUsarRestauradorEnAlgomonBajoEfectoDomidoPuedeAtacar() {
		
		//Se crea un algomon personalizado con fogonazo.
		Ataque canto = new AtaqueCanto(new TipoNormal(), 0, 4 );
		EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataques.put(NombreDelAtaque.CANTO,canto);
		Algomon chansey = new Algomon("Chansey", new TipoFuego(), ataques , new Salud(400));
		
		// Se crea un algomon personalizado.
		Ataque ataqueRapido = new AtaqueSimple(new TipoNormal(), 10 , 16 );
		EnumMap<NombreDelAtaque, Ataque> ataquesNormal = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataquesNormal.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
		Algomon blastoise = new Algomon("Blastoise", new TipoAgua(), ataquesNormal, new Salud(400));
		
		chansey.atacar(blastoise, NombreDelAtaque.CANTO);
		
		try{
			
			blastoise.atacar(chansey, NombreDelAtaque.ATAQUE_RAPIDO);
		
		}catch(AtacarDormidoNoPuedeRealizarseException exception){}
		
		assertEquals(400,chansey.salud(),0.001D);
		
		Elemento restaurador = new Restaurador();
		
		restaurador.aplicarElemento(blastoise);
		
		blastoise.atacar(chansey, NombreDelAtaque.ATAQUE_RAPIDO);
		
		assertEquals(390,chansey.salud(),0.001D);
			
	}
	
	@Test(expected = RestauradorAgotadoException.class)
	public void testAlgomonAgotoLasPosionesYnoPuedeUtilizarMasPosiones(){
		
		// Se crea un algomon personalizado.
	    int potenciaAtaqueRapido = 25;
		int cantidadMaximaDeAtaquesAtaqueRapido = 16;
		Ataque ataqueRapido = new AtaqueSimple(new TipoNormal(), potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
		EnumMap<NombreDelAtaque, Ataque> ataquesNormal = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
		ataquesNormal.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
		Salud saludRaticate = new Salud(300);
		Algomon raticate = new Algomon("Raticate", new TipoNormal(), ataquesNormal, saludRaticate);
				
		Elemento restaurador = new Restaurador();
			
		restaurador.aplicarElemento(raticate);
		restaurador.aplicarElemento(raticate);
		restaurador.aplicarElemento(raticate);
		assertTrue(true);
		restaurador.aplicarElemento(raticate);
		
	}
	
}

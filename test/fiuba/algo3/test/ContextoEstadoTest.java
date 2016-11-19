package fiuba.algo3.test;

import static org.junit.Assert.*;

import java.util.EnumMap;

import org.junit.Ignore;
import org.junit.Test;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.AlgomonEstado;
import fiuba.algo3.algomones.Ataque;
import fiuba.algo3.algomones.AtaqueChupavidas;
import fiuba.algo3.algomones.ContextoEstado;
import fiuba.algo3.algomones.Dormido;
import fiuba.algo3.algomones.Efecto;
import fiuba.algo3.algomones.EstadoEfimero;
import fiuba.algo3.algomones.EstadoPersistente;
import fiuba.algo3.algomones.NombreDelAtaque;
import fiuba.algo3.algomones.Quemado;
import fiuba.algo3.algomones.Salud;
import fiuba.algo3.algomones.Tipo;
import fiuba.algo3.algomones.TipoPlanta;
import fiuba.algo3.algomones.excepciones.CantidadDeAtaquesAgotadosException;
import fiuba.algo3.algomones.excepciones.AtacarDormidoNoPuedeRealizarseException;

	public class ContextoEstadoTest {

	@Ignore	
	@Test
	public void testContextoEstadoIncialNoEstaAfectado(){
		
		ContextoEstado contexto = new ContextoEstado(); 
		
		assertFalse(contexto.estaAfectado());
		
	}
	
	@Ignore
	@Test
	public void testElEstadoEfimeroAfectaAlContextoDelEstado() {
		
		ContextoEstado contexto = new ContextoEstado(); 
		
		Efecto dormido = new Dormido();
		
		AlgomonEstado efimero = new EstadoEfimero(dormido);
		
		contexto.estadoNuevo(efimero);
		
		assertTrue(contexto.estaAfectado());
		
	}
	
	@Ignore
	@Test
	public void testElEstadoPersistenciaAfectaAlContextoDelEstado() {
		
		ContextoEstado contexto = new ContextoEstado();
		
		Efecto quemado = new Quemado();
		
		AlgomonEstado persistente = new EstadoPersistente(quemado);
		
		contexto.estadoNuevo(persistente);
		
		assertTrue(contexto.estaAfectado());
		
	}
	
	@Ignore
	@Test
	public void testAlgomonEstaEnEstadoEfimeroYestadoPersistenteAlMismoTiempo(){
		
		AtacarDormidoNoPuedeRealizarseException excp = null; 
		
		Algomon venusaur = new Algomon("Venusaur", new TipoPlanta(), null, new Salud(400));
		
		ContextoEstado contexto = new ContextoEstado(); 
		
		contexto.estadoNuevo(new EstadoPersistente(new Quemado()));
		
		contexto.estadoNuevo(new EstadoEfimero(new Dormido()));
		
		try{
			contexto.aplicarEfectos(venusaur);
		}catch(AtacarDormidoNoPuedeRealizarseException exception){
			
			excp = exception;
			
		}
		
		assertTrue(excp instanceof AtacarDormidoNoPuedeRealizarseException);
		
		assertEquals(360,venusaur.salud(),0.01D);
		
		
	}
	
	@Ignore
	@Test
	public void testAlgomonEnEstadoPersistenteSeDesactivaCausandoDanioAntesDeDesactivarse(){
		
		
		Algomon venusaur = new Algomon("Venusaur", new TipoPlanta(), null, new Salud(400));
		
		ContextoEstado contexto = new ContextoEstado(); 
		
		contexto.estadoNuevo(new EstadoPersistente(new Quemado()));
		
		contexto.desactivarEstados(venusaur);
		
		assertEquals(360,venusaur.salud(),0.01D);
		
		assertFalse(contexto.estaAfectado());
		
	}
	
	@Ignore
	@Test
	public void testAlgomonEnEstadoEfimeroSeDesactiva(){
		
		Algomon venusaur = new Algomon("Venusaur", new TipoPlanta(), null, new Salud(400));
		
		ContextoEstado contexto = new ContextoEstado(); 
		
		contexto.estadoNuevo(new EstadoEfimero(new Dormido()));
					
		contexto.desactivarEstados(venusaur);
		
		assertFalse(contexto.estaAfectado());
		
	}
	
	@Ignore
	@Test
	public void testDesactivarMasDeUnEstadoDelContexto(){
		
		Algomon venusaur = new Algomon("Venusaur", new TipoPlanta(), null, new Salud(400));
		
		ContextoEstado contexto = new ContextoEstado(); 
		
		contexto.estadoNuevo(new EstadoPersistente(new Quemado()));
		
		contexto.estadoNuevo(new EstadoEfimero(new Dormido()));
		
		contexto.desactivarEstados(venusaur);
		
		assertEquals(360,venusaur.salud(),0.01D);
		
		assertFalse(contexto.estaAfectado());
	}
	
	@Ignore
	@Test
	public void testLosElEstadoEfimeroQueProduceEfectosDeDormirNoSonAcumulables(){
		
		Algomon venusaur = new Algomon("Venusaur", new TipoPlanta(), null, new Salud(400));
		
		ContextoEstado contexto = new ContextoEstado(); 
		
		contexto.estadoNuevo(new EstadoEfimero(new Dormido()));
		
		contexto.estadoNuevo(new EstadoEfimero(new Dormido()));
		
		try{
			contexto.aplicarEfectos(venusaur);
		}catch(AtacarDormidoNoPuedeRealizarseException exception){}
		
		try{
			contexto.aplicarEfectos(venusaur);
		}catch(AtacarDormidoNoPuedeRealizarseException exception){}
		
		try{
			contexto.aplicarEfectos(venusaur);
		}catch(AtacarDormidoNoPuedeRealizarseException exception){}
		
		contexto.aplicarEfectos(venusaur);
		
	}
}

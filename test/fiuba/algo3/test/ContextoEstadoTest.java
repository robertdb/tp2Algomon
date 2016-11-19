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
import fiuba.algo3.algomones.NombreDelAtaque;
import fiuba.algo3.algomones.Quemado;
import fiuba.algo3.algomones.Salud;
import fiuba.algo3.algomones.Tipo;
import fiuba.algo3.algomones.TipoPlanta;
import fiuba.algo3.algomones.excepciones.CantidadDeAtaquesAgotadosException;
import fiuba.algo3.algomones.excepciones.AtacarDormidoNoPuedeRealizarseException;

	public class ContextoEstadoTest {

	
	@Test
	public void testSeAplicanEfectosDormidoYQuemadoAlAlgomon(){
		
		AtacarDormidoNoPuedeRealizarseException err1 = null;
		AtacarDormidoNoPuedeRealizarseException err2 = null;
		AtacarDormidoNoPuedeRealizarseException err3 = null;
		AtacarDormidoNoPuedeRealizarseException err4 = null;
		
		Algomon venusaur = new Algomon("Venusaur", new TipoPlanta(), null, new Salud(400));
		
		ContextoEstado contexto = new ContextoEstado(); 
		
		contexto.nuevoEfecto(new Dormido());
		
		contexto.nuevoEfecto(new Quemado());
		
		
		try{
			
			contexto.aplicarEfectos(venusaur);
			
		}catch(AtacarDormidoNoPuedeRealizarseException exep){
			
			err1 = exep;
			
		}
		
		try{
			
			contexto.aplicarEfectos(venusaur);
			
		}catch(AtacarDormidoNoPuedeRealizarseException exep){
			
			err2 = exep;
			
		}
		try{
			
			contexto.aplicarEfectos(venusaur);
			
		}catch(AtacarDormidoNoPuedeRealizarseException exep){
			
			err3 = exep;
		}

		try{
			contexto.aplicarEfectos(venusaur);
		}catch(AtacarDormidoNoPuedeRealizarseException exep){
			
			err4 = exep;
		}
		
		assertTrue(err1 instanceof AtacarDormidoNoPuedeRealizarseException);
		assertTrue(err2 instanceof AtacarDormidoNoPuedeRealizarseException);
		assertTrue(err3 instanceof AtacarDormidoNoPuedeRealizarseException);
		assertFalse(err4 instanceof AtacarDormidoNoPuedeRealizarseException);
		assertEquals(240,venusaur.salud(),0.01D);
		
		
	}
	
	
	@Test
	public void testElEfectoQuemadoCausaDanioEnElAlgomonAntesDeDesactivarse(){
		
		
		Algomon venusaur = new Algomon("Venusaur", new TipoPlanta(), null, new Salud(400));
		
		ContextoEstado contexto = new ContextoEstado(); 
		
		contexto.nuevoEfecto(new Quemado());
		
		contexto.aplicarNormalizador(venusaur);
		
		assertEquals(360,venusaur.salud(),0.01D);
		
	}
	
	
	@Test
	public void testEfectoDormidoEnAlgomonSeDesactiva(){
		
		AtacarDormidoNoPuedeRealizarseException err1 = null;
		AtacarDormidoNoPuedeRealizarseException err2 = null;
		AtacarDormidoNoPuedeRealizarseException err3 = null;
		
		Algomon venusaur = new Algomon("Venusaur", new TipoPlanta(), null, new Salud(400));
		
		ContextoEstado contexto = new ContextoEstado(); 
		
		contexto.nuevoEfecto(new Dormido());
					
		try{
			contexto.aplicarEfectos(venusaur);
		}catch(AtacarDormidoNoPuedeRealizarseException exception){
			
			err1 = exception;
			
		}
		
		try{
			contexto.aplicarEfectos(venusaur);
		}catch(AtacarDormidoNoPuedeRealizarseException exception){
			
			err2 = exception;
			
		}
		
		contexto.aplicarNormalizador(venusaur);
		
		try{
			contexto.aplicarEfectos(venusaur);
		}catch(AtacarDormidoNoPuedeRealizarseException exception){
			
			err3 = exception;
			
		}
		
		assertTrue(err1 instanceof AtacarDormidoNoPuedeRealizarseException);
		assertTrue(err2 instanceof AtacarDormidoNoPuedeRealizarseException);
		assertFalse(err3 instanceof AtacarDormidoNoPuedeRealizarseException);
			
	}
	
	@Test
	public void testAplicarEfectosDormidoDevueleExceptionDeNoPoderAtacar3Veces(){
		
		AtacarDormidoNoPuedeRealizarseException err1 = null;
		AtacarDormidoNoPuedeRealizarseException err2 = null;
		AtacarDormidoNoPuedeRealizarseException err3 = null;
		AtacarDormidoNoPuedeRealizarseException err4 = null;
		
		Algomon venusaur = new Algomon("Venusaur", new TipoPlanta(), null, new Salud(400));
		
		ContextoEstado contexto = new ContextoEstado(); 
		
		contexto.nuevoEfecto(new Dormido());
	
		try{
			contexto.aplicarEfectos(venusaur);
		}catch(AtacarDormidoNoPuedeRealizarseException exception){
			
			err1 = exception;
			
		}
		
		try{
			contexto.aplicarEfectos(venusaur);
		}catch(AtacarDormidoNoPuedeRealizarseException exception){
			
			err2 = exception;
			
		}
		
		try{
			contexto.aplicarEfectos(venusaur);
		}catch(AtacarDormidoNoPuedeRealizarseException exception){
			
			err3 = exception;
		}
		
		assertTrue(err1 instanceof AtacarDormidoNoPuedeRealizarseException);
		assertTrue(err2 instanceof AtacarDormidoNoPuedeRealizarseException);
		assertTrue(err3 instanceof AtacarDormidoNoPuedeRealizarseException);
		assertFalse(err4 instanceof AtacarDormidoNoPuedeRealizarseException);
		
		
	}
}

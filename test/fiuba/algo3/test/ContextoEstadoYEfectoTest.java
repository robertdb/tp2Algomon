package fiuba.algo3.test;

import static org.junit.Assert.*;

import java.util.EnumMap;

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
import fiuba.algo3.algomones.excepciones.PierdeUnTurnoException;

public class ContextoEstadoYEfectoTest {

	@Test
	public void testContextoEstadoInicial() {
		ContextoEstado contexto = new ContextoEstado(); 
		
		assertEquals(false,contexto.estaAfectado());
		
		Efecto dormido = new Dormido();
		AlgomonEstado efimero = new EstadoEfimero(dormido);
		contexto.estadoNuevo(efimero);
		
		Efecto quemado = new Quemado();
		AlgomonEstado persistente = new EstadoPersistente(quemado);
		contexto.estadoNuevo(persistente);
		
		assertEquals(true,contexto.estaAfectado());
	}
	@Test(expected = PierdeUnTurnoException .class)
	public void testContextoConAlgomonBolbasour(){

		Efecto dormido = new Dormido();
		
		Efecto quemado = new Quemado();
		
		
		Salud salud = new Salud(400);
		Tipo planta = new TipoPlanta();
		Algomon venusaur = new Algomon("Venusaur", planta, null, salud);
		
		quemado.aplicarEfecto(venusaur);
		
		assertEquals(360,venusaur.salud(),0.001D);
		
		dormido.aplicarEfecto(venusaur);
	}
	@Test(expected = PierdeUnTurnoException .class)
	public void testListaDeEfectoABulbasour(){
		ContextoEstado contexto = new ContextoEstado(); 
		
		Efecto quemado = new Quemado();
		AlgomonEstado persistente = new EstadoPersistente(quemado);
		contexto.estadoNuevo(persistente);
		
		Salud salud = new Salud(400);
		Tipo planta = new TipoPlanta();
		Algomon venusaur = new Algomon("Venusaur", planta, null, salud);
		
		contexto.aplicarEfectos(venusaur);
		assertEquals(360,venusaur.salud(),0.01D);
		

		contexto.aplicarEfectos(venusaur);
		assertEquals(320,venusaur.salud(),0.01D);
		
		Efecto dormido = new Dormido();
		AlgomonEstado efimero = new EstadoEfimero(dormido);
		contexto.estadoNuevo(efimero);
		
		contexto.aplicarEfectos(venusaur);
	}
	@Test
	public void desactivarEstadosDelContexto(){
		ContextoEstado contexto = new ContextoEstado(); 
		
		Efecto quemado = new Quemado();
		AlgomonEstado persistente = new EstadoPersistente(quemado);
		contexto.estadoNuevo(persistente);
		
		Salud salud = new Salud(400);
		Tipo planta = new TipoPlanta();
		Algomon venusaur = new Algomon("Venusaur", planta, null, salud);
		
		contexto.desactivarEstados(venusaur);
		assertEquals(360,venusaur.salud(),0.01D);
		
		assertEquals(false,contexto.estaAfectado());
		
		Efecto dormido = new Dormido();
		AlgomonEstado efimero = new EstadoEfimero(dormido);
		contexto.estadoNuevo(efimero);
		
		contexto.desactivarEstados(venusaur);
		assertEquals(360,venusaur.salud(),0.01D);
		
		assertEquals(false,contexto.estaAfectado());
	}
	@Test
	public void desactivarMasDeUnEstadoDelContexto(){
		ContextoEstado contexto = new ContextoEstado(); 
		
		Efecto quemado = new Quemado();
		AlgomonEstado persistente = new EstadoPersistente(quemado);
		contexto.estadoNuevo(persistente);
		
		Efecto dormido = new Dormido();
		AlgomonEstado efimero = new EstadoEfimero(dormido);
		contexto.estadoNuevo(efimero);
		
		Salud salud = new Salud(400);
		Tipo planta = new TipoPlanta();
		Algomon venusaur = new Algomon("Venusaur", planta, null, salud);
		
		contexto.desactivarEstados(venusaur);
		assertEquals(360,venusaur.salud(),0.01D);
		
		assertEquals(false,contexto.estaAfectado());
	}
}

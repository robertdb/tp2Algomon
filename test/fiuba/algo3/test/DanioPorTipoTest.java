package fiuba.algo3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.algomones.Tipo;
import fiuba.algo3.algomones.TipoAgua;
import fiuba.algo3.algomones.TipoFuego;
import fiuba.algo3.algomones.TipoNormal;
import fiuba.algo3.algomones.TipoPlanta;

public class DanioPorTipoTest {

	@Test
	public void testFuegoContraTodo() {
		Tipo tipoFuego = new TipoFuego();
		Tipo tipoAgua = new TipoAgua();
		Tipo tipoPlanta = new TipoPlanta();
		Tipo tipoNormal = new TipoNormal();
		
		assertEquals(0.5,tipoFuego.danioContra(tipoFuego),0.000D);
		assertEquals(0.5,tipoFuego.danioContra(tipoAgua),0.000D);
		assertEquals(2,tipoFuego.danioContra(tipoPlanta),0.000D);
		assertEquals(1,tipoFuego.danioContra(tipoNormal),0.000D);
	}
	@Test
	public void testAguaContraTodo(){
		Tipo tipoFuego = new TipoFuego();
		Tipo tipoAgua = new TipoAgua();
		Tipo tipoPlanta = new TipoPlanta();
		Tipo tipoNormal = new TipoNormal();
		
		assertEquals(0.5,tipoAgua.danioContra(tipoAgua),0.000D);
		assertEquals(2,tipoAgua.danioContra(tipoFuego),0.000D);
		assertEquals(0.5,tipoAgua.danioContra(tipoPlanta),0.000D);
		assertEquals(1,tipoAgua.danioContra(tipoNormal),0.000D);
	}
	@Test
	public void testPlantaContraTodo(){
		Tipo tipoFuego = new TipoFuego();
		Tipo tipoAgua = new TipoAgua();
		Tipo tipoPlanta = new TipoPlanta();
		Tipo tipoNormal = new TipoNormal();
		
		assertEquals(0.5,tipoPlanta.danioContra(tipoPlanta),0.000D);
		assertEquals(0.5,tipoPlanta.danioContra(tipoFuego),0.000D);
		assertEquals(2,tipoPlanta.danioContra(tipoAgua),0.000D);
		assertEquals(1,tipoPlanta.danioContra(tipoNormal),0.000D);
	}
	@Test
	public void testNormalContraTodo(){
		Tipo tipoFuego = new TipoFuego();
		Tipo tipoAgua = new TipoAgua();
		Tipo tipoPlanta = new TipoPlanta();
		Tipo tipoNormal = new TipoNormal();
		
		assertEquals(1,tipoNormal.danioContra(tipoPlanta),0.000D);
		assertEquals(1,tipoNormal.danioContra(tipoFuego),0.000D);
		assertEquals(1,tipoNormal.danioContra(tipoAgua),0.000D);
		assertEquals(1,tipoNormal.danioContra(tipoNormal),0.000D);
		
	}

}

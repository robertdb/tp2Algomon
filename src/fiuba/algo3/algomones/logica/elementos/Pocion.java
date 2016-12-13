package fiuba.algo3.algomones.logica.elementos;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.Elemento;
import fiuba.algo3.algomones.logica.excepciones.ElementoAgotadoException;

public class Pocion extends Elemento {

	private int puntosDeVidaQueAumenta = 20;
	
	public Pocion() {
		setCantidad(4);
		setNombre("Pocion");
	}
	
	protected void setPuntosDeVidaQueAumenta(int puntos) {
		this.puntosDeVidaQueAumenta = puntos;
	}
	
	@Override
	public void aplicar(Algomon algomon) {
		if (elementoAgotado()) {
			throw new ElementoAgotadoException();
		}
		algomon.aumentarVida(puntosDeVidaQueAumenta);
		this.setCantidad(this.getCantidadRestante() - 1);
	}

}

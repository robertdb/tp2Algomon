package fiuba.algo3.algomones.elementos;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Elemento;
import fiuba.algo3.algomones.excepciones.ElementoAgotadoException;

public class Vitamina extends Elemento {

	private int cantidadAumento = 2;
	
	public Vitamina() {
		setCantidad(5);
		setNombre("Vitamina");
	}
	
	@Override
	public void aplicar(Algomon algomon) {
		if (elementoAgotado()) {
			throw new ElementoAgotadoException();
		}
		algomon.aumentarTodosLosAtaques(cantidadAumento);
		this.setCantidad(this.getCantidadRestante() - 1);
	}

}

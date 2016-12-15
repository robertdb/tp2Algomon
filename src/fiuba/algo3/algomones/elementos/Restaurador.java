package fiuba.algo3.algomones.elementos;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Elemento;
import fiuba.algo3.algomones.estadosdealgomones.*;
import fiuba.algo3.algomones.excepciones.ElementoAgotadoException;

public class Restaurador extends Elemento {
	
	public Restaurador() {
		setCantidad(3);
		setNombre("Restaurador");
	}
	
	@Override
	public void aplicar(Algomon algomon) {
		if (elementoAgotado()) {
			throw new ElementoAgotadoException();
		}
		algomon.setEstadoPersistente(new EstadoNoQuemado());
		algomon.setEstadoEfimero(new EstadoNoDormido());
		this.setCantidad(this.getCantidadRestante() - 1);
	}

}

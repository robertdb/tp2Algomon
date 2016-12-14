package fiuba.algo3.algomones.logica.elementos;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.Elemento;
import fiuba.algo3.algomones.logica.estadosdealgomones.*;
import fiuba.algo3.algomones.logica.excepciones.ElementoAgotadoException;

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

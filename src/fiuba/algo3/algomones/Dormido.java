package fiuba.algo3.algomones;

import fiuba.algo3.algomones.excepciones.AtacarDormidoNoPuedeRealizarseException;

public class Dormido implements Efecto{
	private int tiempo;
	
	public Dormido() {
		tiempo = 3;
	}

	@Override
	public void aplicarEfecto(Algomon algomon) {
		this.tiempo = this.tiempo -1;
		throw new AtacarDormidoNoPuedeRealizarseException();
		
	}

	@Override
	public boolean estaActivado() {
		return (this.tiempo == 0);
	}

}

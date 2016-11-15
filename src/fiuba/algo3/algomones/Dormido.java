package fiuba.algo3.algomones;

import fiuba.algo3.algomones.excepciones.PierdeUnTurnoExeption;

public class Dormido implements Efecto{
	private int tiempo;
	
	public Dormido() {
		tiempo = 3;
	}

	@Override
	public void aplicarEfecto(Algomon algomon) {
		this.tiempo = this.tiempo -1;
		throw new PierdeUnTurnoExeption();
		
	}

	@Override
	public boolean estaActivado() {
		return (this.tiempo == 0);
	}

}

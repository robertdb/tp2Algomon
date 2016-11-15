package fiuba.algo3.algomones;

public class Quemado implements Efecto{
	public Quemado() {
	}
	@Override
	public void aplicarEfecto(Algomon algomon) {
		double vida=algomon.salud();
		algomon.reducirSalud(vida*0.10);
	}
	@Override
	public boolean estaActivado() {
		return true;
	}

}

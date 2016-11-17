package fiuba.algo3.algomones;

public class Quemado implements Efecto{
	
	private final double porcetajeDeQuemadura;
	
	public Quemado() {
		
		this.porcetajeDeQuemadura = 0.10;
		
	}
	
	@Override
	public void aplicarEfecto(Algomon algomon) {
		
		double vida = algomon.saludOriginal();
		
		double danio = vida * porcetajeDeQuemadura;
		
		algomon.reducirSalud( danio);
		
	}
	
	@Override
	public boolean estaActivado() {
		return true;
	}

}

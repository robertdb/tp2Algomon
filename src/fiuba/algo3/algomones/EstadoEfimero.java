package fiuba.algo3.algomones;

public class EstadoEfimero implements AlgomonEstado{
	private Efecto efecto;
	
	public EstadoEfimero(Efecto efecto) {
		this.efecto = efecto;
	}

	@Override
	public void aplicarEfecto(Algomon algomon) {
		efecto.aplicarEfecto(algomon);
		
	}

}

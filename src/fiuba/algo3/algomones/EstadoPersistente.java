package fiuba.algo3.algomones;

public class EstadoPersistente implements AlgomonEstado{
	
	private Efecto efecto;
	
	public EstadoPersistente(Efecto efecto) {
		this.efecto = efecto;
	}

	@Override
	public void aplicarEfecto(Algomon algomon) {
		efecto.aplicarEfecto(algomon);
	}

}

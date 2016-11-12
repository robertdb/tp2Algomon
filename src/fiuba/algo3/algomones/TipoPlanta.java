package fiuba.algo3.algomones;

public class TipoPlanta extends Tipo{

	public TipoPlanta() {
		this.danioContraAgua = 0.5;
		this.danioContraFuego = 2;
		this.danioContraPlanta = 0.5;
		this.danioContraNormal = 1;
	}

	@Override
	public double danioContra(Tipo tipo) {
	
		return tipo.danioContraPlanta;
	}

}

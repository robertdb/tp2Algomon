package fiuba.algo3.algomones;

public class TipoFuego extends Tipo{

	public TipoFuego() {
		this.danioContraAgua = 2;
		this.danioContraFuego = 0.5;
		this.danioContraPlanta = 0.5;
		this.danioContraNormal = 1;
	}

	@Override
	public double danioContra(Tipo tipo) {
		return tipo.danioContraFuego;
	}

}

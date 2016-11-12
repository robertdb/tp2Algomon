package fiuba.algo3.algomones;

public class TipoAgua extends DanioPorTipo{
	
	public TipoAgua() {
		this.danioContraAgua = 0.5; 
		this.danioContraFuego = 0.5;
		this.danioContraPlanta = 2;
		this.danioContraNormal = 1;
	}

	@Override
	public double danioContra(DanioPorTipo tipo) {
		return tipo.danioContraAgua;
	}

}

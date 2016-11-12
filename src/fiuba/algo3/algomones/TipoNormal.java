package fiuba.algo3.algomones;

public class TipoNormal extends DanioPorTipo{
	
	
	public TipoNormal() {
		this.danioContraAgua = 1;
		this.danioContraFuego = 1;
		this.danioContraPlanta = 1;
		this.danioContraNormal = 1; 
	}

	@Override
	public double danioContra(DanioPorTipo tipo) {
		return this.danioContraNormal;
	}

}

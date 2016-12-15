package fiuba.algo3.algomones.tiposdeataque;

import fiuba.algo3.algomones.TipoDeAtaque;

public class AtaqueTipoPlanta extends TipoDeAtaque{
	
	public AtaqueTipoPlanta() {
		setMultiplicadorDeDanioContraAgua(2);
		setMultiplicadorDeDanioContraFuego(0.5);
		setMultiplicadorDeDanioContraPlanta(0.5);
	}
	
}

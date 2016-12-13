package fiuba.algo3.algomones.logica.tiposdeataque;

import fiuba.algo3.algomones.logica.TipoDeAtaque;

public class AtaqueTipoAgua extends TipoDeAtaque{

	public AtaqueTipoAgua() {
		setMultiplicadorDeDanioContraAgua(0.5);
		setMultiplicadorDeDanioContraFuego(2);
		setMultiplicadorDeDanioContraPlanta(0.5);
	}
	
}

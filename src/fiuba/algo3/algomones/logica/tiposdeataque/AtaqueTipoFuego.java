package fiuba.algo3.algomones.logica.tiposdeataque;

import fiuba.algo3.algomones.logica.TipoDeAtaque;

public class AtaqueTipoFuego extends TipoDeAtaque{

	public AtaqueTipoFuego() {
		setMultiplicadorDeDanioContraAgua(0.5);
		setMultiplicadorDeDanioContraFuego(0.5);
		setMultiplicadorDeDanioContraPlanta(2);
	}
	
}

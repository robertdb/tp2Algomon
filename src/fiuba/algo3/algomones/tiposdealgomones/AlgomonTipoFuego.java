package fiuba.algo3.algomones.tiposdealgomones;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Ataque;

public class AlgomonTipoFuego extends Algomon{

	@Override
	public int recibirAtaque(Ataque ataque) {
		int vidaAntes = this.getVida();
		int danio = ataque.getDanioContraFuego();
		this.recibirDanio(danio);
		return (vidaAntes - this.getVida());
	}
	
}

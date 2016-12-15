package fiuba.algo3.algomones.tiposdealgomones;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Ataque;

public class AlgomonTipoPlanta extends Algomon{

	@Override
	public int recibirAtaque(Ataque ataque) {
		int vidaAntes = this.getVida();
		int danio = ataque.getDanioContraPlanta();
		this.recibirDanio(danio);
		return (vidaAntes - this.getVida());
	}
	
}

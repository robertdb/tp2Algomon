package fiuba.algo3.algomones.logica.tiposdealgomones;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.Ataque;

public class AlgomonTipoAgua extends Algomon {
	
	@Override
	public int recibirAtaque(Ataque ataque) {
		int vidaAntes = this.getVida();
		int danio = ataque.getDanioContraAgua();
		this.recibirDanio(danio);
		return (vidaAntes - this.getVida());
	}
	
}

package fiuba.algo3.algomones.logica.tiposdealgomones;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.Ataque;

public class AlgomonTipoPlanta extends Algomon{

	@Override
	public int recibirAtaque(Ataque ataque) {
		int danio = ataque.getDanioContraPlanta();
		this.setVida(this.getVida() - danio);
		return danio;
	}
	
}

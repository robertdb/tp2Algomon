package fiuba.algo3.algomones.logica.estadosdealgomones;

import fiuba.algo3.algomones.logica.Algomon;

public class EstadoQuemado extends EstadoPersistente {

	@Override
	public void aplicarEfecto(Algomon algomon) {
		algomon.recibirDanio((int) (algomon.getVidaOriginal() * 0.1)); 
	}

}

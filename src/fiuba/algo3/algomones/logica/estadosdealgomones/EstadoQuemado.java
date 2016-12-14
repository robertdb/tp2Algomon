package fiuba.algo3.algomones.logica.estadosdealgomones;

import fiuba.algo3.algomones.logica.Algomon;

public class EstadoQuemado extends EstadoPersistente {

	@Override
	public void aplicarEfectoAtaque(Algomon algomon) {
		algomon.recibirDanio((int) (algomon.getVidaOriginal() * 0.1));
	}

	@Override
	public void aplicarEfectoElemento(Algomon algomon) {
		algomon.recibirDanio((int) (algomon.getVidaOriginal() * 0.1));
	}

}

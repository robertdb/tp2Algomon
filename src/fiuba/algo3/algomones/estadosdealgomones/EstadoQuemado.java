package fiuba.algo3.algomones.estadosdealgomones;

import fiuba.algo3.algomones.Algomon;

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

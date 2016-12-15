package fiuba.algo3.algomones.estadosdealgomones;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.EstadoAlgomon;

public abstract class EstadoEfimero implements EstadoAlgomon {
	
	@Override
	public abstract void aplicarEfectoAtaque(Algomon algomon);
	
	@Override
	public abstract void aplicarEfectoElemento(Algomon algomon);

	
}

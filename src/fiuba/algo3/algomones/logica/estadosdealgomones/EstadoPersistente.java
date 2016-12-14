package fiuba.algo3.algomones.logica.estadosdealgomones;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.EstadoAlgomon;

public abstract class EstadoPersistente implements EstadoAlgomon {

	@Override
	public abstract void aplicarEfectoAtaque(Algomon algomon);
	
	@Override
	public abstract void aplicarEfectoElemento(Algomon algomon);

}

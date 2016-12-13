package fiuba.algo3.algomones.logica;

import fiuba.algo3.algomones.logica.estadosdealgomones.EstadoNoDormido;
import fiuba.algo3.algomones.logica.estadosdealgomones.EstadoNoQuemado;

public class ContextoEstado {
	
	private EstadoAlgomon estadoPersistente = new EstadoNoQuemado();
	private EstadoAlgomon estadoEfimero = new EstadoNoDormido();

	public void setEstadoPersistente(EstadoAlgomon estado) {
		this.estadoPersistente = estado;
	}
	
	public void setEstadoEfimero(EstadoAlgomon estado) {
		this.estadoEfimero = estado;
	}

	public void aplicarEfectos(Algomon algomon) {
		estadoPersistente.aplicarEfecto(algomon);
		estadoEfimero.aplicarEfecto(algomon);
	}

}

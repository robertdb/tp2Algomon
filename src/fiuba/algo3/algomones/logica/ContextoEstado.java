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

	public void aplicarEfectosAtaque(Algomon algomon) {
		estadoPersistente.aplicarEfectoAtaque(algomon);
		estadoEfimero.aplicarEfectoAtaque(algomon);
	}
	
	public void aplicarEfectosElemento(Algomon algomon) {
		estadoPersistente.aplicarEfectoElemento(algomon);
		estadoEfimero.aplicarEfectoElemento(algomon);
	}

	public EstadoAlgomon getEstadoPersistente() {
		return this.estadoPersistente;
	}

	public EstadoAlgomon getEstadoEfimero() {
		return this.estadoEfimero;
	}

}

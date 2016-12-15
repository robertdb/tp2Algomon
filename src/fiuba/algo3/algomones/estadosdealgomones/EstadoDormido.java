package fiuba.algo3.algomones.estadosdealgomones;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.excepciones.AlgomonDormidoNoPuedeAtacarException;

public class EstadoDormido extends EstadoEfimero{

	private int turnosRestantes = 3;
	
	@Override
	public void aplicarEfectoAtaque(Algomon algomon) {
		if (turnosRestantes < 1) {
			algomon.setEstadoEfimero(new EstadoNoDormido());
			return;
		}
		turnosRestantes--;
		throw new AlgomonDormidoNoPuedeAtacarException();
	}
	
	@Override
	public void aplicarEfectoElemento(Algomon algomon) {
		// Al aplicar un elemento solo se descuenta un turno restante, no se evita la accion
		if (turnosRestantes < 2) { //TODO hardcoded, tiene que ir un 1 pero la interfaz tarda un turno de mas en habilitar los ataques
			algomon.setEstadoEfimero(new EstadoNoDormido());
			return;
		}
		turnosRestantes--;
	}

}

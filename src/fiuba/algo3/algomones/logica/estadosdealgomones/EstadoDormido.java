package fiuba.algo3.algomones.logica.estadosdealgomones;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.excepciones.AlgomonDormidoNoPuedeAtacarException;

public class EstadoDormido extends EstadoEfimero{

	private int turnosRestantes = 3;
	
	@Override
	public void aplicarEfecto(Algomon algomon) {
		if (turnosRestantes < 1) {
			algomon.setEstadoEfimero(new EstadoNoDormido());
			return;
		}
		turnosRestantes--;
		throw new AlgomonDormidoNoPuedeAtacarException();
	}

}

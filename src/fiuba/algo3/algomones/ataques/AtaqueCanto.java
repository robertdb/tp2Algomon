package fiuba.algo3.algomones.ataques;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.AtaqueEspecial;
import fiuba.algo3.algomones.estadosdealgomones.EstadoDormido;
import fiuba.algo3.algomones.excepciones.AtaqueAgotadoException;
import fiuba.algo3.algomones.tiposdeataque.*;

public class AtaqueCanto extends AtaqueEspecial {
	
	public AtaqueCanto() {
		setPotencia(0);
		setCantidad(6);
		setNombre("Canto");
		setTipoDeAtaque(new AtaqueTipoNormal());
	} 

	@Override
	public void utilizar(Algomon algomonAtacante, Algomon algomonAtacado) {
		if (ataquesAgotados()) {
			throw new AtaqueAgotadoException();
		}
		algomonAtacado.recibirAtaque(this);
		algomonAtacado.setEstadoEfimero(new EstadoDormido());
		setCantidad(getCantidadRestante() - 1);
	}
	
}

package fiuba.algo3.algomones.logica.ataques;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.AtaqueEspecial;
import fiuba.algo3.algomones.logica.estadosdealgomones.EstadoDormido;
import fiuba.algo3.algomones.logica.excepciones.AtaqueAgotadoException;
import fiuba.algo3.algomones.logica.tiposdeataque.*;

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

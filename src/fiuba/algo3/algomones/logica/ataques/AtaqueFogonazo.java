package fiuba.algo3.algomones.logica.ataques;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.AtaqueEspecial;
import fiuba.algo3.algomones.logica.estadosdealgomones.EstadoQuemado;
import fiuba.algo3.algomones.logica.excepciones.AtaqueAgotadoException;
import fiuba.algo3.algomones.logica.tiposdeataque.*;

public class AtaqueFogonazo extends AtaqueEspecial {

	public AtaqueFogonazo() {
		setPotencia(2);
		setCantidad(4);
		setNombre("Fogonazo");
		setTipoDeAtaque(new AtaqueTipoFuego());
	} 
	
	@Override
	public void utilizar(Algomon algomonAtacante, Algomon algomonAtacado) {
		if (ataquesAgotados()) {
			throw new AtaqueAgotadoException();
		}
		algomonAtacado.recibirAtaque(this);
		algomonAtacado.setEstadoEfimero(new EstadoQuemado());
		setCantidad(getCantidadRestante() - 1);
	}
	
}

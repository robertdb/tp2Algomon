package fiuba.algo3.algomones.ataques;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.AtaqueEspecial;
import fiuba.algo3.algomones.estadosdealgomones.EstadoQuemado;
import fiuba.algo3.algomones.excepciones.AtaqueAgotadoException;
import fiuba.algo3.algomones.tiposdeataque.*;

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
		algomonAtacado.setEstadoPersistente(new EstadoQuemado());
		setCantidad(getCantidadRestante() - 1);
	}
	
}

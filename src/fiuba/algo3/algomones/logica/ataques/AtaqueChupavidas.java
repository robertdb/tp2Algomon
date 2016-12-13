package fiuba.algo3.algomones.logica.ataques;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.AtaqueEspecial;
import fiuba.algo3.algomones.logica.excepciones.AtaqueAgotadoException;
import fiuba.algo3.algomones.logica.tiposdeataque.*;

public class AtaqueChupavidas extends AtaqueEspecial {

	public AtaqueChupavidas() {
		setPotencia(15);
		setCantidad(8);
		setNombre("Chupavidas");
		setTipoDeAtaque(new AtaqueTipoPlanta());
	} 
	
	@Override
	public void utilizar(Algomon algomonAtacante, Algomon algomonAtacado) {
		if (ataquesAgotados()) {
			throw new AtaqueAgotadoException();
		}
		int danio = algomonAtacado.recibirAtaque(this);
		algomonAtacante.aumentarVida(danio * 30 / 100);
		setCantidad(getCantidadRestante() - 1);
	}
	
}

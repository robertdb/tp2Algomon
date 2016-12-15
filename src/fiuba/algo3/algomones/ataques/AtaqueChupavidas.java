package fiuba.algo3.algomones.ataques;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.AtaqueEspecial;
import fiuba.algo3.algomones.excepciones.AtaqueAgotadoException;
import fiuba.algo3.algomones.tiposdeataque.*;

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

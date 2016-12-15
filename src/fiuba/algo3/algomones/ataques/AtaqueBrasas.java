package fiuba.algo3.algomones.ataques;

import fiuba.algo3.algomones.AtaqueSimple;
import fiuba.algo3.algomones.tiposdeataque.*;

public class AtaqueBrasas extends AtaqueSimple {
	
	public AtaqueBrasas() {
		setPotencia(16);
		setCantidad(10);
		setNombre("Brasas");
		setTipoDeAtaque(new AtaqueTipoFuego());
	} 
	
}

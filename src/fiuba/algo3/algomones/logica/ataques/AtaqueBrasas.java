package fiuba.algo3.algomones.logica.ataques;

import fiuba.algo3.algomones.logica.AtaqueSimple;
import fiuba.algo3.algomones.logica.tiposdeataque.*;

public class AtaqueBrasas extends AtaqueSimple {
	
	public AtaqueBrasas() {
		setPotencia(16);
		setCantidad(10);
		setNombre("Brasas");
		setTipoDeAtaque(new AtaqueTipoFuego());
	} 
	
}

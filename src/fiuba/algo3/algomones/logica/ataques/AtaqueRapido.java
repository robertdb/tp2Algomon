package fiuba.algo3.algomones.logica.ataques;

import fiuba.algo3.algomones.logica.AtaqueSimple;
import fiuba.algo3.algomones.logica.tiposdeataque.*;

public class AtaqueRapido extends AtaqueSimple {

	public AtaqueRapido() {
		setPotencia(10);
		setCantidad(16);
		setNombre("Ataque Rapido");
		setTipoDeAtaque(new AtaqueTipoNormal());
	} 
	
}

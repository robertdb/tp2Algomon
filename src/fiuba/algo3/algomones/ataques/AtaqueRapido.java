package fiuba.algo3.algomones.ataques;

import fiuba.algo3.algomones.AtaqueSimple;
import fiuba.algo3.algomones.tiposdeataque.*;

public class AtaqueRapido extends AtaqueSimple {

	public AtaqueRapido() {
		setPotencia(10);
		setCantidad(16);
		setNombre("Ataque Rapido");
		setTipoDeAtaque(new AtaqueTipoNormal());
	} 
	
}

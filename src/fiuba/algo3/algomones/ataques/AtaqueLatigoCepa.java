package fiuba.algo3.algomones.ataques;

import fiuba.algo3.algomones.AtaqueSimple;
import fiuba.algo3.algomones.tiposdeataque.*;

public class AtaqueLatigoCepa extends AtaqueSimple {

	public AtaqueLatigoCepa() {
		setPotencia(15);
		setCantidad(10);
		setNombre("Latigo Cepa");
		setTipoDeAtaque(new AtaqueTipoPlanta());
	} 
	
}

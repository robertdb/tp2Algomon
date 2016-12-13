package fiuba.algo3.algomones.logica.ataques;

import fiuba.algo3.algomones.logica.AtaqueSimple;
import fiuba.algo3.algomones.logica.tiposdeataque.*;

public class AtaqueLatigoCepa extends AtaqueSimple {

	public AtaqueLatigoCepa() {
		setPotencia(15);
		setCantidad(10);
		setNombre("Latigo Cepa");
		setTipoDeAtaque(new AtaqueTipoPlanta());
	} 
	
}

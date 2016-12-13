package fiuba.algo3.algomones.logica.ataques;

import fiuba.algo3.algomones.logica.AtaqueSimple;
import fiuba.algo3.algomones.logica.tiposdeataque.*;

public class AtaqueBurbuja extends AtaqueSimple{
	
	public AtaqueBurbuja() {
		setPotencia(10);
		setCantidad(15);
		setNombre("Burbuja");
		setTipoDeAtaque(new AtaqueTipoAgua());
	} 
	
}

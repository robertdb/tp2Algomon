package fiuba.algo3.algomones.ataques;

import fiuba.algo3.algomones.AtaqueSimple;
import fiuba.algo3.algomones.tiposdeataque.*;

public class AtaqueBurbuja extends AtaqueSimple{
	
	public AtaqueBurbuja() {
		setPotencia(10);
		setCantidad(15);
		setNombre("Burbuja");
		setTipoDeAtaque(new AtaqueTipoAgua());
	} 
	
}

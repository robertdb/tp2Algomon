package fiuba.algo3.algomones.logica.ataques;

import fiuba.algo3.algomones.logica.AtaqueSimple;
import fiuba.algo3.algomones.logica.tiposdeataque.*;

public class AtaqueCanionDeAgua extends AtaqueSimple {
	
	public AtaqueCanionDeAgua() {
		setPotencia(20);
		setCantidad(8);
		setNombre("Canon De Agua");
		setTipoDeAtaque(new AtaqueTipoAgua());
	} 
	
}

package fiuba.algo3.algomones.ataques;

import fiuba.algo3.algomones.AtaqueSimple;
import fiuba.algo3.algomones.tiposdeataque.*;

public class AtaqueCanionDeAgua extends AtaqueSimple {
	
	public AtaqueCanionDeAgua() {
		setPotencia(20);
		setCantidad(8);
		setNombre("Canon De Agua");
		setTipoDeAtaque(new AtaqueTipoAgua());
	} 
	
}

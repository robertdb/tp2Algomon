package fiuba.algo3.algomones.especiesdealgomones;

import fiuba.algo3.algomones.ataques.*;
import fiuba.algo3.algomones.tiposdealgomones.AlgomonTipoAgua;

public class Squirtle extends AlgomonTipoAgua{

	public Squirtle() {
		setVida(150);
		setNombre("Squirtle");
		setImagenes("images/squirtle.gif", "images/squirtleback.gif");
		agregarAtaque(new AtaqueBurbuja());
		agregarAtaque(new AtaqueCanionDeAgua());
		agregarAtaque(new AtaqueRapido());
	}
	
}

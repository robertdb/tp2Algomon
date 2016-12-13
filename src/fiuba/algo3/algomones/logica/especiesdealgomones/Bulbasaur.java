package fiuba.algo3.algomones.logica.especiesdealgomones;

import fiuba.algo3.algomones.logica.ataques.*;
import fiuba.algo3.algomones.logica.tiposdealgomones.AlgomonTipoPlanta;

public class Bulbasaur extends AlgomonTipoPlanta {

	public Bulbasaur() {
		setVida(140);
		setNombre("Bulbasaur");
		setImagenes("images/bulbasaur.gif", "images/bulbasaurback.gif");
		agregarAtaque(new AtaqueChupavidas());
		agregarAtaque(new AtaqueLatigoCepa());
		agregarAtaque(new AtaqueRapido());
	}
	
}

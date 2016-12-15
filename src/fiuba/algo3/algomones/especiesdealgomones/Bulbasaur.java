package fiuba.algo3.algomones.especiesdealgomones;

import fiuba.algo3.algomones.ataques.*;
import fiuba.algo3.algomones.tiposdealgomones.AlgomonTipoPlanta;

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

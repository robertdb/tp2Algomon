package fiuba.algo3.algomones.especiesdealgomones;

import fiuba.algo3.algomones.ataques.*;
import fiuba.algo3.algomones.tiposdealgomones.AlgomonTipoFuego;

public class Charmander extends AlgomonTipoFuego {
	
	public Charmander() {
		setVida(170);
		setNombre("Charmander");
		setImagenes("images/charmander.gif", "images/charmanderback.gif");
		agregarAtaque(new AtaqueBrasas());
		agregarAtaque(new AtaqueFogonazo());
		agregarAtaque(new AtaqueRapido());
	}
	
}

package fiuba.algo3.algomones.logica.especiesdealgomones;

import fiuba.algo3.algomones.logica.ataques.*;
import fiuba.algo3.algomones.logica.tiposdealgomones.AlgomonTipoFuego;

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

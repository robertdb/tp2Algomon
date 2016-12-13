package fiuba.algo3.algomones.logica.especiesdealgomones;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.ataques.*;

public class Rattata extends Algomon {

	public Rattata() {
		setVida(170);
		setNombre("Rattata");
		setImagenes("images/rattata.gif", "images/rattataback.gif");
		agregarAtaque(new AtaqueFogonazo());
		agregarAtaque(new AtaqueBurbuja());
		agregarAtaque(new AtaqueRapido());
	}
	
}

package fiuba.algo3.algomones.especiesdealgomones;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.ataques.*;

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

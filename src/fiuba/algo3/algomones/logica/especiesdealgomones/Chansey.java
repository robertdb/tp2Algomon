package fiuba.algo3.algomones.logica.especiesdealgomones;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.ataques.*;

public class Chansey extends Algomon {

	public Chansey() {
		setVida(130);
		setNombre("Chansey");
		setImagenes("images/chansey.gif", "images/chanseyback.gif");
		agregarAtaque(new AtaqueCanto());
		agregarAtaque(new AtaqueLatigoCepa());
		agregarAtaque(new AtaqueRapido());
	}
	
}

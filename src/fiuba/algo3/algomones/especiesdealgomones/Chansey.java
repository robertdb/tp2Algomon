package fiuba.algo3.algomones.especiesdealgomones;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.ataques.*;

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

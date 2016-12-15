package fiuba.algo3.algomones.especiesdealgomones;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.ataques.*;

public class Jigglypuff extends Algomon {

	public Jigglypuff() {
		setVida(130);
		setNombre("Jigglypuff");
		setImagenes("images/jigglypuff.gif", "images/jigglypuffback.gif");
		agregarAtaque(new AtaqueCanto());
		agregarAtaque(new AtaqueBurbuja());
		agregarAtaque(new AtaqueRapido());
	}
	
}

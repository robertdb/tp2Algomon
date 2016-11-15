package fiuba.algo3.algomones;

import fiuba.algo3.algomones.excepciones.PosionAgotadaException;

public class Posion implements Elemento {
	
	private int aumentoDeVida;
	
	private int  posionesRestantes;
	
	public Posion(){
		
		this.aumentoDeVida = 20;
		
		this.posionesRestantes = 4;
		
	}

	@Override
	public void aplicarElemento(Algomon algomon) {
		
		if(posionesAgotadas())
			throw new PosionAgotadaException();
		
		algomon.aumentoDeSalud(aumentoDeVida);
		posionesRestantes -= 1;
		
	}

	private boolean posionesAgotadas() {
		
		return posionesRestantes == 0;
	}

}

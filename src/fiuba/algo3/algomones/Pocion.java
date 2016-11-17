package fiuba.algo3.algomones;

import fiuba.algo3.algomones.excepciones.PocionAgotadaException;

public class Pocion implements Elemento {
	
	private int aumentoDeVida;
	
	private int  posionesRestantes;
	
	public Pocion(){
		
		this.aumentoDeVida = 20;
		
		this.posionesRestantes = 4;
		
	}

	@Override
	public void aplicarElemento(Algomon algomon) {
		
		if(pocionesAgotadas())
			throw new PocionAgotadaException();
		
		algomon.aplicarElementoAlaSalud(aumentoDeVida);
		
		posionesRestantes -= 1;
		
	}

	private boolean pocionesAgotadas() {
		
		return posionesRestantes == 0;
	}

}

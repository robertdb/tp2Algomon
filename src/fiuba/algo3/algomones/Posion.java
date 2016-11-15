package fiuba.algo3.algomones;

public class Posion implements Elemento {
	
	private int aumentoDeVida;
	
	public Posion(){
		
		this.aumentoDeVida = 20;
		
	}

	@Override
	public void aplicarElemento(Algomon algomon) {
		
		algomon.aumentoDeSalud(aumentoDeVida);
		
	}

}

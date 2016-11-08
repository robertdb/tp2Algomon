package fiuba.algo3.algomones;

public class Salud {

	private int vidaAfectada;
	private int vidaOriginal;
	
	public Salud(int vida) {
		
		this.vidaAfectada = vida;
		this.vidaOriginal = vida;	
		
	}

	public void reducirVida(double danio) {
	
		vidaAfectada = vidaAfectada - (int)danio;
		if( vidaAfectada < 0)
			vidaAfectada = 0;
	}

	public double vida() {
		
		return vidaAfectada;
	}

}

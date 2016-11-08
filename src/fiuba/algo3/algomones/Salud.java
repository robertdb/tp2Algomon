package fiuba.algo3.algomones;

public class Salud {

	private int vida ;
	
	public Salud(int vida) {
		
		this.vida = vida;	
		
	}

	public void reducirVida(double danio) {
	
		vida = vida - (int)danio;
		
	}

	public double vida() {
		
		return vida;
	}

}

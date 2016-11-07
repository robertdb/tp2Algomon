package fiuba.algo3.Algomones;

public class Salud {

	private double vida ;
	
	public Salud(int vida) {
		
		this.vida = vida;	
		
	}

	public void reducirVida(double danio) {
	
		vida = vida - danio;
		
	}

	public double vida() {
		
		return vida;
	}

}

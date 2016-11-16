package fiuba.algo3.algomones;

public class Salud {

	private int vidaDinamica;
	private int vidaOriginal;
	
	public Salud(int vida) {
		
		this.vidaDinamica = vida;
		this.vidaOriginal = vida;	
		
	}

	public void reducirVida(double danio) {
	
		vidaDinamica = vidaDinamica - (int)danio;
		if( vidaDinamica < 0)
			vidaDinamica = 0;
	}

	public int vida() {
		
		return vidaDinamica;
	
	}

	public boolean terminada() {
		
		return this.vidaDinamica == 0;
	
	}

	public void aumentarVida(double aumentoDeVida) {
		
		this.vidaDinamica = (int) (this.vidaDinamica + aumentoDeVida);
		
		if(this.vidaDinamica > this.vidaOriginal)
			this.vidaDinamica = this.vidaOriginal;
		
	}

	public int vidaOriginal() {
		
		
		return this.vidaOriginal;

	}
}

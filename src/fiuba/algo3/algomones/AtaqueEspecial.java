package fiuba.algo3.algomones;

public abstract class AtaqueEspecial implements Ataque{

	private Ataque ataque;
	
	protected Ataque getAtaque() {
		return this.ataque;
	}
	
	protected void setAtaque(Ataque ataque) {
		this.ataque = ataque;
	}
	
	@Override
	public abstract double atacar(Algomon atacante, Algomon atacado);

	@Override
	public void aumentarAtaques() {
		
		this.ataque.aumentarAtaques();
		
	}

	@Override
	public int cantidadDeAtaqueRestantes() {
		
		return this.getAtaque().cantidadDeAtaqueRestantes();
	}

	@Override
	public int cantidadDeAtaqueMaximos() {
		return getAtaque().cantidadDeAtaqueMaximos();
	}
}

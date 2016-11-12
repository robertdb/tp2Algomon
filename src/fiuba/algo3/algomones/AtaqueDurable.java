package fiuba.algo3.algomones;

public class AtaqueDurable implements Ataque {

	
	private Ataque ataque;
	
	public AtaqueDurable(Tipo tipo, int potencia, int cantidadMaximaDeAtaques) {
		
		this.ataque = new AtaqueSimple(tipo, potencia, cantidadMaximaDeAtaques);
		
	}

	@Override
	public double atacar(Algomon atacante, Algomon atacado) {
		// TODO Auto-generated method stub
		return 0;
	}

}

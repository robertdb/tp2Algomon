package fiuba.algo3.algomones;

public class AtaqueChupavidas extends AtaqueEspecial {
	
	private double factorDeIncremento;
	
	public AtaqueChupavidas(Tipo planta, int potenciaChupavidas, int cantidadMaximaDeAtaques) {
		
		setAtaque(new AtaqueSimple(planta, potenciaChupavidas, cantidadMaximaDeAtaques));
	
		this.factorDeIncremento = 0.3;
	
	}

	@Override
	public double atacar(Algomon atacante, Algomon atacado) {

		double danio = getAtaque().atacar(atacante, atacado);
		
		double aumentoDeVida = danio * factorDeIncremento;
		
		atacante.aumentoDeSalud(aumentoDeVida);
		
		return danio;
		
	}

	@Override
	public int cantidadDeAtaqueRestantes() {
		
		return 0;
	}

}

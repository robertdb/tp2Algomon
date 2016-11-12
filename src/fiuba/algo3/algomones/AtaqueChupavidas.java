package fiuba.algo3.algomones;

public class AtaqueChupavidas implements Ataque {
	
	private Ataque ataqueSimple;
	
	private double factorDeIncremento;
	
	public AtaqueChupavidas(Tipo planta, int potenciaChupavidas, int cantidadMaximaDeAtaques) {
		
		this.ataqueSimple = new AtaqueSimple(planta, potenciaChupavidas, cantidadMaximaDeAtaques);
	
		this.factorDeIncremento = 0.3;
	
	}

	@Override
	public double atacar(Algomon atacante, Algomon atacado) {

		double danio = this.ataqueSimple.atacar(atacante, atacado);
		
		double aumentoDeVida = danio * factorDeIncremento;
		
		atacante.aumentoDeSalud(aumentoDeVida);
		
		return danio;
		
	}

}

package fiuba.algo3.Algomones;

public class AtaqueSimple implements Ataque {

	private TipoDeAtaque tipoDeAtaque;
	private int potencia;
	private int cantidadOriginalDeAtaque;
	private int cantidadDeAtaquesRestantes;
	
	public AtaqueSimple(TipoDeAtaque tipo, int potencia, int cantidadMaximaDeAtaques) {
		
		this.tipoDeAtaque = tipo;
		this.potencia = potencia;
		this.cantidadOriginalDeAtaque = cantidadMaximaDeAtaques;
		this.cantidadDeAtaquesRestantes  = cantidadMaximaDeAtaques;
		
	}

	@Override
	public boolean atacar(Algomon atacante, Algomon atacado) {
		
		atacado.reducirVida(tipoDeAtaque.danioPorTipo(atacado.tipoDeATaque() ) * potencia);

		return true ;
	}

}

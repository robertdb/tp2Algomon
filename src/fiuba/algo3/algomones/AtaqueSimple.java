package fiuba.algo3.algomones;

import fiuba.algo3.algomones.excepciones.CantidadDeAtaquesAgotadosException;

public class AtaqueSimple implements Ataque {

	private Tipo tipoDeAtaque;
	private int potencia;
	private int cantidadOriginalDeAtaque;
	private int cantidadDeAtaquesRestantes;
	
	public AtaqueSimple(Tipo tipo, int potencia, int cantidadMaximaDeAtaques) {
		
		this.tipoDeAtaque = tipo;
		this.potencia = potencia;
		this.cantidadOriginalDeAtaque = cantidadMaximaDeAtaques;
		this.cantidadDeAtaquesRestantes  = cantidadMaximaDeAtaques;
		
	}

	@Override
	public boolean atacar(Algomon atacante, Algomon atacado) {
		
		if(ataquesAgotados())
			throw new CantidadDeAtaquesAgotadosException();
			
		atacado.reducirVida(tipoDeAtaque.danioPorTipo(atacado.tipoDeATaque() ) * potencia);

		cantidadDeAtaquesRestantes -= 1;
		
		return true ;
		
	}
	
	private boolean ataquesAgotados(){
		
		return cantidadDeAtaquesRestantes == 0;
		
	}

}

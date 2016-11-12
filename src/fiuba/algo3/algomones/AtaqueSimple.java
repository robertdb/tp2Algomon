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
	public double atacar(Algomon atacante, Algomon atacado) {
		
		if(ataquesAgotados())
			throw new CantidadDeAtaquesAgotadosException();
			
		double danio = tipoDeAtaque.danioPorTipo(atacado.tipoDeAlgomon() ) * potencia;
		
		atacado.reducirSalud(danio);

		cantidadDeAtaquesRestantes -= 1;
		
		return danio ;
		
	}
	
	private boolean ataquesAgotados(){
		
		return cantidadDeAtaquesRestantes == 0;
		
	}

}

package fiuba.algo3.algomones;

import fiuba.algo3.algomones.excepciones.CantidadDeAtaquesAgotadosException;

public class AtaqueSimple implements Ataque {

	private Tipo tipoDeAtaque;
	private int potencia;
	private int cantidadOriginalDeAtaque;
	private int cantidadDeAtaquesRestantes;
	
	public AtaqueSimple(Tipo tipoAgua, int potencia, int cantidadMaximaDeAtaques) {
		
		this.tipoDeAtaque = tipoAgua;
		this.potencia = potencia;
		this.cantidadOriginalDeAtaque = cantidadMaximaDeAtaques;
		this.cantidadDeAtaquesRestantes  = cantidadMaximaDeAtaques;
		
	}
	@Override
	public double atacar(Algomon atacante, Algomon atacado) {
		
		if(ataquesAgotados())
			throw new CantidadDeAtaquesAgotadosException();
			
		Tipo tipo = atacado.tipoDeAlgomon();
		
		double danio = tipoDeAtaque.danioContra(tipo) * potencia;
	
		atacado.reducirSalud(danio);

		cantidadDeAtaquesRestantes -= 1;
		
		return danio ;
		
	}
	
	private boolean ataquesAgotados(){
		
		return cantidadDeAtaquesRestantes == 0;
		
	}

	@Override
	public void aumentarAtaques() {
		
		this.cantidadDeAtaquesRestantes += 2;
		
		if(cantidadOriginalDeAtaque < cantidadDeAtaquesRestantes)
			cantidadDeAtaquesRestantes = cantidadOriginalDeAtaque;
		
	}
	@Override
	public int cantidadDeAtaqueRestantes() {
		
		return this.cantidadDeAtaquesRestantes;
	}

	@Override
	public int cantidadDeAtaqueMaximos() {
		return cantidadOriginalDeAtaque;
	}
}

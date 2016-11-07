package fiuba.algo3.Algomones;

public enum TipoDeAtaque {
	
	
	AGUA("agua", 0.5, 2, 0.5, 1),
	FUEGO("fuego", 0.5, 0.5, 2, 1),
	PLANTA("planta", 2, 0.5, 0.5, 1),
	NORMAL("normal", 1, 1, 1, 1);
	
	private String tipo;
	private double danioContraAgua;
	private double danioContraFuego;
	private double danioContraPlanta;
	private double danioContraNormal;

	
	private TipoDeAtaque(String tipo, double danioContraAgua, double danioContraFuego, double danioContraPlanta, double danioContraNormal){
		
		this.tipo = tipo;
		this.danioContraAgua = danioContraAgua;
		this.danioContraFuego = danioContraFuego;
		this.danioContraPlanta = danioContraPlanta;
		this.danioContraNormal = danioContraNormal;
			
	}
	
	
	private boolean esFuego(TipoDeAtaque tipoAtaque){
		
		return tipoAtaque.tipo == "fuego";
	}
	
	private boolean esAgua(TipoDeAtaque tipoAtaque){
		
		return tipoAtaque.tipo == "agua";
	}
	
	private boolean esPlanta(TipoDeAtaque tipoAtaque){
		
		return tipoAtaque.tipo == "planta";
	}
	
	private boolean esNormal(TipoDeAtaque tipoAtaque){
		
		return tipoAtaque.tipo == "normal";
	}
	
	public double danioPorTipo(TipoDeAtaque otro){
				
		if(otro.esFuego(otro))
			return this.danioContraFuego;
		
		if(otro.esAgua(otro))
			return this.danioContraAgua;
		
		if(otro.esPlanta(otro))
			return this.danioContraPlanta;
			
		return this.danioContraNormal;
	
	}
	
}

package fiuba.algo3.algomones;

public enum Tipo {
	
	
	AGUA("agua", 0.5, 2, 0.5, 1),
	FUEGO("fuego", 0.5, 0.5, 2, 1),
	PLANTA("planta", 2, 0.5, 0.5, 1),
	NORMAL("normal", 1, 1, 1, 1);
	
	private String tipo;
	private double danioContraAgua;
	private double danioContraFuego;
	private double danioContraPlanta;
	private double danioContraNormal;

	
	private Tipo(String tipo, double danioContraAgua, double danioContraFuego, double danioContraPlanta, double danioContraNormal){
		
		this.tipo = tipo;
		this.danioContraAgua = danioContraAgua;
		this.danioContraFuego = danioContraFuego;
		this.danioContraPlanta = danioContraPlanta;
		this.danioContraNormal = danioContraNormal;
			
	}
	
	
	private boolean esFuego(Tipo tipoAtaque){
		
		return tipoAtaque.tipo == "fuego";
	}
	
	private boolean esAgua(Tipo tipoAtaque){
		
		return tipoAtaque.tipo == "agua";
	}
	
	private boolean esPlanta(Tipo tipoAtaque){
		
		return tipoAtaque.tipo == "planta";
	}
	
	private boolean esNormal(Tipo tipoAtaque){
		
		return tipoAtaque.tipo == "normal";
	}
	
	public double danioPorTipo(Tipo otro){
				
		if(otro.esFuego(otro))
			return this.danioContraFuego;
		
		if(otro.esAgua(otro))
			return this.danioContraAgua;
		
		if(otro.esPlanta(otro))
			return this.danioContraPlanta;
			
		return this.danioContraNormal;
	
	}
	
}

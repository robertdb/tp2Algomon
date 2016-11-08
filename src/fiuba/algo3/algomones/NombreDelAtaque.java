package fiuba.algo3.algomones;

public enum NombreDelAtaque {

	ATAQUE_RAPIDO("Ataque rápido", false, false ),
	CANTO("Canto", true, false),
	BURBUJA("Burbuja", false, false),
	CANION_DE_AGUA("Cañon de agua", false, false),
	CHUPAVIDAS("Chupavidas", true, false),
	LATIGO_CEPA("Látigo cepa", false, false),
	BRASAS("Brasas", false, false),  
	FOGONAZO("fogonazo",false, true);
	
	private String representacion;
	private boolean esEfimero;
	private boolean esPersistente;
	
	private  NombreDelAtaque( String representacion, boolean esEfimero, boolean esPersistente){
		
		this.representacion = representacion;
		this.esEfimero = esEfimero;
		this.esPersistente = esPersistente;
		
	}
	
	public String obtenerRepresentation() {
		return representacion;
	}

	public boolean esEfimero() {
		return esEfimero;
	}

	public boolean esPersistente() {
		return esPersistente;
	}
	
}

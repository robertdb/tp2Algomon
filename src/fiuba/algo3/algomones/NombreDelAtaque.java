package fiuba.algo3.algomones;

public enum NombreDelAtaque {

	ATAQUE_RAPIDO("Ataque rápido"),
	CANTO("Canto"),
	BURBUJA("Burbuja"),
	CANION_DE_AGUA("Cañon de agua"),
	CHUPAVIDAS("Chupavidas"),
	LATIGO_CEPA("Látigo cepa"),
	BRASAS("Brasas"),  
	FOGONAZO("fogonazo");
	
	private String representacion;
	
	private  NombreDelAtaque( String representacion){
		
		this.representacion = representacion;
		
	}
	
	public String obtenerRepresentation() {
		return representacion;
	}
	
}

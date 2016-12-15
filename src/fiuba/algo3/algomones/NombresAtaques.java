package fiuba.algo3.algomones;

public enum NombresAtaques {

	ATAQUE_RAPIDO("Ataque Rapido"),
	CANTO("Canto"),
	BURBUJA("Burbuja"),
	CANION_DE_AGUA("Canon De Agua"),
	CHUPAVIDAS("Chupavidas"),
	LATIGO_CEPA("Latigo Cepa"),
	BRASAS("Brasas"),  
	FOGONAZO("Fogonazo");
	
	private String nombre;
	
	private  NombresAtaques( String nombre){
		
		this.nombre = nombre;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
}

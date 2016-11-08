package fiuba.algo3.algomones;

import java.util.EnumMap;
import java.util.List;

public class Algomon {

	private EnumMap<NombreDelAtaque, Ataque> ataques;
	private String nombreAlgomon;
	private Tipo tipoAlgomon;
	private Salud salud;
	
	public Algomon(String nombre, Tipo tipoAlgomon, EnumMap<NombreDelAtaque, Ataque> ataques, Salud salud) {
		
		this.nombreAlgomon = nombre;
		this.tipoAlgomon = tipoAlgomon;
		this.ataques = ataques;
		this.salud = salud;
		
	}

	public boolean atacar(Algomon atacado, NombreDelAtaque nombreDelAtaque) {
		
		 Ataque ataque = this.ataques.get(nombreDelAtaque);
		 
		 return ataque.atacar(this, atacado);
			 
	}
	
	public Tipo tipoDeATaque(){
		 return tipoAlgomon;
	}

	public void reducirVida(double danioTotal) {
		
		salud.reducirVida(danioTotal);
		
	}

	public double vida() {
		
		return salud.vida();
		
	}

}

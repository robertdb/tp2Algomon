package fiuba.algo3.Algomones;

import java.util.EnumMap;
import java.util.List;

public class Algomon {

	private EnumMap<NombreDelAtaque, Ataque> ataques;
	private String nombreAlgomon;
	private TipoDeAtaque tipoAlgomon;
	private Salud salud;
	
	public Algomon(String nombre, TipoDeAtaque tipoAlgomon, EnumMap ataques, Salud salud) {
		
		this.nombreAlgomon = nombre;
		this.tipoAlgomon = tipoAlgomon;
		this.ataques = ataques;
		this.salud = salud;
		
	}

	public boolean atacar(Algomon atacado, NombreDelAtaque nombreDelAtaque) {
		
		 Ataque ataque = this.ataques.get(nombreDelAtaque);
		 
		 return ataque.atacar(this, atacado);
			 
	}
	
	public TipoDeAtaque tipoDeATaque(){
		 return tipoAlgomon;
	}

	public void reducirVida(double danioTotal) {
		
		salud.reducirVida(danioTotal);
		
	}

	public double vida() {
		
		return salud.vida();
		
	}

}

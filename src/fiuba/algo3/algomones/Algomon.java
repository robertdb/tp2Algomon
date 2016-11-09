package fiuba.algo3.algomones;

import java.util.EnumMap;
import java.util.List;

import fiuba.algo3.algomones.excepciones.AtaqueNoPertenecienteAalgomonException;

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
		 
		 if( ataque == null)
			 throw new AtaqueNoPertenecienteAalgomonException();
	
		 return ataque.atacar(this, atacado);
			 
	}
	
	public Tipo tipoDeATaque(){
		 return tipoAlgomon;
	}

	public void reducirSalud(double danio) {
		
		salud.reducirVida(danio);
		
	}

	public double salud() {
		
		return salud.vida();
		
	}

}

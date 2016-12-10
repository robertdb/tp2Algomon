package fiuba.algo3.algomones;

import java.util.EnumMap;
import java.util.List;
import java.util.Set;

import fiuba.algo3.algomones.excepciones.AtaqueNoPertenecienteAalgomonException;

public class Algomon {

	private EnumMap<NombreDelAtaque, Ataque> ataques;
	private String nombreAlgomon;
	private Tipo tipoAlgomon;
	private Salud salud;
	private ContextoEstado estado;
	
	public Algomon(String nombre, Tipo tipo, EnumMap<NombreDelAtaque, Ataque> ataques, Salud salud) {
		
		this.nombreAlgomon = nombre;
		this.tipoAlgomon = tipo;
		this.ataques = ataques;
		this.salud = salud;
		this.estado = new ContextoEstado();
		
	}

	public double atacar(Algomon atacado, NombreDelAtaque nombreDelAtaque) {
		
		estado.aplicarEfectos(this);
		
		Ataque ataque = this.ataques.get(nombreDelAtaque);
		 
		if( ataque == null)
			throw new AtaqueNoPertenecienteAalgomonException();
	
		return ataque.atacar(this, atacado);
		 
	}
	
	public Tipo tipoDeAlgomon(){
		 return tipoAlgomon;
	}

	public void reducirSalud(double danio) {
		
		salud.reducirVida(danio);
		
	}

	public int salud() {
		
		return salud.vida();
		
	}
	
	public int saludOriginal(){
		
		return salud.vidaOriginal();
		
	}

	public void aumentoDeSalud(double aumentoDeVida) {
		
		salud.aumentarVida(aumentoDeVida);
		
	}

	public void alterarEstado(Efecto efecto) {
		
		this.estado.nuevoEfecto(efecto);
		
	}

	public void aumentarAtaques() {
		
		for (Ataque ataque : this.ataques.values()) {
		    
			ataque.aumentarAtaques();
		
		}
		
	}

	public void aplicarElementoAlaSalud(int aumentoDeVida) {
		
		this.aumentoDeSalud(aumentoDeVida);
		
	}

	public void aplicarRestaurador() {
		
		this.estado.aplicarNormalizador(this);
		
	}

	public Set<NombreDelAtaque> getAtaques() {
		// TODO Auto-generated method stub
		return ataques.keySet();
	}
	public int ataqueRestantes(NombreDelAtaque nombre){
		return this.ataques.get(nombre).cantidadDeAtaqueRestantes();
	}

}

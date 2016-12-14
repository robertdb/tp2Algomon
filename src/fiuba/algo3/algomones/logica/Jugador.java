package fiuba.algo3.algomones.logica;

import java.util.ArrayList;
import java.util.HashMap;
import fiuba.algo3.algomones.logica.elementos.*;
import fiuba.algo3.algomones.logica.excepciones.CadaJugadorNoPuedeElegirMasDe3AlgomonesException;


public class Jugador {
	
	private static int cantidadDeAlgomonesPorJugador = 3;
	
	private String nombre;
	private HashMap<String, Algomon> algomones = new HashMap<String, Algomon>();
	private HashMap<String, Elemento> elementos = new HashMap<String, Elemento>();
	private Algomon algomonActivo;
	
	public Jugador(String nombre) {
		setNombre(nombre);
		Elemento pocion = new Pocion();
		Elemento superpocion = new SuperPocion();
		Elemento restaurador = new Restaurador();
		Elemento vitamina = new Vitamina();
		elementos.put(pocion.getNombre(), pocion);
		elementos.put(superpocion.getNombre(), superpocion);
		elementos.put(restaurador.getNombre(), restaurador);
		elementos.put(vitamina.getNombre(), vitamina);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarAlgomon(Algomon algomon) {
		if (this.algomones.size() >= cantidadDeAlgomonesPorJugador) {
			throw new CadaJugadorNoPuedeElegirMasDe3AlgomonesException();
		}
		this.algomones.put(algomon.getNombre(), algomon);
	}
	
	public Algomon getAlgomonActivo() {
		return this.algomonActivo;
	}
	
	public void setAlgomonActivo(Algomon algomon) {
		this.algomonActivo = algomon;
	}
		
	public ArrayList<Elemento> getListadoElementos() {
		return new ArrayList<Elemento>(elementos.values());
	}
	
	public void usarElemento(String elemento, Algomon algomon) {
		algomon.aplicarElemento(this.elementos.get(elemento));
	}
	
	public void atacarConElAlgomonActivo(Jugador oponente, String nombreAtaque) {
		oponente.recibirAtaqueAlAlgomonActivo(this, nombreAtaque);
	}

	private void recibirAtaqueAlAlgomonActivo(Jugador oponente, String nombreAtaque) {
		Algomon algomonAtacante = oponente.getAlgomonActivo();
		Algomon algomonAtacado = this.algomonActivo;
		algomonAtacante.atacar(algomonAtacado, nombreAtaque);
	}

	public boolean tieneAlgomonActivo() {
		return (this.algomonActivo != null && this.algomonActivo.getVida() > 0);
	}
	
	public ArrayList<Algomon> getListadoAlgomones() {
		return new ArrayList<Algomon>(algomones.values());
	}

}

package fiuba.algo3.algomones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class Jugador {
	EnumMap<EspecieAlgomon, Algomon> algomones;
	EnumMap<TipoElemento,Elemento> elementos;
	private Algomon algomonActual;
	private EspecieAlgomon actual;
	private String nombre;
	private ArrayList<EspecieAlgomon> dead;

	public Jugador() {
		algomones = new EnumMap<EspecieAlgomon,Algomon >(EspecieAlgomon.class);
		elementos = crearHashMap();
		algomonActual = null;
		dead = new ArrayList<EspecieAlgomon>();
	}

	private EnumMap<TipoElemento, Elemento> crearHashMap() {
		EnumMap<TipoElemento,Elemento> elementos = new EnumMap<TipoElemento,Elemento>(TipoElemento.class);

		elementos.put(TipoElemento.POCION, TipoElemento.POCION.nuevo());
		elementos.put(TipoElemento.SUPERPOCION, TipoElemento.SUPERPOCION.nuevo());
		elementos.put(TipoElemento.VITAMINA, TipoElemento.VITAMINA.nuevo());
		elementos.put(TipoElemento.RESTAURADOR, TipoElemento.RESTAURADOR.nuevo());
		return elementos;
	}

	public Algomon statusAlgomonActual() {
		if (algomonActual == null)
			return null;

		if(algomonActual.salud() == 0){

			dead.remove(actual);
			this.elegirAlgomon(dead.get(0));
		}
		return algomonActual;
	}

	public void elegirAlgomon(EspecieAlgomon charmander) {
		algomonActual = algomones.get(charmander);
		actual = charmander;

	}

	public Set<TipoElemento> getElementos() {

		return elementos.keySet();
	}

	public Set<EspecieAlgomon> getAlgomones() {

		return algomones.keySet();
	}

	public Set<NombreDelAtaque> getAtaqueAlgomon() {

		return algomonActual.getAtaques();
	}
	public void aplicarElemento(TipoElemento element){
		Elemento  elemento = elementos.get(element);
		elemento.aplicarElemento(algomonActual);
	}
	public void aplicarAtaque(NombreDelAtaque ataque,Jugador jugador2){
		algomonActual.atacar(jugador2.algomonActual, ataque);
	}

	public void ingresarAlgomon(EspecieAlgomon nombreAlgomon, Algomon algomon) {
		if (algomones.isEmpty()){
			algomonActual = algomon;
			actual = nombreAlgomon;
		}
		dead.add(nombreAlgomon);
		algomones.put(nombreAlgomon, algomon);

	}

	public int elementosRestantes(TipoElemento nombre) {
		// TODO Auto-generated method stub
		return this.elementos.get(nombre).cantidadDeElementosRestantes();
	}

	public int vidaDeAlogmon(EspecieAlgomon nombre) {
		// TODO Auto-generated method stub
		return this.algomones.get(nombre).salud();
	}

	public String nombreJugador() {

		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public Algomon getAlgomonActual(){
		return algomonActual;
	}

	public String getNombre() {
		return nombre;
	}

	public Collection<Algomon> setAlgomones() {
		// TODO Auto-generated method stub
		return this.algomones.values();
	}
}

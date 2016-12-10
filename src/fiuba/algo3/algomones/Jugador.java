package fiuba.algo3.algomones;

import java.util.EnumMap;
import java.util.List;
import java.util.Set;

public class Jugador {
	EnumMap<EspecieAlgomon, Algomon> algomones;
	EnumMap<TipoElemento,Elemento> elementos;
	private Algomon algomonActual;

	public Jugador() {
		algomones = new EnumMap<EspecieAlgomon,Algomon >(EspecieAlgomon.class);
		elementos = crearHashMap();
		algomonActual = null;
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
		// TODO Auto-generated method stub
		return algomonActual;
	}

	public void elegirAlgomon(EspecieAlgomon charmander) {
		algomonActual = algomones.get(charmander);
		
	}

	public Set<TipoElemento> getElementos() {
		
		return elementos.keySet();
	}

	public Set<EspecieAlgomon> getAlgomones() {
		
		return algomones.keySet();
	}

	public Set<NombreDelAtaque> getAtaqueAlgomon() {
		// TODO Auto-generated method stub
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
		}
		
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

}

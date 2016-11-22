package fiuba.algo3.algomones;

import java.util.EnumMap;
import java.util.List;
import java.util.Set;

public class Jugador {
	EnumMap<EspecieAlgomon, Algomon> algomones;
	EnumMap<TipoElemento,Elemento> elementos;
	private Algomon algomonActual;

	public Jugador(EnumMap<EspecieAlgomon, Algomon> algomonesLista, Algomon algomonInicial, EnumMap<TipoElemento, Elemento> elementosLista) {
		algomones = algomonesLista;
		elementos = elementosLista;
		algomonActual = algomonInicial;
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

}

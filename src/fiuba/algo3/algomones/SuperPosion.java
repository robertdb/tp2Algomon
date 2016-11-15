package fiuba.algo3.algomones;

import fiuba.algo3.algomones.excepciones.PosionAgotadaException;
import fiuba.algo3.algomones.excepciones.SuperPosionAgotadaException;

public class SuperPosion implements Elemento {

	Elemento posionSimple;

	
	public SuperPosion(){
		
		this.posionSimple = new Posion();
		
	}
	
	@Override
	public void aplicarElemento(Algomon algomon) {
		
		try{
			this.posionSimple.aplicarElemento(algomon);
			this.posionSimple.aplicarElemento(algomon);
		}
		catch(PosionAgotadaException e){
			
				throw new SuperPosionAgotadaException();
			
			}
			
	}

}



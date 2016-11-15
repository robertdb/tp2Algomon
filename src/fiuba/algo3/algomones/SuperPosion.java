package fiuba.algo3.algomones;

import fiuba.algo3.algomones.excepciones.PosionAgotadaException;
import fiuba.algo3.algomones.excepciones.SuperPosionAgotadaException;

public class SuperPosion implements Elemento {

	Elemento posionSimple1;
	Elemento posionSimple2;
	
	public SuperPosion(){
		
		this.posionSimple1 = new Posion();
		
		this.posionSimple2 = new Posion();
		
	}
	
	@Override
	public void aplicarElemento(Algomon algomon) {
		
		try{
			this.posionSimple1.aplicarElemento(algomon);
			this.posionSimple1.aplicarElemento(algomon);
		}
		catch(PosionAgotadaException e){
			
			try{
				this.posionSimple2.aplicarElemento(algomon);
				this.posionSimple1.aplicarElemento(algomon);
			}
			catch(PosionAgotadaException _e){
				
				throw new SuperPosionAgotadaException();
				
			}
			
		}

	}

}

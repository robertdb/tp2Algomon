package fiuba.algo3.algomones;

import fiuba.algo3.algomones.excepciones.RestauradorAgotadoException;

public class Restaurador implements Elemento {

	private int restauradoresRestantes;
	
	public Restaurador(){
		
		this.restauradoresRestantes = 3;
		
	}
	@Override
	public void aplicarElemento(Algomon algomon) {
		
		if(restauradoresAgotados())
			throw new RestauradorAgotadoException();
		
		algomon.aplicarRestaurador();
		
		restauradoresRestantes -=1;

	}
	
	private boolean restauradoresAgotados() {
		
		return restauradoresRestantes == 0;
		
	}
	@Override
	public int cantidadDeElementosRestantes() {
		
		return this.restauradoresRestantes;
	}

}

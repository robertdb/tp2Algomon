package fiuba.algo3.algomones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContextoEstado {
	
	
	private List <AlgomonEstado> estados;
	  
  	public ContextoEstado(){
      
  		this.estados = new ArrayList<AlgomonEstado>();
  
  	}
  	
  	public void estadoNuevo(AlgomonEstado estado) {
  	    	  		
		if(estado instanceof EstadoPersistente){
				
			this.estados.add(0, estado);
			
			return;
		}
		
		this.estados.add(estado);
  	
  	}
  	  
  	public boolean estaAfectado(){
  		
  		if (this.estados.isEmpty()){
  			return false;
  		}
  		
  		return true;
  		
  	}
  
  	public void aplicarEfectos(Algomon algomon){
  		
  		for(AlgomonEstado estado : estados)
          	estado.aplicarEfecto(algomon);
          
  	}
  	
  	public void desactivarEstados(Algomon algomon){
  		
  		for(AlgomonEstado estado : estados){
  			
  			if (estado instanceof EstadoEfimero){
  	  			continue;
  	  		}
  			
  			estado.aplicarEfecto(algomon);
  		}
  		
  		this.estados = new ArrayList<AlgomonEstado>();
  		
  	}
 }

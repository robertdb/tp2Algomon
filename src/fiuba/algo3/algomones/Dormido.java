package fiuba.algo3.algomones;

import fiuba.algo3.algomones.excepciones.AtacarDormidoNoPuedeRealizarseException;


public class Dormido implements Efecto{
  
  private int tiempo;
  private ContextoEstado contexto;
  public String nombre = "Dormido" ;
  
  public Dormido() {
    tiempo = 2;
  }
  
  public void agregar(ContextoEstado contexto){
    this.contexto = contexto;
    contexto.setearDormido(this);    
  }
  
  @Override
  public void aplicarEfecto(Algomon algomon) {
    
    if (efectoCaducado()){
    	
    		contexto.desactivarDormido();
    		
    		return;
    }
      
    
    this.tiempo -= 1;
    
    throw new AtacarDormidoNoPuedeRealizarseException();
    
  }

  private boolean efectoCaducado(){
    
      return tiempo == 0;
    
  }
  @Override
  public  void reducirTiempo(){

	    if (efectoCaducado()){
	    	
	    		contexto.desactivarDormido();
	    		
	    		return;
	    }
	      
	    
	    this.tiempo -= 1;
  }
  @Override
  public String nombreDeEstado() {
	return this.nombre;
  }
}
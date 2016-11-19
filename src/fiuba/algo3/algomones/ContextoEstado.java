
package fiuba.algo3.algomones;

import java.util.ArrayList;
import java.util.List;


public class ContextoEstado {
  private Efecto quemado;
  private Efecto dormido;
    
  public ContextoEstado() {
    
	  quemado = new NormalEfecto();
	
	  dormido = new NormalEfecto();
  
  }
  
  public void nuevoEfecto(Efecto efecto) {
      
	  efecto.agregar(this);
  
  }

  public void setearQuemado(Efecto quemado){

      this.quemado = quemado;
      
  }

  public void setearDormido(Efecto dormido){
  
      this.dormido = dormido;
      
  }
     
  public void aplicarEfectos(Algomon algomon){

      // el orden importa
	  
	  dormido.aplicarEfecto(algomon);
      quemado.aplicarEfecto(algomon); 
      
      
  }
  
  public void desactivarQuemado(){
	  
    quemado = new NormalEfecto();
    
  }

  public void desactivarDormido(){
	  
    dormido = new NormalEfecto();
    
  }
  
  public void aplicarNormalizador(Algomon algomon){
	  
	  this.aplicarEfectos(algomon);
	  
	  this.desactivarQuemado();
	  
	  this.desactivarDormido();
	  
  }
  
  
}
package fiuba.algo3.algomones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
	  
	  quemado.aplicarEfecto(algomon); 
	  
	  dormido.aplicarEfecto(algomon);
           
  }
  
  public void desactivarQuemado(){
	  
    quemado = new NormalEfecto();
    
  }

  public void desactivarDormido(){
	  
    dormido = new NormalEfecto();
    
  }
  
  public void aplicarNormalizador(Algomon algomon){
	  
	  quemado.aplicarEfecto(algomon);
	  
	  this.desactivarQuemado();
	  
	  this.desactivarDormido();
	  
  }

  public String nombreEstado() {
	
	return dormido.nombreDeEstado()+" "+quemado.nombreDeEstado();
  }

  public String nombreEstadoEfimero() {
	return dormido.nombreDeEstado();
  }
  public void reducirEstadoEfimero(){
	  dormido.reducirTiempo();
  }

  public void aplicarPersistente(Algomon algomon) {
	quemado.aplicarEfecto(algomon);
	
  }
   
  
}
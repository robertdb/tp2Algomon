package fiuba.algo3.algomones;

import fiuba.algo3.algomones.excepciones.AtacarDormidoNoPuedeRealizarseException;


public class Dormido implements Efecto{
  
  private int tiempo;
  private ContextoEstado contexto;
  
  public Dormido() {
    tiempo = 3;
  }
  
  public void agregar(ContextoEstado contexto){
    this.contexto = contexto;
    contexto.setearQuemado(this);    
  }
  
  @Override
  public void aplicarEfecto(Algomon algomon) {
    
    if (efectoCaducado())
      contexto.desactivarDormido();
    
    this.tiempo = this.tiempo -1;
    throw new AtacarDormidoNoPuedeRealizarseException();
  }

  private boolean efectoCaducado(){
    
      return tiempo == -1;
    
  }
}
package fiuba.algo3.algomones;

public class Quemado implements Efecto{
	  
	  private final double porcetajeDeQuemadura  = 0.10;
	  public String nombre = "Quemado";
	  
	  public void agregar(ContextoEstado contexto){
	    
	      contexto.setearQuemado(this);    
	  }
	  
	  @Override
	  public void aplicarEfecto(Algomon algomon) {
	    
	    double vida = algomon.saludOriginal();
	    
	    double danio = vida * porcetajeDeQuemadura;
	    
	    algomon.reducirSalud( danio);
	    
	  }

	@Override
	public String nombreDeEstado() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public void reducirTiempo() {
		// TODO Auto-generated method stub
		
	}
}

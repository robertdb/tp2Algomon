package fiuba.algo3.algomones;

public abstract class DanioPorTipo {
	  double danioContraAgua;
	  double danioContraFuego;
	  double danioContraPlanta;
	  double danioContraNormal;
	 
	 public abstract double danioContra(DanioPorTipo tipo);

}

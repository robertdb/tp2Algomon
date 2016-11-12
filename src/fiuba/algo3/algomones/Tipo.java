package fiuba.algo3.algomones;

public abstract class Tipo {
	  double danioContraAgua;
	  double danioContraFuego;
	  double danioContraPlanta;
	  double danioContraNormal;
	 
	 public abstract double danioContra(Tipo tipo);

}

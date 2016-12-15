package fiuba.algo3.algomones;

public abstract class TipoDeAtaque {
	
	private double multiplicadorDeDanioContraAgua;
	private double multiplicadorDeDanioContraFuego;
	private double multiplicadorDeDanioContraPlanta;
	
	public double getMultiplicadorDeDanioContraAgua() {
		return multiplicadorDeDanioContraAgua;
	}
	
	public double getMultiplicadorDeDanioContraFuego() {
		return multiplicadorDeDanioContraFuego;
	}
	
	public double getMultiplicadorDeDanioContraPlanta() {
		return multiplicadorDeDanioContraPlanta;
	}
	
	protected void setMultiplicadorDeDanioContraAgua(double valor) {
		this.multiplicadorDeDanioContraAgua = valor;
	}
	
	protected void setMultiplicadorDeDanioContraFuego(double valor) {
		this.multiplicadorDeDanioContraFuego = valor;
	}
	
	protected void setMultiplicadorDeDanioContraPlanta(double valor) {
		this.multiplicadorDeDanioContraPlanta = valor;
	}

}

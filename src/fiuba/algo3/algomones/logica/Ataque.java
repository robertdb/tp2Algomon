package fiuba.algo3.algomones.logica;
import fiuba.algo3.algomones.logica.excepciones.AtaqueAgotadoException;

public abstract class Ataque {

	private int potencia;
	private int cantidad;
	private String nombre;
	private TipoDeAtaque tipo;
	
	public int getPotencia() {
		return this.potencia;
	}
	
	public int getCantidadRestante() {
		return this.cantidad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	protected void setTipoDeAtaque(TipoDeAtaque tipo) {
		this.tipo = tipo;
	}
	
	protected void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	protected void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void aumentarCantidad(int cantidad) {
		this.setCantidad(this.cantidad + cantidad);
	}
	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDanioContraAgua() {
		return (int) (potencia * tipo.getMultiplicadorDeDanioContraAgua());
	}
	
	public int getDanioContraFuego() {
		return (int) (potencia * tipo.getMultiplicadorDeDanioContraFuego());
	}
	
	public int getDanioContraPlanta() {
		return (int) (potencia * tipo.getMultiplicadorDeDanioContraPlanta());
	}
	
	public int getDanioContraNormal() {
		return potencia;
	}
	
	protected boolean ataquesAgotados(){
		return cantidad == 0;
	}
	
	public void utilizar(Algomon algomonAtacante, Algomon algomonAtacado) {
		if (ataquesAgotados()) {
			throw new AtaqueAgotadoException();
		}
		algomonAtacado.recibirAtaque(this);
		this.cantidad--;
	}
	
}
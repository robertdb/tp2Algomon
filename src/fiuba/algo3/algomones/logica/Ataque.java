package fiuba.algo3.algomones.logica;
import fiuba.algo3.algomones.logica.excepciones.AtaqueAgotadoException;
import javafx.beans.property.SimpleStringProperty;

public abstract class Ataque {

	private int potencia;
	private int cantidad;
	private String nombre;
	private TipoDeAtaque tipo;
	private final SimpleStringProperty cantidadRestanteProperty = new SimpleStringProperty();
	
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
		this.cantidadRestanteProperty.setValue(this.getNombre() + "(" + String.valueOf(cantidad) + ")");
	}
	
	public void aumentarCantidad(int cantidad) {
		this.setCantidad(this.cantidad + cantidad);
	}
	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
		this.cantidadRestanteProperty.setValue(nombre + "(" + String.valueOf(this.getCantidadRestante()) + ")");
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

	public SimpleStringProperty getCantidadRestanteProperty() {
		return this.cantidadRestanteProperty;
	}
	
}
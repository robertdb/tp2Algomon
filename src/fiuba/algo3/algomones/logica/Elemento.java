package fiuba.algo3.algomones.logica;

import javafx.beans.property.SimpleStringProperty;

public abstract class Elemento {
	
	private int cantidad;
	
	private String nombre;

	private SimpleStringProperty cantidadRestanteProperty = new SimpleStringProperty();
	
	public int getCantidadRestante() {
		return this.cantidad;
	}
	
	protected void setCantidad(int cantidad) {
		this.cantidad = cantidad;
		this.cantidadRestanteProperty.setValue(this.nombre + "(" + String.valueOf(cantidad) + ")");
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	protected boolean elementoAgotado(){
		return cantidad == 0;
	}
	
	public abstract void aplicar(Algomon algomon);

	public SimpleStringProperty getCantidadRestanteProperty() {
		return this.cantidadRestanteProperty;
	}

}

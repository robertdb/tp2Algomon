package fiuba.algo3.algomones.logica;

public abstract class Elemento {
	
	private int cantidad;
	
	private String nombre;
	
	public int getCantidadRestante() {
		return this.cantidad;
	}
	
	protected void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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

}

package fiuba.algo3.algomones;

public interface Efecto {
	
	public void aplicarEfecto(Algomon algomon);

	public void agregar(ContextoEstado contextoEstado);

	public String nombreDeEstado();

	void reducirTiempo();
}

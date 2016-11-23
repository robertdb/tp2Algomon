package fiuba.algo3.algomones;

public class AtaqueFogonazo extends AtaqueEspecial {

	private Ataque ataque;
	public AtaqueFogonazo(Tipo tipoFuego, int potenciaFogonazo, int cantidadMaximaDeAtaquesFogonazo) {
		this.ataque = new AtaqueSimple(tipoFuego, potenciaFogonazo, cantidadMaximaDeAtaquesFogonazo);
	}

	@Override
	public double atacar(Algomon atacante, Algomon atacado) {
		Efecto efecto = new Quemado();
		atacado.alterarEstado(efecto);
		return this.ataque.atacar(atacante, atacado);
	}

	@Override
	public void aumentarAtaques() {
		
		this.ataque.aumentarAtaques();
		
	}

}

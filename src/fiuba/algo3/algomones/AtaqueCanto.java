package fiuba.algo3.algomones;

public class AtaqueCanto extends AtaqueEspecial {

	private Ataque ataque;
	public AtaqueCanto(Tipo tipoNormal1, int potenciaCanto, int cantidadMaximaDeAtaquesCanto) {
		this.ataque = new AtaqueSimple(tipoNormal1, potenciaCanto, cantidadMaximaDeAtaquesCanto);
	}

	@Override
	public double atacar(Algomon atacante, Algomon atacado) {
		Efecto efecto = new Dormido();
		atacado.alterarEstado(efecto);
		return 0;
	}

	@Override
	public void aumentarAtaques() {
		
		this.ataque.aumentarAtaques();
		
	}

}

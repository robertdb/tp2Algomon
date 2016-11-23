package fiuba.algo3.algomones;

public class AtaqueCanto extends AtaqueEspecial {

	public AtaqueCanto(Tipo tipoNormal1, int potenciaCanto, int cantidadMaximaDeAtaquesCanto) {
		setAtaque(new AtaqueSimple(tipoNormal1, potenciaCanto, cantidadMaximaDeAtaquesCanto));
	}

	@Override
	public double atacar(Algomon atacante, Algomon atacado) {
		Efecto efecto = new Dormido();
		atacado.alterarEstado(efecto);
		return 0;
	}

}

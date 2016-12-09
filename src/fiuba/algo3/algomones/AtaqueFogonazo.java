package fiuba.algo3.algomones;

public class AtaqueFogonazo extends AtaqueEspecial {

	public AtaqueFogonazo(Tipo tipoFuego, int potenciaFogonazo, int cantidadMaximaDeAtaquesFogonazo) {
		setAtaque(new AtaqueSimple(tipoFuego, potenciaFogonazo, cantidadMaximaDeAtaquesFogonazo));
	}

	@Override
	public double atacar(Algomon atacante, Algomon atacado) {
		Efecto efecto = new Quemado();
		atacado.alterarEstado(efecto);
		return getAtaque().atacar(atacante, atacado);
	}

	@Override
	public int cantidadDeAtaqueRestantes() {
		// TODO Auto-generated method stub
		return 0;
	}

}

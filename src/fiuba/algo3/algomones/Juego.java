package fiuba.algo3.algomones;

import fiuba.algo3.algomones.excepciones.AlgomonesDeJugadorMuertosExeption;
import fiuba.algo3.algomones.interfaz.Ventana;

public class Juego {
	private Jugador activo;
	private Jugador pasivo;

	public Juego() {
		activo = new Jugador();
		pasivo = new Jugador();
	}
	public void siguienteTruno() {
		Jugador aux = activo;
		activo = pasivo;
		pasivo = aux;
		
	}
	public void seleccionDeAlgomon(){
		//Deveriamos pasar por parametro una ventana : seleccion
		
		int cantAlgomones = 0;
		while(cantAlgomones <= 6){
			//seleccion.seleccionarAlgomon (activo );
			this.siguienteTruno();
			cantAlgomones = cantAlgomones + 1;
		}
	}
	//public void comenzarJuego( ){
		//Deveriamos pasar por parametro una ventana : combate y una ventana: Ganador
		//try{
			//while(true){
				//combate.aplicarAccion(activo,pasivo);
				//this.siguienteTruno();
			//}
		//}catch(AlgomonesDeJugadorMuertosExeption dead){
			//Ganador(activo);
		//}
		
	//}

}

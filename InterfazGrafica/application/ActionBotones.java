package application;

import fiuba.algo3.algomones.Juego;
import javafx.scene.Group;
import javafx.scene.control.Button;

public class ActionBotones {
	private BotonDeAtaque ataque1;
	private BotonDeAtaque ataque2;
	private BotonDeAtaque ataque3;
	/*private Button pocion;
	private Button superPocion;
	private Button restaurador;
	private Button algomon1;
	private Button algomon2;
	private Button algomon3;
	*/
	private Juego juego;
	
	public ActionBotones(Group root){
		ataque1 = new BotonDeAtaque(this);
		ataque2 = new BotonDeAtaque(this);
		ataque3 = new BotonDeAtaque(this);
		
		/*pocion  = new Button();
		superPocion = new Button();
		restaurador = new Button();
		algomon1 = new Button();
		algomon2 = new Button();
		algomon3  = new Button();
		*/
		posicionarBotones();
		subirBotones(root);

	}
	private void posicionarBotones(){
		UbicacionControles ubicacion = new UbicacionControles();
		
		ubicacion.controlerProColumna("ataque1", ataque1);
		ubicacion.controlerProColumna("ataque2", ataque2);
		ubicacion.controlerProColumna("ataque3", ataque3);
		
		/*ubicacion.controlerPorColumnba2("poci", pocion);
		ubicacion.controlerPorColumnba2(null, superPocion);
		ubicacion.controlerPorColumnba2(null, superPocion);
		
		ubicacion.controlerPorColumnba3(null, algomon1);
		ubicacion.controlerPorColumnba3(null, algomon2);
		ubicacion.controlerPorColumnba3(null, algomon3);
	*/
	}
	private void subirBotones(Group root){
		root.getChildren().addAll(ataque1.getBoton(),ataque2.getBoton(),ataque3.getBoton());
	}
	public void nuevoTurno() {
		/*reiniciar todos los botones cada ve que se haga unna accion*/
		
	}
}

package application;

import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class BotonAlgomon {
	private ActionBotones actionBotones;
	private Button boton;
	private Jugador jugador; 
	private EspecieAlgomon algomon;
	
	public BotonAlgomon(ActionBotones Botones) {
		this.actionBotones = Botones;
		this.boton = new Button();
		this.boton.setOnAction (new EventHandler <ActionEvent> () {
		     @Override 
		     public void handle (ActionEvent e) {
		    	jugador.elegirAlgomon(algomon);
		    	 actionBotones.actualizarBotones();
		     }
		 });
	}

	public Button getBoton() {
		// TODO Auto-generated method stub
		return this.boton;
	}

	public void insertarJugadoresYNombreAlgomon(Jugador jugador, EspecieAlgomon nombre) {
		this.jugador = jugador;
		this.algomon = nombre;
		
		boton.setText(nombre.name()+"Vida: "+jugador.vidaDeAlogmon(nombre));
		if (jugador.vidaDeAlogmon(nombre)==0){
			boton.setDisable(true);
		}
		
	}

}

package application;

import java.net.URL;
import java.util.ResourceBundle;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Juego;
import fiuba.algo3.algomones.NombreDelAtaque;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class BotonDeAtaque {
	
	private Button boton;
	private NombreDelAtaque ataque;
	private Algomon atacado;
	private Algomon atacando;
	private ActionBotones actionBotones;
	
	
	public BotonDeAtaque(ActionBotones actionBotones){
		boton = new Button();
		this.actionBotones = actionBotones;
		this.boton.setOnAction (new EventHandler <ActionEvent> () {
		     @Override 
		     public void handle (ActionEvent e) {
		    	 boton.setText("jaja lo logre");
		    	 actionBotones.nuevoTurno();
		     }
		 });
		
	}
	public Button getBoton(){
		return this.boton;
	}
}

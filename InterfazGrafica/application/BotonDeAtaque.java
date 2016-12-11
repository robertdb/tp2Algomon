package application;

import java.net.URL;
import java.util.ResourceBundle;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Juego;
import fiuba.algo3.algomones.Jugador;
import fiuba.algo3.algomones.NombreDelAtaque;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class BotonDeAtaque {
	
	private Button boton;
	private NombreDelAtaque ataque;
	private Jugador ofensivo;
	private Jugador defensivo;
	private ActionEscene actionBotones;
	
	
	public BotonDeAtaque(ActionEscene actionBotones){
		boton = new Button();
		this.actionBotones = actionBotones;
		this.boton.setOnAction (new EventHandler <ActionEvent> () {
		     @Override 
		     public void handle (ActionEvent e) {
		    	ofensivo.aplicarAtaque(ataque, defensivo);
		    	 actionBotones.actualizarBotones();
		     }
		 });
		
	}
	public Button getBoton(){
		return this.boton;
	}
	public void insertarJugadoresYNombreAtaque(Jugador activo, Jugador pasivo,NombreDelAtaque ataque){
		this.ataque = ataque;
		this.defensivo = activo;
		this.ofensivo = pasivo;
		
		boton.setText(ataque.name()+"Restantes: "+activo.statusAlgomonActual().ataqueRestantes(ataque) );
		if (activo.statusAlgomonActual().ataqueRestantes(ataque) == 0){
			boton.setDisable(true);
		}
	}
	
}

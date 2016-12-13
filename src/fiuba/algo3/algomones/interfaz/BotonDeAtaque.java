package fiuba.algo3.algomones.interfaz;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Set;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Dormido;
import fiuba.algo3.algomones.Efecto;
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
	private ActionEscene action;
	
	public BotonDeAtaque(ActionEscene actionBotones){
		boton = new Button();
		this.action = actionBotones;
		this.boton.setOnAction((ActionEvent e) -> {
			ofensivo.aplicarAtaque(ataque, defensivo);
			action.actualizarBotones();
		});
		
	}
	public Button getBoton(){
		return this.boton;
	}
	public void insertarJugadoresYNombreAtaque(Jugador activo, Jugador pasivo,NombreDelAtaque ataque){
		this.ataque = ataque;
		this.defensivo = pasivo;
		this.ofensivo = activo;
		
		boton.setText(ataque.name()+" Restantes: "+activo.statusAlgomonActual().ataqueRestantes(ataque) );
		int restantes = activo.statusAlgomonActual().ataqueRestantes(ataque);
		
		if (restantes == 0 || activo.statusAlgomonActual().estadoEfimero() == "Dormido"){
			boton.setDisable(true);
		}
		else{boton.setDisable(false);}
	}
	
}

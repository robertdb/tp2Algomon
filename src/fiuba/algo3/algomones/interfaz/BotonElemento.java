package fiuba.algo3.algomones.interfaz;

import fiuba.algo3.algomones.Jugador;
import fiuba.algo3.algomones.TipoElemento;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonElemento {
	private Button boton;
	private Jugador activo;
	private TipoElemento element;

	public BotonElemento(ActionEscene actionBotones) {
		this.boton = new Button();
		this.boton.setOnAction (new EventHandler <ActionEvent> () {
		     @Override 
		     public void handle (ActionEvent e) {
		    	activo.aplicarElemento(element);
		    	activo.statusAlgomonActual().reducirTiempoDeEstado();
		    	 actionBotones.actualizarBotones();
		     }
		 });
	}
	public Button getBoton() {
		return boton;
	}
	public void insertarJugadoresYNombreAtaque(Jugador jugador, TipoElemento nombre) {
		this.activo = jugador;
		this.element = nombre;
		
		boton.setText(nombre.NombreElemento()+ "Restantes"+jugador.elementosRestantes(nombre));
		if (jugador.elementosRestantes(nombre) == 0){
			boton.setDisable(true);
		}
		else{boton.setDisable(false);}
	}

}

package fiuba.algo3.algomones.interfaz;

import fiuba.algo3.algomones.Juego;
import fiuba.algo3.algomones.Jugador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class JugadoresController implements Controller  {
	
	private Juego juego;
	
	private InicioController inicioController;

    @FXML
    private TextField inputNombreJugador1;

    @FXML
    private TextField inputNombreJugador2;
    
    @FXML
    private Button botonContinuar;
    
    @FXML
    void continuar(ActionEvent event) throws Exception {
    	
    	this.juego.setJugador1(new Jugador(inputNombreJugador1.getText()));
    	this.juego.setJugador2(new Jugador(inputNombreJugador2.getText()));
    	this.juego.setJugadorActivoRandom();
    	
    	this.inicioController.mostrarEscena(this.inicioController.cargarEscena("SeleccionAlgomones.fxml"));
    	
    }

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	@Override
	public void setInicioController(InicioController controller) {
		this.inicioController = controller;
	}

}
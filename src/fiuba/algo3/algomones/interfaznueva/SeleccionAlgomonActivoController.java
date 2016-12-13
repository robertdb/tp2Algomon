package fiuba.algo3.algomones.interfaznueva;

import java.util.ArrayList;

import fiuba.algo3.algomones.logica.Algomon;
import fiuba.algo3.algomones.logica.Juego;
import fiuba.algo3.algomones.logica.Jugador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class SeleccionAlgomonActivoController {

	private Juego juego;
	
	private Scene escenaSiguiente;
	private CombateController controllerSiguiente;
	
	Jugador jugador;
	ArrayList<Algomon> algomones;
	
    @FXML
    private Label nombreJugador;

    @FXML
    private Button botonAlgomon1;
    
    @FXML
    private ImageView imagenAlgomon1;

    @FXML
    private Label puntosSaludAlgomon1;

    @FXML
    private Button botonAlgomon2;
    
    @FXML
    private ImageView imagenAlgomon2;

    @FXML
    private Label puntosSaludAlgomon2;

    @FXML
    private Button botonAlgomon3;

    @FXML
    private ImageView imagenAlgomon3;
    
    @FXML
    private Label puntosSaludAlgomon3;

    @FXML
    private Label nombreAlgomonActivo;

    @FXML
    private Button botonContinuar;

    @FXML
    void continuar(ActionEvent event) throws Exception {
    	
    	if (!this.juego.getJugadorInactivo().tieneAlgomonActivo()) {  		
    		this.juego.cambiarTurno();
    		this.inicializar();
    	}
    	else {	
    	   	Stage stage = (Stage) botonContinuar.getScene().getWindow();
    	   	this.juego.cambiarTurno();
    	   	this.controllerSiguiente.setJuego(this.juego);
    	   	stage.setScene(this.escenaSiguiente);
    	} 	
    	
    }

    @FXML
    void seleccionarAlgomon1(ActionEvent event) {
    	Algomon algomonActivo = algomones.get(0);
    	this.jugador.setAlgomonActivo(algomonActivo);
    	this.nombreAlgomonActivo.setText(algomonActivo.getNombre());
    }

    @FXML
    void seleccionarAlgomon2(ActionEvent event) {
    	Algomon algomonActivo = algomones.get(1);
    	this.jugador.setAlgomonActivo(algomonActivo);
    	this.nombreAlgomonActivo.setText(algomonActivo.getNombre());
    }

    @FXML
    void seleccionarAlgomon3(ActionEvent event) {
    	Algomon algomonActivo = algomones.get(2);
    	this.jugador.setAlgomonActivo(algomonActivo);
    	this.nombreAlgomonActivo.setText(algomonActivo.getNombre());
    }

	public void setJuego(Juego juego) {
		this.juego = juego;
		this.inicializar();

	}

	private void inicializar() {
		
		this.jugador = this.juego.getJugadorActivo();
		this.algomones = jugador.getListadoAlgomones();
		
		this.nombreJugador.setText(jugador.getNombre());
		this.nombreAlgomonActivo.setText("");
		
		this.imagenAlgomon1.setImage(new Image(getClass().getResourceAsStream(algomones.get(0).getImagenFrente())));
		this.imagenAlgomon2.setImage(new Image(getClass().getResourceAsStream(algomones.get(1).getImagenFrente())));
		this.imagenAlgomon3.setImage(new Image(getClass().getResourceAsStream(algomones.get(2).getImagenFrente())));
		
		this.puntosSaludAlgomon1.setText(String.valueOf(algomones.get(0).getVida()));
		this.puntosSaludAlgomon2.setText(String.valueOf(algomones.get(1).getVida()));
		this.puntosSaludAlgomon3.setText(String.valueOf(algomones.get(2).getVida()));
		
		
	}

	public void setEscenaSiguiente(Scene escena, CombateController controller) {
		this.escenaSiguiente = escena;
		this.controllerSiguiente = controller;
	}
}
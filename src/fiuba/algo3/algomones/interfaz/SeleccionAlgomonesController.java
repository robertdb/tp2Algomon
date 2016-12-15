package fiuba.algo3.algomones.interfaz;

import fiuba.algo3.algomones.Juego;
import fiuba.algo3.algomones.especiesdealgomones.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SeleccionAlgomonesController implements Controller {
	
	private Juego juego;
	
	private InicioController inicioController;
	
	private int contadorSeleccionados = 0;

    @FXML
    private Button botonCharmander;

    @FXML
    private Button botonSquirtle;

    @FXML
    private Button botonBulbasaur;

    @FXML
    private Button botonJigglypuff;

    @FXML
    private Button botonChansey;

    @FXML
    private Button botonRattata;

    @FXML
    private Label nombreJugador;

    @FXML
    void seleccionarBulbasaur(ActionEvent event) throws Exception {
    	this.juego.getJugadorActivo().agregarAlgomon(new Bulbasaur());
    	this.juego.cambiarTurno();
    	this.botonBulbasaur.setDisable(true);
    	this.contadorSeleccionados++;
    	if (this.contadorSeleccionados > 5) {
    		this.continuar();
    	}
    }

	@FXML
    void seleccionarChansey(ActionEvent event) throws Exception {
    	this.juego.getJugadorActivo().agregarAlgomon(new Chansey());
    	this.juego.cambiarTurno();
    	this.botonChansey.setDisable(true);
    	this.contadorSeleccionados++;
    	if (this.contadorSeleccionados > 5) {
    		this.continuar();
    	}
    }

    @FXML
    void seleccionarCharmander(ActionEvent event) throws Exception {
    	this.juego.getJugadorActivo().agregarAlgomon(new Charmander());
    	this.juego.cambiarTurno();
    	this.botonCharmander.setDisable(true);
    	this.contadorSeleccionados++;
    	if (this.contadorSeleccionados > 5) {
    		this.continuar();
    	}
    }

    @FXML
    void seleccionarJigglypuff(ActionEvent event) throws Exception {
    	this.juego.getJugadorActivo().agregarAlgomon(new Jigglypuff());
    	this.juego.cambiarTurno();
    	this.botonJigglypuff.setDisable(true);
    	this.contadorSeleccionados++;
    	if (this.contadorSeleccionados > 5) {
    		this.continuar();
    	}
    }

    @FXML
    void seleccionarRattata(ActionEvent event) throws Exception {
    	this.juego.getJugadorActivo().agregarAlgomon(new Rattata());
    	this.juego.cambiarTurno();
    	this.botonRattata.setDisable(true);
    	this.contadorSeleccionados++;
    	if (this.contadorSeleccionados > 5) {
    		this.continuar();
    	}
    }

    @FXML
    void seleccionarSquirtle(ActionEvent event) throws Exception {
    	this.juego.getJugadorActivo().agregarAlgomon(new Squirtle());
    	this.juego.cambiarTurno();
    	this.botonSquirtle.setDisable(true);
    	this.contadorSeleccionados++;
    	if (this.contadorSeleccionados > 5) {
    		this.continuar();
    	}
    }

	public void setJuego(Juego juego) {
		this.juego = juego;
		this.nombreJugador.textProperty().bind(this.juego.getNombreJugadorActivoProperty());
	}
	
    private void continuar() throws Exception {

    	this.juego.cambiarTurno();
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SeleccionAlgomonActivo.fxml"));
    	Parent root = (Parent)fxmlLoader.load();
         
    	SeleccionAlgomonActivoController controller = fxmlLoader.<SeleccionAlgomonActivoController>getController();

    	controller.setInicioController(this.inicioController);
    	controller.setJuego(juego);
    	
    	Scene escena = new Scene(root);
    	
    	this.inicioController.mostrarEscena(escena);
    	
    	this.inicioController.setSeleccionAlgomonActivo(escena, controller);
    	
	}

	@Override
	public void setInicioController(InicioController controller) {
		this.inicioController = controller;
	}


}


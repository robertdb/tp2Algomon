package fiuba.algo3.algomones.interfaznueva;

import fiuba.algo3.algomones.logica.Juego;
import fiuba.algo3.algomones.logica.especiesdealgomones.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SeleccionAlgomonesController {
	
	private Juego juego;
	
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
    	
    	Stage stage = (Stage) nombreJugador.getScene().getWindow();
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SeleccionAlgomonActivo.fxml"));
    	
    	Parent root = (Parent)fxmlLoader.load();
         
    	SeleccionAlgomonActivoController controller = fxmlLoader.<SeleccionAlgomonActivoController>getController();

    	FXMLLoader fxmlLoaderCombate = new FXMLLoader(getClass().getResource("Combate.fxml"));
    	Parent rootCombate = (Parent)fxmlLoaderCombate.load();
    	controller.setJuego(juego);
    	controller.setEscenaSiguiente(new Scene(rootCombate), fxmlLoaderCombate.<CombateController>getController());
    	
    	Scene escena = new Scene(root);
    	
    	stage.setScene(escena);
	}


}


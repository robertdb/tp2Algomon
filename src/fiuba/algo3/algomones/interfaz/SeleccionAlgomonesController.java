package fiuba.algo3.algomones.interfaz;

import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.Juego;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
    	this.juego.getActivo().ingresarAlgomon(EspecieAlgomon.BULBASAUR, EspecieAlgomon.BULBASAUR.nuevo());
    	this.juego.siguienteTurno();
    	this.botonBulbasaur.setDisable(true);
    	this.contadorSeleccionados++;
    	if (this.contadorSeleccionados > 5) {
    		this.continuar();
    	}
    }

	@FXML
    void seleccionarChansey(ActionEvent event) throws Exception {
    	this.juego.getActivo().ingresarAlgomon(EspecieAlgomon.CHANSEY, EspecieAlgomon.CHANSEY.nuevo());
    	this.juego.siguienteTurno();
    	this.botonChansey.setDisable(true);
    	this.contadorSeleccionados++;
    	if (this.contadorSeleccionados > 5) {
    		this.continuar();
    	}
    }

    @FXML
    void seleccionarCharmander(ActionEvent event) throws Exception {
    	this.juego.getActivo().ingresarAlgomon(EspecieAlgomon.CHARMANDER, EspecieAlgomon.CHARMANDER.nuevo());
    	this.juego.siguienteTurno();
    	this.botonCharmander.setDisable(true);
    	this.contadorSeleccionados++;
    	if (this.contadorSeleccionados > 5) {
    		this.continuar();
    	}
    }

    @FXML
    void seleccionarJigglypuff(ActionEvent event) throws Exception {
    	this.juego.getActivo().ingresarAlgomon(EspecieAlgomon.JIGGLYPUFF, EspecieAlgomon.JIGGLYPUFF.nuevo());
    	this.juego.siguienteTurno();
    	this.botonJigglypuff.setDisable(true);
    	this.contadorSeleccionados++;
    	if (this.contadorSeleccionados > 5) {
    		this.continuar();
    	}
    }

    @FXML
    void seleccionarRattata(ActionEvent event) throws Exception {
    	this.juego.getActivo().ingresarAlgomon(EspecieAlgomon.RATTATA, EspecieAlgomon.RATTATA.nuevo());
    	this.juego.siguienteTurno();
    	this.botonRattata.setDisable(true);
    	this.contadorSeleccionados++;
    	if (this.contadorSeleccionados > 5) {
    		this.continuar();
    	}
    }

    @FXML
    void seleccionarSquirtle(ActionEvent event) throws Exception {
    	this.juego.getActivo().ingresarAlgomon(EspecieAlgomon.SQUIRTLE, EspecieAlgomon.SQUIRTLE.nuevo());
    	this.juego.siguienteTurno();
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

    	this.juego.siguienteTurno();
    	
    	Stage stage = (Stage) nombreJugador.getScene().getWindow();
    	
    	Combate combate = new Combate(stage,this.juego);
    	combate.iniciarCombate();

	}


}


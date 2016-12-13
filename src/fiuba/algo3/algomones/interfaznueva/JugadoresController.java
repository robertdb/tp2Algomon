package fiuba.algo3.algomones.interfaznueva;

import fiuba.algo3.algomones.logica.Juego;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class JugadoresController {
	
	private Juego juego;

    @FXML
    private TextField inputNombreJugador1;

    @FXML
    private TextField inputNombreJugador2;
    
    @FXML
    private Button botonContinuar;
    
    @FXML
    void continuar(ActionEvent event) throws Exception {
    	
    	this.juego.setJugador1(inputNombreJugador1.getText());
    	this.juego.setJugador2(inputNombreJugador2.getText());
    	this.juego.setJugadorActivoRandom();
    	
    	Stage stage = (Stage) botonContinuar.getScene().getWindow();
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SeleccionAlgomones.fxml"));
    	
    	Parent root = (Parent)fxmlLoader.load();
         
    	SeleccionAlgomonesController controller = fxmlLoader.<SeleccionAlgomonesController>getController();

    	controller.setJuego(juego);
    	
    	Scene escena = new Scene(root);
    	
    	stage.setScene(escena);
    }

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

}
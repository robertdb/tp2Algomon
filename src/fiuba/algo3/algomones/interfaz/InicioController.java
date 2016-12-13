package fiuba.algo3.algomones.interfaz;

import fiuba.algo3.algomones.Juego;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InicioController {
	
	private Juego juego;
	
    @FXML
    private Button botonJugar;

    @FXML
    private Button botonSalir;

    @FXML
    void juegoNuevo(ActionEvent event) throws Exception{
    	
    	Stage stage = (Stage) botonJugar.getScene().getWindow();
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Jugadores.fxml"));
    	
    	Parent root = (Parent)fxmlLoader.load();
         
    	JugadoresController controller = fxmlLoader.<JugadoresController>getController();

    	controller.setJuego(juego);
    	
    	Scene escena = new Scene(root);
    	
    	stage.setScene(escena);
    }

    @FXML
    void salir(ActionEvent event) {
    	Stage stage = (Stage) botonSalir.getScene().getWindow();
        stage.close();
    }

	public void setJuego(Juego juego) {
		this.juego = juego;	
	}


}


package fiuba.algo3.algomones.interfaz;

import fiuba.algo3.algomones.Juego;
import fiuba.algo3.algomones.Jugador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class AnunciarGanadorController implements Controller {
	
	private Juego juego;
	
	private InicioController inicioController;
	
    @FXML
    private Label nombreJugador;

    @FXML
    private Button botonJuegoNuevo;

    @FXML
    private Button botonSalir;

    @FXML
    private ImageView imagenAlgomon;

    @FXML
    void juegoNuevo(ActionEvent event) throws Exception {
    	
    	Stage stage = this.inicioController.getVentanaActual();
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Inicio.fxml"));
    	
    	Parent root = (Parent)fxmlLoader.load();
         
    	InicioController controller = fxmlLoader.<InicioController>getController();

    	controller.setJuego(juego);
    	
        Scene escena = new Scene(root);    

    	escena.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
    
    	stage.setScene(escena);

    	controller.setVentanaActual(stage);
    }

    @FXML
    void salir(ActionEvent event) {
    	Stage stage = (Stage) botonSalir.getScene().getWindow();
        stage.close();
    }
    
	public void setGanador(Jugador ganador) {
		
		this.nombreJugador.setText(ganador.getNombre().toUpperCase());
		
		this.imagenAlgomon.setImage(new Image(getClass().getResourceAsStream(ganador.getAlgomonActivo().getImagenFrente())));
		
	}

	@Override
	public void setJuego(Juego juego) throws Exception {
		this.juego = juego;
		if (juego.getJugador1().derrotado()) {
			this.setGanador(juego.getJugador2());
		}
		else {
			this.setGanador(juego.getJugador1());
		}
	}

	@Override
	public void setInicioController(InicioController controller) {
		this.inicioController = controller;
	}
	
	

}

package fiuba.algo3.algomones.interfaznueva;

import fiuba.algo3.algomones.logica.Juego;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InicioController implements Controller {
	
	private Juego juego;
	
	private Stage ventanaActual;
	
	private Scene seleccionAlgomonActivo;
	
	private Controller seleccionAlgomonActivoController;
	
	private CombateController combateController;
	
    @FXML
    private Button botonJugar;

    @FXML
    private Button botonSalir;

	private InicioController setInicioController;

    @FXML
    void juegoNuevo(ActionEvent event) throws Exception{

    	this.mostrarEscena(this.cargarEscena("Jugadores.fxml"));

    }

    @FXML
    void salir(ActionEvent event) {
    	Stage stage = (Stage) botonSalir.getScene().getWindow();
        stage.close();
    }

	public void setJuego(Juego juego) {
		this.juego = new Juego();	
	}
	
	public Scene cargarEscena(String URLFxml) throws Exception {
    	
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(URLFxml));
    	
    	Parent root = (Parent)fxmlLoader.load();
         
    	Controller controller = fxmlLoader.<Controller>getController();

    	controller.setInicioController(this);
    	controller.setJuego(juego);
    	
    	return new Scene(root);
    	
	}
	
	public void mostrarEscena(Scene escena) {
		
		this.ventanaActual.setScene(escena);
		
	}

	@Override
	public void setInicioController(InicioController controller) {
		this.setInicioController = controller;
	}

	public void setVentanaActual(Stage stage) {
		
		this.ventanaActual = stage;
		
	}

	public Stage getVentanaActual() {
		return this.ventanaActual;
	}
	
	public void setSeleccionAlgomonActivo(Scene escena, Controller controller) {
		this.seleccionAlgomonActivo = escena;
		this.seleccionAlgomonActivoController = controller;
	}

	public void mostrarSeleccionAlgomonActivo() throws Exception {
		this.seleccionAlgomonActivoController.setJuego(this.juego);
		this.mostrarEscena(this.seleccionAlgomonActivo);
	}
	
	public void setCombate(CombateController controller) {
		this.combateController = controller;
	}
	
	public CombateController getCombate() {
		return this.combateController;
	}
	

}


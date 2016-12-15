package fiuba.algo3.algomones.interfaz;

import java.util.ArrayList;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Juego;
import fiuba.algo3.algomones.Jugador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SeleccionAlgomonActivoController implements Controller  {

	private Juego juego;
	
	private Scene escenaSiguiente;
	
	private InicioController inicioController; 
	
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
    	
    	if (this.jugador.getAlgomonActivo() == null) {
    		return;
    	}
    	
    	if (!this.juego.getJugadorInactivo().tieneAlgomonActivo()) {  		
    		this.juego.cambiarTurno();
    		this.inicializar();
    	}
    	else {	
    	   	this.juego.cambiarTurno();
    	   	if (this.escenaSiguiente == null) {
    	   		this.escenaSiguiente = this.inicioController.cargarEscena("Combate.fxml");
    	   	}
    	   	this.inicioController.getCombate().inicializar();
    	   	this.inicioController.mostrarEscena(this.escenaSiguiente);
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

    @Override
	public void setJuego(Juego juego) throws Exception {
		this.juego = juego;
		if (juego.getJugadorActivo().derrotado()) {
			this.continuar(null);
		}
		else {
			this.inicializar();
		}

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
	
		this.botonAlgomon1.setDisable(algomones.get(0).getVida() < 1);
		this.botonAlgomon2.setDisable(algomones.get(1).getVida() < 1);
		this.botonAlgomon3.setDisable(algomones.get(2).getVida() < 1);
		
	}

	@Override
	public void setInicioController(InicioController controller) {
		this.inicioController = controller;
	}


}
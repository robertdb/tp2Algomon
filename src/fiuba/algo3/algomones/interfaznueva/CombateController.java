package fiuba.algo3.algomones.interfaznueva;

import java.util.ArrayList;

import fiuba.algo3.algomones.logica.Juego;
import fiuba.algo3.algomones.logica.Jugador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CombateController {
	
	Juego juego;
	
	Jugador jugador1;
	
	Jugador jugador2;
	
	Jugador jugadorActivo;

    @FXML
    private ImageView imagenAlgomon1;

    @FXML
    private ImageView imagenAlgomon2;

    @FXML
    private MenuButton botonMenuAtacar1;

    @FXML
    private MenuButton botonMenuElementos1;

    @FXML
    private Button botonCambiar1;

    @FXML
    private MenuButton botonMenuAtacar2;

    @FXML
    private MenuButton botonMenuElementos2;

    @FXML
    private Button botonCambiar2;

    @FXML
    private Label nombreJugador1;

    @FXML
    private Label nombreJugador2;

    @FXML
    private Label nombreAlgomon1;

    @FXML
    private Label puntosSalud1;

    @FXML
    private Label nombreAlgomon2;

    @FXML
    private Label puntosSalud2;

	public void setJuego(Juego juego) {
		this.juego = juego;
		this.jugador1 = juego.getJugador1();
		this.jugador2 = juego.getJugador2();
		this.jugadorActivo = juego.getJugadorActivo();
		this.inicializar();

	}
	
	public void inicializar() {
			
		this.nombreJugador1.setText(this.jugador1.getNombre());
		this.nombreJugador2.setText(this.jugador2.getNombre());
		
		this.nombreAlgomon1.setText(this.jugador1.getAlgomonActivo().getNombre());
		this.nombreAlgomon2.setText(this.jugador2.getAlgomonActivo().getNombre());
		
		this.imagenAlgomon1.setImage(new Image(getClass().getResourceAsStream(jugador1.getAlgomonActivo().getImagenEspalda())));
		this.imagenAlgomon2.setImage(new Image(getClass().getResourceAsStream(jugador2.getAlgomonActivo().getImagenFrente())));
		
		this.puntosSalud1.setText(String.valueOf(this.jugador1.getAlgomonActivo().getVida()));
		this.puntosSalud2.setText(String.valueOf(this.jugador2.getAlgomonActivo().getVida()));
	
		//TODO bindings
		
		ArrayList<MenuItem> listaAtaques1 = new ArrayList<MenuItem>();
		listaAtaques1.add(new MenuItem(this.jugador1.getAlgomonActivo().getListadoAtaques().get(0).getNombre()));
		listaAtaques1.add(new MenuItem(this.jugador1.getAlgomonActivo().getListadoAtaques().get(1).getNombre()));
		listaAtaques1.add(new MenuItem(this.jugador1.getAlgomonActivo().getListadoAtaques().get(2).getNombre()));
        
        this.botonMenuAtacar1.getItems().addAll(listaAtaques1);
        
        ArrayList<MenuItem> listaAtaques2 = new ArrayList<MenuItem>();
		listaAtaques2.add(new MenuItem(this.jugador1.getAlgomonActivo().getListadoAtaques().get(0).getNombre()));
		listaAtaques2.add(new MenuItem(this.jugador1.getAlgomonActivo().getListadoAtaques().get(1).getNombre()));
		listaAtaques2.add(new MenuItem(this.jugador1.getAlgomonActivo().getListadoAtaques().get(2).getNombre()));
        
        this.botonMenuAtacar2.getItems().addAll(listaAtaques2);
        
        
        if (this.jugadorActivo == this.jugador1) {
        	botonMenuAtacar1.setDisable(false);
        	botonMenuElementos1.setDisable(false);
        	botonCambiar1.setDisable(false);
        	botonMenuAtacar2.setDisable(true);
        	botonMenuElementos2.setDisable(true);
        	botonCambiar2.setDisable(true);
        }
        else {
        	botonMenuAtacar2.setDisable(false);
        	botonMenuElementos2.setDisable(false);
        	botonCambiar2.setDisable(false);
        	botonMenuAtacar1.setDisable(true);
        	botonMenuElementos1.setDisable(true);
        	botonCambiar1.setDisable(true);
        }
		
		
	}
	
	@FXML
    void cambiarAlgomonActivo(ActionEvent event) throws Exception {
    	
    	Stage stage = (Stage) botonCambiar1.getScene().getWindow();
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SeleccionAlgomonActivo.fxml"));
    	
    	Parent root = (Parent)fxmlLoader.load();
         
    	SeleccionAlgomonActivoController controller = fxmlLoader.<SeleccionAlgomonActivoController>getController();

    	controller.setJuego(juego);
    	controller.setEscenaSiguiente(botonCambiar1.getScene(), this);
    	
    	Scene escena = new Scene(root);
    	
    	stage.setScene(escena);
    }

}

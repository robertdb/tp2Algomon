package fiuba.algo3.algomones.interfaznueva;

import fiuba.algo3.algomones.logica.Juego;
import fiuba.algo3.algomones.logica.Jugador;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    private MenuButton botonMenuCambiar1;

    @FXML
    private MenuButton botonMenuAtacar2;

    @FXML
    private MenuButton botonMenuElementos2;

    @FXML
    private MenuButton botonMenuCambiar2;

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
		
		MenuItem ataque11 = new MenuItem(this.jugador1.getAlgomonActivo().getListadoAtaques().get(0).getNombre());
        MenuItem ataque12 = new MenuItem(this.jugador1.getAlgomonActivo().getListadoAtaques().get(1).getNombre());
        MenuItem ataque13 = new MenuItem(this.jugador1.getAlgomonActivo().getListadoAtaques().get(2).getNombre());
        
		MenuItem ataque21 = new MenuItem(this.jugador2.getAlgomonActivo().getListadoAtaques().get(0).getNombre());
        MenuItem ataque22 = new MenuItem(this.jugador2.getAlgomonActivo().getListadoAtaques().get(1).getNombre());
        MenuItem ataque23 = new MenuItem(this.jugador2.getAlgomonActivo().getListadoAtaques().get(2).getNombre());
        
        this.botonMenuAtacar1.getItems().add(ataque11);
        this.botonMenuAtacar1.getItems().add(ataque12);
        this.botonMenuAtacar1.getItems().add(ataque13);
        
        this.botonMenuAtacar2.getItems().add(ataque21);
        this.botonMenuAtacar2.getItems().add(ataque22);
        this.botonMenuAtacar2.getItems().add(ataque23);
        
        //TODO lo de arriba agregar todo junto desde lista
		
		
	}

}

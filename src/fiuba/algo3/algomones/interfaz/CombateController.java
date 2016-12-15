package fiuba.algo3.algomones.interfaz;

import java.util.ArrayList;

import fiuba.algo3.algomones.Ataque;
import fiuba.algo3.algomones.Elemento;
import fiuba.algo3.algomones.Juego;
import fiuba.algo3.algomones.Jugador;
import fiuba.algo3.algomones.interfaz.CombateController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CombateController implements Controller {
	
	Juego juego;
	
	Jugador jugador1;
	
	Jugador jugador2;
	
	Jugador jugadorActivo;
	
	Jugador jugadorInactivo;
	
	InicioController inicioController;

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
    
    @FXML
    private Label etiquetaDormido1;
    
    @FXML
    private Label etiquetaDormido2;
    
    @FXML
    private Label etiquetaQuemado1;
    
    @FXML
    private Label etiquetaQuemado2;
    
    @FXML
    private Label mensaje;

    @Override
	public void setJuego(Juego juego) throws Exception {
		this.juego = juego;
		this.inicializar();
	}
	
	public void inicializar() throws Exception {
		
		this.inicioController.setCombate(this);
		
		this.jugador1 = juego.getJugador1();
		this.jugador2 = juego.getJugador2();
		this.jugadorActivo = juego.getJugadorActivo();
		this.jugadorInactivo = juego.getJugadorInactivo();
		
		this.nombreJugador1.setText(this.jugador1.getNombre());
		this.nombreJugador2.setText(this.jugador2.getNombre());
		
		this.nombreAlgomon1.setText(this.jugador1.getAlgomonActivo().getNombre());
		this.nombreAlgomon2.setText(this.jugador2.getAlgomonActivo().getNombre());
		
		this.imagenAlgomon1.setImage(new Image(getClass().getResourceAsStream(jugador1.getAlgomonActivo().getImagenEspalda())));
		this.imagenAlgomon2.setImage(new Image(getClass().getResourceAsStream(jugador2.getAlgomonActivo().getImagenFrente())));
			
		this.puntosSalud1.textProperty().bind(this.jugador1.getAlgomonActivo().getVidaProperty());
		this.puntosSalud2.textProperty().bind(this.jugador2.getAlgomonActivo().getVidaProperty());
		
		this.etiquetaDormido1.visibleProperty().bind(this.jugador1.getAlgomonActivo().getEstaDormidoProperty());
		this.etiquetaDormido2.visibleProperty().bind(this.jugador2.getAlgomonActivo().getEstaDormidoProperty());
		
		this.etiquetaQuemado1.visibleProperty().bind(this.jugador1.getAlgomonActivo().getEstaQuemadoProperty());
		this.etiquetaQuemado2.visibleProperty().bind(this.jugador2.getAlgomonActivo().getEstaQuemadoProperty());

		this.cargarAtaques(jugador1, jugador2, botonMenuAtacar1);
		this.cargarAtaques(jugador2, jugador1, botonMenuAtacar2);
		
		this.cargarElementos(jugador1, botonMenuElementos1);
		this.cargarElementos(jugador2, botonMenuElementos2);
        
        this.deshabilitarBotonesDelJugadorInactivo();
        
        
	}
	
	public void siguienteTurno() {
		this.juego.cambiarTurno();
		this.jugadorActivo = juego.getJugadorActivo();
		this.jugadorInactivo = juego.getJugadorInactivo();
		this.deshabilitarBotonesDelJugadorInactivo();
		
		if (this.jugadorInactivo.derrotado() || this.jugadorActivo.derrotado()) {
			try {
				this.inicioController.mostrarEscena(this.inicioController.cargarEscena("AnunciarGanador.fxml"));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return;	
		}
		
		if (this.jugadorActivo.getAlgomonActivo().estaDerrotado()) {
			
			try {
				this.cambiarAlgomonActivo(null);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (this.jugadorInactivo.getAlgomonActivo().estaDerrotado()) {
			this.juego.cambiarTurno();
			try {
				this.cambiarAlgomonActivo(null);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	private boolean jugadorEstaActivo(Jugador jugador) {
		return jugador == this.jugadorActivo;
	}
	
	private void deshabilitarBotonesDelJugadorInactivo() {
		if (jugadorEstaActivo(this.jugador1)) {
        	if (!this.jugador1.getAlgomonActivo().getEstaDormidoProperty().getValue()) {
        		botonMenuAtacar1.setDisable(false);
        	}
        	botonMenuElementos1.setDisable(false);
        	botonCambiar1.setDisable(false);
        	botonMenuAtacar2.setDisable(true);
        	botonMenuElementos2.setDisable(true);
        	botonCambiar2.setDisable(true);     	
        }
        else {
        	if (!this.jugador2.getAlgomonActivo().getEstaDormidoProperty().getValue()) {
        		botonMenuAtacar2.setDisable(false);
        	}
        	botonMenuElementos2.setDisable(false);
        	botonCambiar2.setDisable(false);
        	botonMenuAtacar1.setDisable(true);
        	botonMenuElementos1.setDisable(true);
        	botonCambiar1.setDisable(true);
        }
	}

	private void cargarAtaques(Jugador jugador, Jugador oponente, MenuButton boton) {
		
		ArrayList<Ataque> listaAtaques = jugador.getAlgomonActivo().getListadoAtaques();
		
		String nombreAtaque1 = listaAtaques.get(0).getNombre();
		String nombreAtaque2 = listaAtaques.get(1).getNombre();
		String nombreAtaque3 = listaAtaques.get(2).getNombre();
		
		ArrayList<MenuItem> listaMenuDeAtaques = new ArrayList<MenuItem>();
		
		MenuItem ataque1 = new MenuItem();
		ataque1.textProperty().bind(listaAtaques.get(0).getCantidadRestanteProperty());
		ataque1.setOnAction((ActionEvent e) -> {
			jugador.getAlgomonActivo().atacar(oponente.getAlgomonActivo(), nombreAtaque1);
			this.mostrarMensaje(jugador.getAlgomonActivo().getNombre() + " ataco a " + oponente.getAlgomonActivo().getNombre() + " con " + nombreAtaque1 + "!");
			this.siguienteTurno();
		});
		
		MenuItem ataque2 = new MenuItem();
		ataque2.textProperty().bind(listaAtaques.get(1).getCantidadRestanteProperty());
		ataque2.setOnAction((ActionEvent e) -> {
			jugador.getAlgomonActivo().atacar(oponente.getAlgomonActivo(), nombreAtaque2);
			this.mostrarMensaje(jugador.getAlgomonActivo().getNombre() + " ataco a " + oponente.getAlgomonActivo().getNombre() + " con " + nombreAtaque2 + "!");
			this.siguienteTurno();
		});
		
		MenuItem ataque3 = new MenuItem();
		ataque3.textProperty().bind(listaAtaques.get(2).getCantidadRestanteProperty());
		ataque3.setOnAction((ActionEvent e) -> {
			jugador.getAlgomonActivo().atacar(oponente.getAlgomonActivo(), nombreAtaque3);
			this.mostrarMensaje(jugador.getAlgomonActivo().getNombre() + " ataco a " + oponente.getAlgomonActivo().getNombre() + " con " + nombreAtaque3 + "!");
			this.siguienteTurno();
		});
			
		listaMenuDeAtaques.add(ataque1);
		listaMenuDeAtaques.add(ataque2);
		listaMenuDeAtaques.add(ataque3);
        
		boton.getItems().clear();
        boton.getItems().addAll(listaMenuDeAtaques);
        
	}

	private void cargarElementos(Jugador jugador, MenuButton boton) {
		
		ArrayList<Elemento> listaElementos = jugador.getListadoElementos();
		
		String nombreElemento1 = listaElementos.get(0).getNombre();
		String nombreElemento2 = listaElementos.get(1).getNombre();
		String nombreElemento3 = listaElementos.get(2).getNombre();
		String nombreElemento4 = listaElementos.get(3).getNombre();
		
		ArrayList<MenuItem> listaMenuDeElementos = new ArrayList<MenuItem>();
		
		MenuItem elemento1 = new MenuItem();
		elemento1.textProperty().bind(listaElementos.get(0).getCantidadRestanteProperty());
		elemento1.setOnAction((ActionEvent e) -> {
			jugador.usarElemento(nombreElemento1, jugador.getAlgomonActivo());
			this.mostrarMensaje(jugador.getAlgomonActivo().getNombre() + " uso " + nombreElemento1 + "!");
			this.siguienteTurno();
		});
		
		MenuItem elemento2 = new MenuItem();
		elemento2.textProperty().bind(listaElementos.get(1).getCantidadRestanteProperty());
		elemento2.setOnAction((ActionEvent e) -> {
			jugador.usarElemento(nombreElemento2, jugador.getAlgomonActivo());
			this.mostrarMensaje(jugador.getAlgomonActivo().getNombre() + " uso " + nombreElemento2 + "!");
			this.siguienteTurno();
		});
		
		MenuItem elemento3 = new MenuItem();
		elemento3.textProperty().bind(listaElementos.get(2).getCantidadRestanteProperty());
		elemento3.setOnAction((ActionEvent e) -> {
			jugador.usarElemento(nombreElemento3, jugador.getAlgomonActivo());
			this.mostrarMensaje(jugador.getAlgomonActivo().getNombre() + " uso " + nombreElemento3 + "!");
			this.siguienteTurno();
		});
			
		MenuItem elemento4 = new MenuItem();
		elemento4.textProperty().bind(listaElementos.get(3).getCantidadRestanteProperty());
		elemento4.setOnAction((ActionEvent e) -> {
			jugador.usarElemento(nombreElemento4, jugador.getAlgomonActivo());
			this.mostrarMensaje(jugador.getAlgomonActivo().getNombre() + " uso " + nombreElemento4 + "!");
			this.siguienteTurno();
		});
		
		listaMenuDeElementos.add(elemento1);
		listaMenuDeElementos.add(elemento2);
		listaMenuDeElementos.add(elemento3);
		listaMenuDeElementos.add(elemento4);
        
		boton.getItems().clear();
        boton.getItems().addAll(listaMenuDeElementos);
        
	}
	
	private void mostrarMensaje(String mensaje) {
		this.mensaje.setText(mensaje);
	}
	
	@FXML
    void cambiarAlgomonActivo(ActionEvent event) throws Exception {
    	
		this.inicioController.mostrarSeleccionAlgomonActivo();
    	
    }

	@Override
	public void setInicioController(InicioController controller) {
		
		this.inicioController = controller;
		
	}
	

}

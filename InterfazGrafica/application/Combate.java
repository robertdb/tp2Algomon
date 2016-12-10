package application;

import java.util.Set;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.Ataque;
import fiuba.algo3.algomones.Elemento;
import fiuba.algo3.algomones.Juego;
import fiuba.algo3.algomones.Jugador;
import fiuba.algo3.algomones.TipoElemento;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Combate {

	private Juego juego;
	private Stage stage;
	private ActionEscene botones;
	private ImagenesDeEstado estatus;
	
	public Combate(Stage stage,Juego juego ){
		this.juego = juego;
		this.stage = stage;
	}
	public Scene creadorVentanasjuego(Jugador actual,Jugador pasivo){
		
		
		Group root = new Group();
		this.estatus = new ImagenesDeEstado(root);
		this.botones = new ActionEscene(root,this.estatus,this.juego);
		Scene scene = new Scene(root,1200,700);
		return scene;
	}
	public void iniciarCombate(){
		
		Scene scene = creadorVentanasjuego(juego.setActivo(), juego.setPasivo());
		juego.siguienteTruno();
		stage.setScene(scene);
		stage.show();
	}
}

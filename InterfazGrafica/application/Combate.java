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
	
	public Combate(Stage stage,Juego juego ){
		this.juego = juego;
		this.stage = stage;

	}
	public Scene creadorVentanasjuego(Jugador actual,Jugador pasivo){
		Image image = new Image(getClass().getResource("charmander.gif").toExternalForm());
		ImageView iv1 = new ImageView();
		iv1.setImage(image);
		
		Image image2 = new Image(getClass().getResource("chansey.gif").toExternalForm());
		ImageView iv2 = new ImageView();
		iv2.setImage(image2);
		iv2.setLayoutX(600);
		iv2.setLayoutY(200);
		
		Group root = new Group();
		
		
		root.getChildren().add(iv1);
		root.getChildren().add(iv2);
		
		insertarBotonesElementos(juego.setActivo(),root);
		insertatBotonesCambiarAlgomon(juego.setActivo(),root);
		insertarBotonesAtaque(juego.setActivo(),root);
		
		Label label = new Label();
		label.setText("aqui deverian ir descripciones");
		label.setLayoutX(900);
		label.setLayoutY(600);
		
		root.getChildren().add(label);
		
		Scene scene = new Scene(root,1200,700);
		return scene;
	}
	public void insertarBotonesAtaque(Jugador jugador,Group root){
		 Button boton1 = new Button();
		 Button boton2 = new Button();
		
		 boton1.setText("Fogonaso");
    	 boton2.setText("AtaqueRapido");
    	 Button buton = new Button();
    	 buton.setText("Canto");
    	
    	 boton1.setPrefSize(300, 70);
    	 boton2.setPrefSize(300, 70);
    	 buton.setPrefSize(300, 70);
    	 
    	 boton1.setLayoutY(490);
    	 boton1.setLayoutX(600);
    	 boton2.setLayoutY(560);
    	 boton2.setLayoutX(600);
    	 buton.setLayoutY(630);
    	 buton.setLayoutX(600);
    	
    	 root.getChildren().addAll(boton1,boton2,buton);
	}
	public void insertarBotonesElementos(Jugador jugador, Group root ){
		UbicacionControles menu = new UbicacionControles();
		Button boton1 = menu.controlerProColumna("pocion");
    	
    	 root.getChildren().addAll(boton1);

    	 boton1.setOnAction (new EventHandler <ActionEvent> () {
		     @Override 
		     public void handle (ActionEvent e) {
		    	 boton1.setText("jaja lo logre");
		     }
		 });
    
	}
		
	
	public void insertatBotonesCambiarAlgomon(Jugador jugador,Group root){
		 Button boton1 = new Button();
		 Button boton2 = new Button();
		 Button buton = new Button();
		 
		 boton1.setText("bulmasour");
    	 boton2.setText("Charmander");
    	 buton.setText("Rratata");
    	
    	 boton1.setPrefSize(300, 70);
    	 boton2.setPrefSize(300, 70);
    	 buton.setPrefSize(300, 70);
    	 
    	 boton1.setLayoutY(490);
    	 boton1.setLayoutX(300);
    	 boton2.setLayoutY(560);
    	 boton2.setLayoutX(300);
    	 buton.setLayoutY(630);
    	 buton.setLayoutX(300);
    	
    	 root.getChildren().addAll(boton1,boton2,buton);
	}
	public void iniciarCombate(){
		
		Scene scene = creadorVentanasjuego(juego.setActivo(), juego.setPasivo());
		juego.siguienteTruno();
		stage.setScene(scene);
		stage.show();
	}
}

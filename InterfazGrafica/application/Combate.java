package application;

import fiuba.algo3.algomones.Juego;
import fiuba.algo3.algomones.Jugador;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Combate {

	private Juego juego;
	public Combate(Stage stage,Juego juego ){
		
		Button button1 = new Button();
		Image image = new Image(getClass().getResource("charmander.gif").toExternalForm());
		ImageView iv1 = new ImageView();
		iv1.setImage(image);
		button1.setGraphic(iv1);
		button1.setLayoutX(600);
		button1.setLayoutY(400);
		
		Button button2 = new Button();
		Image image2 = new Image(getClass().getResource("chansey.gif").toExternalForm());
		ImageView iv2 = new ImageView();
		iv2.setImage(image2);
		button2.setGraphic(iv2);
		button2.setLayoutX(0);
		button2.setLayoutY(0);
		
		Button button3 = new Button();
		
		Group root = new Group();
		root.getChildren().addAll(button1,button2);
		Scene scene = new Scene(root,1000,700);
		stage.setScene(scene);
		stage.show();
	}
}

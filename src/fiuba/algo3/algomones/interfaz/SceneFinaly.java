package fiuba.algo3.algomones.interfaz;

import java.util.ArrayList;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.Jugador;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SceneFinaly {
	private Stage stage;
	public SceneFinaly(Stage stage,Jugador jugador){
		this.stage = stage;
		Group root = new Group();
		
		ImageView image1 = new ImageView();
		ImageView image2 = new ImageView();
		ImageView image3 = new ImageView();
		
		ArrayList<Algomon> array = new ArrayList<Algomon>();
		array.addAll(jugador.setAlgomones());
		pocionarYColocarImagen(image1, 0, 0, array.get(0));
		pocionarYColocarImagen(image2, 0, 350, array.get(1));
		pocionarYColocarImagen(image3, 0, 700, array.get(2));
		
		Label label = new Label("FELICITACIONES GANADOR:");
		label.setFont(new Font("Arial",50));
		label.setLayoutY(300);
		label.setLayoutX(200);
		Label labelNombre = new Label(jugador.getNombre());
		labelNombre.setFont(new Font("Arial",50));
		labelNombre.setLayoutY(350);
		labelNombre.setLayoutX(200);
		
		Button boton = botonSalir();
		boton.setLayoutX(200);
		boton.setLayoutY(500);
		
		root.getChildren().addAll(image1,image2,image3,label,labelNombre,boton);
		Scene scene = new Scene(root,1000,840);
		stage.setScene(scene);
		stage.show();
		
	} 
	private void pocionarYColocarImagen(ImageView image, double y,double x,Algomon algomon){
		String path = "images/" + algomon.nombre().toLowerCase() + ".gif";
		Image imag =  new Image(path);
		image.setImage(imag);
		
		image.setLayoutX(x);
		image.setLayoutY(y);
		
	}
	private Button botonSalir(){
		Button buton = new Button();
		buton.setText("Salir");
		buton.setOnAction((ActionEvent e) -> {
			this.stage.close();
		});
	return buton;
	}
	private Button volverAJugar(){
		Button buton = new Button();
		buton.setOnAction((ActionEvent e) -> {
			Main main = new Main();
		});
		return buton;
	}
}

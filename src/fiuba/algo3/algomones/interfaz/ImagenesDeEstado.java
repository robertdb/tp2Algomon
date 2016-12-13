package fiuba.algo3.algomones.interfaz;

import java.util.HashMap;

import fiuba.algo3.algomones.Algomon;
import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.Jugador;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;

public class ImagenesDeEstado {
	private ImageView image1;
	private ImageView image2;
	private Group root;
	private EtiquetasDeEstados label;
	
	public ImagenesDeEstado(Group root){
		this.root = root;
		this.label = new EtiquetasDeEstados(root);
		
		this.image1= new ImageView();
		this.image2 = new ImageView();
		image2.setLayoutX(900);
		image2.setLayoutY(70);
		image1.setLayoutX(150);
		image1.setLayoutY(270);

 		root.getChildren().add(image1);
 		root.getChildren().add(image2);
	}

	public void actualizarEstadosDelCombate(Jugador jugadorActivo, Jugador jugadorPasivo) {
		
		this.label.actualizarEtiquetas(jugadorActivo, jugadorPasivo);
		Image imag1 = imagenBackAlgomon(jugadorActivo.getAlgomonActual());
		Image imag2 = imagenFrontAlgomon((jugadorPasivo.getAlgomonActual()));
		
		this.image1.setImage(imag1);
		this.image2.setImage(imag2);
	}

	private Image imagenFrontAlgomon(Algomon a){
		String path = "images/" + a.nombre().toLowerCase() + ".gif";
		return new Image(path, 200, 200, true, false, false);
	}

	private Image imagenBackAlgomon(Algomon a){
		String path = "images/" + a.nombre().toLowerCase() + "-back.gif";
		return new Image(path, 200, 200, true, false, false);
	}
}

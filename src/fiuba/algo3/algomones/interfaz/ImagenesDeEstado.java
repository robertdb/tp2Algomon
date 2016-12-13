package fiuba.algo3.algomones.interfaz;

import java.util.HashMap;


import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.Jugador;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;

public class ImagenesDeEstado {
	private HashMap<EspecieAlgomon,String > pathsAImagenes;
	private ImageView image1;
	private ImageView image2;
	private Group root;
	private EtiquetasDeEstados label;
	public ImagenesDeEstado(Group root){
		pathsAImagenes =  new HashMap<EspecieAlgomon,String >();
		this.root = root;
		this.label = new EtiquetasDeEstados(root);
		pathsAImagenes.put(EspecieAlgomon.BULBASAUR, "images/bulbasaur.gif");
		pathsAImagenes.put(EspecieAlgomon.CHANSEY, "images/chansey.gif");
		pathsAImagenes.put(EspecieAlgomon.CHARMANDER, "images/charmander.gif");
		pathsAImagenes.put(EspecieAlgomon.JIGGLYPUFF, "images/jigglypuff.gif");
		pathsAImagenes.put(EspecieAlgomon.RATTATA, "images/rattata.gif");
		pathsAImagenes.put(EspecieAlgomon.SQUIRTLE, "images/squirtle.gif");
		
		this.image1= new ImageView();
		this.image2 = new ImageView();
		image2.setLayoutX(800);
		image2.setLayoutY(200);
		image1.setLayoutX(10);

		
 		root.getChildren().add(image1);
 		root.getChildren().add(image2);
		
		
	}
	public void actualizarEstadosDelCombate(Jugador jugadorActivo, Jugador jugadorPasivo) {
		
		this.label.actualizarEtiquetas(jugadorActivo, jugadorPasivo);
		Image imag1 = new Image(pathsAImagenes.get(jugadorActivo.getAlgomonActual()));
		Image imag2 = new Image(pathsAImagenes.get(jugadorPasivo.getAlgomonActual()));
		
		this.image1.setImage(imag1);
		this.image2.setImage(imag2);
	}

}

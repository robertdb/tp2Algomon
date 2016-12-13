package fiuba.algo3.algomones.interfaz;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class EtiquetaSimple {
		private Label label;
		
	public EtiquetaSimple(double i,Group root,String nombre){
		this.label = new Label(nombre);
		label.setFont(new Font("Arial",30));
		label.setLayoutY(580);
		label.setLayoutX(i);
		label.setRotate(270);
		root.getChildren().add(label);
	}
}

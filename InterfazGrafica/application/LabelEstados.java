package application;

import fiuba.algo3.algomones.Algomon;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class LabelEstados {
	private Label salud;
	private Label estado;

	public LabelEstados() {
		this.salud = new Label();
		this.estado = new Label();
		
	}
	public void posicionarLabelEstado(double i, double j){
		this.salud.setText("salud:");
		this.salud.setFont(new Font("Arial",30));
		this.salud.setLayoutY(i);
		this.salud.setLayoutX(j);
		
		this.estado.setText("estado: ");
		this.estado.setFont(new Font("Arial",30));
		this.estado.setLayoutY(i+30);
		this.estado.setLayoutX(j);
		
	}
	public void colocarLabel(Group root) {
		root.getChildren().addAll(this.estado,this.salud);
		
	}
	public void cambiarEstados(Algomon statusAlgomonActual) {
		this.salud.setText("SALUD : "+statusAlgomonActual.salud());
		this.estado.setText("ESTADO : " +statusAlgomonActual.nombreDeEstado());
		
	}

}

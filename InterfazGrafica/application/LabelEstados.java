package application;

import fiuba.algo3.algomones.Algomon;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class LabelEstados {
	private Label salud;
	private Label estado;
	private Label nombre;

	public LabelEstados() {
		this.salud = new Label();
		this.estado = new Label();
		this.nombre = new Label();
		
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
		
		this.nombre.setText("Nombre");
		this.nombre.setFont(new Font("Arial",30));
		this.nombre.setLayoutY(i+60);
		this.nombre.setLayoutX(j);
		
	}
	public void colocarLabel(Group root) {
		root.getChildren().addAll(this.estado,this.salud,this.nombre);
		
	}
	public void cambiarEstados(Algomon statusAlgomonActual) {
		this.salud.setText("SALUD : "+statusAlgomonActual.salud());
		this.estado.setText("ESTADO : " +statusAlgomonActual.nombreDeEstado());
		this.nombre.setText(statusAlgomonActual.especieAlgomon());
		
	}

}

package application;

import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.Jugador;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;

public class EtiquetasDeEstados {
	private Label turnoJugador;
	private EtiquetaSimple ataques;
	private EtiquetaSimple elementos;
	private EtiquetaSimple algomones;
	private Group root;
	private LabelEstados estado1;
	private LabelEstados estado2;
	public EtiquetasDeEstados(Group root) {
		
		this.turnoJugador = new Label("jugador1");
		this.turnoJugador.setFont(new Font("Arial",40));
		this.turnoJugador.setLayoutY(400);
		
		this.algomones = new EtiquetaSimple(-60,root,"ALGOMONES");
		
		this.ataques = new EtiquetaSimple(360,root,"ATAQUES");
		
		this.elementos = new EtiquetaSimple(740,root,"ELEMENTOS");
		
		
		this.estado1 = new LabelEstados();
		this.estado1.posicionarLabelEstado(300,600);
		this.estado1.colocarLabel(root);
		
		
		this.estado2 = new LabelEstados();
		this.estado2.posicionarLabelEstado(0,300);
		this.estado2.colocarLabel(root);
		
		root.getChildren().addAll(this.turnoJugador);
 		
	}
	public void actualizarEtiquetas(Jugador activo,Jugador pasivo){
		this.estado1.cambiarEstados(activo.statusAlgomonActual());
		this.estado2.cambiarEstados(pasivo.statusAlgomonActual());
		this.turnoJugador.setText(activo.nombreJugador());
	}

	
}

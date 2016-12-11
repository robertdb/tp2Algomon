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
	private LabelEstados pasivo;
	private LabelEstados activo;
	public EtiquetasDeEstados(Group root) {
		
		this.turnoJugador = new Label("jugador1");
		this.turnoJugador.setFont(new Font("Arial",40));
		this.turnoJugador.setLayoutY(400);
		
		this.algomones = new EtiquetaSimple(-40,root,"ATAQUES");
		
		this.ataques = new EtiquetaSimple(360,root,"ELEMENTOS");
		
		this.elementos = new EtiquetaSimple(740,root,"ALGOMONES");
		
		
		this.pasivo = new LabelEstados();
		this.pasivo.posicionarLabelEstado(300,400);
		this.pasivo.colocarLabel(root);
		
		
		this.activo = new LabelEstados();
		this.activo.posicionarLabelEstado(0,300);
		this.activo.colocarLabel(root);
		
		root.getChildren().addAll(this.turnoJugador);
 		
	}
	public void actualizarEtiquetas(Jugador activo,Jugador pasivo){
			
		this.activo.cambiarEstados(activo.statusAlgomonActual());
		this.pasivo.cambiarEstados(pasivo.statusAlgomonActual());
		this.turnoJugador.setText(activo.nombreJugador());
	}

	
}

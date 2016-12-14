package fiuba.algo3.algomones.interfaz;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import fiuba.algo3.algomones.Juego;
import fiuba.algo3.algomones.NombreDelAtaque;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class ActionEscene {
	private int botonesColumna = 3;
	private Juego juego;
	private BotonesDeAtaque ataques;
	private BotonesDeElementos elementos;
	private BotonesDeAlgomones algomones;
	private ImagenesDeEstado estatus;
	private Stage stage;
	
	public ActionEscene(Group root, ImagenesDeEstado estatus ,Juego juego,Stage stage){
		this.juego = juego;
		this.stage = stage;
		this.ataques = new BotonesDeAtaque(this,root);
		this.elementos = new BotonesDeElementos(this,root);
		this.algomones = new BotonesDeAlgomones(this,root);
		this.estatus = estatus;
		
		this.estatus.actualizarEstadosDelCombate(juego.getActivo(),juego.getPasivo());
	    this.ataques.actualizarBotonesAtaque(juego.getActivo().getAtaqueAlgomon(),juego.getActivo(),juego.getPasivo());
	    this.elementos.actualizarBotonesElementos(juego.getActivo().getElementos(),juego.getActivo());
	    this.algomones.actualizarBotonesAlgomones(juego.getActivo().getAlgomones(),juego.getActivo());
	    File file = new File("music/"+"Tinitus.mp3".toLowerCase());
	    file.getAbsolutePath();
	    Media media = new Media(file.toURI().toString());
	    MediaPlayer mediaPlayer = new MediaPlayer(media);
	    mediaPlayer.setAutoPlay(true);
	    MediaView mediaView = new MediaView(mediaPlayer);
	    
	    root.getChildren().add(mediaView);
	}

	public void actualizarBotones() {
		try{
			juego.siguienteTurno();
			this.estatus.actualizarEstadosDelCombate(juego.getActivo(),juego.getPasivo());
			this.algomones.actualizarBotonesAlgomones(juego.getActivo().getAlgomones(),juego.getActivo());
			this.elementos.actualizarBotonesElementos(juego.getActivo().getElementos(),juego.getActivo());
			this.ataques.actualizarBotonesAtaque(juego.getActivo().getAtaqueAlgomon(),juego.getActivo(),juego.getPasivo());
		}catch(IndexOutOfBoundsException e ){
			SceneFinaly fynal = new SceneFinaly (stage,juego.getActivo()); 
		}
	   
	}
}

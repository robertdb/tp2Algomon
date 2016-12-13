package fiuba.algo3.algomones.interfaz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import fiuba.algo3.algomones.Juego;
import fiuba.algo3.algomones.NombreDelAtaque;
import javafx.scene.Group;
import javafx.scene.control.Button;

public class ActionEscene {
	private int botonesColumna = 3;
	private Juego juego;
	private BotonesDeAtaque ataques;
	private BotonesDeElementos elementos;
	private BotonesDeAlgomones algomones;
	private ImagenesDeEstado estatus;
	
	public ActionEscene(Group root, ImagenesDeEstado estatus ,Juego juego){
		this.juego = juego;
		this.ataques = new BotonesDeAtaque(this,root);
		this.elementos = new BotonesDeElementos(this,root);
		this.algomones = new BotonesDeAlgomones(this,root);
		this.estatus = estatus;
		
		this.estatus.actualizarEstadosDelCombate(juego.getActivo(),juego.getPasivo());
	    this.ataques.actualizarBotonesAtaque(juego.getActivo().getAtaqueAlgomon(),juego.getActivo(),juego.getPasivo());
	    this.elementos.actualizarBotonesElementos(juego.getActivo().getElementos(),juego.getActivo());
	    this.algomones.actualizarBotonesAlgomones(juego.getActivo().getAlgomones(),juego.getActivo());
		
	}

	public void actualizarBotones() {
		juego.siguienteTurno();
		
	
	    this.estatus.actualizarEstadosDelCombate(juego.getActivo(),juego.getPasivo());
	    this.algomones.actualizarBotonesAlgomones(juego.getActivo().getAlgomones(),juego.getActivo());
	    this.elementos.actualizarBotonesElementos(juego.getActivo().getElementos(),juego.getActivo());
	    this.ataques.actualizarBotonesAtaque(juego.getActivo().getAtaqueAlgomon(),juego.getActivo(),juego.getPasivo());
		   
	   
	}
}

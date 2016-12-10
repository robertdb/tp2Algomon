package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import fiuba.algo3.algomones.Juego;
import fiuba.algo3.algomones.NombreDelAtaque;
import javafx.scene.Group;
import javafx.scene.control.Button;

public class ActionBotones {
	private int botonesColumna = 3;
	private Juego juego;
	private BotonesDeAtaque ataques;
	private BotonesDeElementos elementos;
	private BotonesDeAlgomones algomones;
	
	public ActionBotones(Group root ){
		this.ataques = new BotonesDeAtaque(this,root);
		this.elementos = new BotonesDeElementos(this,root);
		this.algomones = new BotonesDeAlgomones(this,root);
	
	}

	public void actualizarBotones() {
	    this.ataques.actualizarBotonesAtaque(juego.setActivo().getAtaqueAlgomon(),juego.setActivo(),juego.setPasivo());
	    this.elementos.actualizarBotonesElementos(juego.setActivo().getElementos(),juego.setActivo());
	    this.algomones.actualizarBotonesAlgomones(juego.setActivo().getAlgomones(),juego.setActivo());
	}	
	
}

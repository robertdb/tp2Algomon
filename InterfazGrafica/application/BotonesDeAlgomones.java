package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.Jugador;
import fiuba.algo3.algomones.NombreDelAtaque;
import javafx.scene.Group;

public class BotonesDeAlgomones {
	private ActionBotones action;
	private ArrayList<BotonAlgomon> algomones;
	private int botonesColumna = 3;
	
	public BotonesDeAlgomones(ActionBotones actionBotones, Group root) {
		this.action = actionBotones;
		
		UbicacionControles ubicacion = new UbicacionControles();
		this.algomones = new ArrayList<BotonAlgomon>();
		
		for(int i = 1; i <= botonesColumna; i = i + 1){
			
			BotonAlgomon boton = new BotonAlgomon(actionBotones);
			ubicacion.controlerPorColumna3(null, boton);
			root.getChildren().add(boton.getBoton());
		}
	}

	public void actualizarBotonesAlgomones(Set<EspecieAlgomon> algomones2, Jugador jugador) {
		Iterator<BotonAlgomon> it = this.algomones.iterator();
		
		for (EspecieAlgomon nombre: algomones2){
			BotonAlgomon boton = it.next();
			boton.insertarJugadoresYNombreAlgomon(jugador,nombre);
		}
	
		
	}

}

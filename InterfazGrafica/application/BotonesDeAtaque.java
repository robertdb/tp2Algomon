package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import fiuba.algo3.algomones.Jugador;
import fiuba.algo3.algomones.NombreDelAtaque;
import javafx.scene.Group;

public class BotonesDeAtaque {
	private int botonesColumna = 3;
	private ArrayList<BotonDeAtaque> list;
	
	public BotonesDeAtaque(ActionBotones actionBotones, Group root){
		
		UbicacionControles ubicacion = new UbicacionControles();
		this.list = new ArrayList<BotonDeAtaque>();
		
		for(int i = 1; i <= botonesColumna; i = i + 1){
			BotonDeAtaque boton = new BotonDeAtaque(actionBotones);
			ubicacion.controlerProColumna(null, boton);
			root.getChildren().add(boton.getBoton());
		}

	}

	public void actualizarBotonesAtaque(Set<NombreDelAtaque> ataqueAlgomon, Jugador jugador, Jugador jugador2) {
			Iterator<BotonDeAtaque> it = this.list.iterator();
			
			for (NombreDelAtaque nombre: ataqueAlgomon){
				BotonDeAtaque boton = it.next();
				boton.insertarJugadoresYNombreAtaque(jugador,jugador2,nombre);
			}
		
	}
	
}

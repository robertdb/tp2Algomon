package fiuba.algo3.algomones.interfaz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import fiuba.algo3.algomones.Jugador;
import fiuba.algo3.algomones.NombreDelAtaque;
import javafx.scene.Group;

public class BotonesDeAtaque {
	private int botonesColumna = 3;
	private ArrayList<BotonDeAtaque> list;
	
	public BotonesDeAtaque(ActionEscene actionBotones, Group root){
		
		UbicacionControles ubicacion = new UbicacionControles();
		this.list = new ArrayList<BotonDeAtaque>();
		
		for(int i = 1; i <= botonesColumna; i = i + 1){
			BotonDeAtaque boton = new BotonDeAtaque(actionBotones);
			ubicacion.controlerProColumna(null, boton);
			root.getChildren().add(boton.getBoton());
			this.list.add(boton);
		}

	}

	public void actualizarBotonesAtaque(Set<NombreDelAtaque> set, Jugador jugador, Jugador jugador2) {
		Iterator<NombreDelAtaque> it = set.iterator();
		for (BotonDeAtaque botn : this.list){
			if (it.hasNext()){
				botn.insertarJugadoresYNombreAtaque(jugador, jugador2, it.next());
			}
		}
		
	}
	
}

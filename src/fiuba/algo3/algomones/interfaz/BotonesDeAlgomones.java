package fiuba.algo3.algomones.interfaz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.Jugador;
import fiuba.algo3.algomones.NombreDelAtaque;
import fiuba.algo3.algomones.TipoElemento;
import javafx.scene.Group;

public class BotonesDeAlgomones {
	private ActionEscene action;
	private ArrayList<BotonAlgomon> algomones;
	private int botonesColumna = 3;
	
	public BotonesDeAlgomones(ActionEscene actionBotones, Group root) {
		this.action = actionBotones;
		
		UbicacionControles ubicacion = new UbicacionControles();
		this.algomones = new ArrayList<BotonAlgomon>();
		
		for(int i = 1; i <= botonesColumna; i = i + 1){
			
			BotonAlgomon boton = new BotonAlgomon(actionBotones);
			ubicacion.controlerPorColumna3(null, boton);
			root.getChildren().add(boton.getBoton());
			algomones.add(boton);
		}
	}

	public void actualizarBotonesAlgomones(Set<EspecieAlgomon> algomones2, Jugador jugador) {
		Iterator<EspecieAlgomon> it =algomones2.iterator();
		for (BotonAlgomon botn : this.algomones){
			if (it.hasNext()){
				botn.insertarJugadoresYNombreAlgomon(jugador, it.next());
			}
		}
		
	}

}

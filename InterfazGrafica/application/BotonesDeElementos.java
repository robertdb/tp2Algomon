package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import fiuba.algo3.algomones.Jugador;
import fiuba.algo3.algomones.NombreDelAtaque;
import fiuba.algo3.algomones.TipoElemento;
import javafx.scene.Group;

public class BotonesDeElementos {
	private ArrayList<BotonElemento> botones;
	private int botonesColumna = 3 ;
	
	public BotonesDeElementos(ActionEscene actionBotones, Group root) {
		UbicacionControles ubicacion = new UbicacionControles();
		this.botones = new ArrayList<BotonElemento>();
		
		
		for(int i = 1; i <= botonesColumna; i = i + 1){
			BotonElemento boton = new BotonElemento(actionBotones);
			ubicacion.controlerPorColumnba2(null, boton.getBoton());
			root.getChildren().add(boton.getBoton());
			botones.add(boton);
		}
	}

	public void actualizarBotonesElementos(Set<TipoElemento> elementos, Jugador jugador) {
		Iterator<TipoElemento> it = elementos.iterator();
		for (BotonElemento botn : this.botones){
			if (it.hasNext()){
				botn.insertarJugadoresYNombreAtaque(jugador, it.next());
			}
		}
		
	}

	

}

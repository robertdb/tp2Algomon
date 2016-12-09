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
	private ArrayList<BotonDeAtaque> list;
	private Juego juego;
	
	public ActionBotones(Group root){
		UbicacionControles ubicacion = new UbicacionControles();
		this.list = new ArrayList<BotonDeAtaque>();
		
		for(int i = 1; i <= botonesColumna; i = i + 1){
			
				BotonDeAtaque boton = new BotonDeAtaque(this);
				ubicacion.controlerProColumna(null, boton);
				root.getChildren().add(boton.getBoton());
		}

	}
	
	public void actualizarBotones() {
		Iterator<BotonDeAtaque> it = this.list.iterator();
		for (NombreDelAtaque nombre: juego.setActivo().getAtaqueAlgomon()){
			BotonDeAtaque boton = it.next();
			boton.insertarJugadoresYNombreAtaque(juego.setActivo(),juego.setPasivo(),nombre);
			boton.insertarNombreBoton(nombre.obtenerRepresentation());
		}
		while (it.hasNext()) {
			it.next().getBoton().setDisable(true);
			 
			}
	}
	
}

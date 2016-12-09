package application;

import javafx.scene.Group;
import javafx.scene.control.Button;

public class UbicacionControles{
	private double columna1 = 100;
	private double columna2 = 500;
	private double columna3 = 800;
	private double alto = 70;
	private double ancho =300 ;
	private double fila1;
	private double fila2;
	private double fila3;
	public UbicacionControles(){
		fila1 = 490;
		fila2 = 490;
		fila3 = 490;
	}
	
	public void controlerProColumna(String text ,BotonDeAtaque ataque1){
		 ataque1.getBoton().setPrefSize(ancho, alto);
		 ataque1.getBoton().setLayoutX(columna1);
		 ataque1.getBoton().setLayoutY(fila1);
		 fila1 = fila1 +alto ;
		
	}
	public void  controlerPorColumnba2(String text,Button boton){
		 boton.setPrefSize(ancho, alto);
		 boton.setLayoutX(columna2);
		 boton.setLayoutY(fila2);
		 fila2 = fila2 +100;
		
	}
	public void controlerPorColumnba3(String text, Button boton){
		
		 boton.setPrefSize(ancho, alto);
		 boton.setLayoutX(columna3);
		 boton.setLayoutY(fila3);
		 fila3 = fila3 +100;
		
	}
}
